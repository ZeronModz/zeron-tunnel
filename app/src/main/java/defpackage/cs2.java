package defpackage;

import android.content.Intent;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class cs2 implements zzikg {
    public final zzikp a;
    public final zzikp b;

    public cs2(sc2 sc2Var, se3 se3Var) {
        this.a = sc2Var;
        this.b = se3Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final pr2 zzb() {
        return new pr2(3, ((sc2) this.a).a(), (Intent) this.b.zzb());
    }
}
