package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzcue;
import com.google.android.gms.internal.ads.zzdje;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xf2 implements zzikg {
    public final /* synthetic */ int a = 0;
    public final zzikp b;
    public final zzikp c;
    public final ng2 d;
    public final zzikp e;

    public xf2(zzcue zzcueVar, se3 se3Var, yc2 yc2Var, ng2 ng2Var, rh2 rh2Var) {
        this.b = se3Var;
        this.c = yc2Var;
        this.d = ng2Var;
        this.e = rh2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        zzikp zzikpVar = this.e;
        ng2 ng2Var = this.d;
        zzikp zzikpVar2 = this.c;
        zzikp zzikpVar3 = this.b;
        switch (i) {
            case 0:
                return new zzdje(new vf2((Context) zzikpVar3.zzb(), ((yc2) zzikpVar2).a(), ng2Var.b(), ((rh2) zzikpVar).a(), 0), g3.g);
            default:
                return new zzdje(new vf2((Context) zzikpVar3.zzb(), ((yc2) zzikpVar2).a(), ng2Var.b(), ((rh2) zzikpVar).a(), 1), g3.g);
        }
    }

    public xf2(se3 se3Var, yc2 yc2Var, ng2 ng2Var, rh2 rh2Var) {
        this.b = se3Var;
        this.c = yc2Var;
        this.d = ng2Var;
        this.e = rh2Var;
    }
}
