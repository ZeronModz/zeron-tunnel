#!/usr/bin/env bash
# ---------------------------------------------------------------------------
# assemble.sh — jadx decompiled output → Gradle project sources
#
# input :  reverse/src/sources        (jadx java sources, 18k files)
#         reverse/res_out/resources   (decoded AndroidManifest + res + assets)
#         reverse/so                  (native libs from split apk)
# output:  App_SRC/app/src/main/{java,res,assets,jniLibs,AndroidManifest.xml}
#
# transformations:
#   1. drop packages provided by Maven (androidx, kotlin, google, okhttp3 ...)
#   2. drop j$ (desugar backport)  -> rewrite  j$.X  ->  java.X
#   3. package  co.strongteam.ultra  ->  dev.zeron.tunnel
#   4. ext      ".ultra"             ->  ".zeron"   (+ mime x-ultra -> x-zeron)
#   5. manifest: strip package/version attrs, ads APPLICATION_ID -> test id
# ---------------------------------------------------------------------------
set -euo pipefail

HERE="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
APP_ROOT="$(dirname "$HERE")"
REV="$(cd "$APP_ROOT/../reverse" && pwd)"

SRC="$REV/src/sources"
RES_DIR="$REV/res_out/resources"
OUT="$APP_ROOT/app/src/main"

say() { printf '\033[1;36m[assemble]\033[0m %s\n' "$*"; }

[ -d "$SRC" ] || { echo "missing: $SRC"; exit 1; }
[ -d "$RES_DIR" ] || { echo "missing: $RES_DIR"; exit 1; }

# ---------------------------------------------------------------- 1. sources
say "copying java sources (with exclusions) ..."
rm -rf "$OUT/java"
mkdir -p "$OUT/java"

EXCLUDES=(
  --exclude='./android'
  --exclude='./androidx'
  --exclude='./java'
  --exclude='./javax'
  --exclude='./kotlin'
  --exclude='./j$'
  --exclude='./okhttp3'
  --exclude='./okio'
  --exclude='./junit'
  --exclude='./kotlinx/coroutines'
  --exclude='./kotlinx/serialization'
  --exclude='./kotlinx/parcelize'
  --exclude='./com/google/ads'
  --exclude='./com/google/android'
  --exclude='./com/google/common'
  --exclude='./com/google/errorprone'
  --exclude='./com/google/firebase'
  --exclude='./com/google/gson'
  --exclude='./com/google/zxing'
  --exclude='./org/junit'
  --exclude='./org/hamcrest'
  --exclude='./org/checkerframework'
  --exclude='./org/chromium'
  --exclude='./org/jetbrains'
  --exclude='./org/intellij'
  --exclude='./org/jspecify'
  --exclude='./org/conscrypt'
  --exclude='./org/slf4j'
  --exclude='./com/google/thirdparty'
)
( cd "$SRC" && tar cf - "${EXCLUDES[@]}" . ) | tar xf - -C "$OUT/java"

n=$(find "$OUT/java" -name '*.java' | wc -l)
say "copied $n java files"

# ------------------------------------------------------- 2. package renames
say "renaming package co.strongteam.ultra -> dev.zeron.tunnel ..."

if [ -d "$OUT/java/co/strongteam/ultra" ]; then
  mkdir -p "$OUT/java/dev/zeron"
  rm -rf "$OUT/java/dev/zeron/tunnel"
  mv "$OUT/java/co/strongteam/ultra" "$OUT/java/dev/zeron/tunnel"
  rm -rf "$OUT/java/co"
fi

# ------------------------------------------------------------- 3. j$ -> java
say "rewriting j$ desugar backport -> java.*"
rm -rf "$OUT/java/j\$"
find "$OUT/java" -name '*.java' -print0 | xargs -0 sed -i \
  -e 's/\bj\$\./java./g'

