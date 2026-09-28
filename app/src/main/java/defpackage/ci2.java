package defpackage;

import android.app.ActivityManager;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat$WebMessageListener;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.l2;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.y3;
import com.google.android.gms.internal.ads.zzaaa;
import com.google.android.gms.internal.ads.zzaz;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbv;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzdal;
import com.google.android.gms.internal.ads.zzdeg;
import com.google.android.gms.internal.ads.zzdel;
import com.google.android.gms.internal.ads.zzdgw;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdjo;
import com.google.android.gms.internal.ads.zzdko;
import com.google.android.gms.internal.ads.zzduv;
import com.google.android.gms.internal.ads.zzdy;
import com.google.android.gms.internal.ads.zzeek;
import com.google.android.gms.internal.ads.zzeiu;
import com.google.android.gms.internal.ads.zzeqd;
import com.google.android.gms.internal.ads.zzesa;
import com.google.android.gms.internal.ads.zzese;
import com.google.android.gms.internal.ads.zzfgh;
import com.google.android.gms.internal.ads.zzfgi;
import com.google.android.gms.internal.ads.zzfie;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfnb;
import com.google.android.gms.internal.ads.zzfno;
import com.google.android.gms.internal.ads.zzfnv;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfsj;
import com.google.android.gms.internal.ads.zzgem;
import com.google.android.gms.internal.ads.zzgen;
import com.google.android.gms.internal.ads.zzgov;
import com.google.android.gms.internal.ads.zzgow;
import com.google.android.gms.internal.ads.zzgpq;
import com.google.android.gms.internal.ads.zzgps;
import com.google.android.gms.internal.ads.zzgpt;
import com.google.android.gms.internal.ads.zzgpv;
import com.google.android.gms.internal.ads.zzgru;
import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.gms.internal.ads.zzhic;
import com.google.android.gms.measurement.internal.d0;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.w;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ci2 implements zzdhc, zzn, zzgzl, zzeek, zzg, zzese, zzfgi, zzfmu, WebViewCompat$WebMessageListener, OnCompleteListener, zzgem, zzgow, zzhic, zzgru, zzdy, zzgpt {
    public final /* synthetic */ int a;
    public final Object b;

    public ci2() {
        this.a = 17;
        this.b = new AtomicBoolean(false);
    }

    public void c(long j) {
        d0 d0Var = (d0) this.b;
        d0Var.a();
        d0Var.e();
        r rVar = d0Var.a;
        f63 f63Var = rVar.e;
        r.f(f63Var);
        if (f63Var.k(j)) {
            r.f(f63Var);
            f63Var.l.b(true);
            rVar.l().f();
        }
        r.f(f63Var);
        f63Var.p.b(j);
        if (f63Var.l.a()) {
            d(j);
        }
    }

    public void d(long j) {
        switch (this.a) {
            case 3:
                fq0 fq0Var = new fq0("creation");
                fq0Var.a = Long.valueOf(j);
                fq0Var.c = "nativeObjectNotCreated";
                e(fq0Var);
                break;
            default:
                d0 d0Var = (d0) this.b;
                d0Var.a();
                r rVar = d0Var.a;
                if (rVar.a()) {
                    f63 f63Var = rVar.e;
                    r.f(f63Var);
                    f63Var.p.b(j);
                    rVar.k.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    m mVar = rVar.f;
                    r.h(mVar);
                    mVar.n.b(Long.valueOf(jElapsedRealtime), "Session started, time");
                    long j2 = j / 1000;
                    Long lValueOf = Long.valueOf(j2);
                    w wVar = rVar.m;
                    r.g(wVar);
                    wVar.l(j, lValueOf, "auto", "_sid");
                    r.f(f63Var);
                    f63Var.q.b(j2);
                    f63Var.l.b(false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("_sid", j2);
                    r.g(wVar);
                    wVar.i("auto", "_s", bundle, j);
                    String strA = f63Var.v.a();
                    if (!TextUtils.isEmpty(strA)) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("_ffr", strA);
                        r.g(wVar);
                        wVar.i("auto", "_ssr", bundle2, j);
                    }
                    break;
                }
                break;
        }
    }

    public void e(fq0 fq0Var) {
        String strB = fq0Var.b();
        zzo.zzh("Dispatching AFMA event on publisher webview: ".concat(strB));
        ((zzbph) this.b).zzb(strB);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        qx2 qx2Var = (qx2) this.b;
        if (task.k()) {
            qx2Var.cancel(false);
            return;
        }
        if (task.m()) {
            qx2Var.c(task.i());
            return;
        }
        Exception excH = task.h();
        if (excH != null) {
            qx2Var.d(excH);
        } else {
            zg1.h();
        }
    }

    @Override // androidx.webkit.WebViewCompat$WebMessageListener
    public void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy) {
        aw2 aw2Var = (aw2) this.b;
        webMessageCompat.a(0);
        try {
            JSONObject jSONObject = new JSONObject(webMessageCompat.b);
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject(Constants$ScionAnalytics$MessageType.DATA_MESSAGE).getString("adSessionId");
            if (string.equals("startSession")) {
                aw2Var.a(string2);
                return;
            }
            if (string.equals("finishSession")) {
                HashMap map = aw2Var.d;
                zzfsj zzfsjVar = (zzfsj) map.get(string2);
                if (zzfsjVar != null) {
                    zzfsjVar.c();
                    map.remove(string2);
                }
            }
        } catch (JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeek, com.google.android.gms.internal.ads.zzese, com.google.android.gms.internal.ads.zzfku
    /* JADX INFO: renamed from: zza */
    public void mo6zza() {
        switch (this.a) {
            case 6:
                if (((Boolean) zzbd.zzc().a(p32.Cf)).booleanValue()) {
                    i31 i31VarA = ((lo2) this.b).g.a();
                    i31VarA.c("action", "ptard");
                    i31VarA.c("ptard", "r");
                    i31VarA.d();
                    return;
                }
                return;
            case 9:
                synchronized (((zzesa) this.b)) {
                    break;
                }
                return;
            default:
                d0 d0Var = (d0) this.b;
                d0Var.a();
                r rVar = d0Var.a;
                f63 f63Var = rVar.e;
                r.f(f63Var);
                wu wuVar = rVar.k;
                wuVar.getClass();
                if (f63Var.k(System.currentTimeMillis())) {
                    f63 f63Var2 = rVar.e;
                    r.f(f63Var2);
                    f63Var2.l.b(true);
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    if (runningAppProcessInfo.importance == 100) {
                        m mVar = rVar.f;
                        r.h(mVar);
                        mVar.n.a("Detected application was in foreground");
                        wuVar.getClass();
                        d(System.currentTimeMillis());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    public void mo5zzb(Object obj) {
        switch (this.a) {
            case 4:
                ((bn2) obj).m = true;
                ((qn2) this.b).d.b();
                return;
            case 5:
                zzfjc zzfjcVar = (zzfjc) obj;
                if (((Boolean) zzbd.zzc().a(p32.P2)).booleanValue()) {
                    ((y3) this.b).k.zzdP(zzfjcVar);
                    return;
                }
                return;
            case 6:
            default:
                jg2 jg2Var = (jg2) obj;
                zzesa zzesaVar = (zzesa) this.b;
                synchronized (zzesaVar) {
                    zzesaVar.c = jg2Var.f;
                    jg2Var.a();
                    break;
                }
                return;
            case 7:
                try {
                    ((zzfmu) this.b).zza((SQLiteDatabase) obj);
                    return;
                } catch (Exception e) {
                    zzo.zzf("Error executing function on offline buffered ping database: ".concat(String.valueOf(e.getMessage())));
                    return;
                }
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzc() {
        zzdko zzdkoVar = (zzdko) this.b;
        zzdkoVar.b().zza();
        zzdjo zzdjoVarC = zzdkoVar.c();
        synchronized (zzdjoVarC) {
            zzdjoVarC.i(pi2.e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public void zzd(zzgpv zzgpvVar, zzgpt zzgptVar) {
        ((e13) this.b).a(zzgpvVar, zzgptVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public void zzdk() {
        zzdeg zzdegVar = ((zzduv) this.b).g;
        synchronized (zzdegVar) {
            try {
                if (zzdegVar.i) {
                    return;
                }
                ScheduledFuture scheduledFuture = zzdegVar.j;
                if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                    zzdegVar.g = -1L;
                } else {
                    zzdegVar.j.cancel(false);
                    zzdegVar.g = zzdegVar.e - zzdegVar.c.elapsedRealtime();
                }
                ScheduledFuture scheduledFuture2 = zzdegVar.k;
                if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                    zzdegVar.h = -1L;
                } else {
                    zzdegVar.k.cancel(false);
                    zzdegVar.h = zzdegVar.f - zzdegVar.c.elapsedRealtime();
                }
                zzdegVar.i = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public void zzdl() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        zzdeg zzdegVar = ((zzduv) this.b).g;
        synchronized (zzdegVar) {
            try {
                if (zzdegVar.i) {
                    if (zzdegVar.g > 0 && (scheduledFuture2 = zzdegVar.j) != null && scheduledFuture2.isCancelled()) {
                        zzdegVar.l(zzdegVar.g);
                    }
                    if (zzdegVar.h > 0 && (scheduledFuture = zzdegVar.k) != null && scheduledFuture.isCancelled()) {
                        zzdegVar.m(zzdegVar.h);
                    }
                    zzdegVar.i = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ ci2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public ci2(zzeiu zzeiuVar, zzfmu zzfmuVar) {
        this.a = 7;
        this.b = zzfmuVar;
    }

    public ci2(zzeqd zzeqdVar, zzdko zzdkoVar) {
        this.a = 8;
        this.b = zzdkoVar;
        Objects.requireNonNull(zzeqdVar);
    }

    public ci2(zzesa zzesaVar) {
        this.a = 9;
        Objects.requireNonNull(zzesaVar);
        this.b = zzesaVar;
    }

    private final void a(Throwable th) {
    }

    private final void b(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public void zzc(zzgpv zzgpvVar, zzgpt zzgptVar) {
        ((e13) this.b).a(zzgpvVar, zzgptVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public void zzb(RemoteException remoteException) {
        ((lo2) this.b).a();
        if (((Boolean) zzbd.zzc().a(p32.Df)).booleanValue()) {
            zzt.zzh().f("Preconnect Remote", remoteException);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public void zzb(zzgov zzgovVar, zzgpt zzgptVar) {
        e13 e13Var = (e13) this.b;
        lp2 lp2Var = e13Var.a;
        if (lp2Var == null) {
            e13.c.c("error: %s", "Play Store not found.");
        } else if (e13.c(zzgptVar, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(zzgovVar.a(), zzgovVar.b()))) {
            lp2Var.a(new wn2(12, lp2Var, new wq(e13Var, 15, zzgovVar, zzgptVar)));
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzb() {
        ((zzdko) this.b).a().onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ Object mo10zza() {
        return (zzaaa) this.b;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zza(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzgem, com.google.android.gms.internal.ads.zzgru
    /* JADX INFO: renamed from: zza */
    public zzgen mo10zza() {
        return new t61((l5) this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzfmu
    public /* synthetic */ Object zza(Object obj) {
        if (((Boolean) d42.c.g()).booleanValue()) {
            ((zzfoe) this.b).zza();
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfgi
    public /* synthetic */ zzdal zza(zzfgh zzfghVar) {
        return ((zzfie) this.b).a(zzfghVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public void zza(zzgpq zzgpqVar, zzgpt zzgptVar) {
        e13 e13Var = (e13) this.b;
        lp2 lp2Var = e13Var.a;
        if (lp2Var == null) {
            e13.c.c("error: %s", "Play Store not found.");
        } else if (e13.c(zzgptVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, zzgpqVar.b()))) {
            lp2Var.a(new wn2(12, lp2Var, new wq(e13Var, 16, zzgpqVar, zzgptVar)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgpt
    public void zza(zzgps zzgpsVar) {
        ((zzz) this.b).zzj(zzgpsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdhc
    /* JADX INFO: renamed from: zza */
    public void mo3zza(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((zzdel) obj).zzdO((zzbzu) obj2);
                break;
            case 1:
                ((zzdgw) obj).zzl((l2) obj2);
                break;
            case 11:
                zzfnb zzfnbVar = (zzfnb) obj2;
                ((zzfnv) obj).zzdN((zzfno) zzfnbVar.a, zzfnbVar.b);
                break;
            default:
                ((zzaz) obj).zzt((zzbv) obj2);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public void zza(Throwable th) {
        switch (this.a) {
            case 4:
            case 5:
                break;
            default:
                zzo.zzf("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhic
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public boolean mo8zza() {
        return ((AtomicBoolean) this.b).get();
    }
}
