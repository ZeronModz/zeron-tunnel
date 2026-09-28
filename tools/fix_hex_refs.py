#!/usr/bin/env python3
"""Fix raw hex resource refs (jadx output) in app/src/main/res.

1. "?/@0x7fXXXXXX" style ids resolvable from the original arsc -> "@type/name".
2. Files whose target ids are missing from the original arsc (63 dangling
   drawable ids) -> restore the whole file from the matching library AAR,
   then pull any file resources it references that we do not have.
3. nav_menu.xml is app-owned: map its dangling icon id by hand.

Usage:  python3 tools/fix_hex_refs.py [--dry-run]
"""
import os
import re
import sys
import zipfile
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
RES = ROOT / "app/src/main/res"
IDS = ROOT / "tools/original_resource_ids.tsv"
AAR_DIR = Path(os.path.expanduser("~/.cache/zeron-aars"))
DRY = "--dry-run" in sys.argv

HEX = re.compile(r"(?<![\w@?/])0x7f[0-9a-f]{6}(?![0-9a-f])")
REF = re.compile(r"@(drawable|anim|animator|mipmap|raw|menu|layout|xml|color|string|dimen|style|integer|array|bool)/([A-Za-z0-9_.]+)")
FILE_TYPES = {"drawable", "anim", "animator", "mipmap", "raw", "menu", "layout", "xml"}

# app-owned dangling ids: filled by hand (id not present in original arsc)
MANUAL = {
    ("menu/nav_menu.xml", "0x7f0800ff"): "@drawable/ic_settings_24dp",
}

# file name prefix -> preferred aar
PREF = [
    ("abc_", "androidx.appcompat:appcompat:1.7.0.aar"),
    ("mtrl_", "com.google.android.material:material:1.12.0.aar"),
    ("notification_", "androidx.core:core:1.16.0.aar"),
    ("common_google_signin_", "com.google.android.gms:play-services-base:18.5.0.aar"),
]


def load_ids():
    m = {}
    for line in IDS.read_text(encoding="utf-8").splitlines():
        p = line.split()
        if len(p) == 3 and p[0] == "resource":
            m[p[1]] = p[2]
        elif len(p) == 2:
            m[p[0]] = p[1]
    return m


def aar_list(aar):
    try:
        with zipfile.ZipFile(aar) as z:
            return z.namelist()
    except Exception:
        return []


def aar_read(aar, name):
    with zipfile.ZipFile(aar) as z:
        return z.read(name).decode("utf-8", "replace")


def find_in_aars(dirname, filename, prefer=None):
    """Find res/<dirname or config variant>/<filename> in cached aars."""
    cands = []
    for aar in sorted(AAR_DIR.glob("*.aar")):
        for n in aar_list(aar):
            if not n.startswith("res/"):
                continue
            d, _, f = n.rpartition("/")
            if f == filename and (d == "res/" + dirname or d.startswith("res/" + dirname + "-")):
                cands.append((aar, n))
    if prefer:
        cands.sort(key=lambda cp: 0 if cp[0].name == prefer else 1)
        if cands and cands[0][0].name == prefer:
            return cands[0]
    return cands[0] if cands else None


def has_file(res_type, name):
    for d in RES.glob(f"{res_type}*"):
        if d.is_dir() and any(d.glob(f"{name}.*")):
            return True
    return False


def ensure(ref_type, ref_name, aar, member, report, queue, stack):
    """Copy a file resource from aar into our res if we do not have it."""
    if ref_type not in FILE_TYPES:
        return
    if has_file(ref_type, ref_name):
        return
    base = os.path.dirname(member)
    # any config dir holding <ref_name>.<ext>
    key = (ref_type, ref_name, aar)
    if key in report["_seen"]:
        return
    report["_seen"].add(key)
    with zipfile.ZipFile(aar) as z:
        for n in z.namelist():
            if not n.startswith("res/"):
                continue
            stem = os.path.basename(n)
            if not (stem == ref_name or stem.startswith(ref_name + ".")):
                continue
            out = RES / f"{ref_type}" / stem
            if not DRY:
                out.parent.mkdir(parents=True, exist_ok=True)
                out.write_bytes(z.read(n))
            report["added"].append(f"{ref_type}/{stem}  (from {aar.name})")
            if stem.endswith(".xml"):
                queue.append((out, aar))
            return
    report["missing_ref"].append(f"@{ref_type}/{ref_name} (not in {aar.name})")


