package com.vpn.sandok.ultrasshservice.util;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class CustomNativeLoader {
    private static final String TAG = "CNL";

    private static String getNativeLibraryDir(Context context) {
        return context.getApplicationInfo().nativeLibraryDir;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean loadFromZip(android.content.Context r8, java.lang.String r9, java.io.File r10, java.lang.String r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpn.sandok.ultrasshservice.util.CustomNativeLoader.loadFromZip(android.content.Context, java.lang.String, java.io.File, java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r8.canExecute() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r0.canExecute() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File loadNativeBinary(android.content.Context r6, java.lang.String r7, java.io.File r8) {
        /*
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = getNativeLibraryDir(r6)     // Catch: java.lang.Throwable -> L8c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c
            r2.<init>()     // Catch: java.lang.Throwable -> L8c
            r2.append(r7)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r3 = ".so"
            r2.append(r3)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L8c
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L8c
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L8c
            if (r1 == 0) goto L31
            boolean r1 = r0.canExecute()     // Catch: java.lang.Throwable -> L8c
            if (r1 == 0) goto L27
            goto L30
        L27:
            setExecutable(r0)     // Catch: java.lang.Throwable -> L8c
            boolean r1 = r0.canExecute()     // Catch: java.lang.Throwable -> L8c
            if (r1 == 0) goto L48
        L30:
            return r0
        L31:
            boolean r0 = r8.exists()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L48
            boolean r0 = r8.canExecute()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L3e
            goto L47
        L3e:
            setExecutable(r8)     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r8.canExecute()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L48
        L47:
            return r8
        L48:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8c
            r0.<init>()     // Catch: java.lang.Throwable -> L8c
            java.lang.String[] r1 = android.os.Build.SUPPORTED_ABIS     // Catch: java.lang.Throwable -> L8c
            if (r1 == 0) goto L63
            int r2 = r1.length     // Catch: java.lang.Throwable -> L8c
            r3 = 0
        L53:
            if (r3 >= r2) goto L63
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L8c
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L8c
            if (r5 != 0) goto L60
            r0.add(r4)     // Catch: java.lang.Throwable -> L8c
        L60:
            int r3 = r3 + 1
            goto L53
        L63:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L8c
        L67:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L8c
            if (r1 == 0) goto L90
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = "os.arch"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L85
            java.lang.String r3 = "686"
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L85
            java.lang.String r1 = "x86"
        L85:
            boolean r1 = loadFromZip(r6, r7, r8, r1)     // Catch: java.lang.Throwable -> L8c
            if (r1 == 0) goto L67
            return r8
        L8c:
            r6 = move-exception
            r6.getMessage()
        L90:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpn.sandok.ultrasshservice.util.CustomNativeLoader.loadNativeBinary(android.content.Context, java.lang.String, java.io.File):java.io.File");
    }

    private static void setExecutable(File file) {
        file.setReadable(true);
        file.setExecutable(true);
        file.setWritable(false);
        file.setWritable(true, true);
    }
}
