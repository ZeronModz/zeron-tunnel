package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.e3;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.r3;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzcue;
import com.google.android.gms.internal.ads.zzdbh;
import com.google.android.gms.internal.ads.zzdcm;
import com.google.android.gms.internal.ads.zzdej;
import com.google.android.gms.internal.ads.zzdje;
import com.google.android.gms.internal.ads.zzdkr;
import com.google.android.gms.internal.ads.zzdoc;
import com.google.android.gms.internal.ads.zzdol;
import com.google.android.gms.internal.ads.zzdsm;
import com.google.android.gms.internal.ads.zzdtw;
import com.google.android.gms.internal.ads.zzdxt;
import com.google.android.gms.internal.ads.zzdzr;
import com.google.android.gms.internal.ads.zzecz;
import com.google.android.gms.internal.ads.zzeej;
import com.google.android.gms.internal.ads.zzefc;
import com.google.android.gms.internal.ads.zzefr;
import com.google.android.gms.internal.ads.zzehj;
import com.google.android.gms.internal.ads.zzehn;
import com.google.android.gms.internal.ads.zzehp;
import com.google.android.gms.internal.ads.zzehr;
import com.google.android.gms.internal.ads.zzekl;
import com.google.android.gms.internal.ads.zzeua;
import com.google.android.gms.internal.ads.zzezj;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.android.gms.internal.ads.zzike;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class la2 implements zzikg {
    public final /* synthetic */ int a;
    public final Object b;
    public final zzikp c;

    public /* synthetic */ la2(Object obj, zzikp zzikpVar, int i) {
        this.a = i;
        this.b = obj;
        this.c = zzikpVar;
    }

    public zzehn a() {
        return new zzehn(new zzehj(((sc2) ((ee2) this.b).b).a()), (zzgzy) this.c.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        zzikp zzikpVar = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                ia2 ia2Var = (ia2) zzikpVar;
                return new e3((Context) ((te3) obj).a, new i31(ia2Var.c.a, 13, ia2Var.b.zzb(), false));
            case 1:
                return new ne2(((ue3) obj).zzb(), ((ue3) zzikpVar).zzb());
            case 2:
                return ((zzcue) obj).a(((we3) zzikpVar).zzb());
            case 3:
                return new zzezj(((ha2) obj).a(), ((Integer) zzbd.zzc().a(p32.Td)).intValue(), (ScheduledExecutorService) zzikpVar.zzb());
            case 4:
                return new zzezj(new er2(((fl2) obj).b.a(), 2), ((Integer) zzbd.zzc().a(p32.Yd)).intValue(), (ScheduledExecutorService) zzikpVar.zzb());
            case 5:
                return new zzezj(((ha2) obj).b(), ((Integer) zzbd.zzc().a(p32.Ud)).intValue(), (ScheduledExecutorService) zzikpVar.zzb());
            case 6:
                Boolean bool = (Boolean) zzbd.zzc().a(p32.D6);
                bool.booleanValue();
                return true == bool.booleanValue() ? ((tf2) obj).b() : ((of2) zzikpVar).a();
            case 7:
                return new eg2(((wf2) obj).b.d, (Executor) zzikpVar.zzb());
            case 8:
                String str = (String) ((se3) zzikpVar).zzb();
                zzekl zzeklVar = ((oh2) obj).f;
                return zzeklVar != null ? zzeklVar : new zzekl(str);
            case 9:
                ((sc2) zzikpVar).a();
                Context context = ((oh2) obj).a;
                k02.J(context);
                return context;
            case 10:
                Set setZzb = ((we3) zzikpVar).zzb();
                ji2 ji2Var = (ji2) obj;
                zzdbh zzdbhVar = ji2Var.p;
                if (zzdbhVar != null) {
                    return zzdbhVar;
                }
                zzdbh zzdbhVar2 = new zzdbh(setZzb);
                ji2Var.p = zzdbhVar2;
                return zzdbhVar2;
            case 11:
                return new wi2((ml2) ((zzikp) obj).zzb(), ((ng2) zzikpVar).b.a());
            case 12:
                Set setA = ((zzdkr) obj).a((ch2) ((se3) zzikpVar).zzb());
                k02.J(setA);
                return setA;
            case 13:
                return new zzdje(new uf2(((zzdkr) obj).b, 1), (Executor) zzikpVar.zzb());
            case 14:
                tt2 tt2VarB = ((ng2) obj).b();
                JSONObject jSONObject = ((lj2) zzikpVar).b.a;
                k02.J(jSONObject);
                return new zzdol(tt2VarB, jSONObject);
            case 15:
                ta2 ta2Var = g3.a;
                k02.J(ta2Var);
                return new tj1(ta2Var, 27, ((ok2) obj).zzb(), (zzdxt) ((se3) zzikpVar).zzb());
            case 16:
                return new zzdsm((zzdoc) ((zzike) obj).zzb(), ((pe2) zzikpVar).a());
            case 17:
                return new zzdtw((zzdcm) ((se3) obj).zzb(), ((ng2) zzikpVar).b());
            case 18:
                return new ql2(gu2.a(((rc2) obj).b.a()), (ol2) ((se3) zzikpVar).zzb());
            case 19:
                return new zl2((zzbgd) ((se3) obj).zzb(), ((ue3) zzikpVar).zzb());
            case 20:
                return new r3((zzdzr) ((te3) obj).a, new ci2((zzbph) ((mm2) zzikpVar).b.a, 3));
            case 21:
                ta2 ta2Var2 = g3.b;
                k02.J(ta2Var2);
                ta2 ta2Var3 = g3.a;
                k02.J(ta2Var3);
                return new zzecz(ta2Var2, ta2Var3, new zzeej((Context) ((cn2) obj).b.zzb(), ta2Var3), se3.b((fg2) zzikpVar));
            case 22:
                Map map = ((ve3) obj).a;
                ta2 ta2Var4 = g3.a;
                k02.J(ta2Var4);
                return new zzefc(map, ta2Var4, new zzdej(((th2) zzikpVar).b.zzb()));
            case 23:
                ta2 ta2Var5 = g3.a;
                k02.J(ta2Var5);
                return new zzefr(ta2Var5, ((ee2) obj).a(), se3.b((fg2) zzikpVar));
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                return a();
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                return new zzehp(((fg2) obj).b(), ((oc2) zzikpVar).zzb());
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                return new so2(((la2) obj).a(), ((oc2) zzikpVar).zzb());
            case 27:
                la2 la2Var = (la2) zzikpVar;
                return new zl2((zzehr) ((se3) obj).zzb(), new so2(((la2) la2Var.b).a(), ((oc2) la2Var.c).zzb()));
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                ta2 ta2Var6 = g3.a;
                k02.J(ta2Var6);
                return new zzeua(ta2Var6, ((rh2) obj).a(), ((zc2) zzikpVar).zzb());
            default:
                return new zzezj(((bh2) obj).a(), ((Integer) zzbd.zzc().a(p32.Qd)).intValue(), (ScheduledExecutorService) zzikpVar.zzb());
        }
    }
}
