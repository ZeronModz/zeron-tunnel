package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.zzgfe;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.android.gms.internal.ads.zzikg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jz2 implements zzikg {
    public final /* synthetic */ int a;
    public final te3 b;
    public final se3 c;
    public final te3 d;
    public final se3 e;

    public jz2(te3 te3Var, se3 se3Var, te3 te3Var2, se3 se3Var2) {
        this.a = 1;
        this.b = te3Var;
        this.c = se3Var;
        this.d = te3Var2;
        this.e = se3Var2;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        te3 te3Var = this.d;
        se3 se3Var = this.e;
        se3 se3Var2 = this.c;
        te3 te3Var2 = this.b;
        switch (i) {
            case 0:
                return new iz2((Context) te3Var2.a, (f6) se3Var2.zzb(), (zzgfe) se3Var.zzb(), (k5) te3Var.a);
            case 1:
                return new k03((Context) te3Var2.a, (k5) te3Var.a, (f6) se3Var2.zzb(), (zzgzy) se3Var.zzb());
            default:
                return new l03((Context) te3Var2.a, (k5) te3Var.a, (f6) se3Var2.zzb(), (zzgzy) se3Var.zzb());
        }
    }

    public /* synthetic */ jz2(int i, se3 se3Var, se3 se3Var2, te3 te3Var, te3 te3Var2) {
        this.a = i;
        this.b = te3Var;
        this.c = se3Var;
        this.e = se3Var2;
        this.d = te3Var2;
    }
}
