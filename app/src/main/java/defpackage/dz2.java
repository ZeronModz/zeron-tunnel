package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.zzgfx;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dz2 implements zzikg {
    public final /* synthetic */ int a;
    public final te3 b;
    public final zzikp c;
    public final zzikp d;
    public final zzikp e;

    public /* synthetic */ dz2(int i, se3 se3Var, se3 se3Var2, te3 te3Var, te3 te3Var2) {
        this.a = i;
        this.b = te3Var;
        this.c = se3Var;
        this.d = te3Var2;
        this.e = se3Var2;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        zzikp zzikpVar = this.e;
        zzikp zzikpVar2 = this.d;
        zzikp zzikpVar3 = this.c;
        te3 te3Var = this.b;
        switch (i) {
            case 0:
                return new cz2((vz1) te3Var.a, (zzgfx) zzikpVar3.zzb(), (Context) zzikpVar2.zzb(), (f6) zzikpVar.zzb(), 0);
            case 1:
                return new ez2((vz1) te3Var.a, (zzgfx) zzikpVar3.zzb(), (k5) zzikpVar2.zzb(), (f6) zzikpVar.zzb());
            default:
                return new cz2((vz1) te3Var.a, (zzgfx) zzikpVar3.zzb(), (Context) zzikpVar2.zzb(), (f6) zzikpVar.zzb(), 1);
        }
    }
}
