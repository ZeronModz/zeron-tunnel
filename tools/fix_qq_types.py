#!/usr/bin/env python3
"""Replace jadx's '??' placeholder types with real Java types.

For every *code* occurrence of `?? ident` (comments/strings untouched):

  ?? x = new Foo(...)        -> Foo
  ?? x = new Foo$Bar() {...} -> Foo$Bar
  ?? x = (Foo) expr          -> Foo
  ?? x = 0                   -> int
  ?? x = identY              -> type(identY)          (recursive)
  ?? x = obj.method(...)     -> return type of method (context aware)
  ?? x = Class.method(...)   -> return type of method in that class
  ?? x;                      -> type from later `x = expr`

Fallback when nothing is found: report for manual fixing.

Usage:  python3 tools/fix_qq_types.py [--dry-run]
"""
import re
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
SRC = ROOT / "app/src/main/java"
DRY = "--dry-run" in sys.argv

JAVA_FILES = sorted(p for p in SRC.rglob("*.java"))

DECL = re.compile(
    r'^\s*(?:(?:public|private|protected|static|final|abstract|synchronized|native|default|strictfp|canonical)\s+)+'
    r'(?P<type>[A-Za-z_$][\w$]*(?:\s*\.\s*[A-Za-z_$][\w$]*)*(?:\s*<[^;={}()]+>)?(?:\s*\[\s*\])*)\s+'
    r'(?P<name>[A-Za-z_$][\w$]*)\s*\('
)
DECL2 = re.compile(
    r'^\s*(?:(?:public|private|protected|static|final|abstract|synchronized|native|default|strictfp|canonical|transient|volatile)\s+)+'
    r'(?P<type>[A-Za-z_$][\w$]*(?:\s*\.\s*[A-Za-z_$][\w$]*)*(?:\s*<[^;={}()]+>)?(?:\s*\[\s*\])*)\s+'
    r'(?P<name>[A-Za-z_$][\w$]*)\s*\((?P<args>[^)]*)\)\s*(?:throws [\w.,\s]+)?\s*\{'
)
FIELD = re.compile(
    r'^\s*(?:(?:public|private|protected|static|final|volatile|transient)\s+)+'
    r'(?P<type>[A-Za-z_$][\w$]*(?:\s*\.\s*[A-Za-z_$][\w$]*)*(?:\s*<[^;={}()]+>)?(?:\s*\[\s*\])*)\s+'
    r'(?P<name>[A-Za-z_$][\w$]*)\s*(?:=[^;]*)?;'
)
VARDECL = re.compile(
    r'\b(?P<type>[A-Za-z_$][\w$]*(?:\s*\.\s*[A-Za-z_$][\w$]*)*(?:\s*<[^;={}()]+>)?(?:\s*\[\s*\])*)\s+'
    r'(?P<name>[A-Za-z_$][\w$]*)\s*(?==[^(]*;|\s*[;,)])'
)

JDK_STATIC = [
    ("Collections.EMPTY_LIST", "List"),
    ("Collections.emptyList(", "List"),
    ("Collections.emptySet(", "Set"),
    ("Collections.emptyMap(", "Map"),
    ("Collections.singletonList(", "List"),
    ("Arrays.asList(", "List"),
    ("Boolean.valueOf(", "Boolean"),
    ("Integer.valueOf(", "Integer"),
    ("Long.valueOf(", "Long"),
    ("Double.valueOf(", "Double"),
    ("Float.valueOf(", "Float"),
    ("String.valueOf(", "String"),
    ("URLDecoder.decode(", "String"),
    ("URLEncoder.encode(", "String"),
    ("System.currentTimeMillis(", "long"),
    ("Math.max(", "int"),
    ("Math.min(", "int"),
    ("Math.abs(", "int"),
    ("Math.round(", "long"),
    ("Math.sqrt(", "double"),
]

SKIP_TYPES = {
    "return", "new", "throw", "if", "else", "for", "while", "switch",
    "case", "catch", "do", "class", "interface", "enum", "package",
    "import", "instanceof", "try", "finally", "super", "this", "void",
    "assert", "break", "continue", "synchronized", "default",
}

# method name -> list of (return type, class file or None)
METHODS = {}
# class simple name / fq name -> file
CLASSES = {}
# field name -> types (per class file)
FIELDS = {}


def norm(t):
    return re.sub(r"\s+", "", t)


def build_index():
    for f in JAVA_FILES:
        txt = f.read_text(encoding="utf-8", errors="replace")
        # class names present in this file
        for m in re.finditer(r"\b(?:class|interface|enum)\s+([A-Za-z_$][\w$]*)", txt):
            CLASSES.setdefault(m.group(1), f)
        txt = re.sub(r"/\*.*?\*/", " ", txt, flags=re.S)
        for line in txt.splitlines():
            m = DECL2.match(line)
            if m and m.group("type") not in SKIP_TYPES:
                rt = norm(m.group("type"))
                if rt not in SKIP_TYPES:
                    METHODS.setdefault(m.group("name"), []).append((rt, f))
            m2 = FIELD.match(line)
            if m2 and m2.group("type") not in SKIP_TYPES:
                FIELDS.setdefault(m2.group("name"), set()).add((norm(m2.group("type")), f))
        # import map for fq names
    # import index: fq name -> file
    for f in JAVA_FILES:
        CLASSES.setdefault(f.stem, f)


