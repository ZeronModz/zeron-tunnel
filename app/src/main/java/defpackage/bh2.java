package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bh2 implements zzikg {
    public final /* synthetic */ int a = 2;
    public final zzikp b;
    public final rh2 c;
    public final se3 d;

    public bh2(rh2 rh2Var, se3 se3Var, se3 se3Var2) {
        this.c = rh2Var;
        this.b = se3Var;
        this.d = se3Var2;
    }

    public hr2 a() {
        ta2 ta2Var = g3.a;
        k02.J(ta2Var);
        cu2 cu2VarA = this.c.a();
        return new hr2(ta2Var, cu2VarA, ((Integer) this.d.zzb()).intValue());
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        int i = this.a;
        se3 se3Var = this.d;
        rh2 rh2Var = this.c;
        zzikp zzikpVar = this.b;
        switch (i) {
            case 0:
                return new ah2((Context) se3Var.zzb(), 0, ((yc2) zzikpVar).a(), rh2Var.a());
            case 1:
                return new bn2((gn2) zzikpVar.zzb(), rh2Var.a(), (String) se3Var.zzb());
            default:
                return a();
        }
    }

    public bh2(se3 se3Var, zzikp zzikpVar, rh2 rh2Var) {
        this.d = se3Var;
        this.b = zzikpVar;
        this.c = rh2Var;
    }

    public bh2(se3 se3Var, rh2 rh2Var, se3 se3Var2) {
        this.b = se3Var;
        this.c = rh2Var;
        this.d = se3Var2;
    }
}
