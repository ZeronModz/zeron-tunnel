package defpackage;

import com.google.android.gms.internal.ads.zzikp;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xe3 implements zzikp {
    public static final Object c = new Object();
    public volatile zzikp a;
    public volatile Object b;

    public static zzikp a(zzikp zzikpVar) {
        if ((zzikpVar instanceof xe3) || (zzikpVar instanceof se3)) {
            return zzikpVar;
        }
        xe3 xe3Var = new xe3();
        xe3Var.b = c;
        xe3Var.a = zzikpVar;
        return xe3Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        zzikp zzikpVar = this.a;
        if (zzikpVar == null) {
            return this.b;
        }
        Object objZzb = zzikpVar.zzb();
        this.b = objZzb;
        this.a = null;
        return objZzb;
    }
}
