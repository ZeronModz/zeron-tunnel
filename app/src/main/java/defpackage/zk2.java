package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.d6;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzckb;
import com.google.android.gms.internal.ads.zzcxv;
import com.google.android.gms.internal.ads.zzcyj;
import com.google.android.gms.internal.ads.zzdil;
import com.google.android.gms.internal.ads.zzdti;
import com.google.android.gms.internal.ads.zzdxt;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzdyk;
import com.google.android.gms.internal.ads.zzeak;
import com.google.android.gms.internal.ads.zzeam;
import com.google.android.gms.internal.ads.zzeiu;
import com.google.android.gms.internal.ads.zzejf;
import com.google.android.gms.internal.ads.zzenr;
import com.google.android.gms.internal.ads.zzeqf;
import com.google.android.gms.internal.ads.zzerp;
import com.google.android.gms.internal.ads.zzerx;
import com.google.android.gms.internal.ads.zzeun;
import com.google.android.gms.internal.ads.zzfgv;
import com.google.android.gms.internal.ads.zzfhv;
import com.google.android.gms.internal.ads.zzfje;
import com.google.android.gms.internal.ads.zzfjo;
import com.google.android.gms.internal.ads.zzfks;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.ads.zzfqg;
import com.google.android.gms.internal.ads.zzgct;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zk2 implements zzikg {
    public final /* synthetic */ int a = 4;
    public final se3 b;
    public final zzikp c;
    public final se3 d;
    public final zzikp e;
    public final zzikp f;
    public final zzikp g;
    public final zzikp h;
    public final zzikp i;
    public final zzikp j;

    public zk2(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, se3 se3Var, rh2 rh2Var, se3 se3Var2, zzikp zzikpVar4, zzikp zzikpVar5, se3 se3Var3) {
        this.c = zzikpVar;
        this.f = zzikpVar2;
        this.h = zzikpVar3;
        this.b = se3Var;
        this.i = rh2Var;
        this.d = se3Var2;
        this.j = zzikpVar4;
        this.g = zzikpVar5;
        this.e = se3Var3;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        zzikp zzikpVar = this.g;
        zzikp zzikpVar2 = this.c;
        zzikp zzikpVar3 = this.j;
        zzikp zzikpVar4 = this.i;
        zzikp zzikpVar5 = this.h;
        zzikp zzikpVar6 = this.f;
        zzikp zzikpVar7 = this.e;
        se3 se3Var = this.d;
        se3 se3Var2 = this.b;
        switch (i) {
            case 0:
                return new zzdti(((sc2) zzikpVar2).a(), (Executor) se3Var2.zzb(), (zzazh) se3Var.zzb(), ((yc2) zzikpVar).a(), yd2.a(), new zzckb(), (zzeiu) ((se3) zzikpVar7).zzb(), (mv2) ((se3) zzikpVar6).zzb(), (zzdxz) ((se3) zzikpVar5).zzb(), (zzejf) ((se3) zzikpVar4).zzb(), (zzfjo) ((se3) zzikpVar3).zzb());
            case 1:
                Executor executor = (Executor) se3Var2.zzb();
                Context contextA = ((sc2) zzikpVar2).a();
                WeakReference weakReference = (WeakReference) ((pc2) zzikpVar4).b.d;
                k02.J(weakReference);
                ta2 ta2Var = g3.a;
                k02.J(ta2Var);
                return new zzeak(executor, contextA, weakReference, ta2Var, (ql2) se3Var.zzb(), (ScheduledExecutorService) ((se3) zzikpVar7).zzb(), (zzdyk) ((se3) zzikpVar6).zzb(), ((yc2) zzikpVar).a(), new zzdil(((th2) zzikpVar3).b.zzb()), (zzfor) ((se3) zzikpVar5).zzb());
            case 2:
                return new zzerx((Context) ((te3) zzikpVar2).a, (zzr) ((te3) zzikpVar6).a, (String) ((te3) zzikpVar5).a, (zzfgv) se3Var2.zzb(), (zzerp) se3Var.zzb(), (zzfhv) ((se3) zzikpVar7).zzb(), ((yc2) zzikpVar4).a(), (zzazh) zzikpVar3.zzb(), (zzdxz) zzikpVar.zzb());
            case 3:
                Context contextA2 = ((sc2) zzikpVar2).a();
                String str = ((zzcxv) ((yg2) zzikpVar6).b.zzb()).b.e;
                k02.J(str);
                return new zzeun(contextA2, str, (String) zzikpVar5.zzb(), (zzcxv) se3Var2.zzb(), (zzfks) se3Var.zzb(), ((rh2) zzikpVar4).a(), (zzdxt) ((se3) zzikpVar7).zzb(), (zzcyj) zzikpVar3.zzb(), ((Long) zzikpVar.zzb()).longValue());
            case 4:
                ta2 ta2Var2 = g3.a;
                k02.J(ta2Var2);
                return new ms2(ta2Var2, (ScheduledExecutorService) zzikpVar2.zzb(), (String) zzikpVar6.zzb(), (wq2) zzikpVar5.zzb(), (Context) se3Var2.zzb(), ((rh2) zzikpVar4).a(), (zzeqf) se3Var.zzb(), (ql2) zzikpVar3.zzb(), (zzeam) zzikpVar.zzb(), ((Integer) ((se3) zzikpVar7).zzb()).intValue());
            case 5:
                zzenr zzenrVar = (zzenr) se3Var2.zzb();
                VersionInfoParcel versionInfoParcelA = ((yc2) zzikpVar2).a();
                String str2 = ((zzcxv) ((yg2) zzikpVar7).b.zzb()).b.e;
                k02.J(str2);
                return new zzfqg(zzenrVar, versionInfoParcelA, str2, (String) zzikpVar6.zzb(), ((sc2) zzikpVar5).a(), ((ph2) zzikpVar4).b.d, (zzfje) se3Var.zzb(), (Clock) zzikpVar3.zzb(), (zzazh) zzikpVar.zzb());
            default:
                return new d6((zzgct) se3Var2.zzb(), (zzgct) se3Var.zzb(), se3.b((se3) zzikpVar7), (zzgct) ((se3) zzikpVar6).zzb(), (zzgct) ((se3) zzikpVar5).zzb(), se3.b((se3) zzikpVar4), (File) ((se3) zzikpVar3).zzb(), (ExecutorService) zzikpVar2.zzb(), (f6) zzikpVar.zzb());
        }
    }

    public zk2(sc2 sc2Var, yg2 yg2Var, se3 se3Var, se3 se3Var2, se3 se3Var3, rh2 rh2Var, se3 se3Var4, se3 se3Var5, se3 se3Var6) {
        this.c = sc2Var;
        this.f = yg2Var;
        this.h = se3Var;
        this.b = se3Var2;
        this.d = se3Var3;
        this.i = rh2Var;
        this.e = se3Var4;
        this.j = se3Var5;
        this.g = se3Var6;
    }

    public zk2(sc2 sc2Var, se3 se3Var, se3 se3Var2, yc2 yc2Var, yd2 yd2Var, se3 se3Var3, se3 se3Var4, se3 se3Var5, se3 se3Var6, se3 se3Var7) {
        this.c = sc2Var;
        this.b = se3Var;
        this.d = se3Var2;
        this.g = yc2Var;
        this.e = se3Var3;
        this.f = se3Var4;
        this.h = se3Var5;
        this.i = se3Var6;
        this.j = se3Var7;
    }

    public zk2(se3 se3Var, zzikp zzikpVar, yg2 yg2Var, zzikp zzikpVar2, zzikp zzikpVar3, ph2 ph2Var, se3 se3Var2, zzikp zzikpVar4, zzikp zzikpVar5) {
        this.b = se3Var;
        this.c = zzikpVar;
        this.e = yg2Var;
        this.f = zzikpVar2;
        this.h = zzikpVar3;
        this.i = ph2Var;
        this.d = se3Var2;
        this.j = zzikpVar4;
        this.g = zzikpVar5;
    }

    public zk2(se3 se3Var, sc2 sc2Var, pc2 pc2Var, se3 se3Var2, se3 se3Var3, se3 se3Var4, yc2 yc2Var, th2 th2Var, se3 se3Var5) {
        this.b = se3Var;
        this.c = sc2Var;
        this.i = pc2Var;
        this.d = se3Var2;
        this.e = se3Var3;
        this.f = se3Var4;
        this.g = yc2Var;
        this.j = th2Var;
        this.h = se3Var5;
    }

    public zk2(se3 se3Var, se3 se3Var2, se3 se3Var3, se3 se3Var4, se3 se3Var5, se3 se3Var6, se3 se3Var7, te3 te3Var, se3 se3Var8) {
        this.b = se3Var;
        this.d = se3Var2;
        this.e = se3Var3;
        this.f = se3Var4;
        this.h = se3Var5;
        this.i = se3Var6;
        this.j = se3Var7;
        this.c = te3Var;
        this.g = se3Var8;
    }

    public zk2(te3 te3Var, te3 te3Var2, te3 te3Var3, se3 se3Var, se3 se3Var2, se3 se3Var3, yc2 yc2Var, se3 se3Var4, se3 se3Var5) {
        this.c = te3Var;
        this.f = te3Var2;
        this.h = te3Var3;
        this.b = se3Var;
        this.d = se3Var2;
        this.e = se3Var3;
        this.i = yc2Var;
        this.j = se3Var4;
        this.g = se3Var5;
    }
}
