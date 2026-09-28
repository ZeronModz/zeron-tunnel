# Zeron Tunnel

Android VPN client (fork of Ultra Tunnel), applicationId `dev.zeron.tunnel`.

- Sources are generated from the original APK with **jadx**, then re-assembled
  by `tools/assemble.sh` into a standard Gradle project.
- Config files use the **`.zeron`** extension (was `.ultra`); mime type
  `application/x-zeron`.
- Firebase config comes from `app/google-services.json`.
- Ads: Google **test** App ID is used in the manifest
  (`ca-app-pub-3940256099942544~3347511713`).

## Build

CI: `.github/workflows/build.yml` → JDK 21, Gradle 8.11.1, AGP 8.9.2,
compileSdk 36. Artifact: `app-debug.apk`.

Locally (needs Android SDK 36 + JDK 21):

```
tools/assemble.sh        # regenerate src/main from reverse/ (optional)
gradle :app:assembleDebug
```

## Layout

```
app/src/main/java      sources (dev.zeron.tunnel, libv2ray, go, bundled libs)
app/src/main/res       resources from the APK
app/src/main/assets    geoip.dat, geosite.dat, ...
app/src/main/jniLibs   arm64-v8a/libgojni.so
reverse/               jadx output (outside the git repo when cloned)
```
