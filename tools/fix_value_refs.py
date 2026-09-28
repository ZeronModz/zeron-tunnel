#!/usr/bin/env python3
"""Fix jadx-decoded <item> values that AAPT2 cannot compile from source.

Two problems jadx leaves behind:
  1. "?unknown_ref: 7f08004e"      -> unresolved theme attribute reference
  2. "<item name=\"android:gravity\">0x800033</item>"
                                     -> raw enum/flag numbers instead of names

Fix:
  1. resolve the id via the APK's public.xml  ->  ?attr/<name>
  2. look the attr up in AOSP attrs.xml / library attrs and rewrite the
     number as the symbolic enum / flag combination.

Usage: python3 tools/fix_value_refs.py [--dry-run]
"""
import os
import re
import sys
import glob

ROOT = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
RES = os.path.join(ROOT, "app", "src", "main", "res")
PUBLIC = os.path.expanduser(
    "/storage/emulated/0/Download/ultra-tunnel/reverse/res_out/resources/res/values/public.xml"
)
AOSP = "/data/data/com.termux/files/usr/tmp/aosp_attrs.xml"
AAR_CACHE = os.path.expanduser("~/.cache/zeron-aars")

PREFERRED = {"-1": "match_parent"}

report = {"ref_ok": 0, "ref_fail": 0, "enum_ok": 0, "flag_ok": 0, "unresolved": []}


def parse_attr_blocks(xml):
    """attr name -> {'kind': enum|flags, 'map': {value_int: name}}"""
    out = {}
    for m in re.finditer(r'<attr\b([^>]*[^/])>(.*?)</attr>', xml, re.S):
        head, body = m.group(1), m.group(2)
        nm = re.search(r'name="([^"]+)"', head)
        if not nm:
            continue
        name = nm.group(1)
        pairs = []
        kind = None
        for e in re.finditer(r'<(enum|flag)\s+name="([^"]+)"\s+value="([^"]+)"', body):
            k, en, ev = e.group(1), e.group(2), e.group(3)
            kind = "flags" if k == "flag" else "enum"
            try:
                iv = int(ev, 0)
            except ValueError:
                continue
            pairs.append((iv, en))
        if not pairs:
            continue
        # several names may share a value (fill_parent/match_parent):
        # prefer the name listed in PREFERRED for that value
        table = {}
        for iv, en in pairs:
            if iv not in table:
                table[iv] = en
            elif PREFERRED.get(str(iv)) == en:
                table[iv] = en
        prev = out.get(name)
        if prev is None or len(table) > len(prev["map"]):
            out[name] = {"kind": kind, "map": table}
    return out


def load_tables():
    tables = {}
    if os.path.exists(AOSP):
        tables.update(parse_attr_blocks(open(AOSP, encoding="utf-8").read()))
    own = os.path.join(RES, "values", "attrs.xml")
    if os.path.exists(own):
        t = parse_attr_blocks(open(own, encoding="utf-8").read())
        tables.update({k: v for k, v in t.items() if k not in tables})
    n = 0
    for p in glob.glob(os.path.join(AAR_CACHE, "*.aar")):
        try:
            import zipfile
            z = zipfile.ZipFile(p)
        except Exception:
            continue
        for member in z.namelist():
            if not re.match(r"res/values[^/]*/[^/]+\.xml$", member):
                continue
            try:
                t = parse_attr_blocks(z.read(member).decode("utf-8", "replace"))
            except Exception:
                continue
            for k, v in t.items():
                if k not in tables:
                    tables[k] = v
            n += 1
    print(f"  attr tables: {len(tables)} names (from aosp + own + {n} aar files)")
    return tables


def load_ids():
    ids = {}
    if not os.path.exists(PUBLIC):
        print(f"  WARNING: public.xml not found: {PUBLIC}")
        return ids
    for m in re.finditer(
        r'<public\s+type="([^"]+)"\s+name="([^"]+)"\s+id="(0x[0-9a-fA-F]+)"', open(PUBLIC, encoding="utf-8").read()
    ):
        ids[m.group(3).lower()] = (m.group(1), m.group(2))
    print(f"  public ids: {len(ids)}")
    return ids


def flags_symbolic(value, table):
    if value == 0:
        return table.get(0)
    if value in table:
        return table[value]
    rem = value
    chosen = []
    for iv in sorted((v for v in table if v > 0), reverse=True):
        if rem <= 0:
            break
        if (rem & iv) == iv:
            chosen.append(table[iv])
            rem -= iv
            if rem == 0:
                break
    if rem == 0 and chosen:
        return "|".join(chosen)
    return None


def enum_symbolic(value, table):
    return table.get(value)


def fix_file(path, tables, ids, dry):
    s = open(path, encoding="utf-8").read()
    orig = s

    # --- 1. unresolved theme refs -------------------------------------
    def ref_repl(m):
        key = "0x" + m.group(1).lower()
        got = ids.get(key)
        if got and got[0] == "attr":
            report["ref_ok"] += 1
            return "?attr/%s" % got[1]
        report["ref_fail"] += 1
        return ""  # drop the whole <item> (parent style supplies a value)

    s = re.sub(
        r'[ \t]*<item name="[^"]+">\?unknown_ref:\s*[0-9a-fA-F]{8}</item>\n',
        lambda m: (report.__setitem__("ref_fail", report["ref_fail"] + 1) or ""),
        s,
    )

    # --- 2. numeric enum / flag values --------------------------------
    def item_repl(m):
        attr, raw = m.group(1), m.group(2)
        base = attr.split(":", 1)[-1] if attr.startswith("android:") else attr
        info = tables.get(base)
        if not info:
            return m.group(0)
        try:
            iv = int(raw, 0)
        except ValueError:
            return m.group(0)
        sym = flags_symbolic(iv, info["map"]) if info["kind"] == "flags" else enum_symbolic(iv, info["map"])
        if sym is None:
            report["unresolved"].append((os.path.basename(path), attr, raw, base, info["kind"]))
            return m.group(0)
        report["enum_ok" if info["kind"] == "enum" else "flag_ok"] += 1
        return '<item name="%s">%s</item>' % (attr, sym)

    s = re.sub(
        r'<item name="([^"]+)">(-?0x[0-9a-fA-F]+|-?\d+)</item>', item_repl, s
    )

    if s != orig and not dry:
        open(path, "w", encoding="utf-8").write(s)
    return s != orig


def main():
    dry = "--dry-run" in sys.argv
    print("loading ...")
    tables = load_tables()
    ids = load_ids()
    files = sorted(glob.glob(os.path.join(RES, "values*", "*.xml")))
    changed = 0
    for f in files:
        if fix_file(f, tables, ids, dry):
            changed += 1
    print(
        "files changed: %d | refs ok=%d fail=%d | enum=%d flags=%d | unresolved=%d"
        % (changed, report["ref_ok"], report["ref_fail"], report["enum_ok"], report["flag_ok"], len(report["unresolved"]))
    )
    for u in report["unresolved"][:40]:
        print("   unresolved:", u)
    return 0


if __name__ == "__main__":
    sys.exit(main())
