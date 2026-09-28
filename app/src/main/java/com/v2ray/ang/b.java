package com.v2ray.ang;

import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.v2ray.ang.AngApplication;
import defpackage.ld0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends FullScreenContentCallback {
    public final /* synthetic */ AngApplication.AppOpenAdManager a;
    public final /* synthetic */ FragmentActivity b;

    public b(AngApplication.AppOpenAdManager appOpenAdManager, ld0 ld0Var, FragmentActivity fragmentActivity) {
        this.a = appOpenAdManager;
        this.b = fragmentActivity;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        AngApplication.AppOpenAdManager appOpenAdManager = this.a;
        appOpenAdManager.b = null;
        appOpenAdManager.d = false;
        if (appOpenAdManager.a.a.canRequestAds()) {
            appOpenAdManager.a(this.b);
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        adError.getClass();
        AngApplication.AppOpenAdManager appOpenAdManager = this.a;
        appOpenAdManager.b = null;
        appOpenAdManager.d = false;
        if (appOpenAdManager.a.a.canRequestAds()) {
            appOpenAdManager.a(this.b);
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
    }
}
