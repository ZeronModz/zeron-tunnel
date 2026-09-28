package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzau;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbj;
import com.google.android.gms.internal.ads.zzcda;
import com.google.android.gms.internal.ads.zzcdh;
import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzcth;
import com.google.android.gms.internal.ads.zzcwv;
import com.google.android.gms.internal.ads.zzdfw;
import com.google.android.gms.internal.ads.zzdlu;
import com.google.android.gms.internal.ads.zzdmq;
import com.google.android.gms.internal.ads.zzdue;
import com.google.android.gms.internal.ads.zzepu;
import com.google.android.gms.internal.ads.zzepz;
import com.google.android.gms.internal.ads.zzeqd;
import com.google.android.gms.internal.ads.zzerp;
import com.google.android.gms.internal.ads.zzese;
import com.google.android.gms.internal.ads.zzesm;
import com.google.android.gms.internal.ads.zzfet;
import com.google.android.gms.internal.ads.zzfgv;
import com.google.android.gms.internal.ads.zzfhv;
import com.google.android.gms.internal.ads.zzfie;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.internal.zzaf;
import com.google.android.play.core.appupdate.zza;
import com.google.android.play.core.appupdate.zzd;
import com.google.android.play.core.appupdate.zzh;
import com.google.android.play.core.appupdate.zzj;
import com.google.android.play.core.appupdate.zzk;
import com.google.android.play.core.appupdate.zzs;
import com.google.android.play.core.appupdate.zzu;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class wl0 implements zzgzl, zzg, zza {
    public static final Object g = new Object();
    public static wl0 h;
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public /* synthetic */ wl0(uc3 uc3Var) {
        this.a = 7;
        zzk zzkVar = new zzk(uc3Var);
        zzaf zzafVarA = yv1.a(new zzu(zzkVar));
        this.b = zzafVarA;
        zzaf zzafVarA2 = yv1.a(new zzs(zzkVar, zzafVarA));
        this.c = zzafVarA2;
        zzaf zzafVarA3 = yv1.a(new zzd(zzkVar));
        this.d = zzafVarA3;
        zzaf zzafVarA4 = yv1.a(new zzh(zzafVarA2, zzafVarA3, zzkVar));
        this.e = zzafVarA4;
        this.f = yv1.a(new zzj(zzafVarA4));
    }

    public static wl0 a(Context context) {
        wl0 wl0Var;
        synchronized (g) {
            try {
                wl0Var = h;
                if (wl0Var == null) {
                    wl0Var = new wl0(context.getApplicationContext());
                    h = wl0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wl0Var;
    }

    private final void e(Throwable th) {
        bv2 bv2Var;
        if (((Boolean) zzbd.zzc().a(p32.K6)).booleanValue()) {
            zze.zzb("App open ad failed to load", th);
        }
        zzfet zzfetVar = (zzfet) this.f;
        zzcth zzcthVar = (zzcth) zzfetVar.e.zzd();
        com.google.android.gms.ads.internal.client.zze zzeVarK = zzcthVar == null ? xg0.K(th, null) : xg0.K(th, zzcthVar.zza().l);
        synchronized (zzfetVar) {
            try {
                zzfetVar.j = null;
                if (zzcthVar != null) {
                    zzcthVar.zze().zzdI(zzeVarK);
                    if (((Boolean) zzbd.zzc().a(p32.x9)).booleanValue()) {
                        zzfetVar.b.execute(new wn2(5, this, zzeVarK));
                    }
                } else {
                    zzfetVar.d.zzdI(zzeVarK);
                    ((id2) zzfetVar.a((gt2) this.e)).zza().zza().f.zzo();
                }
                mu.A(zzeVarK.zza, "AppOpenAdLoader.onFailure", th);
                ((zzese) this.b).mo6zza();
                if (!((Boolean) d42.c.g()).booleanValue() || (bv2Var = (bv2) this.c) == null) {
                    zzfor zzforVar = zzfetVar.h;
                    zzfoe zzfoeVar = (zzfoe) this.d;
                    zzfoeVar.zzh(zzeVarK);
                    zzfoeVar.zzj(th);
                    zzfoeVar.zzd(false);
                    zzforVar.b(zzfoeVar.zzm());
                } else {
                    bv2Var.f(zzeVarK);
                    zzfoe zzfoeVar2 = (zzfoe) this.d;
                    zzfoeVar2.zzj(th);
                    zzfoeVar2.zzd(false);
                    bv2Var.a(zzfoeVar2);
                    bv2Var.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void f(Throwable th) {
        bv2 bv2Var;
        if (((Boolean) zzbd.zzc().a(p32.K6)).booleanValue()) {
            zze.zzb("Interstitial ad failed to load", th);
        }
        zzdlu zzdluVar = (zzdlu) this.e;
        com.google.android.gms.ads.internal.client.zze zzeVarK = xg0.K(th, zzdluVar.b().l);
        zzfgv zzfgvVar = (zzfgv) this.f;
        synchronized (zzfgvVar) {
            try {
                zzfgvVar.i = null;
                zzdluVar.a().zzdI(zzeVarK);
                if (((Boolean) zzbd.zzc().a(p32.y9)).booleanValue()) {
                    zzfgvVar.b.execute(new wn2(6, this, zzeVarK));
                    zzfgvVar.b.execute(new qj2(11, this, zzeVarK));
                }
                mu.A(zzeVarK.zza, "InterstitialAdLoader.onFailure", th);
                ((zzese) this.b).mo6zza();
                if (!((Boolean) d42.c.g()).booleanValue() || (bv2Var = (bv2) this.c) == null) {
                    zzfor zzforVar = zzfgvVar.g;
                    zzfoe zzfoeVar = (zzfoe) this.d;
                    zzfoeVar.zzh(zzeVarK);
                    zzfoeVar.zzj(th);
                    zzfoeVar.zzd(false);
                    zzforVar.b(zzfoeVar.zzm());
                } else {
                    bv2Var.f(zzeVarK);
                    zzfoe zzfoeVar2 = (zzfoe) this.d;
                    zzfoeVar2.zzj(th);
                    zzfoeVar2.zzd(false);
                    bv2Var.a(zzfoeVar2);
                    bv2Var.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void g(Object obj) {
        bv2 bv2Var;
        zzesm zzesmVar = (zzesm) this.f;
        jg2 jg2Var = (jg2) obj;
        synchronized (zzesmVar) {
            if (jg2Var != null) {
                try {
                    jg2Var.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((zzdfw) jg2Var.g.a.b).b = zzesmVar.d.b;
            ((zzese) this.b).zzb(jg2Var);
            zzesmVar.b.e().execute(new mg2(this, 1));
            if (!((Boolean) d42.c.g()).booleanValue() || (bv2Var = (bv2) this.c) == null) {
                zzfor zzforVar = zzesmVar.e;
                zzfoe zzfoeVar = (zzfoe) this.d;
                zzfoeVar.zzg(jg2Var.a.b);
                zzfoeVar.zzi(jg2Var.f.a);
                zzfoeVar.zzd(true);
                zzforVar.b(zzfoeVar.zzm());
            } else {
                bv2Var.e(jg2Var.a.b);
                bv2Var.g(jg2Var.f.a);
                zzfoe zzfoeVar2 = (zzfoe) this.d;
                zzfoeVar2.zzd(true);
                bv2Var.a(zzfoeVar2);
                bv2Var.h();
            }
        }
    }

    private final void h(Object obj) {
        bv2 bv2Var;
        zzfet zzfetVar = (zzfet) this.f;
        jg2 jg2Var = (jg2) obj;
        synchronized (zzfetVar) {
            if (jg2Var != null) {
                try {
                    jg2Var.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzfetVar.j = null;
            if (((Boolean) zzbd.zzc().a(p32.x9)).booleanValue()) {
                ((zzdfw) jg2Var.g.a.b).d = zzfetVar.d;
            }
            ((zzese) this.b).zzb(jg2Var);
            if (!((Boolean) d42.c.g()).booleanValue() || (bv2Var = (bv2) this.c) == null) {
                zzfor zzforVar = zzfetVar.h;
                zzfoe zzfoeVar = (zzfoe) this.d;
                zzfoeVar.zzg(jg2Var.a.b);
                zzfoeVar.zzi(jg2Var.f.a);
                zzfoeVar.zzd(true);
                zzforVar.b(zzfoeVar.zzm());
            } else {
                bv2Var.e(jg2Var.a.b);
                bv2Var.g(jg2Var.f.a);
                zzfoe zzfoeVar2 = (zzfoe) this.d;
                zzfoeVar2.zzd(true);
                bv2Var.a(zzfoeVar2);
                bv2Var.h();
            }
        }
    }

    private final void i(Object obj) {
        bv2 bv2Var;
        zzfgv zzfgvVar = (zzfgv) this.f;
        xi2 xi2Var = (xi2) obj;
        synchronized (zzfgvVar) {
            if (xi2Var != null) {
                try {
                    xi2Var.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzfgvVar.i = null;
            l32 l32Var = p32.y9;
            if (((Boolean) zzbd.zzc().a(l32Var)).booleanValue()) {
                ca2 ca2Var = xi2Var.g.a;
                zzerp zzerpVar = zzfgvVar.d;
                zzdfw zzdfwVar = (zzdfw) ca2Var.b;
                zzdfwVar.b = zzerpVar;
                zzdfwVar.e = zzfgvVar.e;
            }
            ((zzese) this.b).zzb(xi2Var);
            final int i = 1;
            if (((Boolean) zzbd.zzc().a(l32Var)).booleanValue()) {
                zzfgvVar.b.execute(new Runnable(this) { // from class: mt2
                    public final /* synthetic */ wl0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        int i2 = i;
                        wl0 wl0Var = this.b;
                        switch (i2) {
                            case 0:
                                ((zzfgv) wl0Var.f).e.zzg();
                                break;
                            default:
                                ((zzfgv) wl0Var.f).d.zzg();
                                break;
                        }
                    }
                });
                final int i2 = 0;
                zzfgvVar.b.execute(new Runnable(this) { // from class: mt2
                    public final /* synthetic */ wl0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        int i22 = i2;
                        wl0 wl0Var = this.b;
                        switch (i22) {
                            case 0:
                                ((zzfgv) wl0Var.f).e.zzg();
                                break;
                            default:
                                ((zzfgv) wl0Var.f).d.zzg();
                                break;
                        }
                    }
                });
            }
            if (!((Boolean) d42.c.g()).booleanValue() || (bv2Var = (bv2) this.c) == null) {
                zzfor zzforVar = zzfgvVar.g;
                zzfoe zzfoeVar = (zzfoe) this.d;
                zzfoeVar.zzg(xi2Var.a.b);
                zzfoeVar.zzi(xi2Var.f.a);
                zzfoeVar.zzd(true);
                zzforVar.b(zzfoeVar.zzm());
            } else {
                bv2Var.e(xi2Var.a.b);
                bv2Var.g(xi2Var.f.a);
                zzfoe zzfoeVar2 = (zzfoe) this.d;
                zzfoeVar2.zzd(true);
                bv2Var.a(zzfoeVar2);
                bv2Var.h();
            }
        }
    }

    public void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (((HashMap) this.c)) {
            try {
                vl0 vl0Var = new vl0(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) ((HashMap) this.c).get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    ((HashMap) this.c).put(broadcastReceiver, arrayList);
                }
                arrayList.add(vl0Var);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList arrayList2 = (ArrayList) ((HashMap) this.d).get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        ((HashMap) this.d).put(action, arrayList2);
                    }
                    arrayList2.add(vl0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(Intent intent) {
        int iMatch;
        synchronized (((HashMap) this.c)) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(((Context) this.b).getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    intent.toString();
                }
                ArrayList arrayList = (ArrayList) ((HashMap) this.d).get(intent.getAction());
                if (arrayList != null) {
                    if (z) {
                        arrayList.toString();
                    }
                    ArrayList arrayList2 = null;
                    for (int i = 0; i < arrayList.size(); i++) {
                        vl0 vl0Var = (vl0) arrayList.get(i);
                        if (z) {
                            Objects.toString(vl0Var.a);
                        }
                        if (!vl0Var.c && (iMatch = vl0Var.a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager")) >= 0) {
                            if (z) {
                                Integer.toHexString(iMatch);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(vl0Var);
                            vl0Var.c = true;
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            ((vl0) arrayList2.get(i2)).c = false;
                        }
                        ((ArrayList) this.e).add(new y6(20, intent, arrayList2));
                        if (!((ul0) this.f).hasMessages(1)) {
                            ((ul0) this.f).sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(BroadcastReceiver broadcastReceiver) {
        synchronized (((HashMap) this.c)) {
            try {
                ArrayList arrayList = (ArrayList) ((HashMap) this.c).remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    vl0 vl0Var = (vl0) arrayList.get(size);
                    vl0Var.d = true;
                    for (int i = 0; i < vl0Var.a.countActions(); i++) {
                        String action = vl0Var.a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) ((HashMap) this.d).get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                vl0 vl0Var2 = (vl0) arrayList2.get(size2);
                                if (vl0Var2.b == broadcastReceiver) {
                                    vl0Var2.d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                ((HashMap) this.d).remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public void zza(Throwable th) {
        bv2 bv2Var;
        bv2 bv2Var2;
        switch (this.a) {
            case 1:
                String message = th.getMessage();
                if (((Boolean) zzbd.zzc().a(p32.L8)).booleanValue()) {
                    zzt.zzh().g(th, "SignalGeneratorImpl.generateSignals");
                } else {
                    zzt.zzh().f("SignalGeneratorImpl.generateSignals", th);
                }
                bv2 bv2VarZzy = zzau.zzy((ListenableFuture) this.b, (zzcdh) this.c);
                if (((Boolean) d42.e.g()).booleanValue() && bv2VarZzy != null) {
                    zzfoe zzfoeVar = (zzfoe) this.e;
                    zzfoeVar.zzj(th);
                    zzfoeVar.zzd(false);
                    bv2VarZzy.a(zzfoeVar);
                    bv2VarZzy.h();
                }
                zzcda zzcdaVar = (zzcda) this.d;
                if (zzcdaVar == null) {
                    return;
                }
                try {
                    if (!"Unknown format is no longer supported.".equals(message)) {
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                        sb.append("Internal error. ");
                        sb.append(message);
                        message = sb.toString();
                    }
                    zzcdaVar.zzb(message);
                    return;
                } catch (RemoteException e) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                    return;
                }
            case 2:
            default:
                if (((Boolean) zzbd.zzc().a(p32.K6)).booleanValue()) {
                    zze.zzb("Rewarded ad failed to load", th);
                }
                zzfie zzfieVar = (zzfie) this.f;
                zzdue zzdueVar = (zzdue) zzfieVar.e.zzd();
                com.google.android.gms.ads.internal.client.zze zzeVarK = zzdueVar == null ? xg0.K(th, null) : xg0.K(th, zzdueVar.zza().l);
                synchronized (zzfieVar) {
                    try {
                        if (zzdueVar != null) {
                            zzdueVar.zze().zzdI(zzeVarK);
                            zzfieVar.b.execute(new wn2(7, this, zzeVarK));
                        } else {
                            zzfieVar.d.zzdI(zzeVarK);
                            ((id2) zzfieVar.a((rt2) this.e)).mo22zza().zza().f.zzo();
                        }
                        mu.A(zzeVarK.zza, "RewardedAdLoader.onFailure", th);
                        ((zzese) this.b).mo6zza();
                        if (!((Boolean) d42.c.g()).booleanValue() || (bv2Var2 = (bv2) this.c) == null) {
                            zzfor zzforVar = zzfieVar.g;
                            zzfoe zzfoeVar2 = (zzfoe) this.d;
                            zzfoeVar2.zzh(zzeVarK);
                            zzfoeVar2.zzj(th);
                            zzfoeVar2.zzd(false);
                            zzforVar.b(zzfoeVar2.zzm());
                        } else {
                            bv2Var2.f(zzeVarK);
                            zzfoe zzfoeVar3 = (zzfoe) this.d;
                            zzfoeVar3.zzj(th);
                            zzfoeVar3.zzd(false);
                            bv2Var2.a(zzfoeVar3);
                            bv2Var2.h();
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 3:
                zzfoe zzfoeVar4 = (zzfoe) this.d;
                if (((Boolean) zzbd.zzc().a(p32.K6)).booleanValue()) {
                    zze.zzb("Native ad failed to load", th);
                }
                zzdmq zzdmqVar = (zzdmq) this.e;
                com.google.android.gms.ads.internal.client.zze zzeVarK2 = xg0.K(th, zzdmqVar.a().l);
                zzdmqVar.b().zzdI(zzeVarK2);
                zzesm zzesmVar = (zzesm) this.f;
                zzesmVar.b.e().execute(new qj2(9, this, zzeVarK2));
                mu.A(zzeVarK2.zza, "NativeAdLoader.onFailure", th);
                ((zzese) this.b).mo6zza();
                if (!((Boolean) d42.c.g()).booleanValue() || (bv2Var = (bv2) this.c) == null) {
                    zzfor zzforVar2 = zzesmVar.e;
                    zzfoeVar4.zzh(zzeVarK2);
                    zzfoeVar4.zzj(th);
                    zzfoeVar4.zzd(false);
                    zzforVar2.b(zzfoeVar4.zzm());
                    return;
                }
                bv2Var.f(zzeVarK2);
                zzfoeVar4.zzj(th);
                zzfoeVar4.zzd(false);
                bv2Var.a(zzfoeVar4);
                bv2Var.h();
                return;
            case 4:
                e(th);
                return;
            case 5:
                f(th);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    public void mo5zzb(Object obj) {
        bv2 bv2Var;
        int i = 0;
        switch (this.a) {
            case 1:
                zzcda zzcdaVar = (zzcda) this.d;
                zzfoe zzfoeVar = (zzfoe) this.e;
                ListenableFuture listenableFuture = (ListenableFuture) this.b;
                zzau zzauVar = (zzau) this.f;
                AtomicBoolean atomicBooleanZzN = zzauVar.zzN();
                zzbj zzbjVar = (zzbj) obj;
                bv2 bv2VarZzy = zzau.zzy(listenableFuture, (zzcdh) this.c);
                atomicBooleanZzN.set(true);
                if (!((Boolean) zzbd.zzc().a(p32.F8)).booleanValue()) {
                    if (zzcdaVar != null) {
                        try {
                            zzcdaVar.zzb("QueryInfo generation has been disabled.");
                        } catch (RemoteException e) {
                            zzo.zzf("QueryInfo generation has been disabled.".concat(e.toString()));
                        }
                        break;
                    }
                    if (!((Boolean) d42.e.g()).booleanValue() || bv2VarZzy == null) {
                        return;
                    }
                    zzfoeVar.zzk("QueryInfo generation has been disabled.");
                    zzfoeVar.zzd(false);
                    bv2VarZzy.a(zzfoeVar);
                    bv2VarZzy.h();
                    return;
                }
                try {
                    try {
                        if (zzbjVar == null) {
                            if (zzcdaVar != null) {
                                zzcdaVar.zzc(null, null, null);
                            }
                            zzfoeVar.zzd(true);
                            if (!((Boolean) d42.e.g()).booleanValue() || bv2VarZzy == null) {
                                return;
                            }
                        } else {
                            try {
                                if (TextUtils.isEmpty((!TextUtils.isEmpty(zzbjVar.zzc) ? new JSONObject(zzbjVar.zzc) : new JSONObject(zzbjVar.zzb)).optString("request_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED))) {
                                    zzo.zzi("The request ID is empty in request JSON.");
                                    if (zzcdaVar != null) {
                                        zzcdaVar.zzb("Internal error: request ID is empty in request JSON.");
                                    }
                                    zzfoeVar.zzk("Request ID empty");
                                    zzfoeVar.zzd(false);
                                    if (!((Boolean) d42.e.g()).booleanValue() || bv2VarZzy == null) {
                                        return;
                                    }
                                } else {
                                    Bundle bundle = zzbjVar.zzf;
                                    if (zzauVar.zzF() && bundle != null && bundle.getInt(zzauVar.zzH(), -1) == -1) {
                                        bundle.putInt(zzauVar.zzH(), zzauVar.zzI().get());
                                    }
                                    if (zzauVar.zzE() && bundle != null && TextUtils.isEmpty(bundle.getString(zzauVar.zzG()))) {
                                        if (TextUtils.isEmpty(zzauVar.zzK())) {
                                            zzauVar.zzL(zzt.zzc().zze(zzauVar.zzz(), zzauVar.zzJ().afmaVersion));
                                        }
                                        bundle.putString(zzauVar.zzG(), zzauVar.zzK());
                                    }
                                    if (zzcdaVar != null) {
                                        boolean zIsEmpty = TextUtils.isEmpty(zzbjVar.zzc);
                                        String str = zzbjVar.zza;
                                        if (zIsEmpty) {
                                            zzcdaVar.zzc(str, zzbjVar.zzb, bundle);
                                        } else {
                                            zzcdaVar.zzc(str, zzbjVar.zzc, bundle);
                                        }
                                    }
                                    zzfoeVar.zzd(true);
                                    if (!((Boolean) d42.e.g()).booleanValue() || bv2VarZzy == null) {
                                        return;
                                    }
                                }
                            } catch (JSONException e2) {
                                zzo.zzi("Failed to create JSON object from the request string.");
                                if (zzcdaVar != null) {
                                    String string = e2.toString();
                                    StringBuilder sb = new StringBuilder(string.length() + 33);
                                    sb.append("Internal error for request JSON: ");
                                    sb.append(string);
                                    zzcdaVar.zzb(sb.toString());
                                }
                                zzfoeVar.zzj(e2);
                                zzfoeVar.zzd(false);
                                zzt.zzh().f("SignalGeneratorImpl.generateSignals.onSuccess", e2);
                                if (!((Boolean) d42.e.g()).booleanValue() || bv2VarZzy == null) {
                                    return;
                                }
                            }
                        }
                    } catch (RemoteException e3) {
                        zzfoeVar.zzj(e3);
                        zzfoeVar.zzd(false);
                        zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e3);
                        zzt.zzh().f("SignalGeneratorImpl.generateSignals.onSuccess", e3);
                        if (!((Boolean) d42.e.g()).booleanValue() || bv2VarZzy == null) {
                            return;
                        }
                    }
                    bv2VarZzy.a(zzfoeVar);
                    bv2VarZzy.h();
                    return;
                } catch (Throwable th) {
                    if (((Boolean) d42.e.g()).booleanValue() && bv2VarZzy != null) {
                        bv2VarZzy.a(zzfoeVar);
                        bv2VarZzy.h();
                    }
                    throw th;
                }
            case 2:
            default:
                zzfie zzfieVar = (zzfie) this.f;
                dl2 dl2Var = (dl2) obj;
                synchronized (zzfieVar) {
                    if (dl2Var != null) {
                        try {
                            dl2Var.b();
                        } finally {
                        }
                    }
                    ((zzdfw) dl2Var.g.a.b).e = zzfieVar.d;
                    ((zzese) this.b).zzb(dl2Var);
                    Executor executor = zzfieVar.b;
                    zzfhv zzfhvVar = zzfieVar.d;
                    Objects.requireNonNull(zzfhvVar);
                    executor.execute(new pt2(zzfhvVar, i));
                    zzfieVar.d.onAdMetadataChanged();
                    if (!((Boolean) d42.c.g()).booleanValue() || (bv2Var = (bv2) this.c) == null) {
                        zzfor zzforVar = zzfieVar.g;
                        zzfoe zzfoeVar2 = (zzfoe) this.d;
                        zzfoeVar2.zzg(dl2Var.a.b);
                        zzfoeVar2.zzi(dl2Var.f.a);
                        zzfoeVar2.zzd(true);
                        zzforVar.b(zzfoeVar2.zzm());
                    } else {
                        bv2Var.e(dl2Var.a.b);
                        bv2Var.g(dl2Var.f.a);
                        zzfoe zzfoeVar3 = (zzfoe) this.d;
                        zzfoeVar3.zzd(true);
                        bv2Var.a(zzfoeVar3);
                        bv2Var.h();
                    }
                    break;
                }
                return;
            case 3:
                g(obj);
                return;
            case 4:
                h(obj);
                return;
            case 5:
                i(obj);
                return;
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzc() {
    }

    public /* synthetic */ wl0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj;
    }

    public wl0(Context context) {
        this.a = 0;
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new ArrayList();
        this.b = context;
        this.f = new ul0(this, context.getMainLooper(), 0);
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zza(View view) {
        zzepz zzepzVar = (zzepz) this.e;
        zzeqd zzeqdVar = ((zzepu) this.f).d;
        zzfjc zzfjcVar = (zzfjc) this.c;
        tt2 tt2Var = (tt2) this.d;
        zzcen zzcenVar = (zzcen) this.b;
        zzeqdVar.getClass();
        uq2 uq2Var = new uq2(new uh2(zzeqdVar, tt2Var), null);
        qd2 qd2VarD = zzeqdVar.a.d(new zzcwv(zzfjcVar, tt2Var, null), uq2Var);
        ci2 ci2Var = new ci2(zzeqdVar, qd2VarD);
        synchronized (zzepzVar) {
            zzepzVar.a = ci2Var;
        }
        zzcenVar.a(qd2VarD.d());
    }

    @Override // com.google.android.play.core.appupdate.zza
    public AppUpdateManager zza() {
        return (AppUpdateManager) ((zzaf) this.f).zza();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzb() {
    }
}
