package io.ktor.client.plugins.api;

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
import org.conscrypt.HpkeSuite;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/client/request/HttpRequestBuilder;", "it", "Lmk1;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.api.SendingRequest$install$1", f = "CommonHooks.kt", i = {}, l = {HpkeSuite.KEM_MLKEM_768}, m = "invokeSuspend", n = {}, s = {})
final class SendingRequest$install$1 extends SuspendLambda implements Function3<PipelineContext<Object, HttpRequestBuilder>, Object, Continuation<? super mk1>, Object> {
    final /* synthetic */ Function3<HttpRequestBuilder, OutgoingContent, Continuation<? super mk1>, Object> $handler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SendingRequest$install$1(Function3<? super HttpRequestBuilder, ? super OutgoingContent, ? super Continuation<? super mk1>, ? extends Object> function3, Continuation<? super SendingRequest$install$1> continuation) {
        super(3, continuation);
        this.$handler = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, Continuation<? super mk1> continuation) {
        SendingRequest$install$1 sendingRequest$install$1 = new SendingRequest$install$1(this.$handler, continuation);
        sendingRequest$install$1.L$0 = pipelineContext;
        return sendingRequest$install$1.invokeSuspend(mk1.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to io.ktor.client.plugins.api.SendingRequest$install$1 for r4v3 'this'  java.lang.Object
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
            goto L31
        Ld:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r4)
            r4 = 0
            return r4
        L14:
            kotlin.d.b(r5)
            java.lang.Object r5 = r4.L$0
            io.ktor.util.pipeline.PipelineContext r5 = (io.ktor.util.pipeline.PipelineContext) r5
            kotlin.jvm.functions.Function3<io.ktor.client.request.HttpRequestBuilder, io.ktor.http.content.OutgoingContent, kotlin.coroutines.Continuation<? super mk1>, java.lang.Object> r1 = r4.$handler
            java.lang.Object r3 = r5.a
            java.lang.Object r5 = r5.getD()
            r5.getClass()
            io.ktor.http.content.OutgoingContent r5 = (io.ktor.http.content.OutgoingContent) r5
            r4.label = r2
            java.lang.Object r4 = r1.invoke(r3, r5, r4)
            if (r4 != r0) goto L31
            return r0
        L31:
            mk1 r4 = defpackage.mk1.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.api.SendingRequest$install$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
