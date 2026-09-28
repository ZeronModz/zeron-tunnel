#!/usr/bin/env python3
"""Strip <attr> declarations from our res that are already provided by a
dependency AAR.  jadx dumps every attr of the final APK (library attrs were
merged into the app package), so we end up declaring appcompat/material/...
attrs twice -> AAPT2 "Duplicate value for resource 'attr/x'".

Usage:  python3 tools/strip_lib_attrs.py [--download-only] [--dry-run]
"""
import io
import os
import re
import sys
import zipfile
import urllib.request

ROOT = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
GRADLE = os.path.join(ROOT, "app", "build.gradle")
RES = os.path.join(ROOT, "app", "src", "main", "res")
CACHE = os.path.expanduser("~/.cache/zeron-aars")

REPOS = [
    "https://dl.google.com/dl/android/maven2",
    "https://repo1.maven.org/maven2",
    "https://jitpack.io",
]

DEP_RE = re.compile(
    r"""^\s*(?:implementation|api|compileOnly)\s+
        (?:platform\()?
        ['"](?P<g>[^:'"]+):(?P<a>[^:'"]+):(?P<v>[^'"]+)['"]
        \)?\s*$""",
    re.X,
)

ATTR_TAG = re.compile(r'<attr\b[^>]*?name="([^"]+)"')


def deps():
    out = []
    for line in open(GRADLE, encoding="utf-8"):
        m = DEP_RE.match(line.rstrip())
        if m and not m.group("g").startswith("platform"):
            out.append((m.group("g"), m.group("a"), m.group("v")))
    return out


def pom_bytes(g, a, v):
    path = os.path.join(CACHE, f"{g}:{a}:{v}.pom".replace("/", "_"))
    if os.path.exists(path) and os.path.getsize(path) > 0:
        return open(path, "rb").read()
    for u in url_for(g, a, v, "pom"):
        try:
            data = fetch(u)
        except Exception:
            continue
        if data.lstrip()[:5] == b"<?xml" or data.lstrip()[:4] == b"<pro":
            open(path, "wb").write(data)
            return data
    return None


DEP_BLOCK = re.compile(r"<dependency>(.*?)</dependency>", re.S)
TAG = re.compile(r"<%s>(.*?)</%s>")


def pom_deps(g, a, v):
    """direct compile/runtime deps that declare an explicit version."""
    data = pom_bytes(g, a, v)
    if not data:
        return []
    txt = data.decode("utf-8", "replace")
    out = []
    for blk in DEP_BLOCK.findall(txt):
        def tag(n):
            m = re.search(r"<%s>\s*([^<]+?)\s*</%s>" % (n, n), blk)
            return m.group(1).strip() if m else ""
        if "<optional>true</optional>" in blk:
            continue
        scope = tag("scope") or "compile"
        if scope not in ("compile", "runtime"):
            continue
        ga, ar, ve = tag("groupId"), tag("artifactId"), tag("version")
        ve = ve.strip()
        if ve.startswith("[") and ve.endswith("]"):
            ve = ve[1:-1].strip()
        if not ve or ve.startswith("${") or not re.match(r"^[0-9a-zA-Z]", ve):
            continue
        out.append((ga, ar, ve))
    return out


def url_for(g, a, v, ext):
    gp = g.replace(".", "/")
    return [f"{r}/{gp}/{a}/{v}/{a}-{v}.{ext}" for r in REPOS]


def fetch(url, timeout=60):
    req = urllib.request.Request(url, headers={"User-Agent": "curl/8"})
    with urllib.request.urlopen(req, timeout=timeout) as r:
        return r.read()


def aar_bytes(g, a, v):
    os.makedirs(CACHE, exist_ok=True)
    path = os.path.join(CACHE, f"{g}:{a}:{v}.aar".replace("/", "_"))
    if os.path.exists(path) and os.path.getsize(path) > 0:
        return open(path, "rb").read()
    for u in url_for(g, a, v, "aar"):
        try:
            data = fetch(u)
        except Exception:
            continue
        if data[:2] == b"PK":
            open(path, "wb").write(data)
            return data
    return None


def all_modules():
    """explicit deps + 2 levels of transitive POM deps (explicit versions)."""
    seen = set()
    frontier = list(deps())
    while frontier:
        g, a, v = frontier.pop(0)
        if (g, a) in seen:
            continue
        seen.add((g, a))
        yield g, a, v
        if len(seen) < 400:
            frontier.extend(pom_deps(g, a, v))


def lib_attrs():
    names = set()
    got = miss = 0
    for g, a, v in all_modules():
        data = aar_bytes(g, a, v)
        if data is None:
            miss += 1
            print(f"  no aar: {g}:{a}:{v}")
            continue
        got += 1
        try:
            z = zipfile.ZipFile(io.BytesIO(data))
        except Exception as e:
            print(f"  bad zip {g}:{a}:{v}: {e}")
            continue
        for n in z.namelist():
            if not re.match(r"res/values[^/]*/[^/]+\.xml$", n):
                continue
            try:
                txt = z.read(n).decode("utf-8", "replace")
            except Exception:
                continue
            for m in ATTR_TAG.finditer(txt):
                names.add(m.group(1))
    print(f"  aars: {got} ok, {miss} missing, attrs collected: {len(names)}")
    return names


def strip(names, dry):
    total = 0
    for dirpath, _, files in os.walk(RES):
        if not os.path.basename(dirpath).startswith("values"):
            continue
        for fn in files:
            if not fn.endswith(".xml"):
                continue
            p = os.path.join(dirpath, fn)
            s = open(p, encoding="utf-8").read()
            removed_here = [0]

            def repl(m):
                if m.group(1) in names:
                    removed_here[0] += 1
                    return ""
                return m.group(0)

            new = re.sub(
                r'[ \t]*<attr\b[^>]*?name="([^"]+)"[^>]*?(?:/>|>.*?</attr>)\n',
                repl, s, flags=re.S,
            )
            if removed_here[0]:
                if not dry:
                    open(p, "w", encoding="utf-8").write(new)
                total += removed_here[0]
                print(f"  {os.path.relpath(p, ROOT)}: removed {removed_here[0]}")
    return total


def main():
    dry = "--dry-run" in sys.argv
    print("collecting library attrs ...")
    names = lib_attrs()
    if "--download-only" in sys.argv:
        return 0
    print("stripping ...")
    removed = strip(names, dry)
    print(f"removed {removed} attr declarations (dry={dry})")
    return 0


if __name__ == "__main__":
    sys.exit(main())
