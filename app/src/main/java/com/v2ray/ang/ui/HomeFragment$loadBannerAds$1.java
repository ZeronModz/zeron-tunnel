package com.v2ray.ang.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.m;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import defpackage.mk1;
import defpackage.u7;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "com.v2ray.ang.ui.HomeFragment$loadBannerAds$1", f = "HomeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class HomeFragment$loadBannerAds$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    int label;
    final /* synthetic */ HomeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$loadBannerAds$1(HomeFragment homeFragment, Continuation<? super HomeFragment$loadBannerAds$1> continuation) {
        super(2, continuation);
        this.this$0 = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new HomeFragment$loadBannerAds$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((HomeFragment$loadBannerAds$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Context contextF;
        HomeFragment homeFragment;
        FrameLayout frameLayout;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.d.b(obj);
        HomeFragment homeFragment2 = this.this$0;
        int i = HomeFragment.f2;
        boolean zW = homeFragment2.W();
        mk1 mk1Var = mk1.a;
        if (zW) {
            HomeFragment homeFragment3 = this.this$0;
            if (!homeFragment3.Q1 && !homeFragment3.r1 && (contextF = homeFragment3.f()) != null && (frameLayout = (homeFragment = this.this$0).k1) != null) {
                homeFragment.r1 = true;
                if (homeFragment.j1 == null) {
                    AdView adView = new AdView(contextF);
                    final HomeFragment homeFragment4 = this.this$0;
                    adView.setAdUnitId("ca-app-pub-7120795588295806/3661173282");
                    adView.setAdSize(AdSize.BANNER);
                    adView.setAdListener(new AdListener() { // from class: com.v2ray.ang.ui.HomeFragment$loadBannerAds$1$1$1
                        @Override // com.google.android.gms.ads.AdListener
                        public final void onAdFailedToLoad(LoadAdError loadAdError) {
                            loadAdError.getClass();
                            super.onAdFailedToLoad(loadAdError);
                            HomeFragment homeFragment5 = homeFragment4;
                            homeFragment5.Q1 = false;
                            homeFragment5.r1 = false;
                            loadAdError.getCode();
                            loadAdError.getDomain();
                            loadAdError.getMessage();
                            if (homeFragment5.R1 >= 3 || !homeFragment5.W() || homeFragment5.F == null) {
                                return;
                            }
                            int i2 = homeFragment5.R1 + 1;
                            homeFragment5.R1 = i2;
                            long j = ((long) i2) * 30000;
                            Job job = homeFragment5.s1;
                            if (job != null) {
                                job.cancel((CancellationException) null);
                            }
                            homeFragment5.s1 = kotlinx.coroutines.c.d(m.a(homeFragment5.l()), null, null, new HomeFragment$retryBanner$1(j, homeFragment5, null), 3);
                        }

                        @Override // com.google.android.gms.ads.AdListener
                        public final void onAdLoaded() {
                            super.onAdLoaded();
                            HomeFragment homeFragment5 = homeFragment4;
                            homeFragment5.Q1 = true;
                            homeFragment5.r1 = false;
                            homeFragment5.R1 = 0;
                        }
                    });
                    homeFragment.j1 = adView;
                    frameLayout.removeAllViews();
                    frameLayout.addView(this.this$0.j1);
                }
                AdRequest adRequestBuild = new AdRequest.Builder().build();
                adRequestBuild.getClass();
                AdView adView2 = this.this$0.j1;
                if (adView2 != null) {
                    adView2.loadAd(adRequestBuild);
                }
            }
        }
        return mk1Var;
    }
}
