package com.v2ray.ang.ui;

import dev.zeron.tunnel.R;
import defpackage.bn0;
import defpackage.l71;
import defpackage.lv;
import defpackage.mk1;
import defpackage.oy;
import defpackage.qf3;
import defpackage.u7;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "com.v2ray.ang.ui.RoutingSettingActivity$importFromClipboard$1$1", f = "RoutingSettingActivity.kt", i = {0}, l = {144}, m = "invokeSuspend", n = {"result"}, s = {"Z$0"})
final class RoutingSettingActivity$importFromClipboard$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ String $clipboard;
    boolean Z$0;
    int label;
    final /* synthetic */ RoutingSettingActivity this$0;

    /* JADX INFO: renamed from: com.v2ray.ang.ui.RoutingSettingActivity$importFromClipboard$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.v2ray.ang.ui.RoutingSettingActivity$importFromClipboard$1$1$1", f = "RoutingSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        final /* synthetic */ boolean $result;
        int label;
        final /* synthetic */ RoutingSettingActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, RoutingSettingActivity routingSettingActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$result = z;
            this.this$0 = routingSettingActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$result, this.this$0, continuation);
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
            boolean z = this.$result;
            RoutingSettingActivity routingSettingActivity = this.this$0;
            if (z) {
                routingSettingActivity.i();
                qf3.O(this.this$0);
            } else {
                qf3.M(routingSettingActivity, R.string.toast_failure);
            }
            return mk1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingSettingActivity$importFromClipboard$1$1(String str, RoutingSettingActivity routingSettingActivity, Continuation<? super RoutingSettingActivity$importFromClipboard$1$1> continuation) {
        super(2, continuation);
        this.$clipboard = str;
        this.this$0 = routingSettingActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new RoutingSettingActivity$importFromClipboard$1$1(this.$clipboard, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((RoutingSettingActivity$importFromClipboard$1$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.d.b(obj);
            boolean zG = l71.g(this.$clipboard);
            lv lvVar = oy.a;
            MainCoroutineDispatcher mainCoroutineDispatcher = bn0.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(zG, this.this$0, null);
            this.Z$0 = zG;
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
