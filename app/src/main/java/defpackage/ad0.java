package defpackage;

import android.content.Context;
import android.widget.ProgressBar;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.material.button.MaterialButton;
import com.google.android.ump.FormError;
import com.v2ray.ang.service.CountdownService;
import com.v2ray.ang.ui.HomeFragment;
import com.v2ray.ang.util.GoogleMobileAdsConsentManager;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ad0 implements OnUserEarnedRewardListener, GoogleMobileAdsConsentManager.OnConsentGatheringCompleteListener {
    public final /* synthetic */ HomeFragment a;

    public /* synthetic */ ad0(HomeFragment homeFragment) {
        this.a = homeFragment;
    }

    @Override // com.v2ray.ang.util.GoogleMobileAdsConsentManager.OnConsentGatheringCompleteListener
    public void consentGatheringComplete(FormError formError) {
        Context contextF;
        HomeFragment homeFragment = this.a;
        homeFragment.m1.set(true);
        if (homeFragment.Q.d() == null || (contextF = homeFragment.f()) == null) {
            return;
        }
        GoogleMobileAdsConsentManager googleMobileAdsConsentManager = homeFragment.l1;
        if (googleMobileAdsConsentManager == null) {
            yg0.N("googleMobileAdsConsentManager");
            throw null;
        }
        if (!googleMobileAdsConsentManager.a.canRequestAds()) {
            MaterialButton materialButton = homeFragment.u1;
            if (materialButton != null) {
                materialButton.setVisibility(0);
            }
            ProgressBar progressBar = homeFragment.v1;
            if (progressBar != null) {
                progressBar.setVisibility(8);
                return;
            }
            return;
        }
        AtomicBoolean atomicBoolean = homeFragment.n1;
        if (!atomicBoolean.getAndSet(true)) {
            Context contextF2 = homeFragment.f();
            if (contextF2 == null) {
                atomicBoolean.set(false);
            } else {
                MobileAds.initialize(contextF2, new xc0());
            }
        }
        homeFragment.o0();
        homeFragment.l0(contextF);
        homeFragment.k0();
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
        int i = HomeFragment.f2;
        rewardItem.getClass();
        HomeFragment homeFragment = this.a;
        long j = ((long) homeFragment.w1) * 3600000;
        Lazy lazy = zq0.a;
        long jB = zq0.B() + j;
        CountdownService.b.getClass();
        if (CountdownService.c) {
            homeFragment.K0();
            zq0.u().h(jB, "TimeLeft");
            homeFragment.I0();
        } else {
            zq0.u().h(jB, "TimeLeft");
            homeFragment.B0();
        }
        qf3.L(homeFragment.M(), "Thank you for your support!!!");
    }
}