# ------------------------------------------------- 4. package + extension
say "rewriting package refs + extension .ultra -> .zeron ..."
find "$OUT/java" -name '*.java' -print0 | xargs -0 sed -i \
  -e 's/co\.strongteam\.ultra/dev.zeron.tunnel/g' \
  -e 's/\.ultra"/.zeron"/g' \
  -e 's|application/x-ultra|application/x-zeron|g'

# ------------------------------------------------------------- 5. resources
say "copying res + assets ..."
rm -rf "$OUT/res" "$OUT/assets"
mkdir -p "$OUT" "$OUT/assets"
tar cf - -C "$RES_DIR" res | tar xf - -C "$OUT"
tar cf - -C "$RES_DIR" assets | tar xf - -C "$OUT"

# jadx public.xml pins fixed ids -> conflicts with library resources
rm -f "$OUT/res/values/public.xml"

# drop google-services generated values (plugin regenerates them)
if [ -f "$OUT/res/values/strings.xml" ]; then
  python3 - "$OUT/res/values/strings.xml" <<'PY'
import re, sys
p = sys.argv[1]
s = open(p, encoding='utf-8').read()
names = ["google_app_id", "gcm_defaultSenderId", "google_api_key",
         "google_crash_reporting_api_key", "project_id",
         "google_storage_bucket", "google_storage_bucket", "firebase_database_url",
         "default_web_client_id", "project_number"]
for n in names:
    s = re.sub(r'\s*<string name="%s">.*?</string>' % n, '', s, flags=re.S)
open(p, 'w', encoding='utf-8').write(s)
PY
fi

# -------------------------------------------------------------- 6. manifest
say "rewriting AndroidManifest.xml ..."
python3 - "$RES_DIR/AndroidManifest.xml" "$OUT/AndroidManifest.xml" <<'PY'
import re, sys
src, dst = sys.argv[1], sys.argv[2]
s = open(src, encoding='utf-8').read()

# package / version / build-sdk attributes are owned by Gradle now
for attr in ["package", "versionCode", "versionName", "compileSdkVersion",
             "compileSdkVersionCodename", "platformBuildVersionCode",
             "platformBuildVersionName", "requiredSplitTypes", "splitTypes"]:
    s = re.sub(r'\s*android:%s="[^"]*"' % attr, '', s)
    s = re.sub(r'\s*%s="[^"]*"' % attr, '', s)

# <uses-sdk> is supplied by the gradle module
s = re.sub(r'<uses-sdk\b[^>]*/>', '', s)

# package rename (authorities, permissions, component names)
s = s.replace("co.strongteam.ultra", "dev.zeron.tunnel")

s = s.replace("application/x-ultra", "application/x-zeron")

# redundant: already declared by the play-services-ads manifest
for _n in ("com.google.android.gms.ads.AdActivity",
           "com.google.android.gms.ads.OutOfContextTestingActivity"):
    s = re.sub(r'[ \t]*<activity\b[^>]*?android:name="%s"[^>]*?(?:/>|>.*?</activity>)\n'
               % re.escape(_n), "", s, flags=re.S)

# AdMob app id -> google test id (no ad account needed)
s = re.sub(r'(<meta-data\s+android:name="com\.google\.android\.gms\.ads\.APPLICATION_ID"\s+'
           r'android:value=")[^"]*(")',
           r'\g<1>ca-app-pub-3940256099942544~3347511713\g<2>', s)

open(dst, 'w', encoding='utf-8').write(s)
print("manifest ok")
PY

# -------------------------------------------------------------- 7. jniLibs
if [ -d "$REV/so" ]; then
  say "copying native libs ..."
  rm -rf "$OUT/jniLibs"
  mkdir -p "$OUT/jniLibs"
  tar cf - -C "$REV/so/lib" . | tar xf - -C "$OUT/jniLibs"
fi

say "done."
find "$OUT" -maxdepth 1 -mindepth 1 | sort | sed 's/^/    /'
