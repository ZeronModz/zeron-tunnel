package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.r3;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzdzj;
import com.google.android.gms.internal.ads.zzdzr;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pd2 implements zzdzr {
    public final Context a;
    public final zzbph b;
    public final gd2 c;
    public final pd2 d = this;
    public final se3 e;

    public pd2(gd2 gd2Var, Context context, zzbph zzbphVar) {
        this.c = gd2Var;
        this.a = context;
        this.b = zzbphVar;
        this.e = se3.a(new la2(te3.a(this), new mm2(te3.a(zzbphVar), 0), 20));
    }

    @Override // com.google.android.gms.internal.ads.zzdzr
    public final r3 zzb() {
        return (r3) this.e.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdzr
    public final zzdzj zzc() {
        return new od2(this.c, this.d);
    }
}
