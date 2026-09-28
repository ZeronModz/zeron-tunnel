package io.ktor.client.plugins.api;

import defpackage.mk1;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponse;", "Lmk1;", "it", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponse;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.api.ResponseHook$install$1", f = "KtorCallContexts.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
final class ResponseHook$install$1 extends SuspendLambda implements Function3<PipelineContext<HttpResponse, mk1>, HttpResponse, Continuation<? super mk1>, Object> {
    final /* synthetic */ Function3<OnResponseContext, HttpResponse, Continuation<? super mk1>, Object> $handler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ResponseHook$install$1(Function3<? super OnResponseContext, ? super HttpResponse, ? super Continuation<? super mk1>, ? extends Object> function3, Continuation<? super ResponseHook$install$1> continuation) {
        super(3, continuation);
        this.$handler = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<HttpResponse, mk1> pipelineContext, HttpResponse httpResponse, Continuation<? super mk1> continuation) {
        ResponseHook$install$1 responseHook$install$1 = new ResponseHook$install$1(this.$handler, continuation);
        responseHook$install$1.L$0 = pipelineContext;
        return responseHook$install$1.invokeSuspend(mk1.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to io.ktor.client.plugins.api.ResponseHook$install$1 for r4v3 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Ld
            kotlin.d.b(r5)
            goto L2f
        Ld:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r4)
            r4 = 0
            return r4
        L14:
            kotlin.d.b(r5)
            java.lang.Object r5 = r4.L$0
            io.ktor.util.pipeline.PipelineContext r5 = (io.ktor.util.pipeline.PipelineContext) r5
            kotlin.jvm.functions.Function3<io.ktor.client.plugins.api.OnResponseContext, io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super mk1>, java.lang.Object> r1 = r4.$handler
            io.ktor.client.plugins.api.OnResponseContext r3 = new io.ktor.client.plugins.api.OnResponseContext
            r3.<init>()
            java.lang.Object r5 = r5.getD()
            r4.label = r2
            java.lang.Object r4 = r1.invoke(r3, r5, r4)
            if (r4 != r0) goto L2f
            return r0
        L2f:
            mk1 r4 = defpackage.mk1.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.api.ResponseHook$install$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
