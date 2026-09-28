package defpackage;

import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzaed;
import com.google.android.gms.internal.ads.zzaef;
import com.google.android.gms.internal.ads.zzaev;
import com.google.android.gms.internal.ads.zzafv;
import com.google.common.util.concurrent.Monitor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dr0 {
    public int a;
    public final Object b;
    public final Object c;
    public Object d;

    public dr0(zzaed zzaedVar, zzaef zzaefVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.c = zzaefVar;
        this.a = i;
        this.b = new zzaea(zzaedVar, j, 0L, j2, j3, j4, j5);
    }

    public static final int d(zzaev zzaevVar, long j, zzafv zzafvVar) {
        if (j == zzaevVar.zzn()) {
            return 0;
        }
        zzafvVar.a = j;
        return 1;
    }

    public abstract boolean a();

    public void b(long j) {
        nw1 nw1Var = (nw1) this.d;
        if (nw1Var == null || nw1Var.a != j) {
            zzaea zzaeaVar = (zzaea) this.b;
            this.d = new nw1(j, zzaeaVar.a.zza(j), zzaeaVar.c, zzaeaVar.d, zzaeaVar.e, zzaeaVar.f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c8, code lost:
    
        return d(r28, r9, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c(com.google.android.gms.internal.ads.zzaev r28, com.google.android.gms.internal.ads.zzafv r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr0.c(com.google.android.gms.internal.ads.zzaev, com.google.android.gms.internal.ads.zzafv):int");
    }

    public dr0(Monitor monitor) {
        this.a = 0;
        cn0.n(monitor, "monitor");
        this.b = monitor;
        this.c = monitor.b.newCondition();
    }
}
