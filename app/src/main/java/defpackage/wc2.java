package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzikg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class wc2 implements zzikg {
    public final /* synthetic */ int a;
    public final sc2 b;
    public final se3 c;

    public wc2(sc2 sc2Var, se3 se3Var) {
        this.a = 3;
        this.c = se3Var;
        this.b = sc2Var;
    }

    public sv2 a() {
        zzdxz zzdxzVar = (zzdxz) this.c.zzb();
        this.b.a();
        return new sv2(zzdxzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        se3 se3Var = this.c;
        sc2 sc2Var = this.b;
        switch (i) {
            case 0:
                try {
                    return Wrappers.a(sc2Var.a()).b(0, ((ApplicationInfo) se3Var.zzb()).packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            case 1:
                return new zzu(sc2Var.a(), (String) se3Var.zzb());
            case 2:
                ta2 ta2Var = g3.a;
                k02.J(ta2Var);
                return new vs2(ta2Var, sc2Var.a(), (vn2) se3Var.zzb());
            default:
                return a();
        }
    }

    public /* synthetic */ wc2(sc2 sc2Var, se3 se3Var, int i) {
        this.a = i;
        this.b = sc2Var;
        this.c = se3Var;
    }
}
