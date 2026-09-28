package com.v2ray.ang.ui;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.bn0;
import defpackage.i60;
import defpackage.lv;
import defpackage.mk1;
import defpackage.oy;
import defpackage.qf3;
import defpackage.u7;
import defpackage.ul1;
import defpackage.zq0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "com.v2ray.ang.ui.PerAppProxyActivity$selectProxyApp$1", f = "PerAppProxyActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class PerAppProxyActivity$selectProxyApp$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PerAppProxyActivity this$0;

    /* JADX INFO: renamed from: com.v2ray.ang.ui.PerAppProxyActivity$selectProxyApp$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.v2ray.ang.ui.PerAppProxyActivity$selectProxyApp$1$1", f = "PerAppProxyActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        final /* synthetic */ Ref$ObjectRef<String> $content;
        int label;
        final /* synthetic */ PerAppProxyActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref$ObjectRef<String> ref$ObjectRef, PerAppProxyActivity perAppProxyActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$content = ref$ObjectRef;
            this.this$0 = perAppProxyActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$content, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.d.b(obj);
            String str = this.$content.element;
            PerAppProxyActivity perAppProxyActivity = this.this$0;
            int i = PerAppProxyActivity.f;
            perAppProxyActivity.j(str, true);
            qf3.O(this.this$0);
            this.this$0.h().c.b();
            return mk1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerAppProxyActivity$selectProxyApp$1(String str, PerAppProxyActivity perAppProxyActivity, Continuation<? super PerAppProxyActivity$selectProxyApp$1> continuation) {
        super(2, continuation);
        this.$url = str;
        this.this$0 = perAppProxyActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        PerAppProxyActivity$selectProxyApp$1 perAppProxyActivity$selectProxyApp$1 = new PerAppProxyActivity$selectProxyApp$1(this.$url, this.this$0, continuation);
        perAppProxyActivity$selectProxyApp$1.L$0 = obj;
        return perAppProxyActivity$selectProxyApp$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((PerAppProxyActivity$selectProxyApp$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.d.b(obj);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? B = i60.b(0, this.$url);
        ref$ObjectRef.element = B;
        if (B == 0 || B.length() == 0) {
            Regex regex = ul1.a;
            Lazy lazy = zq0.a;
            String strB = i60.b(ul1.y(Integer.parseInt("10808"), zq0.z().d("pref_socks_port")), this.$url);
            T t = strB;
            if (strB == null) {
                t = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            ref$ObjectRef.element = t;
        }
        lv lvVar = oy.a;
        kotlinx.coroutines.c.d(coroutineScope, bn0.a, null, new AnonymousClass1(ref$ObjectRef, this.this$0, null), 2);
        return mk1.a;
    }
}
