package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzat;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzau;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.n3;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzboy;
import com.google.android.gms.internal.ads.zzbpa;
import com.google.android.gms.internal.ads.zzcce;
import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzctj;
import com.google.android.gms.internal.ads.zzctl;
import com.google.android.gms.internal.ads.zzcue;
import com.google.android.gms.internal.ads.zzcvc;
import com.google.android.gms.internal.ads.zzcwu;
import com.google.android.gms.internal.ads.zzcwv;
import com.google.android.gms.internal.ads.zzdbx;
import com.google.android.gms.internal.ads.zzdbz;
import com.google.android.gms.internal.ads.zzdkr;
import com.google.android.gms.internal.ads.zzdlu;
import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzdub;
import com.google.android.gms.internal.ads.zzdue;
import com.google.android.gms.internal.ads.zzduu;
import com.google.android.gms.internal.ads.zzduv;
import com.google.android.gms.internal.ads.zzduy;
import com.google.android.gms.internal.ads.zzduz;
import com.google.android.gms.internal.ads.zzdxh;
import com.google.android.gms.internal.ads.zzdxt;
import com.google.android.gms.internal.ads.zzecr;
import com.google.android.gms.internal.ads.zzejf;
import com.google.android.gms.internal.ads.zzekg;
import com.google.android.gms.internal.ads.zzekr;
import com.google.android.gms.internal.ads.zzelg;
import com.google.android.gms.internal.ads.zzelk;
import com.google.android.gms.internal.ads.zzelp;
import com.google.android.gms.internal.ads.zzemc;
import com.google.android.gms.internal.ads.zzems;
import com.google.android.gms.internal.ads.zzeot;
import com.google.android.gms.internal.ads.zzfis;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ty1 implements zzgyw {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ty1(yk2 yk2Var, String str, JSONObject jSONObject) {
        this.a = 3;
        this.b = yk2Var;
        this.d = str;
        this.c = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final ListenableFuture zza(Object obj) {
        int i = this.a;
        final int i2 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                return ((zzau) obj4).zzu((yk2[]) obj3, (String) obj2, (yk2) obj);
            case 1:
                zzcwu zzcwuVar = (zzcwu) obj4;
                wl0 wl0Var = (wl0) obj3;
                ListenableFuture listenableFuture = (ListenableFuture) obj2;
                jg2 jg2Var = (jg2) obj;
                if (jg2Var != null) {
                    wl0Var.mo5zzb(jg2Var);
                }
                return z.T(listenableFuture, ((Long) w42.a.g()).longValue(), TimeUnit.MILLISECONDS, zzcwuVar.b);
            case 2:
                zzdsh zzdshVar = (zzdsh) obj4;
                zzcjl zzcjlVarA = zzdshVar.c.a(zzr.zzb(), null, null);
                w12 w12Var = new w12(zzcjlVarA);
                zzdshVar.a(zzcjlVarA, (zzb) obj3, (zzcce) obj2);
                zzcjlVarA.zzP().zzH(new xb2(w12Var));
                zzcjlVarA.loadUrl((String) zzbd.zzc().a(p32.F4));
                return w12Var;
            case 3:
                String str = (String) obj2;
                JSONObject jSONObject = (JSONObject) obj3;
                zzcjl zzcjlVar = (zzcjl) obj;
                zzboy zzboyVar = ((yk2) obj4).h;
                zzcen zzcenVar = new zzcen();
                zzt.zzc();
                String string = UUID.randomUUID().toString();
                zzboyVar.a(string, new j62(zzboyVar, zzcenVar));
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", string);
                    jSONObject2.put("args", jSONObject);
                    zzcjlVar.zzb(str, jSONObject2);
                    break;
                } catch (Exception e) {
                    zzcenVar.b(e);
                }
                return zzcenVar;
            case 4:
                zzekr zzekrVar = (zzekr) obj4;
                tt2 tt2Var = (tt2) obj3;
                zzfjc zzfjcVar = (zzfjc) obj2;
                zzdxt zzdxtVar = zzekrVar.i;
                l32 l32Var = p32.N2;
                if (((Boolean) zzbd.zzc().a(l32Var)).booleanValue()) {
                    ec1.R(zzdxh.RENDERING_WEBVIEW_CREATION_START.zza(), zzdxtVar.e);
                }
                zzduv zzduvVar = zzekrVar.b;
                cu2 cu2Var = zzekrVar.c;
                final zzcjl zzcjlVarA2 = zzduvVar.a(cu2Var.f, tt2Var, zzfjcVar.b.b);
                zzcjlVarA2.zzaw(tt2Var.W);
                if (((Boolean) zzbd.zzc().a(l32Var)).booleanValue()) {
                    ec1.R(zzdxh.RENDERING_WEBVIEW_CREATION_END.zza(), zzdxtVar.e);
                }
                zzcen zzcenVar2 = new zzcen();
                zzctl zzctlVar = zzekrVar.a;
                zzcwv zzcwvVar = new zzcwv(zzfjcVar, tt2Var, null);
                VersionInfoParcel versionInfoParcel = zzekrVar.e;
                boolean z = zzekrVar.g;
                zzbok zzbokVar = zzekrVar.f;
                hd2 hd2VarA = zzctlVar.a(zzcwvVar, new zzdkr(new lp2(versionInfoParcel, zzcenVar2, tt2Var, zzcjlVarA2, cu2Var, z, zzbokVar, zzekrVar.h, zzekrVar.j), zzcjlVarA2), new zzctj(tt2Var.a0));
                if (((Boolean) zzbd.zzc().a(l32Var)).booleanValue()) {
                    ec1.R(zzdxh.RENDERING_AD_COMPONENT_CREATION_END.zza(), zzdxtVar.e);
                }
                zzduu zzduuVarF = hd2VarA.f();
                if (true != z) {
                    zzbokVar = null;
                }
                zzduuVarF.a(zzcjlVarA2, false, zzbokVar, zzdxtVar.e);
                zzcenVar2.a(hd2VarA);
                hd2VarA.b().h(new zzdbz() { // from class: jp2
                    @Override // com.google.android.gms.internal.ads.zzdbz
                    public final /* synthetic */ void zzdr() {
                        int i3 = i2;
                        zzcjl zzcjlVar2 = zzcjlVarA2;
                        switch (i3) {
                            case 0:
                                if (zzcjlVar2.zzP() != null) {
                                    zzcjlVar2.zzP().zzq();
                                }
                                break;
                            case 1:
                                if (zzcjlVar2.zzP() != null) {
                                    zzcjlVar2.zzP().zzq();
                                }
                                break;
                            case 2:
                                if (zzcjlVar2.zzP() != null) {
                                    zzcjlVar2.zzP().zzq();
                                }
                                break;
                            default:
                                if (zzcjlVar2.zzP() != null) {
                                    zzcjlVar2.zzP().zzq();
                                }
                                break;
                        }
                    }
                }, g3.g);
                vt2 vt2Var = tt2Var.s;
                String strA = vt2Var.a;
                if (((Boolean) zzbd.zzc().a(p32.m6)).booleanValue() && ((fp2) hd2VarA.i.zzb()).a()) {
                    strA = dc2.a(strA, dc2.b(tt2Var));
                }
                hd2VarA.f();
                return z.b0(zzduu.b(zzcjlVarA2, vt2Var.b, strA, zzdxtVar.e, zzctlVar.zzd()), new ah2(zzcjlVarA2, 1, tt2Var, hd2VarA), zzekrVar.d);
            case 5:
                zzelg zzelgVar = (zzelg) obj4;
                zzfjc zzfjcVar2 = (zzfjc) obj3;
                tt2 tt2Var2 = (tt2) obj2;
                Executor executor = zzelgVar.e;
                zzdxt zzdxtVar2 = zzelgVar.g;
                l32 l32Var2 = p32.N2;
                if (((Boolean) zzbd.zzc().a(l32Var2)).booleanValue()) {
                    ec1.R(zzdxh.RENDERING_WEBVIEW_CREATION_START.zza(), zzdxtVar2.e);
                }
                Context context = zzelgVar.b;
                zzr zzrVarQ = if3.Q(context, tt2Var2.u);
                final zzcjl zzcjlVarA3 = zzelgVar.c.a(zzrVarQ, tt2Var2, zzfjcVar2.b.b);
                zzcjlVarA3.zzaw(tt2Var2.W);
                View viewA = (((Boolean) zzbd.zzc().a(p32.d9)).booleanValue() && tt2Var2.g0) ? n3.a(context, zzcjlVarA3.zzE(), tt2Var2) : new zzduy(context, zzcjlVarA3.zzE(), (zzat) zzelgVar.f.apply(tt2Var2));
                if (((Boolean) zzbd.zzc().a(l32Var2)).booleanValue()) {
                    ec1.R(zzdxh.RENDERING_WEBVIEW_CREATION_END.zza(), zzdxtVar2.e);
                }
                zzcvc zzcvcVar = zzelgVar.a;
                kd2 kd2VarD = zzcvcVar.d(new zzcwv(zzfjcVar2, tt2Var2, null), new zzcue(viewA, zzcjlVarA3, new rp2(zzcjlVarA3), zzrVarQ.zzi ? new zzfis(-3, 0, true) : new zzfis(zzrVarQ.zze, zzrVarQ.zzb, false)));
                if (((Boolean) zzbd.zzc().a(l32Var2)).booleanValue()) {
                    ec1.R(zzdxh.RENDERING_AD_COMPONENT_CREATION_END.zza(), zzdxtVar2.e);
                }
                kd2VarD.f().a(zzcjlVarA3, false, null, zzdxtVar2.e);
                zzdbx zzdbxVarB = kd2VarD.b();
                final int i3 = 1;
                zzdbz zzdbzVar = new zzdbz() { // from class: jp2
                    @Override // com.google.android.gms.internal.ads.zzdbz
                    public final /* synthetic */ void zzdr() {
                        int i32 = i3;
                        zzcjl zzcjlVar2 = zzcjlVarA3;
                        switch (i32) {
                            case 0:
                                if (zzcjlVar2.zzP() != null) {
                                    zzcjlVar2.zzP().zzq();
                                }
                                break;
                            case 1:
                                if (zzcjlVar2.zzP() != null) {
                                    zzcjlVar2.zzP().zzq();
                                }
                                break;
                            case 2:
                                if (zzcjlVar2.zzP() != null) {
                                    zzcjlVar2.zzP().zzq();
                                }
                                break;
                            default:
                                if (zzcjlVar2.zzP() != null) {
                                    zzcjlVar2.zzP().zzq();
                                }
                                break;
                        }
                    }
                };
                ta2 ta2Var = g3.g;
                zzdbxVarB.h(zzdbzVar, ta2Var);
                vt2 vt2Var2 = tt2Var2.s;
                String strA2 = vt2Var2.a;
                if (((Boolean) zzbd.zzc().a(p32.m6)).booleanValue() && ((fp2) kd2VarD.l.zzb()).a()) {
                    strA2 = dc2.a(strA2, dc2.b(tt2Var2));
                }
                kd2VarD.f();
                zzcen zzcenVarB = zzduu.b(zzcjlVarA3, vt2Var2.b, strA2, zzdxtVar2.e, zzcvcVar.c());
                b43 b43Var = zzcenVarB.a;
                boolean z2 = tt2Var2.M;
                int i4 = 7;
                if (z2) {
                    b43Var.addListener(new yb2(zzcjlVarA3, i4), executor);
                }
                b43Var.addListener(new qj2(i4, zzelgVar, zzcjlVarA3), executor);
                return z.b0(zzcenVarB, new ny1(kd2VarD, 3), ta2Var);
            case 6:
                return z.j(n3.a(((zzelk) obj4).a, (View) obj3, (tt2) obj2));
            case 7:
                return z.j(n3.a(((zzelp) obj4).a, (View) obj3, (tt2) obj2));
            case 8:
                zzemc zzemcVar = (zzemc) obj4;
                tt2 tt2Var3 = (tt2) obj3;
                zzfjc zzfjcVar3 = (zzfjc) obj2;
                zzdxt zzdxtVar3 = zzemcVar.j;
                l32 l32Var3 = p32.N2;
                if (((Boolean) zzbd.zzc().a(l32Var3)).booleanValue()) {
                    ec1.R(zzdxh.RENDERING_WEBVIEW_CREATION_START.zza(), zzdxtVar3.e);
                }
                zzduv zzduvVar2 = zzemcVar.b;
                cu2 cu2Var2 = zzemcVar.d;
                final zzcjl zzcjlVarA4 = zzduvVar2.a(cu2Var2.f, tt2Var3, zzfjcVar3.b.b);
                zzcjlVarA4.zzaw(tt2Var3.W);
                if (((Boolean) zzbd.zzc().a(l32Var3)).booleanValue()) {
                    ec1.R(zzdxh.RENDERING_WEBVIEW_CREATION_END.zza(), zzdxtVar3.e);
                }
                zzcen zzcenVar3 = new zzcen();
                zzdlu zzdluVar = zzemcVar.c;
                zzcwv zzcwvVar2 = new zzcwv(zzfjcVar3, tt2Var3, null);
                Context context2 = zzemcVar.a;
                VersionInfoParcel versionInfoParcel2 = zzemcVar.f;
                boolean z3 = zzemcVar.h;
                zzbok zzbokVar2 = zzemcVar.g;
                qd2 qd2VarD = zzdluVar.d(zzcwvVar2, new zzdkr(new vp2(context2, versionInfoParcel2, zzcenVar3, tt2Var3, zzcjlVarA4, cu2Var2, z3, zzbokVar2, zzemcVar.i, zzemcVar.k), zzcjlVarA4));
                zzcenVar3.a(qd2VarD);
                if (((Boolean) zzbd.zzc().a(l32Var3)).booleanValue()) {
                    ec1.R(zzdxh.RENDERING_AD_COMPONENT_CREATION_END.zza(), zzdxtVar3.e);
                }
                final int i5 = 2;
                qd2VarD.b().h(new zzdbz() { // from class: jp2
                    @Override // com.google.android.gms.internal.ads.zzdbz
                    public final /* synthetic */ void zzdr() {
                        int i32 = i5;
                        zzcjl zzcjlVar2 = zzcjlVarA4;
                        switch (i32) {
                            case 0:
                                if (zzcjlVar2.zzP() != null) {
                                    zzcjlVar2.zzP().zzq();
                                }
                                break;
                            case 1:
                                if (zzcjlVar2.zzP() != null) {
                                    zzcjlVar2.zzP().zzq();
                                }
                                break;
                            case 2:
                                if (zzcjlVar2.zzP() != null) {
                                    zzcjlVar2.zzP().zzq();
                                }
                                break;
                            default:
                                if (zzcjlVar2.zzP() != null) {
                                    zzcjlVar2.zzP().zzq();
                                }
                                break;
                        }
                    }
                }, g3.g);
                vt2 vt2Var3 = tt2Var3.s;
                String strA3 = vt2Var3.a;
                if (((Boolean) zzbd.zzc().a(p32.m6)).booleanValue() && ((fp2) qd2VarD.h.zzb()).a()) {
                    strA3 = dc2.a(strA3, dc2.b(tt2Var3));
                }
                qd2VarD.f().a(zzcjlVarA4, true, true != z3 ? null : zzbokVar2, zzdxtVar3.e);
                qd2VarD.f();
                return z.b0(zzduu.b(zzcjlVarA4, vt2Var3.b, strA3, zzdxtVar3.e, zzdluVar.c()), new ah2(zzcjlVarA4, i5, tt2Var3, qd2VarD), zzemcVar.e);
            case 9:
                zzems zzemsVar = (zzems) obj4;
                zzfjc zzfjcVar4 = (zzfjc) obj3;
                tt2 tt2Var4 = (tt2) obj2;
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.length() == 0) {
                    return z.v(new zzecr(3));
                }
                int i6 = zzfjcVar4.a.a.l;
                if (i6 <= 1) {
                    return z.b0(zzemsVar.a(zzfjcVar4, tt2Var4, jSONArray.getJSONObject(0)), ox1.m, zzemsVar.b);
                }
                int length = jSONArray.length();
                if (((Boolean) zzbd.zzc().a(p32.O2)).booleanValue()) {
                    zzemsVar.f.b("nsl", String.valueOf(length));
                }
                zzemsVar.d.a(Math.min(length, i6));
                ArrayList arrayList = new ArrayList(i6);
                while (i2 < i6) {
                    if (i2 < length) {
                        arrayList.add(zzemsVar.a(zzfjcVar4, tt2Var4, jSONArray.getJSONObject(i2)));
                    } else {
                        arrayList.add(z.v(new zzecr(3)));
                    }
                    i2++;
                }
                return z.j(arrayList);
            default:
                zzeot zzeotVar = (zzeot) obj4;
                tt2 tt2Var5 = (tt2) obj3;
                zzfjc zzfjcVar5 = (zzfjc) obj2;
                zzdxt zzdxtVar4 = zzeotVar.j;
                l32 l32Var4 = p32.N2;
                if (((Boolean) zzbd.zzc().a(l32Var4)).booleanValue()) {
                    ec1.R(zzdxh.RENDERING_WEBVIEW_CREATION_START.zza(), zzdxtVar4.e);
                }
                zzduv zzduvVar3 = zzeotVar.b;
                cu2 cu2Var3 = zzeotVar.d;
                final zzcjl zzcjlVarA5 = zzduvVar3.a(cu2Var3.f, tt2Var5, zzfjcVar5.b.b);
                zzcjlVarA5.zzaw(tt2Var5.W);
                if (((Boolean) zzbd.zzc().a(l32Var4)).booleanValue()) {
                    ec1.R(zzdxh.RENDERING_WEBVIEW_CREATION_END.zza(), zzdxtVar4.e);
                }
                zzcen zzcenVar4 = new zzcen();
                zzdue zzdueVar = zzeotVar.c;
                zzcwv zzcwvVar3 = new zzcwv(zzfjcVar5, tt2Var5, null);
                Context context3 = zzeotVar.a;
                VersionInfoParcel versionInfoParcel3 = zzeotVar.f;
                zzbok zzbokVar3 = zzeotVar.g;
                boolean z4 = zzeotVar.h;
                zzejf zzejfVar = zzeotVar.i;
                zzdxt zzdxtVar5 = zzeotVar.j;
                ud2 ud2VarA = zzdueVar.a(zzcwvVar3, new zzdub(new lq2(context3, zzduvVar3, cu2Var3, versionInfoParcel3, tt2Var5, zzcenVar4, zzcjlVarA5, zzbokVar3, z4, zzejfVar, zzdxtVar5, zzeotVar.k), zzcjlVarA5));
                zzcenVar4.a(ud2VarA);
                if (((Boolean) zzbd.zzc().a(l32Var4)).booleanValue()) {
                    ec1.R(zzdxh.RENDERING_AD_COMPONENT_CREATION_END.zza(), zzdxtVar5.e);
                }
                zzcjlVarA5.zzab("/reward", new zzbpa(ud2VarA.f()));
                final int i7 = 3;
                ud2VarA.b().h(new zzdbz() { // from class: jp2
                    @Override // com.google.android.gms.internal.ads.zzdbz
                    public final /* synthetic */ void zzdr() {
                        int i32 = i7;
                        zzcjl zzcjlVar2 = zzcjlVarA5;
                        switch (i32) {
                            case 0:
                                if (zzcjlVar2.zzP() != null) {
                                    zzcjlVar2.zzP().zzq();
                                }
                                break;
                            case 1:
                                if (zzcjlVar2.zzP() != null) {
                                    zzcjlVar2.zzP().zzq();
                                }
                                break;
                            case 2:
                                if (zzcjlVar2.zzP() != null) {
                                    zzcjlVar2.zzP().zzq();
                                }
                                break;
                            default:
                                if (zzcjlVar2.zzP() != null) {
                                    zzcjlVar2.zzP().zzq();
                                }
                                break;
                        }
                    }
                }, g3.g);
                ud2VarA.g().a(zzcjlVarA5, true, true != z4 ? null : zzbokVar3, zzdxtVar5.e);
                vt2 vt2Var4 = tt2Var5.s;
                String strA4 = vt2Var4.a;
                if (((Boolean) zzbd.zzc().a(p32.m6)).booleanValue() && ((fp2) ud2VarA.h.zzb()).a()) {
                    strA4 = dc2.a(strA4, dc2.b(tt2Var5));
                }
                ud2VarA.g();
                return z.b0(zzduu.b(zzcjlVarA5, vt2Var4.b, strA4, zzdxtVar5.e, zzdueVar.zzd()), new ah2(zzcjlVarA5, 3, tt2Var5, ud2VarA), zzeotVar.e);
        }
    }

    public /* synthetic */ ty1(Object obj, int i, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ ty1(zzekg zzekgVar, tt2 tt2Var, zzfjc zzfjcVar, zzduz zzduzVar, int i) {
        this.a = i;
        this.b = zzekgVar;
        this.c = tt2Var;
        this.d = zzfjcVar;
    }
}
