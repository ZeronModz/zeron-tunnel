package io.ktor.client.plugins;

import defpackage.mk1;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponse;", "Lmk1;", "response", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponse;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.AfterReceiveHook$install$1", f = "BodyProgress.kt", i = {0}, l = {48, 49}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
final class AfterReceiveHook$install$1 extends SuspendLambda implements Function3<PipelineContext<HttpResponse, mk1>, HttpResponse, Continuation<? super mk1>, Object> {
    final /* synthetic */ Function2<HttpResponse, Continuation<? super HttpResponse>, Object> $handler;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AfterReceiveHook$install$1(Function2<? super HttpResponse, ? super Continuation<? super HttpResponse>, ? extends Object> function2, Continuation<? super AfterReceiveHook$install$1> continuation) {
        super(3, continuation);
        this.$handler = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<HttpResponse, mk1> pipelineContext, HttpResponse httpResponse, Continuation<? super mk1> continuation) {
        AfterReceiveHook$install$1 afterReceiveHook$install$1 = new AfterReceiveHook$install$1(this.$handler, continuation);
        afterReceiveHook$install$1.L$0 = pipelineContext;
        afterReceiveHook$install$1.L$1 = httpResponse;
        return afterReceiveHook$install$1.invokeSuspend(mk1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r1.e(r7, r6) == r0) goto L17;
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
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            kotlin.d.b(r7)
            goto L47
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            return r2
        L17:
            java.lang.Object r1 = r6.L$0
            io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
            kotlin.d.b(r7)
            goto L38
        L1f:
            kotlin.d.b(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
            java.lang.Object r7 = r6.L$1
            io.ktor.client.statement.HttpResponse r7 = (io.ktor.client.statement.HttpResponse) r7
            kotlin.jvm.functions.Function2<io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse>, java.lang.Object> r5 = r6.$handler
            r6.L$0 = r1
            r6.label = r4
            java.lang.Object r7 = r5.invoke(r7, r6)
            if (r7 != r0) goto L38
            goto L46
        L38:
            io.ktor.client.statement.HttpResponse r7 = (io.ktor.client.statement.HttpResponse) r7
            if (r7 == 0) goto L47
            r6.L$0 = r2
            r6.label = r3
            java.lang.Object r6 = r1.e(r7, r6)
            if (r6 != r0) goto L47
        L46:
            return r0
        L47:
            mk1 r6 = defpackage.mk1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.AfterReceiveHook$install$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
