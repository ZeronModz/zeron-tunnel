package defpackage;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class tr2 implements zzikg {
    public final zzikp a;

    public tr2(yc2 yc2Var) {
        this.a = yc2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final pr2 zzb() {
        VersionInfoParcel versionInfoParcelA = ((yc2) this.a).a();
        ta2 ta2Var = g3.a;
        k02.J(ta2Var);
        return new pr2(versionInfoParcelA, ta2Var);
    }
}