IMPORTS = {}


def build_imports():
    for f in JAVA_FILES:
        for m in re.finditer(r"^import\s+(?:static\s+)?([\w.]+);", f.read_text(encoding="utf-8", errors="replace"), re.M):
            IMPORTS.setdefault(m.group(1).split(".")[-1], []).append(m.group(1))


def class_file(name, current):
    """Locate the source file for a class-ish name."""
    name = name.strip().split("<")[0]
    simple = name.split(".")[-1].split("$")[-1]
    for key in (name, simple):
        if key in CLASSES:
            return CLASSES[key]
    if simple in IMPORTS:
        fq = IMPORTS[simple][0].replace(".", "/") + ".java"
        p = SRC / fq
        if p.exists():
            return p
    return None


def method_return(meth, recv_type=None, current=None):
    """Return type of meth, narrowed by receiver class when possible."""
    cands = METHODS.get(meth, [])
    if not cands:
        return None
    if recv_type:
        f = class_file(recv_type, current)
        if f:
            local = [rt for rt, cf in cands if cf == f]
            if local:
                return local[0]
    uniq = {rt for rt, _ in cands}
    if len(uniq) == 1:
        return cands[0][0]
    # prefer same file
    if current:
        local = [rt for rt, cf in cands if cf == current]
        if len(set(local)) == 1:
            return local[0]
    if recv_type:
        f = class_file(recv_type, current)
        if f:
            local = [rt for rt, cf in cands if cf and cf.parent.name == f.parent.name]
            if local:
                return local[0]
    return None


def field_type(name, current):
    cands = FIELDS.get(name)
    if not cands:
        return None
    if len({t for t, _ in cands}) == 1:
        return next(iter(cands))[0]
    if current:
        local = [t for t, cf in cands if cf == current]
        if len(set(local)) == 1:
            return local[0]
    return None


class FileCtx:
    def top_class(self):
        txt = self.path.read_text(encoding="utf-8", errors="replace")
        m = re.search(r"\b(?:class|interface|enum)\s+([A-Za-z_$][\w$]*)", txt)
        return m.group(1) if m else None

    def imports(self):
        if not hasattr(self, "_imports"):
            txt = self.path.read_text(encoding="utf-8", errors="replace")
            self._imports = [m.group(1) for m in re.finditer(r"^import\s+(?:static\s+)?([\w.$]+);", txt, re.M)]
        return self._imports

    def resolve_nested(self, name):
        if "$" not in name:
            return name
        for imp in self.imports():
            if imp == name or imp.endswith("." + name) or imp.split(".")[-1] == name:
                return name
        outer = name.split("$")[0]
        for imp in self.imports():
            if imp.split(".")[-1] == outer:
                pkg = imp.rsplit(".", 1)[0]
                return pkg + "." + outer + "." + name.split("$", 1)[1]
        if class_file(outer, self.path) is not None:
            return outer + "." + name.split("$", 1)[1]
        if class_file(name, self.path) is not None:
            return name
        return name

    def __init__(self, path):
        self.path = path
        raw = path.read_text(encoding="utf-8", errors="replace")
        raw = re.sub(r"/\*.*?\*/", " ", raw, flags=re.S)
        self.lines = raw.splitlines()
        self.known = {}  # var -> type
        self.qq = {}     # var -> line no (declared with ??)

    def strip_comment(self, line):
        if "//" in line:
            line = line[: line.index("//")]
        return line

    def local_type(self, var):
        if var in self.known:
            return self.known[var]
        for line in self.lines:
            m = VARDECL.search(self.strip_comment(line))
            if m and m.group("name") == var and m.group("type") not in SKIP_TYPES:
                t = norm(m.group("type"))
                if t not in SKIP_TYPES:
                    return t
        return None

    def infer(self, expr, depth=0):
        expr = expr.strip()
        for pref, typ in JDK_STATIC:
            if expr.startswith(pref):
                return typ
        if depth > 6:
            return None
        # cast
        m = re.match(r"^\(([^()]+)\)", expr)
        if m and not m.group(1).strip().startswith("new"):
            t = norm(m.group(1).split("<")[0])
            if t not in SKIP_TYPES:
                return t
        # new Type
        m = re.match(r"^new\s+([A-Za-z_$][\w$.]*)\s*(?:<[^>]*>)?\s*\(", expr)
        if m:
            return self.resolve_nested(m.group(1))
        # literal
        if re.match(r"^-?\d", expr) or expr.startswith("Integer."):
            if expr.endswith("L"):
                return "long"
            return "int"
        if re.match(r"^-?[\d.]+[fF]$", expr):
            return "float"
        if expr.startswith('"'):
            return "String"
        if expr in ("true", "false"):
            return "boolean"
        if expr.startswith("null"):
            return None
        # receiver.method(  or Class.method(
        m = re.match(r"^([A-Za-z_$][\w$.]*)\.([A-Za-z_$][\w$]*)\s*\(", expr)
        if m:
            recv, meth = m.group(1), m.group(2)
            recv_t = self.local_type(recv)
            if recv_t is None and (recv[:1].isupper() or recv in CLASSES or recv.split(".")[0] in CLASSES):
                recv_t = recv
            rt = method_return(meth, recv_t, self.path)
            if rt:
                return rt
        # bare method call in same file
        m = re.match(r"^([A-Za-z_$][\w$]*)\s*\(", expr)
        if m:
            rt = method_return(m.group(1), None, self.path)
            if rt:
                return rt
        if expr in ("this", "super"):
            t = self.top_class()
            if t:
                return t
        # identifier / field
        m = re.match(r"^([A-Za-z_$][\w$.]+)$", expr)
        if m:
            name = m.group(1)
            simple = name.split(".")[-1]
            t = self.local_type(name)
            if t:
                return t
            t = field_type(simple, self.path)
            if t:
                return t
        # ternary / binary: try sub-expressions
        if " ? " in expr:
            a = expr.split(" ? ")[1].split(" : ")[0]
            t = self.infer(a, depth + 1)
            if t:
                return t
        return None


