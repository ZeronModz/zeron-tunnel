package com.v2ray.ang.ui;

import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ay2;
import defpackage.bn0;
import defpackage.lv;
import defpackage.mk1;
import defpackage.oy;
import defpackage.qf3;
import defpackage.u7;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "com.v2ray.ang.ui.UrlSchemeActivity$parseUri$1", f = "UrlSchemeActivity.kt", i = {0, 0}, l = {78}, m = "invokeSuspend", n = {"count", "countSub"}, s = {"I$0", "I$1"})
final class UrlSchemeActivity$parseUri$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ Ref$ObjectRef<String> $decodedUrl;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ UrlSchemeActivity this$0;

    /* JADX INFO: renamed from: com.v2ray.ang.ui.UrlSchemeActivity$parseUri$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.v2ray.ang.ui.UrlSchemeActivity$parseUri$1$1", f = "UrlSchemeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        final /* synthetic */ int $count;
        final /* synthetic */ int $countSub;
        int label;
        final /* synthetic */ UrlSchemeActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, int i2, UrlSchemeActivity urlSchemeActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$count = i;
            this.$countSub = i2;
            this.this$0 = urlSchemeActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$count, this.$countSub, this.this$0, continuation);
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
            int i = this.$count + this.$countSub;
            UrlSchemeActivity urlSchemeActivity = this.this$0;
            if (i > 0) {
                qf3.K(urlSchemeActivity, R.string.import_subscription_success);
            } else {
                qf3.K(urlSchemeActivity, R.string.import_subscription_failure);
            }
            return mk1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlSchemeActivity$parseUri$1(Ref$ObjectRef<String> ref$ObjectRef, UrlSchemeActivity urlSchemeActivity, Continuation<? super UrlSchemeActivity$parseUri$1> continuation) {
        super(2, continuation);
        this.$decodedUrl = ref$ObjectRef;
        this.this$0 = urlSchemeActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new UrlSchemeActivity$parseUri$1(this.$decodedUrl, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((UrlSchemeActivity$parseUri$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.d.b(obj);
            Pair pairI = ay2.i(this.$decodedUrl.element, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false);
            int iIntValue = ((Number) pairI.component1()).intValue();
            int iIntValue2 = ((Number) pairI.component2()).intValue();
            lv lvVar = oy.a;
            MainCoroutineDispatcher mainCoroutineDispatcher = bn0.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(iIntValue, iIntValue2, this.this$0, null);
            this.I$0 = iIntValue;
            this.I$1 = iIntValue2;
            this.label = 1;
            if (kotlinx.coroutines.c.e(mainCoroutineDispatcher, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.d.b(obj);
        }
        return mk1.a;
    }
}
