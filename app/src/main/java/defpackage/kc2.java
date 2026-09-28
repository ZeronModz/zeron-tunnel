package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzfi;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.zzbmd;
import com.google.android.gms.internal.ads.zzbyw;
import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzcwu;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdmb;
import com.google.android.gms.internal.ads.zzdop;
import com.google.android.gms.internal.ads.zzdpc;
import com.google.android.gms.internal.ads.zzdsm;
import com.google.android.gms.internal.ads.zzeej;
import com.google.android.gms.internal.ads.zzenr;
import com.google.android.gms.internal.ads.zzeqn;
import com.google.android.gms.internal.ads.zzerp;
import com.google.android.gms.internal.ads.zzevl;
import com.google.android.gms.internal.ads.zzfet;
import com.google.android.gms.internal.ads.zzfff;
import com.google.android.gms.internal.ads.zzfgv;
import com.google.android.gms.internal.ads.zzgzy;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kc2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kc2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final /* synthetic */ void a() {
        mh2 mh2Var = (mh2) this.b;
        synchronized (mh2Var.a) {
            try {
                if (mh2Var.i) {
                    return;
                }
                mh2Var.i = true;
                mh2Var.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final /* synthetic */ void b() {
        zzdbs zzdbsVar = (zzdbs) this.b;
        synchronized (zzdbsVar) {
            zzo.zzf("Timeout waiting for show call succeed to be called.");
            zzdbsVar.zzd(new zzdmb("Timeout for show call succeed."));
            zzdbsVar.d = true;
        }
    }

    private final void c() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        jn2 jn2Var = (jn2) this.b;
        zzcjl zzcjlVar = jn2Var.d;
        gn2 gn2Var = jn2Var.c;
        synchronized (gn2Var) {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("platform", "ANDROID");
                    String str = gn2Var.k;
                    if (!TextUtils.isEmpty(str)) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                        sb.append("afma-sdk-a-v");
                        sb.append(str);
                        jSONObject.put("sdkVersion", sb.toString());
                    }
                    jSONObject.put("internalSdkVersion", gn2Var.i);
                    jSONObject.put("osVersion", Build.VERSION.RELEASE);
                    jSONObject.put("adapters", gn2Var.d.a());
                    if (((Boolean) zzbd.zzc().a(p32.Ra)).booleanValue()) {
                        String str2 = zzt.zzh().g;
                        if (!TextUtils.isEmpty(str2)) {
                            jSONObject.put("plugin", str2);
                        }
                    }
                    if (gn2Var.q < zzt.zzk().currentTimeMillis() / 1000) {
                        gn2Var.o = "{}";
                    }
                    jSONObject.put("networkExtras", gn2Var.o);
                    jSONObject.put("adSlots", gn2Var.j());
                    jSONObject.put("appInfo", gn2Var.e.a());
                    String str3 = zzt.zzh().i().zzi().e;
                    if (!TextUtils.isEmpty(str3)) {
                        jSONObject.put("cld", new JSONObject(str3));
                    }
                    if (((Boolean) zzbd.zzc().a(p32.Ga)).booleanValue() && (jSONObject2 = gn2Var.p) != null) {
                        String string = jSONObject2.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 13);
                        sb2.append("Server data: ");
                        sb2.append(string);
                        zzo.zzd(sb2.toString());
                        jSONObject.put("serverData", gn2Var.p);
                    }
                    if (((Boolean) zzbd.zzc().a(p32.Fa)).booleanValue()) {
                        jSONObject.put("openAction", gn2Var.v);
                        jSONObject.put("gesture", gn2Var.r);
                    }
                    jSONObject.put("isGamRegisteredTestDevice", zzt.zzo().zzk());
                    zzt.zzc();
                    zzbb.zza();
                    jSONObject.put("isSimulator", zzf.zzw());
                    if (((Boolean) zzbd.zzc().a(p32.Ta)).booleanValue()) {
                        jSONObject.put("uiStorage", new JSONObject(gn2Var.x));
                    }
                    if (!TextUtils.isEmpty((CharSequence) zzbd.zzc().a(p32.Va))) {
                        jSONObject.put("gmaDisk", (JSONObject) gn2Var.h.b);
                    }
                    if (!TextUtils.isEmpty((CharSequence) zzbd.zzc().a(p32.Ua))) {
                        jSONObject.put("userDisk", (JSONObject) gn2Var.g.b);
                    }
                } catch (JSONException e) {
                    zzt.zzh().g(e, "Inspector.toJson");
                    zzo.zzj("Ad inspector encountered an error", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzcjlVar.zzc("window.inspectorInfo", jSONObject.toString());
    }

    private final /* synthetic */ void d() {
        vn2 vn2Var = (vn2) this.b;
        AtomicReference atomicReference = vn2Var.d;
        synchronized (atomicReference) {
            try {
                if (((String) atomicReference.get()).isEmpty()) {
                    atomicReference.set(vn2Var.b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void e() {
        eo2 eo2Var = (eo2) this.b;
        synchronized (eo2Var.b) {
            try {
                if (eo2Var.c) {
                    return;
                }
                eo2Var.c = true;
                zzbyw zzbywVar = new zzbyw(eo2Var.g, zzt.zzs().zza(), eo2Var, eo2Var);
                eo2Var.f = zzbywVar;
                zzbywVar.checkAvailabilityAndConnect();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f() {
        zzenr zzenrVar = (zzenr) this.b;
        synchronized (zzenrVar) {
            zzenrVar.h = zzenrVar.a.elapsedRealtime() - zzenrVar.i;
        }
    }

    private final void g() {
        zzeqn zzeqnVar = (zzeqn) this.b;
        synchronized (zzeqnVar) {
            zzeqnVar.a(3, "Signal collection timeout.");
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 6;
        switch (this.a) {
            case 0:
                ((lc2) this.b).a();
                return;
            case 1:
                ((ff2) this.b).b.d.a();
                return;
            case 2:
                ((ff2) this.b).b.d.b();
                return;
            case 3:
                sf2 sf2Var = (sf2) this.b;
                zzbmd zzbmdVar = sf2Var.q.d;
                if (zzbmdVar == null) {
                    return;
                }
                try {
                    zzbmdVar.zze((zzbx) sf2Var.s.zzb(), new a(sf2Var.l));
                    return;
                } catch (RemoteException e) {
                    zzo.zzg("RemoteException when notifyAdLoad is called", e);
                    return;
                }
            case 4:
                ((zzcwu) this.b).d = false;
                return;
            case 5:
                wg2 wg2Var = (wg2) this.b;
                kf2.N(wg2Var.c);
                wg2Var.h = true;
                return;
            case 6:
                ch2 ch2Var = (ch2) this.b;
                synchronized (ch2Var) {
                    try {
                        b43 b43Var = ch2Var.f;
                        if (b43Var.isDone()) {
                            return;
                        }
                        b43Var.c(Boolean.TRUE);
                        return;
                    } finally {
                    }
                }
            case 7:
                a();
                return;
            case 8:
                b();
                return;
            case 9:
                ((zzdop) this.b).zzy();
                return;
            case 10:
                zzdpc zzdpcVar = (zzdpc) this.b;
                if (zzdpcVar.f == null) {
                    View view = new View(zzdpcVar.c.getContext());
                    zzdpcVar.f = view;
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                }
                if (zzdpcVar.c != zzdpcVar.f.getParent()) {
                    zzdpcVar.c.addView(zzdpcVar.f);
                    return;
                }
                return;
            case 11:
                try {
                    ((zzdsm) this.b).zzc();
                    return;
                } catch (RemoteException e2) {
                    zzo.zzl("#007 Could not call remote method.", e2);
                    return;
                }
            case 12:
                String str = zzt.zzh().i().zzi().e;
                boolean zIsEmpty = TextUtils.isEmpty(str);
                zzcen zzcenVar = (zzcen) this.b;
                if (zIsEmpty) {
                    zzcenVar.b(new Exception());
                    return;
                } else {
                    zzcenVar.a(str);
                    return;
                }
            case 13:
                c();
                return;
            case 14:
                d();
                return;
            case 15:
                ((zzeej) this.b).a();
                return;
            case 16:
                ((ho2) this.b).a();
                return;
            case 17:
                i31 i31Var = (i31) this.b;
                gd2 gd2Var = ((gd2) i31Var.b).c;
                k02.M(Context.class, (Context) i31Var.c);
                lo2 lo2VarMo78zza = new tj1(gd2Var).mo78zza();
                lo2VarMo78zza.getClass();
                zzt.zzc();
                if (zzs.zzH(lo2VarMo78zza.a.getPackageName())) {
                    lo2VarMo78zza.c.execute(new kc2(lo2VarMo78zza, 18));
                    return;
                }
                ci2 ci2Var = new ci2(lo2VarMo78zza, i);
                td2 td2Var = (td2) lo2VarMo78zza.f.zzb();
                td2Var.a = ci2Var;
                eo2 eo2VarMo76zza = td2Var.zza().mo76zza();
                zzgzy zzgzyVar = lo2VarMo78zza.b;
                Objects.requireNonNull(eo2VarMo76zza);
                zzgzyVar.execute(new kc2(eo2VarMo76zza, 19));
                return;
            case 18:
                ((lo2) this.b).a();
                return;
            case 19:
                e();
                return;
            case 20:
                f();
                return;
            case 21:
                zzevl zzevlVar = (zzevl) this.b;
                zzevlVar.d.execute(new c(zzevlVar, 4));
                return;
            case 22:
                ((zzm) this.b).zzB();
                return;
            case 23:
                g();
                return;
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                boolean zBooleanValue = ((Boolean) zzbd.zzc().a(p32.Sb)).booleanValue();
                Throwable th = (Throwable) this.b;
                if (zBooleanValue) {
                    zzt.zzh().h("TopicsSignalUnsampled.fetchTopicsSignal", th);
                    return;
                } else {
                    zzt.zzh().g(th, "TopicsSignal.fetchTopicsSignal");
                    return;
                }
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                ((zzfet) this.b).d.zzdI(xg0.P(6, null, null));
                return;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                ((zzfff) this.b).d.zzdI(xg0.P(6, null, null));
                return;
            case 27:
                ((zzerp) this.b).zzg();
                return;
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                zzfi zzfiVar = ((nt2) this.b).a;
                if (zzfiVar.zzc() != null) {
                    try {
                        zzfiVar.zzc().zzc(1);
                        return;
                    } catch (RemoteException e3) {
                        zzo.zzj("Could not notify onAdFailedToLoad event.", e3);
                        return;
                    }
                }
                return;
            default:
                ((zzfgv) this.b).d.zzdI(xg0.P(6, null, null));
                return;
        }
    }
}
