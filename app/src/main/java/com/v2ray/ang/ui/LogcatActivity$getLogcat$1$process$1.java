package com.v2ray.ang.ui;

import defpackage.mk1;
import defpackage.u7;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Ljava/lang/Process;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.v2ray.ang.ui.LogcatActivity$getLogcat$1$process$1", f = "LogcatActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LogcatActivity$getLogcat$1$process$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Process>, Object> {
    final /* synthetic */ LinkedHashSet<String> $lst;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogcatActivity$getLogcat$1$process$1(LinkedHashSet<String> linkedHashSet, Continuation<? super LogcatActivity$getLogcat$1$process$1> continuation) {
        super(2, continuation);
        this.$lst = linkedHashSet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new LogcatActivity$getLogcat$1$process$1(this.$lst, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Process> continuation) {
        return ((LogcatActivity$getLogcat$1$process$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.d.b(obj);
            return Runtime.getRuntime().exec((String[]) this.$lst.toArray(new String[0]));
        }
        u7.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
