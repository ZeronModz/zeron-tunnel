package com.v2ray.ang.ui;

import defpackage.bn0;
import defpackage.lv;
import defpackage.mk1;
import defpackage.oy;
import defpackage.u7;
import defpackage.zq0;
import java.util.ArrayList;
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
@DebugMetadata(c = "com.v2ray.ang.ui.SubEditActivity$deleteServer$1$1", f = "SubEditActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class SubEditActivity$deleteServer$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SubEditActivity this$0;

    /* JADX INFO: renamed from: com.v2ray.ang.ui.SubEditActivity$deleteServer$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.v2ray.ang.ui.SubEditActivity$deleteServer$1$1$1", f = "SubEditActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        int label;
        final /* synthetic */ SubEditActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SubEditActivity subEditActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = subEditActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
            this.this$0.finish();
            return mk1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubEditActivity$deleteServer$1$1(SubEditActivity subEditActivity, Continuation<? super SubEditActivity$deleteServer$1$1> continuation) {
        super(2, continuation);
        this.this$0 = subEditActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        SubEditActivity$deleteServer$1$1 subEditActivity$deleteServer$1$1 = new SubEditActivity$deleteServer$1$1(this.this$0, continuation);
        subEditActivity$deleteServer$1$1.L$0 = obj;
        return subEditActivity$deleteServer$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((SubEditActivity$deleteServer$1$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.d.b(obj);
        Lazy lazy = zq0.a;
        SubEditActivity subEditActivity = this.this$0;
        int i = SubEditActivity.g;
        String strI = subEditActivity.i();
        strI.getClass();
        zq0.A().o(strI);
        ArrayList arrayListG = zq0.g();
        arrayListG.remove(strI);
        zq0.p(arrayListG);
        zq0.G(strI);
        lv lvVar = oy.a;
        kotlinx.coroutines.c.d(coroutineScope, bn0.a, null, new AnonymousClass1(this.this$0, null), 2);
        return mk1.a;
    }
}
