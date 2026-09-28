package defpackage;

import com.google.android.gms.internal.ads.x8;
import com.google.android.gms.internal.ads.zzhlg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class t73 implements zzhlg {
    public final hc3 a;
    public final x8 b;

    public t73(x8 x8Var, hc3 hc3Var) {
        this.b = x8Var;
        this.a = hc3Var;
    }

    public static t73 a(x8 x8Var) {
        return new t73(x8Var, z73.a(x8Var.v()));
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final hc3 zzf() {
        return this.a;
    }
}
