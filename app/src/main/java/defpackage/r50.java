package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzco;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.internal.a0;
import com.google.android.gms.measurement.internal.d0;
import com.google.android.gms.measurement.internal.q;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.w;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzkw;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzmb;
import com.google.firebase.a;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.messaging.MessagingAnalytics;
import java.util.Objects;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r50 implements Application.ActivityLifecycleCallbacks, zzkw {
    public final /* synthetic */ int a;
    public final Object b;

    public r50() {
        this.a = 0;
        this.b = new ArrayDeque(10);
    }

    public void a(Intent intent) {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (arrayDeque.contains(string)) {
                        return;
                    } else {
                        arrayDeque.add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException unused) {
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    AnalyticsConnector analyticsConnector = (AnalyticsConnector) a.c().b(AnalyticsConnector.class);
                    Log.isLoggable("FirebaseMessaging", 3);
                    if (analyticsConnector != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        analyticsConnector.setUserProperty("fcm", "_ln", string2);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string2);
                        analyticsConnector.logEvent("fcm", "_cmp", bundle2);
                    }
                } else {
                    Log.isLoggable("FirebaseMessaging", 3);
                }
            }
            MessagingAnalytics.c("_no", bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.a) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    if (Build.VERSION.SDK_INT > 25) {
                        a(intent);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new f20(12, this, intent));
                    }
                    break;
                }
                break;
            case 1:
                ((ss2) this.b).c(new jk2(this, bundle, activity));
                break;
            default:
                zza(zzdf.a(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((ss2) this.b).c(new or2(this, activity, 4));
                break;
            default:
                zzb(zzdf.a(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((ss2) this.b).c(new or2(this, activity, 2));
                break;
            default:
                zzc(zzdf.a(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((ss2) this.b).c(new or2(this, activity, 1));
                break;
            default:
                zzd(zzdf.a(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                zzco zzcoVar = new zzco();
                ((ss2) this.b).c(new jk2(this, activity, zzcoVar));
                Bundle bundleB = zzcoVar.b(50L);
                if (bundleB != null) {
                    bundle.putAll(bundleB);
                }
                break;
            default:
                zze(zzdf.a(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.a) {
            case 1:
                ((ss2) this.b).c(new or2(this, activity, 0));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.a) {
            case 1:
                ((ss2) this.b).c(new or2(this, activity, 3));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[Catch: all -> 0x0025, RuntimeException -> 0x0029, TryCatch #1 {RuntimeException -> 0x0029, blocks: (B:3:0x0006, B:5:0x0016, B:7:0x001c, B:22:0x0048, B:25:0x004f, B:27:0x0062, B:29:0x006a, B:35:0x007a, B:40:0x0087, B:15:0x002d, B:17:0x0034, B:19:0x0040), top: B:47:0x0006, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    @Override // com.google.android.gms.measurement.internal.zzkw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zza(com.google.android.gms.internal.measurement.zzdf r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            com.google.android.gms.measurement.internal.w r0 = (com.google.android.gms.measurement.internal.w) r0
            com.google.android.gms.measurement.internal.r r1 = r0.a
            com.google.android.gms.measurement.internal.m r0 = r1.f     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            com.google.android.gms.measurement.internal.r.h(r0)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            p13 r0 = r0.n     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            java.lang.String r2 = "onActivityCreated"
            r0.a(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            android.content.Intent r0 = r9.c     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            if (r0 == 0) goto L95
            android.net.Uri r2 = r0.getData()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            if (r2 == 0) goto L2d
            boolean r3 = r2.isHierarchical()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            if (r3 != 0) goto L23
            goto L2d
        L23:
            r5 = r2
            goto L46
        L25:
            r0 = move-exception
            r8 = r0
            goto Lab
        L29:
            r0 = move-exception
            r8 = r0
            goto L9e
        L2d:
            android.os.Bundle r2 = r0.getExtras()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            r3 = 0
            if (r2 == 0) goto L45
            java.lang.String r4 = "com.android.vending.referral_url"
            java.lang.String r2 = r2.getString(r4)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            if (r4 != 0) goto L45
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            goto L23
        L45:
            r5 = r3
        L46:
            if (r5 == 0) goto L95
            boolean r2 = r5.isHierarchical()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            if (r2 != 0) goto L4f
            goto L95
        L4f:
            com.google.android.gms.measurement.internal.h0 r2 = r1.i     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            com.google.android.gms.measurement.internal.r.f(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            java.lang.String r2 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r0 = r0.getStringExtra(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            java.lang.String r2 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            if (r2 != 0) goto L77
            java.lang.String r2 = "https://www.google.com"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            if (r2 != 0) goto L77
            java.lang.String r2 = "android-app://com.google.appcrawler"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            if (r0 == 0) goto L73
            goto L77
        L73:
            java.lang.String r0 = "auto"
        L75:
            r6 = r0
            goto L7a
        L77:
            java.lang.String r0 = "gs"
            goto L75
        L7a:
            java.lang.String r0 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            if (r10 != 0) goto L85
            r0 = 1
        L83:
            r4 = r0
            goto L87
        L85:
            r0 = 0
            goto L83
        L87:
            com.google.android.gms.measurement.internal.q r0 = r1.g     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            com.google.android.gms.measurement.internal.r.h(r0)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            tf3 r2 = new tf3     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
            r0.j(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L29
        L95:
            com.google.android.gms.measurement.internal.zzmb r8 = r1.l
            com.google.android.gms.measurement.internal.r.g(r8)
            r8.i(r9, r10)
            return
        L9e:
            com.google.android.gms.measurement.internal.m r0 = r1.f     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.measurement.internal.r.h(r0)     // Catch: java.lang.Throwable -> L25
            p13 r0 = r0.f     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "Throwable caught in onActivityCreated"
            r0.b(r8, r2)     // Catch: java.lang.Throwable -> L25
            goto L95
        Lab:
            com.google.android.gms.measurement.internal.zzmb r0 = r1.l
            com.google.android.gms.measurement.internal.r.g(r0)
            r0.i(r9, r10)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r50.zza(com.google.android.gms.internal.measurement.zzdf, android.os.Bundle):void");
    }

    @Override // com.google.android.gms.measurement.internal.zzkw
    public void zzb(zzdf zzdfVar) {
        zzmb zzmbVar = ((w) this.b).a.l;
        r.g(zzmbVar);
        synchronized (zzmbVar.l) {
            try {
                if (Objects.equals(zzmbVar.g, zzdfVar)) {
                    zzmbVar.g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzmbVar.a.d.o()) {
            zzmbVar.f.remove(Integer.valueOf(zzdfVar.a));
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkw
    public void zzc(zzdf zzdfVar) {
        r rVar = ((w) this.b).a;
        zzmb zzmbVar = rVar.l;
        r.g(zzmbVar);
        synchronized (zzmbVar.l) {
            zzmbVar.k = false;
            zzmbVar.h = true;
        }
        r rVar2 = zzmbVar.a;
        rVar2.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (rVar2.d.o()) {
            zzlu zzluVarF = zzmbVar.f(zzdfVar);
            zzmbVar.d = zzmbVar.c;
            zzmbVar.c = null;
            q qVar = rVar2.g;
            r.h(qVar);
            qVar.j(new h4(zzmbVar, zzluVarF, jElapsedRealtime));
        } else {
            zzmbVar.c = null;
            q qVar2 = rVar2.g;
            r.h(qVar2);
            qVar2.j(new h92(zzmbVar, jElapsedRealtime));
        }
        d0 d0Var = rVar.h;
        r.g(d0Var);
        r rVar3 = d0Var.a;
        rVar3.k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        q qVar3 = rVar3.g;
        r.h(qVar3);
        qVar3.j(new a0(d0Var, jElapsedRealtime2, 1));
    }

    @Override // com.google.android.gms.measurement.internal.zzkw
    public void zzd(zzdf zzdfVar) {
        r rVar = ((w) this.b).a;
        d0 d0Var = rVar.h;
        r.g(d0Var);
        r rVar2 = d0Var.a;
        rVar2.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        q qVar = rVar2.g;
        r.h(qVar);
        qVar.j(new a0(d0Var, jElapsedRealtime, 0));
        zzmb zzmbVar = rVar.l;
        r.g(zzmbVar);
        Object obj = zzmbVar.l;
        synchronized (obj) {
            zzmbVar.k = true;
            if (!Objects.equals(zzdfVar, zzmbVar.g)) {
                synchronized (obj) {
                    zzmbVar.g = zzdfVar;
                    zzmbVar.h = false;
                    r rVar3 = zzmbVar.a;
                    if (rVar3.d.o()) {
                        zzmbVar.i = null;
                        q qVar2 = rVar3.g;
                        r.h(qVar2);
                        qVar2.j(new xg3(zzmbVar, 1));
                    }
                }
            }
        }
        r rVar4 = zzmbVar.a;
        if (!rVar4.d.o()) {
            zzmbVar.c = zzmbVar.i;
            q qVar3 = rVar4.g;
            r.h(qVar3);
            qVar3.j(new xg3(zzmbVar, 0));
            return;
        }
        zzmbVar.j(zzdfVar.b, zzmbVar.f(zzdfVar), false);
        zzd zzdVar = zzmbVar.a.n;
        r.e(zzdVar);
        r rVar5 = zzdVar.a;
        rVar5.k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        q qVar4 = rVar5.g;
        r.h(qVar4);
        qVar4.j(new h92(zzdVar, jElapsedRealtime2));
    }

    @Override // com.google.android.gms.measurement.internal.zzkw
    public void zze(zzdf zzdfVar, Bundle bundle) {
        zzlu zzluVar;
        zzmb zzmbVar = ((w) this.b).a.l;
        r.g(zzmbVar);
        if (!zzmbVar.a.d.o() || bundle == null || (zzluVar = (zzlu) zzmbVar.f.get(Integer.valueOf(zzdfVar.a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzluVar.c);
        bundle2.putString("name", zzluVar.a);
        bundle2.putString("referrer_name", zzluVar.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public /* synthetic */ r50(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void e(Activity activity, Bundle bundle) {
    }
}
