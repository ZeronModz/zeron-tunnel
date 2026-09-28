package io.ktor.client.plugins;

import defpackage.mk1;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "it", "Lmk1;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponseContainer;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.ReceiveError$install$1", f = "HttpCallValidator.kt", i = {0}, l = {149, 151}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
final class ReceiveError$install$1 extends SuspendLambda implements Function3<PipelineContext<HttpResponseContainer, HttpClientCall>, HttpResponseContainer, Continuation<? super mk1>, Object> {
    final /* synthetic */ Function3<HttpRequest, Throwable, Continuation<? super Throwable>, Object> $handler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReceiveError$install$1(Function3<? super HttpRequest, ? super Throwable, ? super Continuation<? super Throwable>, ? extends Object> function3, Continuation<? super ReceiveError$install$1> continuation) {
        super(3, continuation);
        this.$handler = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, Continuation<? super mk1> continuation) {
        ReceiveError$install$1 receiveError$install$1 = new ReceiveError$install$1(this.$handler, continuation);
        receiveError$install$1.L$0 = pipelineContext;
        return receiveError$install$1.invokeSuspend(mk1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r5 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r6 != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.PipelineContext] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [io.ktor.client.plugins.ReceiveError$install$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v1, types: [io.ktor.client.plugins.ReceiveError$install$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            kotlin.d.b(r6)
            goto L49
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r5)
            return r2
        L17:
            java.lang.Object r1 = r5.L$0
            io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
            kotlin.d.b(r6)     // Catch: java.lang.Throwable -> L1f
            goto L4d
        L1f:
            r6 = move-exception
            goto L34
        L21:
            kotlin.d.b(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
            r5.L$0 = r1     // Catch: java.lang.Throwable -> L1f
            r5.label = r4     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r5 = r1.d(r5)     // Catch: java.lang.Throwable -> L1f
            if (r5 != r0) goto L4d
            goto L48
        L34:
            kotlin.jvm.functions.Function3<io.ktor.client.request.HttpRequest, java.lang.Throwable, kotlin.coroutines.Continuation<? super java.lang.Throwable>, java.lang.Object> r4 = r5.$handler
            java.lang.Object r1 = r1.a
            io.ktor.client.call.HttpClientCall r1 = (io.ktor.client.call.HttpClientCall) r1
            io.ktor.client.request.HttpRequest r1 = r1.c()
            r5.L$0 = r2
            r5.label = r3
            java.lang.Object r6 = r4.invoke(r1, r6, r5)
            if (r6 != r0) goto L49
        L48:
            return r0
        L49:
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L50
        L4d:
            mk1 r5 = defpackage.mk1.a
            return r5
        L50:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.ReceiveError$install$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
