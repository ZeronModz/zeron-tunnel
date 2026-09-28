package io.ktor.client.plugins;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/client/request/HttpRequestBuilder;", "content", "Lmk1;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.RenderRequestHook$install$1", f = "HttpPlainText.kt", i = {0}, l = {145, 146}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
final class RenderRequestHook$install$1 extends SuspendLambda implements Function3<PipelineContext<Object, HttpRequestBuilder>, Object, Continuation<? super mk1>, Object> {
    final /* synthetic */ Function3<HttpRequestBuilder, Object, Continuation<? super OutgoingContent>, Object> $handler;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RenderRequestHook$install$1(Function3<? super HttpRequestBuilder, Object, ? super Continuation<? super OutgoingContent>, ? extends Object> function3, Continuation<? super RenderRequestHook$install$1> continuation) {
        super(3, continuation);
        this.$handler = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, Continuation<? super mk1> continuation) {
        RenderRequestHook$install$1 renderRequestHook$install$1 = new RenderRequestHook$install$1(this.$handler, continuation);
        renderRequestHook$install$1.L$0 = pipelineContext;
        renderRequestHook$install$1.L$1 = obj;
        return renderRequestHook$install$1.invokeSuspend(mk1.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to io.ktor.client.plugins.RenderRequestHook$install$1 for r7v3 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            kotlin.d.b(r8)
            goto L47
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r7)
            return r2
        L17:
            java.lang.Object r1 = r7.L$0
            io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
            kotlin.d.b(r8)
            goto L38
        L1f:
            kotlin.d.b(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
            java.lang.Object r8 = r7.L$1
            kotlin.jvm.functions.Function3<io.ktor.client.request.HttpRequestBuilder, java.lang.Object, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, java.lang.Object> r5 = r7.$handler
            java.lang.Object r6 = r1.a
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = r5.invoke(r6, r8, r7)
            if (r8 != r0) goto L38
            goto L46
        L38:
            io.ktor.http.content.OutgoingContent r8 = (io.ktor.http.content.OutgoingContent) r8
            if (r8 == 0) goto L47
            r7.L$0 = r2
            r7.label = r3
            java.lang.Object r7 = r1.e(r8, r7)
            if (r7 != r0) goto L47
        L46:
            return r0
        L47:
            mk1 r7 = defpackage.mk1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.RenderRequestHook$install$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