def run():
    build_index()
    build_imports()
    total = 0
    done = 0
    unresolved = []
    for f in JAVA_FILES:
        ctx = FileCtx(f)
        # collect ?? declarations
        decls = []  # (idx, var)
        unres_local = []
        for i, line in enumerate(ctx.lines):
            stripped = line
            # ignore lines that are comments
            s = stripped.lstrip()
            if s.startswith("//") or s.startswith("*") or s.startswith("/*"):
                continue
            if "??" not in line:
                continue
            code = ctx.strip_comment(line)
            for m in re.finditer(r"\?\?\s+([A-Za-z_$][\w$]*)", code):
                var = m.group(1)
                decls.append((i, var, m.group(0)))
        if not decls:
            continue
        # resolve
        repl = {}
        for i, var, tok in decls:
            total += 1
            code = ctx.strip_comment(ctx.lines[i])
            typ = None
            m = re.search(re.escape(tok) + r"\s*=\s*(.+?)(?:;|\{|$)", code)
            if m:
                typ = ctx.infer(m.group(1))
            if typ is None:
                # look ahead for assignment
                for j in range(i + 1, min(i + 200, len(ctx.lines))):
                    c2 = ctx.strip_comment(ctx.lines[j])
                    m2 = re.search(r"\b" + re.escape(var) + r"\s*=\s*(.+?);", c2)
                    if m2:
                        typ = ctx.infer(m2.group(1))
                        if typ:
                            break
            if typ is None:
                typ = ctx.local_type(var)
            if typ:
                done += 1
                repl.setdefault(i, []).append((tok, f"{typ} {var}"))
                ctx.known[var] = typ
            else:
                unres_local.append((i, var, tok))
        # second pass: propagate types that only became known later
        for i, var, tok in list(unres_local):
            if i in {k for k, _ in [(a, b) for a, b in []]}:
                pass
            code = ctx.strip_comment(ctx.lines[i]) if False else None
        for i, var, tok in list(unres_local):
            typ = None
            code = ctx.strip_comment(ctx.lines[i])
            m = re.search(re.escape(tok) + r"\s*=\s*(.+?)(?:;|\{|$)", code)
            if m:
                typ = ctx.infer(m.group(1))
            if typ is None:
                for j in range(i + 1, min(i + 200, len(ctx.lines))):
                    c2 = ctx.strip_comment(ctx.lines[j])
                    m2 = re.search(r"\b" + re.escape(var) + r"\s*=\s*(.+?);", c2)
                    if m2:
                        typ = ctx.infer(m2.group(1))
                        if typ:
                            break
            if typ:
                done += 1
                repl.setdefault(i, []).append((tok, f"{typ} {var}"))
                ctx.known[var] = typ
                unres_local.remove((i, var, tok))

        for i, var, tok in unres_local:
            unresolved.append(f"{f.relative_to(SRC)}:{i+1}: {ctx.lines[i].strip()}")
        if repl and not DRY:
            for i, subs in repl.items():
                line = ctx.lines[i]
                for tok, new in subs:
                    line = line.replace(tok, new, 1)
                ctx.lines[i] = line
            f.write_text("\n".join(ctx.lines) + "\n", encoding="utf-8")

    print(f"?? declarations: {total}, resolved: {done}, unresolved: {len(unresolved)}")
    for u in unresolved:
        print("   ", u)
    if DRY:
        print("(dry-run)")


run()
