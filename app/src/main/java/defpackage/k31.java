package defpackage;

import com.google.android.gms.internal.ads.zzaev;
import com.google.android.gms.internal.ads.zzer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class k31 {
    public int a;
    public long b;

    public static k31 e(zzaev zzaevVar, zzer zzerVar) {
        zzaevVar.zzi(zzerVar.a, 0, 8);
        zzerVar.D(0);
        int iB = zzerVar.b();
        long jA = zzerVar.a();
        k31 k31Var = new k31();
        k31Var.a = iB;
        k31Var.b = jA;
        return k31Var;
    }

    public synchronized long a(int i) {
        if (i != 429 && (i < 500 || i >= 600)) {
            return 86400000L;
        }
        return (long) Math.min(Math.pow(2.0d, this.a) + ((long) (Math.random() * 1000.0d)), 1800000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean b() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.a     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L12
            long r2 = r4.b     // Catch: java.lang.Throwable -> L12
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L10
            goto L14
        L10:
            r0 = 0
            goto L15
        L12:
            r0 = move-exception
            goto L17
        L14:
            r0 = 1
        L15:
            monitor-exit(r4)
            return r0
        L17:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k31.b():boolean");
    }

    public synchronized void c() {
        this.a = 0;
    }

    public synchronized void d(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            c();
            return;
        }
        this.a++;
        this.b = System.currentTimeMillis() + a(i);
    }
}
