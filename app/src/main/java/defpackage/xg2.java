package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzbsq;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.ads.zzikg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xg2 implements zzikg {
    public final /* synthetic */ int a = 0;
    public final sc2 b;
    public final yc2 c;
    public final se3 d;

    public xg2(sc2 sc2Var, yc2 yc2Var, se3 se3Var) {
        this.b = sc2Var;
        this.c = yc2Var;
        this.d = se3Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        se3 se3Var = this.d;
        yc2 yc2Var = this.c;
        sc2 sc2Var = this.b;
        switch (i) {
            case 0:
                Context contextA = sc2Var.a();
                zzfor zzforVar = (zzfor) se3Var.zzb();
                VersionInfoParcel versionInfoParcelA = yc2Var.a();
                ta2 ta2Var = g3.a;
                k02.J(ta2Var);
                return new wg2(contextA, zzforVar, versionInfoParcelA, ta2Var);
            default:
                return new zzbsq().b(sc2Var.a(), yc2Var.a(), (zzfor) se3Var.zzb());
        }
    }

    public xg2(sc2 sc2Var, se3 se3Var, yc2 yc2Var) {
        this.b = sc2Var;
        this.d = se3Var;
        this.c = yc2Var;
    }
}