def process():
    ids = load_ids()
    report = {"resolved": 0, "replaced": [], "added": [], "missing_ref": [], "leftover": [], "_seen": set()}
    queue = []
    files = sorted(p for p in RES.rglob("*.xml"))

    def handle(path: Path, aar=None):
        s = path.read_text(encoding="utf-8", errors="replace")
        rel = f"{path.parent.name}/{path.name}"
        member = None
        written = False

        if aar is not None:
            with zipfile.ZipFile(aar) as z:
                for n in z.namelist():
                    if n.startswith("res/") and n.rpartition("/")[2] == path.name and (
                        n.rpartition("/")[0] == "res/" + path.parent.name
                        or n.rpartition("/")[0].startswith("res/" + path.parent.name + "-")
                    ):
                        member = n
                        break

        # 1. manual / resolvable hex ids
        def sub(m):
            hx = m.group(0)
            man = MANUAL.get((rel, hx))
            if man:
                return man
            if hx in ids:
                report["resolved"] += 1
                return "@" + ids[hx]
            return hx

        s2 = HEX.sub(sub, s)
        changed = s2 != s

        # 2. still unresolvable -> restore file from an aar
        if HEX.search(s2) and member is None:
            for pref, want in PREF:
                if path.name.startswith(pref):
                    c = find_in_aars(path.parent.name, path.name, prefer=want)
                    if c:
                        aar, member = c
                        break
            if member is None:
                c = find_in_aars(path.parent.name, path.name)
                if c:
                    aar, member = c
            if member is None:
                report["leftover"].append(f"{rel}: no aar source for {sorted(set(HEX.findall(s2)))}")
                s2 = HEX.sub(" ", s2)

        if HEX.search(s2) and aar is not None and member is not None:
            content = aar_read(aar, member)
            if HEX.search(content):
                report["leftover"].append(f"{rel}: aar version still hex")
                s2 = HEX.sub(" ", s2)
            else:
                if not DRY:
                    path.write_text(content, encoding="utf-8")
                written = True
                report["replaced"].append(f"{rel}  (from {aar.name})")
                s2 = content

        if HEX.search(s2):
            report["leftover"].append(f"{rel}: {sorted(set(HEX.findall(s2)))}")

        if changed and not written and not DRY:
            path.write_text(s2, encoding="utf-8")

        # 3. pull referenced file resources we lack
        if aar is not None and member is not None:
            for t, n in REF.findall(s2):
                if t in FILE_TYPES and not has_file(t, n):
                    ensure(t, n, aar, member, report, queue, [])

        return aar

    for f in files:
        handle(f)

    seen = set()
    while queue:
        p, aar = queue.pop(0)
        if p in seen:
            continue
        seen.add(p)
        if p.exists():
            handle(p, aar)

    print(f"resolved hex ids : {report['resolved']}")
    print(f"files restored    : {len(report['replaced'])}")
    for r in report["replaced"]:
        print("   ", r)
    print(f"resources added   : {len(report['added'])}")
    for r in report["added"]:
        print("   ", r)
    if report["missing_ref"]:
        print(f"MISSING refs      : {len(report['missing_ref'])}")
        for r in report["missing_ref"]:
            print("   ", r)
    if report["leftover"]:
        print(f"LEFTOVER hex      : {len(report['leftover'])}")
        for r in report["leftover"]:
            print("   ", r)
    if DRY:
        print("(dry-run: nothing written)")


process()
