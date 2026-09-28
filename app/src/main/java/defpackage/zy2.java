package defpackage;

import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.zzgfx;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zy2 implements zzikg {
    public final /* synthetic */ int a = 1;
    public final te3 b;
    public final zzikp c;
    public final te3 d;
    public final zzikp e;

    public zy2(te3 te3Var, se3 se3Var, te3 te3Var2, se3 se3Var2) {
        this.b = te3Var;
        this.c = se3Var;
        this.d = te3Var2;
        this.e = se3Var2;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        zzikp zzikpVar = this.e;
        te3 te3Var = this.d;
        zzikp zzikpVar2 = this.c;
        te3 te3Var2 = this.b;
        switch (i) {
            case 0:
                return new yy2((vz1) te3Var2.a, (Map) te3Var.a, (k5) zzikpVar2.zzb(), (f6) zzikpVar.zzb());
            default:
                return new ez2((vz1) te3Var2.a, (zzgfx) zzikpVar2.zzb(), (Map) te3Var.a, (f6) zzikpVar.zzb());
        }
    }

    public zy2(te3 te3Var, te3 te3Var2, te3 te3Var3, se3 se3Var) {
        this.b = te3Var;
        this.d = te3Var2;
        this.c = te3Var3;
        this.e = se3Var;
    }
}
