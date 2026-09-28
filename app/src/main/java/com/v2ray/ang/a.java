package com.v2ray.ang;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.v2ray.ang.AngApplication;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends AppOpenAd.AppOpenAdLoadCallback {
    public final /* synthetic */ AngApplication.AppOpenAdManager a;

    public a(AngApplication.AppOpenAdManager appOpenAdManager) {
        this.a = appOpenAdManager;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        loadAdError.getClass();
        this.a.c = false;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(AppOpenAd appOpenAd) {
        AppOpenAd appOpenAd2 = appOpenAd;
        appOpenAd2.getClass();
        AngApplication.AppOpenAdManager appOpenAdManager = this.a;
        appOpenAdManager.b = appOpenAd2;
        appOpenAdManager.c = false;
        appOpenAdManager.e = new Date().getTime();
    }
}
