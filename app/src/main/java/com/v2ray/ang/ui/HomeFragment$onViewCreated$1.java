package com.v2ray.ang.ui;

import android.content.res.AssetManager;
import androidx.lifecycle.m;
import dev.zeron.tunnel.R;
import com.v2ray.ang.viewmodel.MainViewModel;
import com.vpn.sandok.ultrasshservice.SocksHttpService;
import com.vpn.sandok.ultrasshservice.logger.SkStatus;
import defpackage.md0;
import defpackage.mk1;
import defpackage.tc0;
import defpackage.u7;
import defpackage.yg0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "com.v2ray.ang.ui.HomeFragment$onViewCreated$1", f = "HomeFragment.kt", i = {}, l = {435}, m = "invokeSuspend", n = {}, s = {})
final class HomeFragment$onViewCreated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    int label;
    final /* synthetic */ HomeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$onViewCreated$1(HomeFragment homeFragment, Continuation<? super HomeFragment$onViewCreated$1> continuation) {
        super(2, continuation);
        this.this$0 = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new HomeFragment$onViewCreated$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((HomeFragment$onViewCreated$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        final int i2 = 1;
        if (i == 0) {
            kotlin.d.b(obj);
            this.label = 1;
            if (kotlinx.coroutines.f.b(500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.d.b(obj);
        }
        final HomeFragment homeFragment = this.this$0;
        int i3 = HomeFragment.f2;
        final int i4 = 0;
        homeFragment.f0().getUpdateTestResultAction().e(homeFragment.L(), new md0(0, new Function1() { // from class: com.v2ray.ang.ui.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) throws JSONException {
                int i5 = i4;
                mk1 mk1Var = mk1.a;
                HomeFragment homeFragment2 = homeFragment;
                switch (i5) {
                    case 0:
                        int i6 = HomeFragment.f2;
                        kotlinx.coroutines.c.d(m.a(homeFragment2), null, null, new HomeFragment$setupViewModel$1$1(homeFragment2, (String) obj2, null), 3);
                        break;
                    default:
                        int i7 = HomeFragment.f2;
                        if (((Boolean) obj2).booleanValue()) {
                            if (!homeFragment2.T0 || homeFragment2.h0) {
                                homeFragment2.A0("Connected");
                            } else {
                                homeFragment2.A0("Checking Server");
                            }
                            kotlinx.coroutines.c.d(m.a(homeFragment2), null, null, new HomeFragment$setupViewModel$2$1(homeFragment2, null), 3);
                            homeFragment2.I0();
                        } else if (yg0.a(homeFragment2.f0().isRunning().d(), Boolean.TRUE) || SkStatus.isTunnelActive() || SocksHttpService.isRunning || homeFragment2.h0()) {
                            homeFragment2.A0("Connected");
                        } else {
                            homeFragment2.A0(homeFragment2.j().getString(R.string.connection_not_connected));
                            homeFragment2.K0();
                        }
                        break;
                }
                return mk1Var;
            }
        }));
        homeFragment.f0().isRunning().e(homeFragment.L(), new md0(0, new Function1() { // from class: com.v2ray.ang.ui.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) throws JSONException {
                int i5 = i2;
                mk1 mk1Var = mk1.a;
                HomeFragment homeFragment2 = homeFragment;
                switch (i5) {
                    case 0:
                        int i6 = HomeFragment.f2;
                        kotlinx.coroutines.c.d(m.a(homeFragment2), null, null, new HomeFragment$setupViewModel$1$1(homeFragment2, (String) obj2, null), 3);
                        break;
                    default:
                        int i7 = HomeFragment.f2;
                        if (((Boolean) obj2).booleanValue()) {
                            if (!homeFragment2.T0 || homeFragment2.h0) {
                                homeFragment2.A0("Connected");
                            } else {
                                homeFragment2.A0("Checking Server");
                            }
                            kotlinx.coroutines.c.d(m.a(homeFragment2), null, null, new HomeFragment$setupViewModel$2$1(homeFragment2, null), 3);
                            homeFragment2.I0();
                        } else if (yg0.a(homeFragment2.f0().isRunning().d(), Boolean.TRUE) || SkStatus.isTunnelActive() || SocksHttpService.isRunning || homeFragment2.h0()) {
                            homeFragment2.A0("Connected");
                        } else {
                            homeFragment2.A0(homeFragment2.j().getString(R.string.connection_not_connected));
                            homeFragment2.K0();
                        }
                        break;
                }
                return mk1Var;
            }
        }));
        homeFragment.f0().getDownloaded().e(homeFragment.l(), new md0(0, new tc0(homeFragment, 1)));
        homeFragment.f0().getUploaded().e(homeFragment.l(), new md0(0, new tc0(homeFragment, 2)));
        homeFragment.f0().getStartTime().e(homeFragment.l(), new md0(0, new tc0(homeFragment, 3)));
        homeFragment.f0().startListenBroadcast();
        MainViewModel mainViewModelF0 = homeFragment.f0();
        AssetManager assets = homeFragment.L().getAssets();
        assets.getClass();
        mainViewModelF0.initAssets(assets);
        return mk1.a;
    }
}
