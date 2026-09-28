package defpackage;

import android.os.Build;
import android.os.UserManager;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class kf3 {
    public static UserManager a;
    public static volatile boolean b = !a();

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(android.content.Context r7) {
        /*
            boolean r0 = defpackage.kf3.b
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Class<kf3> r0 = defpackage.kf3.class
            monitor-enter(r0)
            boolean r2 = defpackage.kf3.b     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r7 = move-exception
            goto L4a
        L11:
            r2 = r1
        L12:
            r3 = 2
            r4 = 0
            r5 = 0
            if (r2 > r3) goto L40
            android.os.UserManager r3 = defpackage.kf3.a     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L25
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> Lf
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch: java.lang.Throwable -> Lf
            defpackage.kf3.a = r3     // Catch: java.lang.Throwable -> Lf
        L25:
            if (r3 != 0) goto L29
            r5 = r1
            goto L44
        L29:
            boolean r6 = r3.isUserUnlocked()     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3b
            if (r6 != 0) goto L39
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3b
            boolean r7 = r3.isUserRunning(r6)     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3b
            if (r7 != 0) goto L40
        L39:
            r5 = r1
            goto L40
        L3b:
            defpackage.kf3.a = r4     // Catch: java.lang.Throwable -> Lf
            int r2 = r2 + 1
            goto L12
        L40:
            if (r5 == 0) goto L44
            defpackage.kf3.a = r4     // Catch: java.lang.Throwable -> Lf
        L44:
            if (r5 == 0) goto L48
            defpackage.kf3.b = r1     // Catch: java.lang.Throwable -> Lf
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r5
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kf3.b(android.content.Context):boolean");
    }
}
