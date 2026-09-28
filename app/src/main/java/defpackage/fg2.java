package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.d2;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.t5;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbgj$zza$zza;
import com.google.android.gms.internal.ads.zzcac;
import com.google.android.gms.internal.ads.zzcdm;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzcma;
import com.google.android.gms.internal.ads.zzctc;
import com.google.android.gms.internal.ads.zzcvc;
import com.google.android.gms.internal.ads.zzcvs;
import com.google.android.gms.internal.ads.zzday;
import com.google.android.gms.internal.ads.zzdbx;
import com.google.android.gms.internal.ads.zzddy;
import com.google.android.gms.internal.ads.zzdjg;
import com.google.android.gms.internal.ads.zzdlu;
import com.google.android.gms.internal.ads.zzdmd;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzegw;
import com.google.android.gms.internal.ads.zzehb;
import com.google.android.gms.internal.ads.zzehr;
import com.google.android.gms.internal.ads.zzekl;
import com.google.android.gms.internal.ads.zzelt;
import com.google.android.gms.internal.ads.zzenr;
import com.google.android.gms.internal.ads.zzent;
import com.google.android.gms.internal.ads.zzepp;
import com.google.android.gms.internal.ads.zzeqp;
import com.google.android.gms.internal.ads.zzerp;
import com.google.android.gms.internal.ads.zzfgv;
import com.google.android.gms.internal.ads.zzfhv;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzfjj;
import com.google.android.gms.internal.ads.zzfkd;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.ads.zzfqr;
import com.google.android.gms.internal.ads.zzgce;
import com.google.android.gms.internal.ads.zzgcl;
import com.google.android.gms.internal.ads.zzgdq;
import com.google.android.gms.internal.ads.zzgdw;
import com.google.android.gms.internal.ads.zzgfx;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fg2 implements zzikg {
    public final /* synthetic */ int a;
    public final zzikp b;
    public final zzikp c;
    public final zzikp d;
    public final zzikp e;
    public final Object f;

    public /* synthetic */ fg2(Object obj, se3 se3Var, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.d = (zzikp) obj;
        this.b = se3Var;
        this.e = (zzikp) obj2;
        this.f = obj3;
        this.c = (zzikp) obj4;
    }

    public zzday a() {
        return new zzday(((ng2) this.c).b(), ((ng2) this.f).b.c, (zzekl) this.d.zzb(), ((ng2) this.b).b.a(), (String) this.e.zzb());
    }

    public uo2 b() {
        return new uo2(((sc2) this.d).a(), ((nh2) this.f).zzb(), (zzehr) ((se3) this.b).zzb(), ((la2) this.c).a(), ((oc2) this.e).zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        zzikp zzikpVar = this.b;
        zzikp zzikpVar2 = this.e;
        zzikp zzikpVar3 = this.c;
        zzikp zzikpVar4 = this.d;
        Object obj = this.f;
        switch (i) {
            case 0:
                return new zzcvs(((sc2) zzikpVar4).a(), ((wf2) obj).b.d, ((ng2) zzikpVar3).b(), ((yc2) zzikpVar2).a(), (fp2) ((se3) zzikpVar).zzb());
            case 1:
                zzdbx zzdbxVar = (zzdbx) ((se3) zzikpVar).zzb();
                tt2 tt2VarB = ((ng2) zzikpVar3).b();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzikpVar4.zzb();
                ta2 ta2Var = g3.a;
                k02.J(ta2Var);
                return new ch2(zzdbxVar, tt2VarB, scheduledExecutorService, ta2Var, ((ng2) zzikpVar2).b.c, (zzddy) ((se3) obj).zzb());
            case 2:
                return new mh2(((ng2) obj).a(), ((ng2) zzikpVar3).b(), (Clock) zzikpVar4.zzb(), (zzdxz) zzikpVar2.zzb(), (ScheduledExecutorService) zzikpVar.zzb());
            case 3:
                return a();
            case 4:
                return new zzdmd(((sc2) zzikpVar4).a(), ((yi2) obj).b.b, ((ng2) zzikpVar3).b(), ((yc2) zzikpVar2).a(), (fp2) ((se3) zzikpVar).zzb());
            case 5:
                Map mapB = ((ue3) zzikpVar4).zzb();
                Map mapB2 = ((ue3) zzikpVar2).zzb();
                Map mapB3 = ((ue3) obj).zzb();
                tj2 tj2Var = ((ej2) zzikpVar3).a.a;
                k02.J(tj2Var);
                return new cj2(mapB, mapB2, mapB3, (se3) zzikpVar, tj2Var);
            case 6:
                return new sk2((Executor) zzikpVar4.zzb(), (zzctc) ((se3) zzikpVar).zzb(), (zzdjg) ((se3) zzikpVar2).zzb(), (ve2) ((se3) obj).zzb(), (dh2) ((se3) zzikpVar3).zzb());
            case 7:
                Context contextA = ((sc2) zzikpVar4).a();
                String packageName = ((sc2) ((ee2) obj).b).a().getPackageName();
                k02.J(packageName);
                VersionInfoParcel versionInfoParcelA = ((yc2) zzikpVar2).a();
                zzbgj$zza$zza zzbgj_zza_zza = (zzbgj$zza$zza) zzikpVar3.zzb();
                String str = (String) ((se3) zzikpVar).zzb();
                zzbgd zzbgdVar = new zzbgd(new zzbgi(contextA));
                l22 l22VarZ = d2.z();
                int i2 = versionInfoParcelA.buddyApkVersion;
                l22VarZ.d();
                ((d2) l22VarZ.b).w(i2);
                int i3 = versionInfoParcelA.clientJarVersion;
                l22VarZ.d();
                ((d2) l22VarZ.b).x(i3);
                int i4 = true != versionInfoParcelA.isClientJar ? 2 : 0;
                l22VarZ.d();
                ((d2) l22VarZ.b).y(i4);
                zzbgdVar.a(new t61(zzbgj_zza_zza, packageName, (d2) l22VarZ.e(), str));
                return zzbgdVar;
            case 8:
                Context contextA2 = ((sc2) zzikpVar4).a();
                ta2 ta2Var2 = g3.a;
                k02.J(ta2Var2);
                zzcac zzcacVar = new zzcac();
                zzcma zzcmaVar = (zzcma) ((xc2) zzikpVar2).a.a;
                k02.J(zzcmaVar);
                return new zzegw(contextA2, ta2Var2, zzcacVar, zzcmaVar, new qo2(((cd2) ((ee2) obj).b).zzb()), (ArrayDeque) zzikpVar3.zzb(), new zzehb(), (zzfor) zzikpVar.zzb());
            case 9:
                return b();
            case 10:
                return new fp2(((sc2) zzikpVar4).a(), ((yc2) zzikpVar2).a(), ((ng2) zzikpVar3).b(), (zzcjl) ((zzikg) obj).zzb(), (zzdxz) zzikpVar.zzb());
            case 11:
                return new zzelt((Context) ((se3) zzikpVar).zzb(), (Executor) zzikpVar4.zzb(), (zzdlu) ((te3) obj).a, (zzfiq) zzikpVar2.zzb(), (zzdxz) zzikpVar3.zzb());
            case 12:
                return new dq2((zzcma) zzikpVar4.zzb(), ((ph2) zzikpVar2).b.a(), ((ki2) obj).b, (zzenr) ((se3) zzikpVar).zzb(), (zzekl) ((se3) zzikpVar3).zzb());
            case 13:
                Clock clock = (Clock) zzikpVar4.zzb();
                gq2 gq2Var = (gq2) zzikpVar3;
                zzent zzentVar = new zzent((zzfkd) gq2Var.b.zzb(), (ol2) gq2Var.c.zzb(), (zzdxz) gq2Var.d.zzb());
                zzekl zzeklVar = (zzekl) ((se3) zzikpVar).zzb();
                mv2 mv2Var = (mv2) zzikpVar2.zzb();
                zzenr zzenrVar = ((jq2) obj).a;
                return zzenrVar != null ? zzenrVar : new zzenr(clock, zzentVar, zzeklVar, mv2Var);
            case 14:
                return new zzepp((Context) ((se3) zzikpVar).zzb(), (zzcvc) ((te3) zzikpVar2).a, (xu2) ((se3) obj).zzb(), (zzgzy) zzikpVar4.zzb(), ((rq2) zzikpVar3).b.a);
            case 15:
                return new zzeqp((Context) zzikpVar4.zzb(), ((dj2) zzikpVar2).a.b, ((rh2) ((zzikp) obj)).a(), ((tf2) ((pe2) zzikpVar3).b).c(), (zzdxz) zzikpVar.zzb());
            case 16:
                zzcdm zzcdmVar = new zzcdm();
                Context contextA3 = ((sc2) zzikpVar4).a();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) zzikpVar2.zzb();
                ta2 ta2Var3 = g3.a;
                k02.J(ta2Var3);
                return new at2(zzcdmVar, contextA3, scheduledExecutorService2, ta2Var3, ((et2) obj).b.b, ((et2) zzikpVar3).b.a.l, ((et2) zzikpVar).b.a.k);
            case 17:
                return new zzfgv((Context) ((te3) obj).a, (Executor) zzikpVar4.zzb(), (zzcma) zzikpVar2.zzb(), (zzerp) ((se3) zzikpVar).zzb(), (zzfhv) ((se3) zzikpVar3).zzb(), new zzfjj());
            case 18:
                return new ov2((wv2) ((se3) zzikpVar).zzb(), ((wc2) zzikpVar4).a(), ((sc2) zzikpVar2).a(), (Clock) ((se3) obj).zzb(), (zzfqr) ((se3) zzikpVar3).zzb());
            case 19:
                Context context = (Context) ((te3) zzikpVar4).a;
                zzgcl zzgclVar = (zzgcl) ((se3) zzikpVar).zzb();
                ExecutorService executorService = (ExecutorService) ((te3) zzikpVar2).a;
                zzgce zzgceVar = (zzgce) ((se3) obj).zzb();
                k5 k5Var = (k5) ((te3) zzikpVar3).a;
                return new zzgdq(context, zzgclVar, executorService, zzgceVar, new Random(), k5Var.B().v(), k5Var.B().x(), k5Var.B().y(), k5Var.B().w(), k5Var.zzb(), k5Var.y() - 1);
            case 20:
                return new ny2(se3.b((se3) zzikpVar), se3.b((se3) zzikpVar4), se3.b((se3) zzikpVar2), (ExecutorService) ((te3) obj).a, (f6) ((se3) zzikpVar3).zzb());
            case 21:
                return new t5((k5) ((te3) zzikpVar4).a, (ny2) ((se3) zzikpVar).zzb(), (zzgdw) ((se3) zzikpVar2).zzb(), (ExecutorService) ((te3) obj).a, (f6) ((se3) zzikpVar3).zzb());
            default:
                return new wy2((vz1) ((te3) obj).a, (zzgfx) zzikpVar4.zzb(), (Map) ((te3) zzikpVar3).a, (Context) zzikpVar2.zzb(), (f6) zzikpVar.zzb());
        }
    }

    public /* synthetic */ fg2(zzikp zzikpVar, zzikp zzikpVar2, zzikg zzikgVar, zzikp zzikpVar3, zzikp zzikpVar4, int i) {
        this.a = i;
        this.d = zzikpVar;
        this.e = zzikpVar2;
        this.f = zzikgVar;
        this.c = zzikpVar3;
        this.b = zzikpVar4;
    }

    public fg2(zzikp zzikpVar, nh2 nh2Var, se3 se3Var, la2 la2Var, zzikp zzikpVar2) {
        this.a = 9;
        this.d = zzikpVar;
        this.f = nh2Var;
        this.b = se3Var;
        this.c = la2Var;
        this.e = zzikpVar2;
    }

    public /* synthetic */ fg2(zzikg zzikgVar, zzikg zzikgVar2, zzikg zzikgVar3, se3 se3Var, zzikp zzikpVar, int i) {
        this.a = i;
        this.d = zzikgVar;
        this.e = zzikgVar2;
        this.f = zzikgVar3;
        this.b = se3Var;
        this.c = zzikpVar;
    }

    public /* synthetic */ fg2(sc2 sc2Var, zzikg zzikgVar, ng2 ng2Var, yc2 yc2Var, se3 se3Var, int i) {
        this.a = i;
        this.d = sc2Var;
        this.f = zzikgVar;
        this.c = ng2Var;
        this.e = yc2Var;
        this.b = se3Var;
    }

    public fg2(sc2 sc2Var, yc2 yc2Var, ng2 ng2Var, zzikg zzikgVar, se3 se3Var) {
        this.a = 10;
        this.d = sc2Var;
        this.e = yc2Var;
        this.c = ng2Var;
        this.f = zzikgVar;
        this.b = se3Var;
    }

    public fg2(sc2 sc2Var, ee2 ee2Var, yc2 yc2Var, zzikp zzikpVar, se3 se3Var) {
        this.a = 7;
        this.d = sc2Var;
        this.f = ee2Var;
        this.e = yc2Var;
        this.c = zzikpVar;
        this.b = se3Var;
    }

    public fg2(ng2 ng2Var, ng2 ng2Var2, se3 se3Var, ng2 ng2Var3, se3 se3Var2) {
        this.a = 3;
        this.c = ng2Var;
        this.f = ng2Var2;
        this.d = se3Var;
        this.b = ng2Var3;
        this.e = se3Var2;
    }

    public fg2(ng2 ng2Var, ng2 ng2Var2, se3 se3Var, se3 se3Var2, se3 se3Var3) {
        this.a = 2;
        this.f = ng2Var;
        this.c = ng2Var2;
        this.d = se3Var;
        this.e = se3Var2;
        this.b = se3Var3;
    }

    public fg2(jq2 jq2Var, zzikp zzikpVar, gq2 gq2Var, se3 se3Var, zzikp zzikpVar2) {
        this.a = 13;
        this.f = jq2Var;
        this.d = zzikpVar;
        this.c = gq2Var;
        this.b = se3Var;
        this.e = zzikpVar2;
    }

    public /* synthetic */ fg2(se3 se3Var, zzikp zzikpVar, zzikp zzikpVar2, Object obj, se3 se3Var2, int i) {
        this.a = i;
        this.b = se3Var;
        this.d = zzikpVar;
        this.e = zzikpVar2;
        this.f = obj;
        this.c = se3Var2;
    }

    public fg2(se3 se3Var, ng2 ng2Var, se3 se3Var2, ng2 ng2Var2, se3 se3Var3) {
        this.a = 1;
        this.b = se3Var;
        this.c = ng2Var;
        this.d = se3Var2;
        this.e = ng2Var2;
        this.f = se3Var3;
    }

    public fg2(se3 se3Var, se3 se3Var2, se3 se3Var3, se3 se3Var4, te3 te3Var) {
        this.a = 11;
        this.b = se3Var;
        this.d = se3Var2;
        this.f = te3Var;
        this.e = se3Var3;
        this.c = se3Var4;
    }

    public fg2(se3 se3Var, te3 te3Var, se3 se3Var2, zzikp zzikpVar, rq2 rq2Var) {
        this.a = 14;
        this.b = se3Var;
        this.e = te3Var;
        this.f = se3Var2;
        this.d = zzikpVar;
        this.c = rq2Var;
    }

    public fg2(te3 te3Var, se3 se3Var, te3 te3Var2, se3 se3Var2, se3 se3Var3) {
        this.a = 17;
        this.f = te3Var;
        this.d = se3Var;
        this.e = te3Var2;
        this.b = se3Var2;
        this.c = se3Var3;
    }

    public fg2(te3 te3Var, se3 se3Var, te3 te3Var2, te3 te3Var3, se3 se3Var2) {
        this.a = 22;
        this.f = te3Var;
        this.d = se3Var;
        this.c = te3Var2;
        this.e = te3Var3;
        this.b = se3Var2;
    }
}
