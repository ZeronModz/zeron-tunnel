package com.v2ray.ang.ui;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import com.sandok.tunnel.service.InjectorService;
import com.sandok.tunnel.utils.ConfigUtil;
import com.v2ray.ang.ui.HomeFragment;
import defpackage.mk1;
import defpackage.qf3;
import defpackage.u7;
import defpackage.yg0;
import defpackage.zq0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "com.v2ray.ang.ui.HomeFragment$startOVPN$1", f = "HomeFragment.kt", i = {0, 1}, l = {2708, 2736}, m = "invokeSuspend", n = {"ovpnConfig", "e"}, s = {"L$0", "L$0"})
final class HomeFragment$startOVPN$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ HomeFragment this$0;

    /* JADX INFO: renamed from: com.v2ray.ang.ui.HomeFragment$startOVPN$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroid/content/ComponentName;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.v2ray.ang.ui.HomeFragment$startOVPN$1$1", f = "HomeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ComponentName>, Object> {
        final /* synthetic */ HomeFragment.OVPNConfig $ovpnConfig;
        int label;
        final /* synthetic */ HomeFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HomeFragment homeFragment, HomeFragment.OVPNConfig oVPNConfig, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = homeFragment;
            this.$ovpnConfig = oVPNConfig;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$ovpnConfig, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ComponentName> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.d.b(obj);
            HomeFragment homeFragment = this.this$0;
            homeFragment.M().bindService(new Intent(homeFragment.M(), (Class<?>) InjectorService.class), homeFragment.e2, 1);
            this.this$0.Z();
            HomeFragment homeFragment2 = this.this$0;
            HomeFragment.OVPNConfig oVPNConfig = this.$ovpnConfig;
            ConfigUtil configUtil = homeFragment2.U0;
            if (configUtil == null) {
                yg0.N("configUtil");
                throw null;
            }
            configUtil.setTunnelType(oVPNConfig.a);
            configUtil.setServerSelectedName(homeFragment2.q0);
            Lazy lazy = zq0.a;
            configUtil.setNetworkSelectedName(zq0.C());
            configUtil.setProxy(oVPNConfig.d);
            configUtil.setProxyPort(oVPNConfig.e);
            configUtil.setSni(oVPNConfig.c);
            configUtil.setPayload(oVPNConfig.f);
            configUtil.setSSHPortString(homeFragment2.u0);
            configUtil.setSSHHost(oVPNConfig.b);
            if (oVPNConfig.a == 5) {
                configUtil.setSSLPort(homeFragment2.w0);
            }
            int i = Build.VERSION.SDK_INT;
            HomeFragment homeFragment3 = this.this$0;
            return i >= 26 ? homeFragment3.L().startForegroundService(new Intent(this.this$0.M(), (Class<?>) InjectorService.class).setAction("START")) : homeFragment3.L().startService(new Intent(this.this$0.M(), (Class<?>) InjectorService.class).setAction("START"));
        }
    }

    /* JADX INFO: renamed from: com.v2ray.ang.ui.HomeFragment$startOVPN$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.v2ray.ang.ui.HomeFragment$startOVPN$1$2", f = "HomeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        int label;
        final /* synthetic */ HomeFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HomeFragment homeFragment, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = homeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.d.b(obj);
            qf3.N(this.this$0.M(), "Failed to start OVPN");
            this.this$0.J0();
            return mk1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$startOVPN$1(HomeFragment homeFragment, Continuation<? super HomeFragment$startOVPN$1> continuation) {
        super(2, continuation);
        this.this$0 = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new HomeFragment$startOVPN$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((HomeFragment$startOVPN$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r7 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (kotlinx.coroutines.c.e(r8, r1, r7) != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            java.lang.Object r7 = r7.L$0
            java.lang.Exception r7 = (java.lang.Exception) r7
            kotlin.d.b(r8)
            goto L5a
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r7)
            return r4
        L1b:
            java.lang.Object r1 = r7.L$0
            com.v2ray.ang.ui.HomeFragment$OVPNConfig r1 = (com.v2ray.ang.ui.HomeFragment.OVPNConfig) r1
            kotlin.d.b(r8)     // Catch: java.lang.Exception -> L44
            goto L5a
        L23:
            kotlin.d.b(r8)
            com.v2ray.ang.ui.HomeFragment r8 = r7.this$0     // Catch: java.lang.Exception -> L44
            int r1 = com.v2ray.ang.ui.HomeFragment.f2     // Catch: java.lang.Exception -> L44
            com.v2ray.ang.ui.HomeFragment$OVPNConfig r8 = r8.q0()     // Catch: java.lang.Exception -> L44
            lv r1 = defpackage.oy.a     // Catch: java.lang.Exception -> L44
            kotlinx.coroutines.MainCoroutineDispatcher r1 = defpackage.bn0.a     // Catch: java.lang.Exception -> L44
            com.v2ray.ang.ui.HomeFragment$startOVPN$1$1 r5 = new com.v2ray.ang.ui.HomeFragment$startOVPN$1$1     // Catch: java.lang.Exception -> L44
            com.v2ray.ang.ui.HomeFragment r6 = r7.this$0     // Catch: java.lang.Exception -> L44
            r5.<init>(r6, r8, r4)     // Catch: java.lang.Exception -> L44
            r7.L$0 = r4     // Catch: java.lang.Exception -> L44
            r7.label = r3     // Catch: java.lang.Exception -> L44
            java.lang.Object r7 = kotlinx.coroutines.c.e(r1, r5, r7)     // Catch: java.lang.Exception -> L44
            if (r7 != r0) goto L5a
            goto L59
        L44:
            lv r8 = defpackage.oy.a
            kotlinx.coroutines.MainCoroutineDispatcher r8 = defpackage.bn0.a
            com.v2ray.ang.ui.HomeFragment$startOVPN$1$2 r1 = new com.v2ray.ang.ui.HomeFragment$startOVPN$1$2
            com.v2ray.ang.ui.HomeFragment r3 = r7.this$0
            r1.<init>(r3, r4)
            r7.L$0 = r4
            r7.label = r2
            java.lang.Object r7 = kotlinx.coroutines.c.e(r8, r1, r7)
            if (r7 != r0) goto L5a
        L59:
            return r0
        L5a:
            mk1 r7 = defpackage.mk1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.ui.HomeFragment$startOVPN$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
