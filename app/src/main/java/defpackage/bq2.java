package defpackage;

import com.google.android.gms.internal.ads.zzenr;
import com.google.android.gms.internal.ads.zzens;
import com.google.android.gms.internal.ads.zzenv;
import com.google.android.gms.internal.ads.zzfjc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bq2 {
    public final b43 c;
    public zzens f;
    public final String h;
    public final int i;
    public final zzenr j;
    public tt2 k;
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public int g = Integer.MAX_VALUE;
    public boolean l = false;

    public bq2(zzfjc zzfjcVar, zzenr zzenrVar, b43 b43Var) {
        zt2 zt2Var = zzfjcVar.b;
        this.i = zt2Var.b.r;
        this.j = zzenrVar;
        this.c = b43Var;
        this.h = hq2.a(zzfjcVar);
        List list = zt2Var.a;
        for (int i = 0; i < list.size(); i++) {
            this.a.put((tt2) list.get(i), Integer.valueOf(i));
        }
        this.b.addAll(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r2.v0 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r6.l = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r4.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        r6.d.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        return (defpackage.tt2) r1.remove(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.tt2 a() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.e()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L43
            r0 = 0
        L8:
            java.util.ArrayList r1 = r6.b     // Catch: java.lang.Throwable -> L2b
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L2b
            if (r0 >= r2) goto L43
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L2b
            tt2 r2 = (defpackage.tt2) r2     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r2.t0     // Catch: java.lang.Throwable -> L2b
            java.util.HashSet r4 = r6.e     // Catch: java.lang.Throwable -> L2b
            boolean r5 = r4.contains(r3)     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L23
            int r0 = r0 + 1
            goto L8
        L23:
            boolean r5 = r2.v0     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L2d
            r5 = 1
            r6.l = r5     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r0 = move-exception
            goto L46
        L2d:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L2b
            if (r5 != 0) goto L36
            r4.add(r3)     // Catch: java.lang.Throwable -> L2b
        L36:
            java.util.ArrayList r3 = r6.d     // Catch: java.lang.Throwable -> L2b
            r3.add(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r0 = r1.remove(r0)     // Catch: java.lang.Throwable -> L2b
            tt2 r0 = (defpackage.tt2) r0     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r6)
            return r0
        L43:
            monitor-exit(r6)
            r6 = 0
            return r6
        L46:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bq2.a():tt2");
    }

    public final synchronized void b(zzens zzensVar, tt2 tt2Var) {
        this.l = false;
        this.d.remove(tt2Var);
        if (d()) {
            zzensVar.zzm();
            return;
        }
        Integer num = (Integer) this.a.get(tt2Var);
        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (iIntValue > this.g) {
            this.j.e(tt2Var);
            return;
        }
        if (this.f != null) {
            this.j.e(this.k);
        }
        this.g = iIntValue;
        this.f = zzensVar;
        this.k = tt2Var;
        if (h()) {
            return;
        }
        i();
    }

    public final synchronized void c(tt2 tt2Var) {
        this.l = false;
        this.d.remove(tt2Var);
        this.e.remove(tt2Var.t0);
        if (d() || h()) {
            return;
        }
        i();
    }

    public final synchronized boolean d() {
        return this.c.isDone();
    }

    public final synchronized boolean e() {
        if (this.l) {
            return false;
        }
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty() && ((tt2) arrayList.get(0)).v0 && !this.d.isEmpty()) {
            return false;
        }
        if (!d()) {
            ArrayList arrayList2 = this.d;
            if (arrayList2.size() < this.i) {
                if (f(false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final synchronized boolean f(boolean z) {
        try {
            for (tt2 tt2Var : this.b) {
                Integer num = (Integer) this.a.get(tt2Var);
                int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z || !this.e.contains(tt2Var.t0)) {
                    int i = this.g;
                    if (iIntValue < i) {
                        return true;
                    }
                    if (iIntValue > i) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean g() {
        try {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.a.get((tt2) it.next());
                if ((num != null ? num.intValue() : Integer.MAX_VALUE) < this.g) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean h() {
        if (!f(true)) {
            if (!g()) {
                return false;
            }
        }
        return true;
    }

    public final synchronized void i() {
        this.j.c(this.k);
        zzens zzensVar = this.f;
        b43 b43Var = this.c;
        if (zzensVar != null) {
            b43Var.c(zzensVar);
        } else {
            b43Var.d(new zzenv(3, this.h));
        }
    }
}
