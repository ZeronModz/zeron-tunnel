package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.q3;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nh2 implements zzikg {
    public final se3 a;
    public final zzikp b;
    public final zzikp c;
    public final ee2 d;
    public final zzikp e;
    public final se3 f;
    public final zzikp g;
    public final se3 h;
    public final of2 i;
    public final rh2 j;
    public final se3 k;
    public final se3 l;

    public nh2(se3 se3Var, zzikp zzikpVar, zzikp zzikpVar2, ee2 ee2Var, zzikp zzikpVar3, se3 se3Var2, zzikp zzikpVar4, se3 se3Var3, of2 of2Var, rh2 rh2Var, se3 se3Var4, se3 se3Var5) {
        this.a = se3Var;
        this.b = zzikpVar;
        this.c = zzikpVar2;
        this.d = ee2Var;
        this.e = zzikpVar3;
        this.f = se3Var2;
        this.g = zzikpVar4;
        this.h = se3Var3;
        this.i = of2Var;
        this.j = rh2Var;
        this.k = se3Var4;
        this.l = se3Var5;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final q3 zzb() {
        xu2 xu2Var = (xu2) this.a.zzb();
        VersionInfoParcel versionInfoParcelA = ((yc2) this.b).a();
        ApplicationInfo applicationInfo = (ApplicationInfo) this.c.zzb();
        String packageName = ((sc2) this.d.b).a().getPackageName();
        k02.J(packageName);
        l32 l32Var = p32.a;
        return new q3(xu2Var, versionInfoParcelA, applicationInfo, packageName, zzbd.zzb().a(), (PackageInfo) this.e.zzb(), se3.b(this.f), ((oc2) this.g).zzb(), (String) this.h.zzb(), this.i.b(), this.j.a(), (gi2) this.k.zzb(), ((Integer) this.l.zzb()).intValue());
    }
}
