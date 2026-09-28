package defpackage;

import com.google.common.base.Optional;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class uf3 {
    public static volatile Optional a = Optional.absent();
    public static final Object b = new Object();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0073 A[Catch: all -> 0x0045, TRY_LEAVE, TryCatch #0 {all -> 0x0045, blocks: (B:12:0x002f, B:14:0x0037, B:15:0x0043, B:19:0x0047, B:21:0x0053, B:25:0x0063, B:27:0x0069, B:34:0x0084, B:35:0x008e, B:29:0x0073, B:30:0x0077, B:31:0x007d), top: B:41:0x002f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r0 = "com.google.android.gms.phenotype"
            java.lang.String r6 = r6.getAuthority()
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 != 0) goto L17
            java.lang.String r5 = java.lang.String.valueOf(r6)
            java.lang.String r6 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            r5.concat(r6)
            return r1
        L17:
            com.google.common.base.Optional r6 = defpackage.uf3.a
            boolean r6 = r6.isPresent()
            if (r6 == 0) goto L2c
            com.google.common.base.Optional r5 = defpackage.uf3.a
            java.lang.Object r5 = r5.get()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L2c:
            java.lang.Object r6 = defpackage.uf3.b
            monitor-enter(r6)
            com.google.common.base.Optional r0 = defpackage.uf3.a     // Catch: java.lang.Throwable -> L45
            boolean r0 = r0.isPresent()     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L47
            com.google.common.base.Optional r5 = defpackage.uf3.a     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L45
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L45
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L45
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L45
            return r5
        L45:
            r5 = move-exception
            goto L9c
        L47:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L45
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L73
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L45
            r4 = 29
            if (r3 >= r4) goto L61
            r3 = r1
            goto L63
        L61:
            r3 = 268435456(0x10000000, float:2.524355E-29)
        L63:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L84
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> L45
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L84
        L73:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r0, r1)     // Catch: java.lang.Throwable -> L45 android.content.pm.PackageManager.NameNotFoundException -> L84
            int r5 = r5.flags     // Catch: java.lang.Throwable -> L45
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L84
            r1 = 1
        L84:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L45
            com.google.common.base.Optional r5 = com.google.common.base.Optional.of(r5)     // Catch: java.lang.Throwable -> L45
            defpackage.uf3.a = r5     // Catch: java.lang.Throwable -> L45
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L45
            com.google.common.base.Optional r5 = defpackage.uf3.a
            java.lang.Object r5 = r5.get()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L9c:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L45
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uf3.a(android.content.Context, android.net.Uri):boolean");
    }
}
