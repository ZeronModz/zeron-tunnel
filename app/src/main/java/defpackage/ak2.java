package defpackage;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzdpm;
import com.google.android.gms.internal.ads.zzdqc;
import com.google.android.gms.internal.ads.zzduv;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ak2 implements zzikg {
    public final /* synthetic */ int a = 0;
    public final zzikp b;
    public final lj2 c;

    public ak2(lj2 lj2Var, se3 se3Var) {
        this.c = lj2Var;
        this.b = se3Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        lj2 lj2Var = this.c;
        zzikp zzikpVar = this.b;
        switch (i) {
            case 0:
                yk2 yk2Var = lj2Var.b.b;
                k02.J(yk2Var);
                return new zzdpm(yk2Var, (Clock) zzikpVar.zzb());
            default:
                zzduv zzduvVar = (zzduv) zzikpVar.zzb();
                yk2 yk2Var2 = lj2Var.b.b;
                k02.J(yk2Var2);
                return new zzdqc(zzduvVar, yk2Var2);
        }
    }

    public ak2(se3 se3Var, lj2 lj2Var) {
        this.b = se3Var;
        this.c = lj2Var;
    }
}
