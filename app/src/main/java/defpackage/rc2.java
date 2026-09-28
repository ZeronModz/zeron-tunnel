package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.x3;
import com.google.android.gms.internal.ads.zzeiu;
import com.google.android.gms.internal.ads.zzfvr;
import com.google.android.gms.internal.ads.zzikg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class rc2 implements zzikg {
    public final /* synthetic */ int a;
    public final sc2 b;

    public /* synthetic */ rc2(sc2 sc2Var, int i) {
        this.a = i;
        this.b = sc2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        sc2 sc2Var = this.b;
        switch (i) {
            case 0:
                ApplicationInfo applicationInfo = sc2Var.a().getApplicationInfo();
                k02.J(applicationInfo);
                return applicationInfo;
            case 1:
                return new zzfvr(sc2Var.a(), zzt.zzs().zza());
            case 2:
                return gu2.a(sc2Var.a());
            case 3:
                return new an2(sc2Var.a());
            case 4:
                return new tn2(sc2Var.a());
            case 5:
                return new x3(sc2Var.a());
            case 6:
                Context contextA = sc2Var.a();
                ta2 ta2Var = g3.a;
                k02.J(ta2Var);
                return new zzeiu(contextA, ta2Var);
            case 7:
                ta2 ta2Var2 = g3.a;
                k02.J(ta2Var2);
                return new vr2(ta2Var2, sc2Var.a());
            case 8:
                Context contextA2 = sc2Var.a();
                ta2 ta2Var3 = g3.a;
                k02.J(ta2Var3);
                return new nr2(contextA2, ta2Var3, 4);
            default:
                return new dt2(sc2Var.a());
        }
    }
}
