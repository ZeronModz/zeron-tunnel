package io.ktor.util.pipeline;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import defpackage.u7;
import defpackage.yg0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "subject", "Lmk1;", "<anonymous>", "(Ljava/lang/Void;Ljava/lang/Void;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.util.pipeline.PipelineKt$intercept$1", f = "Pipeline.kt", i = {}, l = {497}, m = "invokeSuspend", n = {}, s = {})
public final class PipelineKt$intercept$1 extends SuspendLambda implements Function3<PipelineContext<? extends Object, Object>, Object, Continuation<? super mk1>, Object> {
    final /* synthetic */ Function3<PipelineContext<Object, Object>, Object, Continuation<? super mk1>, Object> $block;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PipelineKt$intercept$1(Function3<? super PipelineContext<Object, Object>, Object, ? super Continuation<? super mk1>, ? extends Object> function3, Continuation<? super PipelineKt$intercept$1> continuation) {
        super(3, continuation);
        this.$block = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<? extends Object, Object> pipelineContext, Object obj, Continuation<? super mk1> continuation) {
        PipelineKt$intercept$1 pipelineKt$intercept$1 = new PipelineKt$intercept$1(this.$block, continuation);
        pipelineKt$intercept$1.L$0 = pipelineContext;
        pipelineKt$intercept$1.L$1 = obj;
        return pipelineKt$intercept$1.invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            d.b(obj);
            yg0.M();
            throw null;
        }
        if (i == 1) {
            d.b(obj);
            return mk1.a;
        }
        u7.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
