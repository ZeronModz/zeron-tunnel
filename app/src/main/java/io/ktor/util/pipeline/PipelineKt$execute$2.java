package io.ktor.util.pipeline;

import defpackage.mk1;
import defpackage.u7;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lmk1;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.util.pipeline.PipelineKt$execute$2", f = "Pipeline.kt", i = {}, l = {481}, m = "invokeSuspend", n = {}, s = {})
public final class PipelineKt$execute$2 extends SuspendLambda implements Function1<Continuation<? super mk1>, Object> {
    final /* synthetic */ Object $context;
    final /* synthetic */ Pipeline<mk1, Object> $this_execute;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipelineKt$execute$2(Pipeline<mk1, Object> pipeline, Object obj, Continuation<? super PipelineKt$execute$2> continuation) {
        super(1, continuation);
        this.$this_execute = pipeline;
        this.$context = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Continuation<?> continuation) {
        return new PipelineKt$execute$2(this.$this_execute, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super mk1> continuation) {
        return ((PipelineKt$execute$2) create(continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        mk1 mk1Var = mk1.a;
        if (i != 0) {
            if (i == 1) {
                d.b(obj);
                return mk1Var;
            }
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d.b(obj);
        Pipeline<mk1, Object> pipeline = this.$this_execute;
        Object obj2 = this.$context;
        this.label = 1;
        return pipeline.a(obj2, mk1Var, this) == coroutineSingletons ? coroutineSingletons : mk1Var;
    }
}
