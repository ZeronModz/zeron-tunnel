package com.v2ray.ang;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import androidx.appcompat.app.h;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.r;
import androidx.multidex.MultiDexApplication;
import androidx.work.Configuration;
import androidx.work.WorkManager;
import androidx.work.impl.WorkManagerImpl;
import com.AiH;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.iphunt.sandoki.AppLifecycleObserver;
import com.tencent.mmkv.MMKV;
import com.v2ray.ang.util.GoogleMobileAdsConsentManager;
import defpackage.cf1;
import defpackage.l71;
import defpackage.ld0;
import defpackage.xu;
import defpackage.yg0;
import defpackage.zq0;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/v2ray/ang/AngApplication;", "Landroidx/multidex/MultiDexApplication;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "Companion", "OnShowAdCompleteListener", "AppOpenAdManager", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AngApplication extends MultiDexApplication implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {
    public static final Companion c = new Companion(null);
    public static AngApplication d;
    public final Configuration a;
    public AppOpenAdManager b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/AngApplication$AppOpenAdManager;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Lcom/v2ray/ang/AngApplication;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class AppOpenAdManager {
        public final GoogleMobileAdsConsentManager a;
        public AppOpenAd b;
        public boolean c;
        public boolean d;
        public long e;

        public AppOpenAdManager(AngApplication angApplication) {
            GoogleMobileAdsConsentManager.Companion companion = GoogleMobileAdsConsentManager.b;
            Context applicationContext = angApplication.getApplicationContext();
            applicationContext.getClass();
            this.a = companion.a(applicationContext);
        }

        public final void a(FragmentActivity fragmentActivity) {
            if (this.c) {
                return;
            }
            if (this.b == null || new Date().getTime() - this.e >= 14400000) {
                this.c = true;
                AdRequest adRequestBuild = new AdRequest.Builder().build();
                adRequestBuild.getClass();
                AppOpenAd.load(fragmentActivity, "ca-app-pub-7120795588295806/7894081315", adRequestBuild, new a(this));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/v2ray/ang/AngApplication$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/v2ray/ang/AngApplication$OnShowAdCompleteListener;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lmk1;", "onShowAdComplete", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface OnShowAdCompleteListener {
        void onShowAdComplete();
    }

    public AngApplication() {
        Configuration.Builder builder = new Configuration.Builder();
        builder.g = "dev.zeron.tunnel:bg";
        this.a = new Configuration(builder);
    }

    public final void a(FragmentActivity fragmentActivity, ld0 ld0Var) {
        AppOpenAdManager appOpenAdManager = this.b;
        if (appOpenAdManager == null) {
            yg0.N("appOpenAdManager");
            throw null;
        }
        if (appOpenAdManager.d) {
            return;
        }
        if (appOpenAdManager.b == null || new Date().getTime() - appOpenAdManager.e >= 14400000) {
            if (appOpenAdManager.a.a.canRequestAds()) {
                appOpenAdManager.a(fragmentActivity);
                return;
            }
            return;
        }
        AppOpenAd appOpenAd = appOpenAdManager.b;
        if (appOpenAd != null) {
            appOpenAd.setFullScreenContentCallback(new b(appOpenAdManager, ld0Var, fragmentActivity));
        }
        appOpenAdManager.d = true;
        AppOpenAd appOpenAd2 = appOpenAdManager.b;
        if (appOpenAd2 != null) {
            appOpenAd2.show(fragmentActivity);
        }
    }

    @Override // androidx.multidex.MultiDexApplication, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        c.getClass();
        d = this;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        if (this.b != null) {
            return;
        }
        yg0.N("appOpenAdManager");
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        r.i.getClass();
        r rVar = r.j;
        rVar.f.a(new AppLifecycleObserver());
        MMKV.l(this);
        String strE = zq0.z().e("pref_ui_mode_night", "0");
        if (strE != null) {
            switch (strE.hashCode()) {
                case 48:
                    if (strE.equals("0")) {
                        h.j(-1);
                    }
                    break;
                case 49:
                    if (strE.equals("1")) {
                        h.j(1);
                    }
                    break;
                case 50:
                    if (strE.equals("2")) {
                        h.j(2);
                    }
                    break;
            }
        }
        WorkManager.a.getClass();
        Configuration configuration = this.a;
        configuration.getClass();
        WorkManagerImpl.e(this, configuration);
        Lazy lazy = zq0.a;
        ArrayList arrayListC = zq0.c();
        if (arrayListC == null || arrayListC.isEmpty()) {
            zq0.k(l71.c(this, 0));
        }
        Typeface typeface = cf1.a;
        int i = cf1.b;
        boolean z = cf1.c;
        cf1.a = typeface;
        cf1.b = i;
        cf1.c = z;
        cf1.d = true;
        cf1.e = 80;
        cf1.f = 0;
        cf1.g = 200;
        cf1.h = true;
        rVar.f.a(this);
        this.b = new AppOpenAdManager(this);
        new AiH(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }
}
