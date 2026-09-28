package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.ads.zzikg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class cd2 implements zzikg {
    public final sc2 a;
    public final se3 b;

    public cd2(sc2 sc2Var, se3 se3Var) {
        this.a = sc2Var;
        this.b = se3Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzbzq zzb() {
        Context contextA = this.a.a();
        zzfor zzforVar = (zzfor) this.b.zzb();
        ta2 ta2Var = g3.a;
        k02.J(ta2Var);
        zzt.zzr().a(contextA, VersionInfoParcel.forPackage(), zzforVar);
        c22 c22Var = kf2.p;
        return new zzbzq(contextA, zzt.zzr().a(contextA, VersionInfoParcel.forPackage(), zzforVar).a("google.afma.sdkConstants.getSdkConstants", c22Var, c22Var), VersionInfoParcel.forPackage(), ta2Var);
    }
}
