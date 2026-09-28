package defpackage;

import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhuw;
import java.security.spec.ECPoint;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class va3 extends zzhuw {
    public final ta3 a;
    public final ECPoint b;
    public final hc3 c;
    public final Integer d;

    public /* synthetic */ va3(ta3 ta3Var, ECPoint eCPoint, hc3 hc3Var, Integer num) {
        this.a = ta3Var;
        this.b = eCPoint;
        this.c = hc3Var;
        this.d = num;
    }

    @Override // com.google.android.gms.internal.ads.zzhuw, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Integer b() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzhuw
    public final hc3 c() {
        return this.c;
    }
}
