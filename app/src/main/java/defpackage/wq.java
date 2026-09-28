package defpackage;

import android.app.job.JobParameters;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.j3;
import com.google.android.gms.internal.ads.zzadl;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbmu;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfs;
import com.google.android.gms.internal.ads.zzdye;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzeiu;
import com.google.android.gms.internal.ads.zzekj;
import com.google.android.gms.internal.ads.zzeoz;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzgoj;
import com.google.android.gms.internal.ads.zzgov;
import com.google.android.gms.internal.ads.zzgpq;
import com.google.android.gms.internal.ads.zzgpt;
import com.google.android.gms.internal.ads.zzio;
import com.google.android.gms.internal.ads.zzrb;
import com.google.android.gms.internal.ads.zzsd;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzab;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.measurement.internal.g0;
import com.google.android.gms.measurement.internal.h0;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.o;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.w;
import com.google.android.gms.measurement.internal.z;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zznt;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.util.Objects;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class wq implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public wq(zzbee zzbeeVar, zzbdu zzbduVar, WebView webView, boolean z) {
        this.a = 5;
        this.c = webView;
        this.d = zzbeeVar;
        this.b = new n12(this, zzbduVar, webView, z);
    }

    private final /* synthetic */ void a() {
        AudioTrack audioTrack = (AudioTrack) this.b;
        Handler handler = (Handler) this.c;
        final zzed zzedVar = (zzed) this.d;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                final int i = 0;
                handler.post(new Runnable() { // from class: zj3
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        int i2 = i;
                        zzed zzedVar2 = zzedVar;
                        switch (i2) {
                            case 0:
                                zzedVar2.c(-1, ni3.c);
                                zzedVar2.d();
                                break;
                            default:
                                zzedVar2.c(-1, ni3.c);
                                zzedVar2.d();
                                break;
                        }
                    }
                });
            }
            synchronized (zzsd.p) {
                try {
                    int i2 = zzsd.r - 1;
                    zzsd.r = i2;
                    if (i2 == 0) {
                        ScheduledExecutorService scheduledExecutorService = zzsd.q;
                        if (scheduledExecutorService == null) {
                            throw null;
                        }
                        scheduledExecutorService.shutdown();
                        zzsd.q = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (handler.getLooper().getThread().isAlive()) {
                final int i3 = 1;
                handler.post(new Runnable() { // from class: zj3
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        int i22 = i3;
                        zzed zzedVar2 = zzedVar;
                        switch (i22) {
                            case 0:
                                zzedVar2.c(-1, ni3.c);
                                zzedVar2.d();
                                break;
                            default:
                                zzedVar2.c(-1, ni3.c);
                                zzedVar2.d();
                                break;
                        }
                    }
                });
            }
            synchronized (zzsd.p) {
                try {
                    int i4 = zzsd.r - 1;
                    zzsd.r = i4;
                    if (i4 == 0) {
                        ScheduledExecutorService scheduledExecutorService2 = zzsd.q;
                        if (scheduledExecutorService2 == null) {
                            throw null;
                        }
                        scheduledExecutorService2.shutdown();
                        zzsd.q = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        m12 m12Var;
        AtomicReference atomicReference;
        z zVar;
        r rVar;
        f63 f63Var;
        h0 h0Var;
        f63 f63Var2;
        m mVar;
        int i = 5;
        Object objCall = null;
        strZzm = null;
        String strZzm = null;
        switch (this.a) {
            case 0:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.d;
                Context context = (Context) this.c;
                Intent intent = (Intent) this.b;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    Logger loggerA = Logger.a();
                    int i2 = ConstraintProxyUpdateReceiver.a;
                    loggerA.getClass();
                    vv0.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    vv0.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    vv0.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    vv0.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 1:
                g31 g31Var = (g31) this.d;
                g31Var.b((CrashlyticsReportWithSessionId) this.b, (TaskCompletionSource) this.c);
                g31Var.i.b.set(0);
                double dMin = Math.min(3600000.0d, Math.pow(g31Var.b, g31Var.a()) * (60000.0d / g31Var.a));
                com.google.firebase.crashlytics.internal.Logger logger = com.google.firebase.crashlytics.internal.Logger.b;
                String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d));
                logger.a(3);
                try {
                    Thread.sleep((long) dMin);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            case 2:
                try {
                    objCall = ((l80) this.b).call();
                    break;
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new s33(i, (m80) this.c, objCall));
                return;
            case 3:
                zzadl zzadlVar = (zzadl) this.b;
                yk3 yk3Var = (yk3) this.c;
                zzio zzioVar = (zzio) this.d;
                zzadlVar.getClass();
                String str = wt2.a;
                zzadlVar.b.zzd(yk3Var, zzioVar);
                return;
            case 4:
                zj0 zj0Var = (zj0) this.b;
                x40 x40Var = (x40) this.d;
                if (x40Var.a > 0) {
                    Bundle bundle = (Bundle) x40Var.c;
                    zj0Var.b(bundle != null ? bundle.getBundle((String) this.c) : null);
                }
                if (x40Var.a >= 2) {
                    gs1 gs1Var = (gs1) zj0Var;
                    gs1Var.b = true;
                    gs1Var.e();
                }
                if (x40Var.a >= 3) {
                    ((gs1) zj0Var).e();
                }
                if (x40Var.a >= 4) {
                    zj0Var.c();
                }
                if (x40Var.a >= 5) {
                    zj0Var.getClass();
                    return;
                }
                return;
            case 5:
                n12 n12Var = (n12) this.b;
                WebView webView = (WebView) this.c;
                if (webView.getSettings().getJavaScriptEnabled()) {
                    try {
                        webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", n12Var);
                        return;
                    } catch (Throwable unused3) {
                        n12Var.onReceiveValue(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        return;
                    }
                }
                return;
            case 6:
                AdManagerAdView adManagerAdView = (AdManagerAdView) this.b;
                if (adManagerAdView.zza((zzbx) this.c)) {
                    ((zzbmu) this.d).a.onAdManagerAdViewLoaded(adManagerAdView);
                    return;
                } else {
                    zzo.zzi("Could not bind.");
                    return;
                }
            case 7:
                ((TaggingLibraryJsInterface) this.b).zza((Bundle) this.c, (u32) this.d);
                return;
            case 8:
                zzcfs zzcfsVar = ((zzcfi) this.d).q;
                if (zzcfsVar != null) {
                    zzcfsVar.zzf((String) this.b, (String) this.c);
                    return;
                }
                return;
            case 9:
                ((j3) this.b).h((String) this.c, (ValueCallback) this.d);
                return;
            case 10:
                hc2 hc2Var = (hc2) this.b;
                Context context2 = (Context) this.c;
                VersionInfoParcel versionInfoParcel = (VersionInfoParcel) this.d;
                long jElapsedRealtime = zzt.zzk().elapsedRealtime();
                zzt.zzc().zze(context2, versionInfoParcel.afmaVersion);
                if (((Boolean) zzbd.zzc().a(p32.tf)).booleanValue()) {
                    long jElapsedRealtime2 = zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                    i31 i31VarA = hc2Var.b.a();
                    i31VarA.c("action", "webview_startup_l");
                    StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length());
                    sb.append(jElapsedRealtime2);
                    i31VarA.c("webview_startup_l", sb.toString());
                    i31VarA.d();
                }
                if (!((Boolean) zzbd.zzc().a(p32.zf)).booleanValue() || Build.VERSION.SDK_INT < 24) {
                    return;
                }
                g3.f.execute(new vn1(hc2Var, 29));
                return;
            case 11:
                ((mv2) this.b).b((String) this.c, (zzv) this.d, null, null);
                return;
            case 12:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.b;
                String str2 = (String) this.c;
                zzu zzuVar = (zzu) this.d;
                int i3 = zzeiu.c;
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_state", (Integer) 1);
                sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str2});
                zzeiu.c(sQLiteDatabase, zzuVar);
                return;
            case 13:
                zzeoz.a((zzfjc) this.b, (tt2) this.c, (zzekj) this.d);
                return;
            case 14:
                vz2 vz2Var = (vz2) this.b;
                HashMap map = (HashMap) this.d;
                Context context3 = (Context) this.c;
                map.putAll(vz2Var.d.a());
                vz2Var.a(map);
                map.put("f", "q");
                map.put("ctx", context3);
                return;
            case 15:
                e13 e13Var = (e13) this.b;
                zzgov zzgovVar = (zzgov) this.c;
                zzgpt zzgptVar = (zzgpt) this.d;
                String str3 = e13Var.b;
                try {
                    lp2 lp2Var = e13Var.a;
                    if (lp2Var == null) {
                        throw null;
                    }
                    zzgoj zzgojVar = (zzgoj) lp2Var.i;
                    if (zzgojVar == null) {
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("callerPackage", str3);
                    String strA = zzgovVar.a();
                    if (!e13.b(strA)) {
                        strA.getClass();
                        bundle2.putString("sessionToken", strA.trim());
                    }
                    String strB = zzgovVar.b();
                    if (!e13.b(strB)) {
                        strB.getClass();
                        bundle2.putString("appId", strB.trim());
                    }
                    zzgojVar.zzf(bundle2, new d13(e13Var, zzgptVar));
                    return;
                } catch (RemoteException e) {
                    e13.c.d(e, "dismiss overlay display from: %s", str3);
                    return;
                }
            case 16:
                e13 e13Var2 = (e13) this.b;
                zzgpq zzgpqVar = (zzgpq) this.c;
                zzgpt zzgptVar2 = (zzgpt) this.d;
                String str4 = e13Var2.b;
                try {
                    lp2 lp2Var2 = e13Var2.a;
                    if (lp2Var2 == null) {
                        throw null;
                    }
                    zzgoj zzgojVar2 = (zzgoj) lp2Var2.i;
                    if (zzgojVar2 == null) {
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("callerPackage", str4);
                    bundle3.putBinder("windowToken", zzgpqVar.a());
                    String strF = zzgpqVar.f();
                    if (!e13.b(strF)) {
                        strF.getClass();
                        bundle3.putString("adFieldEnifd", strF.trim());
                    }
                    bundle3.putInt("layoutGravity", zzgpqVar.c());
                    bundle3.putFloat("layoutVerticalMargin", zzgpqVar.d());
                    bundle3.putInt("displayMode", 0);
                    bundle3.putInt("triggerMode", 0);
                    bundle3.putInt("windowWidthPx", zzgpqVar.e());
                    if (!e13.b(null) || !e13.b(null)) {
                        throw null;
                    }
                    String strB2 = zzgpqVar.b();
                    if (!e13.b(strB2)) {
                        strB2.getClass();
                        bundle3.putString("appId", strB2.trim());
                    }
                    if (!e13.b(null)) {
                        throw null;
                    }
                    bundle3.putBoolean("stableSessionToken", true);
                    zzgojVar2.zze(str4, bundle3, new d13(e13Var2, zzgptVar2));
                    return;
                } catch (RemoteException e2) {
                    e13.c.d(e2, "show overlay display from: %s", str4);
                    return;
                }
            case 17:
                g0 g0Var = ((zzjd) this.d).a;
                g0Var.w();
                zw1 zw1Var = (zw1) this.b;
                Object objA = zw1Var.c.a();
                wj3 wj3Var = (wj3) this.c;
                if (objA == null) {
                    g0Var.V(zw1Var, wj3Var);
                    return;
                } else {
                    g0Var.U(zw1Var, wj3Var);
                    return;
                }
            case 18:
                zzbg zzbgVar = (zzbg) this.b;
                wj3 wj3Var2 = (wj3) this.c;
                String str5 = wj3Var2.a;
                g0 g0Var2 = ((zzjd) this.d).a;
                if ("_cmp".equals(zzbgVar.a) && (m12Var = zzbgVar.b) != null) {
                    Bundle bundle4 = m12Var.a;
                    if (bundle4.size() != 0) {
                        String string = bundle4.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            g0Var2.zzaV().l.b(zzbgVar.toString(), "Event has been filtered ");
                            zzbgVar = new zzbg("_cmpx", m12Var, zzbgVar.c, zzbgVar.d);
                        }
                    }
                }
                String str6 = zzbgVar.a;
                o oVar = g0Var2.a;
                cj3 cj3Var = g0Var2.g;
                g0.P(oVar);
                zzc zzcVar = TextUtils.isEmpty(str5) ? null : (zzc) oVar.j.c(str5);
                if (zzcVar == null) {
                    g0Var2.zzaV().n.b(str5, "EES not loaded for");
                    g0Var2.w();
                    g0Var2.e(zzbgVar, wj3Var2);
                    return;
                }
                try {
                    zzab zzabVar = zzcVar.c;
                    g0.P(cj3Var);
                    HashMap mapL = cj3.L(true, zzbgVar.b.d());
                    String strL = kf2.L(str6, xg0.p, xg0.n);
                    if (strL == null) {
                        strL = str6;
                    }
                    if (zzcVar.a(new zzaa(strL, zzbgVar.d, mapL))) {
                        if (zzabVar.b.equals(zzabVar.a)) {
                            g0Var2.w();
                            g0Var2.e(zzbgVar, wj3Var2);
                        } else {
                            g0Var2.zzaV().n.b(str6, "EES edited event");
                            g0.P(cj3Var);
                            zzbg zzbgVarE = cj3.e(zzabVar.b);
                            g0Var2.w();
                            g0Var2.e(zzbgVarE, wj3Var2);
                        }
                        if (zzabVar.c.isEmpty()) {
                            return;
                        }
                        for (zzaa zzaaVar : zzabVar.c) {
                            g0Var2.zzaV().n.b(zzaaVar.a, "EES logging created event");
                            g0.P(cj3Var);
                            zzbg zzbgVarE2 = cj3.e(zzaaVar);
                            g0Var2.w();
                            g0Var2.e(zzbgVarE2, wj3Var2);
                        }
                        return;
                    }
                } catch (zzd unused4) {
                    g0Var2.zzaV().f.c("EES error. appId, eventName", wj3Var2.b, str6);
                }
                g0Var2.zzaV().n.b(str6, "EES was not applied to event");
                g0Var2.w();
                g0Var2.e(zzbgVar, wj3Var2);
                return;
            case 19:
                g0 g0Var3 = ((zzjd) this.d).a;
                g0Var3.w();
                g0Var3.c((zzbg) this.b, (String) this.c);
                return;
            case 20:
                g0 g0Var4 = ((zzjd) this.d).a;
                g0Var4.w();
                dj3 dj3Var = (dj3) this.b;
                Object objA2 = dj3Var.a();
                wj3 wj3Var3 = (wj3) this.c;
                if (objA2 == null) {
                    g0Var4.S(dj3Var.b, wj3Var3);
                    return;
                } else {
                    g0Var4.R(dj3Var, wj3Var3);
                    return;
                }
            case 21:
                AtomicReference atomicReference2 = (AtomicReference) this.b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            zVar = (z) this.d;
                            rVar = zVar.a;
                            f63Var = rVar.e;
                            r.f(f63Var);
                        } catch (RemoteException e3) {
                            m mVar2 = ((z) this.d).a.f;
                            r.h(mVar2);
                            mVar2.f.b(e3, "Failed to get app instance id");
                            atomicReference = (AtomicReference) this.b;
                        }
                        if (f63Var.h().i(zzjk.ANALYTICS_STORAGE)) {
                            zzgb zzgbVar = zVar.d;
                            if (zzgbVar != null) {
                                atomicReference2.set(zzgbVar.zzm((wj3) this.c));
                                String str7 = (String) atomicReference2.get();
                                if (str7 != null) {
                                    w wVar = zVar.a.m;
                                    r.g(wVar);
                                    wVar.g.set(str7);
                                    f63 f63Var3 = rVar.e;
                                    r.f(f63Var3);
                                    f63Var3.g.b(str7);
                                }
                                zVar.n();
                                atomicReference = (AtomicReference) this.b;
                                atomicReference.notify();
                                return;
                            }
                            m mVar3 = rVar.f;
                            r.h(mVar3);
                            mVar3.f.a("Failed to get app instance id");
                        } else {
                            m mVar4 = rVar.f;
                            r.h(mVar4);
                            mVar4.k.a("Analytics storage consent denied; will not get app instance id");
                            w wVar2 = zVar.a.m;
                            r.g(wVar2);
                            wVar2.g.set(null);
                            f63 f63Var4 = rVar.e;
                            r.f(f63Var4);
                            f63Var4.g.b(null);
                            atomicReference2.set(null);
                        }
                        atomicReference2.notify();
                        return;
                    } catch (Throwable th) {
                        ((AtomicReference) this.b).notify();
                        throw th;
                    }
                }
            case 22:
                zzcu zzcuVar = (zzcu) this.c;
                z zVar2 = (z) this.d;
                r rVar2 = zVar2.a;
                try {
                    try {
                        f63Var2 = rVar2.e;
                        mVar = rVar2.f;
                        r.f(f63Var2);
                    } catch (Throwable th2) {
                        h0 h0Var2 = rVar2.i;
                        r.f(h0Var2);
                        h0Var2.J(null, zzcuVar);
                        throw th2;
                    }
                } catch (RemoteException e4) {
                    m mVar5 = rVar2.f;
                    r.h(mVar5);
                    mVar5.f.b(e4, "Failed to get app instance id");
                }
                if (f63Var2.h().i(zzjk.ANALYTICS_STORAGE)) {
                    zzgb zzgbVar2 = zVar2.d;
                    if (zzgbVar2 != null) {
                        strZzm = zzgbVar2.zzm((wj3) this.b);
                        if (strZzm != null) {
                            w wVar3 = rVar2.m;
                            r.g(wVar3);
                            wVar3.g.set(strZzm);
                            r.f(f63Var2);
                            f63Var2.g.b(strZzm);
                        }
                        zVar2.n();
                        h0Var = rVar2.i;
                        r.f(h0Var);
                        h0Var.J(strZzm, zzcuVar);
                        return;
                    }
                    r.h(mVar);
                    mVar.f.a("Failed to get app instance id");
                } else {
                    r.h(mVar);
                    mVar.k.a("Analytics storage consent denied; will not get app instance id");
                    w wVar4 = rVar2.m;
                    r.g(wVar4);
                    wVar4.g.set(null);
                    r.f(f63Var2);
                    f63Var2.g.b(null);
                }
                h0Var = rVar2.i;
                r.f(h0Var);
                h0Var.J(strZzm, zzcuVar);
                return;
            case 23:
                ((com.google.android.gms.ads.nonagon.signalgeneration.zzo) this.b).zzd(this.c, (Pair) this.d);
                return;
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                z zVar3 = (z) this.b;
                wj3 wj3Var4 = (wj3) this.c;
                qw1 qw1Var = (qw1) this.d;
                r rVar3 = zVar3.a;
                zzgb zzgbVar3 = zVar3.d;
                if (zzgbVar3 == null) {
                    m mVar6 = rVar3.f;
                    r.h(mVar6);
                    mVar6.f.a("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    zzgbVar3.zzC(wj3Var4, qw1Var);
                    zVar3.n();
                    return;
                } catch (RemoteException e5) {
                    m mVar7 = rVar3.f;
                    r.h(mVar7);
                    mVar7.f.c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(qw1Var.a), e5);
                    return;
                }
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                zznt zzntVar = (zznt) this.b;
                m mVar8 = (m) this.c;
                JobParameters jobParameters = (JobParameters) this.d;
                mVar8.n.a("AppMeasurementJobService processed last upload request.");
                ((zznp) zzntVar.a).zzb(jobParameters, false);
                return;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                zzrb zzrbVar = (zzrb) this.b;
                yk3 yk3Var2 = (yk3) this.c;
                zzio zzioVar2 = (zzio) this.d;
                zzrbVar.getClass();
                String str8 = wt2.a;
                zzrbVar.b.zzn(yk3Var2, zzioVar2);
                return;
            case 27:
                a();
                return;
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                ((zzz) this.b).zzk((String) this.c, (Map) this.d);
                return;
            default:
                com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzf((zzdye) this.b, null, (String) this.c, (Pair[]) this.d);
                return;
        }
    }

    public /* synthetic */ wq(Object obj, int i, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ wq(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ wq(vz2 vz2Var, HashMap map, Context context) {
        this.a = 14;
        this.b = vz2Var;
        this.d = map;
        this.c = context;
    }

    public /* synthetic */ wq() {
        this.a = 2;
    }

    public wq(z zVar, AtomicReference atomicReference, wj3 wj3Var) {
        this.a = 21;
        this.b = atomicReference;
        this.c = wj3Var;
        Objects.requireNonNull(zVar);
        this.d = zVar;
    }
}
