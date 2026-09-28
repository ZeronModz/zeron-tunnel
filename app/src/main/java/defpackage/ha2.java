package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzcbz;
import com.google.android.gms.internal.ads.zzcca;
import com.google.android.gms.internal.ads.zzccb;
import com.google.android.gms.internal.ads.zzcdu;
import com.google.android.gms.internal.ads.zzctu;
import com.google.android.gms.internal.ads.zzdbo;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzddu;
import com.google.android.gms.internal.ads.zzdje;
import com.google.android.gms.internal.ads.zzdjg;
import com.google.android.gms.internal.ads.zzdoh;
import com.google.android.gms.internal.ads.zzdol;
import com.google.android.gms.internal.ads.zzdqh;
import com.google.android.gms.internal.ads.zzdrp;
import com.google.android.gms.internal.ads.zzdxt;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzdyc;
import com.google.android.gms.internal.ads.zzesr;
import com.google.android.gms.internal.ads.zzeuv;
import com.google.android.gms.internal.ads.zzevl;
import com.google.android.gms.internal.ads.zzeyf;
import com.google.android.gms.internal.ads.zzfbm;
import com.google.android.gms.internal.ads.zzfhv;
import com.google.android.gms.internal.ads.zzfie;
import com.google.android.gms.internal.ads.zzfio;
import com.google.android.gms.internal.ads.zzfjd;
import com.google.android.gms.internal.ads.zzfqr;
import com.google.android.gms.internal.ads.zzgcl;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ha2 implements zzikg {
    public final /* synthetic */ int a;
    public final zzikp b;
    public final zzikp c;
    public final zzikp d;

    public ha2(se3 se3Var, se3 se3Var2, te3 te3Var) {
        this.a = 28;
        this.c = se3Var;
        this.d = se3Var2;
        this.b = te3Var;
    }

    public zzesr a() {
        ta2 ta2Var = g3.a;
        k02.J(ta2Var);
        return new zzesr(ta2Var, ((sc2) this.b).a(), ((rh2) this.c).a(), ((zzctu) ((pe2) this.d).b).a);
    }

    public zzeyf b() {
        ta2 ta2Var = g3.a;
        k02.J(ta2Var);
        return new zzeyf(ta2Var, ((zzctu) ((pe2) this.b).b).a, (Context) ((se3) this.c).zzb(), ((we3) this.d).zzb());
    }

    public kk2 c() {
        ta2 ta2Var = g3.a;
        k02.J(ta2Var);
        zzdrp zzdrpVarA = ((ok2) this.b).zzb();
        la2 la2Var = (la2) this.c;
        k02.J(ta2Var);
        return new kk2(ta2Var, zzdrpVarA, new tj1(ta2Var, 27, ((ok2) la2Var.b).zzb(), (zzdxt) ((se3) la2Var.c).zzb()), (zzdxt) ((se3) this.d).zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        Set setSingleton;
        switch (this.a) {
            case 0:
                zzg zzgVar = (zzg) ((te3) this.c).a;
                return new ga2(zzgVar);
            case 1:
                Integer num = (Integer) zzbd.zzc().a(p32.T);
                num.intValue();
                int iIntValue = num.intValue();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((se3) this.b).zzb();
                sv2 sv2VarA = ((wc2) this.c).a();
                Clock clock = (Clock) ((se3) this.d).zzb();
                if (((Boolean) zzbd.zzc().a(p32.O)).booleanValue()) {
                    return new zzfqr(iIntValue, scheduledExecutorService, sv2VarA, clock);
                }
                return null;
            case 2:
                return new zf2(((wf2) this.b).b.d, (zzdxz) this.c.zzb(), ((ng2) this.d).b());
            case 3:
                Context context = (Context) this.b.zzb();
                VersionInfoParcel versionInfoParcelA = ((yc2) this.c).a();
                tt2 tt2VarB = ((ng2) this.d).b();
                zzcca zzccaVar = new zzcca();
                zzccb zzccbVar = tt2VarB.A;
                if (zzccbVar == null) {
                    return null;
                }
                vt2 vt2Var = tt2VarB.s;
                return new zzcbz(context, versionInfoParcelA, zzccbVar, vt2Var != null ? vt2Var.b : null, zzccaVar);
            case 4:
                zzdbo zzdboVar = new zzdbo(((th2) this.b).b.zzb());
                Set setZzb = ((we3) this.c).zzb();
                ta2 ta2Var = g3.a;
                k02.J(ta2Var);
                return new zzdbs(zzdboVar, setZzb, ta2Var, (ScheduledExecutorService) this.d.zzb());
            case 5:
                return new zzddu(((we3) this.b).zzb(), ((ng2) this.c).b(), ((ng2) this.d).a());
            case 6:
                return new zzdjg((Context) this.b.zzb(), ((we3) this.c).zzb(), ((ng2) this.d).b());
            case 7:
                zzdoh zzdohVarA = ((pe2) this.b).a();
                zzdol zzdolVar = (zzdol) ((yg2) this.c).b.zzb();
                k02.J(zzdolVar);
                Executor executor = (Executor) this.d.zzb();
                ta2 ta2Var2 = g3.a;
                k02.J(ta2Var2);
                return new zzdqh(zzdohVarA, zzdolVar, executor, ta2Var2);
            case 8:
                return c();
            case 9:
                int i = ((rh2) this.d).a().p.b;
                if (i != 0) {
                    return i + (-1) != 0 ? ((of2) this.c).a() : ((of2) this.b).a();
                }
                throw null;
            case 10:
                String str = ((et2) this.b).b.a.h;
                k02.J(str);
                Context contextA = ((sc2) this.c).a();
                ta2 ta2Var3 = g3.a;
                k02.J(ta2Var3);
                Map mapB = ((ue3) this.d).zzb();
                if (((Boolean) zzbd.zzc().a(p32.d6)).booleanValue()) {
                    zzbgd zzbgdVar = new zzbgd(new zzbgi(contextA));
                    synchronized (zzbgdVar) {
                        if (zzbgdVar.c) {
                            try {
                                g32 g32Var = zzbgdVar.b;
                                g32Var.d();
                                ((y2) g32Var.b).w(str);
                            } catch (NullPointerException e) {
                                zzt.zzh().f("AdMobClearcutLogger.modify", e);
                            }
                        }
                    }
                    setSingleton = Collections.singleton(new zzdje(new zl2(zzbgdVar, mapB), ta2Var3));
                } else {
                    setSingleton = Collections.EMPTY_SET;
                }
                k02.J(setSingleton);
                return setSingleton;
            case 11:
                return new zzdyc((zzdxt) ((se3) this.b).zzb(), ((we3) this.c).zzb(), (Clock) this.d.zzb());
            case 12:
                Context contextA2 = ((sc2) this.b).a();
                WeakReference weakReference = (WeakReference) ((pc2) this.c).b.d;
                k02.J(weakReference);
                jn2 jn2Var = (jn2) ((se3) this.d).zzb();
                ta2 ta2Var4 = g3.a;
                k02.J(ta2Var4);
                return new qn2(contextA2, weakReference, jn2Var, ta2Var4);
            case 13:
                return a();
            case 14:
                rc2 rc2Var = (rc2) this.b;
                ta2 ta2Var5 = g3.a;
                k02.J(ta2Var5);
                vr2 vr2Var = new vr2(ta2Var5, rc2Var.b.a());
                Clock clock2 = (Clock) ((se3) this.c).zzb();
                k02.J(ta2Var5);
                return new zzevl(vr2Var, ((Long) a42.c.g()).longValue(), clock2, ta2Var5, (zzdxz) ((se3) this.d).zzb());
            case 15:
                Context contextA3 = ((rc2) this.b).b.a();
                ta2 ta2Var6 = g3.a;
                k02.J(ta2Var6);
                nr2 nr2Var = new nr2(contextA3, ta2Var6, 4);
                Clock clock3 = (Clock) ((se3) this.c).zzb();
                k02.J(ta2Var6);
                return new zzevl(nr2Var, 2147483647L, clock3, ta2Var6, (zzdxz) ((se3) this.d).zzb());
            case 16:
                wc2 wc2Var = (wc2) this.b;
                ta2 ta2Var7 = g3.a;
                k02.J(ta2Var7);
                vs2 vs2Var = new vs2(ta2Var7, wc2Var.b.a(), (vn2) wc2Var.c.zzb());
                Clock clock4 = (Clock) ((se3) this.c).zzb();
                k02.J(ta2Var7);
                return new zzevl(vs2Var, ((Long) a42.d.g()).longValue(), clock4, ta2Var7, (zzdxz) ((se3) this.d).zzb());
            case 17:
                er2 er2Var = new er2(((sc2) ((fr2) this.b).a).a(), 0);
                Clock clock5 = (Clock) ((se3) this.c).zzb();
                ta2 ta2Var8 = g3.a;
                k02.J(ta2Var8);
                return new zzevl(er2Var, 2147483647L, clock5, ta2Var8, (zzdxz) ((se3) this.d).zzb());
            case 18:
                pr2 pr2VarA = ((qr2) this.b).zzb();
                Clock clock6 = (Clock) ((se3) this.c).zzb();
                ta2 ta2Var9 = g3.a;
                k02.J(ta2Var9);
                return new zzevl(pr2VarA, ((Long) a42.a.g()).longValue(), clock6, ta2Var9, (zzdxz) ((se3) this.d).zzb());
            case 19:
                pr2 pr2VarA2 = ((tr2) this.b).zzb();
                Clock clock7 = (Clock) ((se3) this.c).zzb();
                ta2 ta2Var10 = g3.a;
                k02.J(ta2Var10);
                return new zzevl(pr2VarA2, 2147483647L, clock7, ta2Var10, (zzdxz) ((se3) this.d).zzb());
            case 20:
                zzeuv zzeuvVarA = ((ur2) this.b).zzb();
                Clock clock8 = (Clock) ((se3) this.c).zzb();
                ta2 ta2Var11 = g3.a;
                k02.J(ta2Var11);
                return new zzevl(zzeuvVarA, ((Long) a42.b.g()).longValue(), clock8, ta2Var11, (zzdxz) ((se3) this.d).zzb());
            case 21:
                pr2 pr2VarZzb = ((cs2) this.b).zzb();
                Clock clock9 = (Clock) ((se3) this.c).zzb();
                ta2 ta2Var12 = g3.a;
                k02.J(ta2Var12);
                return new zzevl(pr2VarZzb, ((Long) a42.e.g()).longValue(), clock9, ta2Var12, (zzdxz) ((se3) this.d).zzb());
            case 22:
                es2 es2VarZzb = ((fs2) this.b).zzb();
                Clock clock10 = (Clock) ((se3) this.c).zzb();
                ta2 ta2Var13 = g3.a;
                k02.J(ta2Var13);
                return new zzevl(es2VarZzb, 2147483647L, clock10, ta2Var13, (zzdxz) ((se3) this.d).zzb());
            case 23:
                gs2 gs2VarA = ((os2) this.b).zzb();
                Clock clock11 = (Clock) ((se3) this.c).zzb();
                ta2 ta2Var14 = g3.a;
                k02.J(ta2Var14);
                return new zzevl(gs2VarA, ((Long) a42.g.g()).longValue(), clock11, ta2Var14, (zzdxz) ((se3) this.d).zzb());
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                zzfbm zzfbmVarA = ((ws2) this.b).zzb();
                Clock clock12 = (Clock) ((se3) this.c).zzb();
                ta2 ta2Var15 = g3.a;
                k02.J(ta2Var15);
                return new zzevl(zzfbmVarA, ((Long) a42.h.g()).longValue(), clock12, ta2Var15, (zzdxz) ((se3) this.d).zzb());
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                return b();
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                k02.J(((et2) this.b).b.a.d);
                new zzbfg();
                zzcdu zzcduVar = (zzcdu) this.c.zzb();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.d.zzb();
                ta2 ta2Var16 = g3.a;
                k02.J(ta2Var16);
                return new ir2(zzcduVar, scheduledExecutorService2, ta2Var16);
            case 27:
                return new zzfio((zzfie) ((se3) this.b).zzb(), (zzfhv) ((se3) this.c).zzb(), (zzfjd) ((se3) this.d).zzb());
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                zzgcl zzgclVar = ((k5) ((te3) this.b).a).L() ? (zzgcl) se3.b((se3) this.c).zzb() : (zzgcl) se3.b((se3) this.d).zzb();
                k02.J(zzgclVar);
                return zzgclVar;
            default:
                Context context2 = (Context) ((te3) this.b).a;
                return new q03(context2, (ExecutorService) ((te3) this.c).a, q03.g);
        }
    }

    public /* synthetic */ ha2(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, int i) {
        this.a = i;
        this.b = zzikpVar;
        this.c = zzikpVar2;
        this.d = zzikpVar3;
    }

    public ha2(te3 te3Var, se3 se3Var, te3 te3Var2) {
        this.a = 29;
        this.b = te3Var;
        this.d = se3Var;
        this.c = te3Var2;
    }
}
