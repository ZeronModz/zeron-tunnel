package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.zzgcc;
import com.google.android.gms.internal.ads.zzgfx;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xy2 implements zzikg {
    public final /* synthetic */ int a;
    public final te3 b;
    public final zzikp c;
    public final te3 d;
    public final te3 e;
    public final zzikp f;

    public /* synthetic */ xy2(te3 te3Var, se3 se3Var, te3 te3Var2, te3 te3Var3, se3 se3Var2, int i) {
        this.a = i;
        this.b = te3Var;
        this.c = se3Var;
        this.d = te3Var2;
        this.e = te3Var3;
        this.f = se3Var2;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        zzikp zzikpVar = this.f;
        te3 te3Var = this.e;
        te3 te3Var2 = this.d;
        zzikp zzikpVar2 = this.c;
        te3 te3Var3 = this.b;
        switch (i) {
            case 0:
                return new wy2((vz1) te3Var3.a, (zzgfx) zzikpVar2.zzb(), (View) te3Var2.a, (Activity) te3Var.a, (f6) zzikpVar.zzb());
            default:
                return new wy2((vz1) te3Var3.a, (zzgfx) zzikpVar2.zzb(), (zzgcc) te3Var2.a, (Map) te3Var.a, (f6) zzikpVar.zzb());
        }
    }
}
