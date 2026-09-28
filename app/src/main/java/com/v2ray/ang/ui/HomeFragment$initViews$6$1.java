package com.v2ray.ang.ui;

import android.content.Intent;
import com.google.android.material.button.MaterialButton;
import defpackage.mk1;
import defpackage.u7;
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
@DebugMetadata(c = "com.v2ray.ang.ui.HomeFragment$initViews$6$1", f = "HomeFragment.kt", i = {2}, l = {3098, 3101, 3105}, m = "invokeSuspend", n = {"intent"}, s = {"L$0"})
final class HomeFragment$initViews$6$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ HomeFragment this$0;

    /* JADX INFO: renamed from: com.v2ray.ang.ui.HomeFragment$initViews$6$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.v2ray.ang.ui.HomeFragment$initViews$6$1$1", f = "HomeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        final /* synthetic */ Intent $intent;
        int label;
        final /* synthetic */ HomeFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Intent intent, HomeFragment homeFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$intent = intent;
            this.this$0 = homeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$intent, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
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
            Intent intent = this.$intent;
            HomeFragment homeFragment = this.this$0;
            if (intent != null) {
                homeFragment.Q0.a(intent);
            } else {
                int i = HomeFragment.f2;
                homeFragment.F0();
            }
            MaterialButton materialButton = this.this$0.P0;
            if (materialButton != null) {
                materialButton.setEnabled(true);
            }
            return mk1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$initViews$6$1(HomeFragment homeFragment, Continuation<? super HomeFragment$initViews$6$1> continuation) {
        super(2, continuation);
        this.this$0 = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new HomeFragment$initViews$6$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((HomeFragment$initViews$6$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (kotlinx.coroutines.c.e(r1, r3, r6) != r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L26
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L18
            java.lang.Object r6 = r6.L$0
            android.content.Intent r6 = (android.content.Intent) r6
            kotlin.d.b(r7)
            goto L5c
        L18:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            return r5
        L1e:
            kotlin.d.b(r7)
            goto L44
        L22:
            kotlin.d.b(r7)
            goto L32
        L26:
            kotlin.d.b(r7)
            r6.label = r4
            java.lang.Object r7 = defpackage.xg0.D(r6)
            if (r7 != r0) goto L32
            goto L5b
        L32:
            lv r7 = defpackage.oy.a
            com.v2ray.ang.ui.HomeFragment$initViews$6$1$intent$1 r1 = new com.v2ray.ang.ui.HomeFragment$initViews$6$1$intent$1
            com.v2ray.ang.ui.HomeFragment r4 = r6.this$0
            r1.<init>(r4, r5)
            r6.label = r3
            java.lang.Object r7 = kotlinx.coroutines.c.e(r7, r1, r6)
            if (r7 != r0) goto L44
            goto L5b
        L44:
            android.content.Intent r7 = (android.content.Intent) r7
            lv r1 = defpackage.oy.a
            kotlinx.coroutines.MainCoroutineDispatcher r1 = defpackage.bn0.a
            com.v2ray.ang.ui.HomeFragment$initViews$6$1$1 r3 = new com.v2ray.ang.ui.HomeFragment$initViews$6$1$1
            com.v2ray.ang.ui.HomeFragment r4 = r6.this$0
            r3.<init>(r7, r4, r5)
            r6.L$0 = r5
            r6.label = r2
            java.lang.Object r6 = kotlinx.coroutines.c.e(r1, r3, r6)
            if (r6 != r0) goto L5c
        L5b:
            return r0
        L5c:
            mk1 r6 = defpackage.mk1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.v2ray.ang.ui.HomeFragment$initViews$6$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
