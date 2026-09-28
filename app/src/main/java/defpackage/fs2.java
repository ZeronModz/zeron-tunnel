package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fs2 implements zzikg {
    public final zzikp a;
    public final zzikp b;
    public final zzikp c;

    public fs2(se3 se3Var, se3 se3Var2, sc2 sc2Var) {
        this.a = se3Var;
        this.b = se3Var2;
        this.c = sc2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final es2 zzb() {
        return new es2((ApplicationInfo) this.a.zzb(), (PackageInfo) this.b.zzb(), ((sc2) this.c).a());
    }
}
