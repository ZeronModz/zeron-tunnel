package io.ktor.client.plugins.api;

import com.google.android.gms.ads.RequestConfiguration;
import com.trilead.ssh2.packets.Packets;
import defpackage.mk1;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/client/request/HttpRequestBuilder;", "it", "Lmk1;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.api.TransformRequestBodyHook$install$1", f = "KtorCallContexts.kt", i = {0}, l = {79, Packets.SSH_MSG_GLOBAL_REQUEST}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
final class TransformRequestBodyHook$install$1 extends SuspendLambda implements Function3<PipelineContext<Object, HttpRequestBuilder>, Object, Continuation<? super mk1>, Object> {
    final /* synthetic */ Function5<TransformRequestBodyContext, HttpRequestBuilder, Object, TypeInfo, Continuation<? super OutgoingContent>, Object> $handler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransformRequestBodyHook$install$1(Function5<? super TransformRequestBodyContext, ? super HttpRequestBuilder, Object, ? super TypeInfo, ? super Continuation<? super OutgoingContent>, ? extends Object> function5, Continuation<? super TransformRequestBodyHook$install$1> continuation) {
        super(3, continuation);
        this.$handler = function5;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, Continuation<? super mk1> continuation) {
        TransformRequestBodyHook$install$1 transformRequestBodyHook$install$1 = new TransformRequestBodyHook$install$1(this.$handler, continuation);
        transformRequestBodyHook$install$1.L$0 = pipelineContext;
        return transformRequestBodyHook$install$1.invokeSuspend(mk1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (r1.e(r12, r10) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            kotlin.d.b(r12)
            goto L5f
        L11:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r11)
            return r2
        L17:
            java.lang.Object r1 = r11.L$0
            io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
            kotlin.d.b(r12)
            r10 = r11
            goto L50
        L20:
            kotlin.d.b(r12)
            java.lang.Object r12 = r11.L$0
            r1 = r12
            io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
            kotlin.jvm.functions.Function5<io.ktor.client.plugins.api.TransformRequestBodyContext, io.ktor.client.request.HttpRequestBuilder, java.lang.Object, io.ktor.util.reflect.TypeInfo, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, java.lang.Object> r5 = r11.$handler
            io.ktor.client.plugins.api.TransformRequestBodyContext r6 = new io.ktor.client.plugins.api.TransformRequestBodyContext
            r6.<init>()
            java.lang.Object r7 = r1.a
            java.lang.Object r8 = r1.getD()
            java.lang.Object r12 = r1.a
            io.ktor.client.request.HttpRequestBuilder r12 = (io.ktor.client.request.HttpRequestBuilder) r12
            io.ktor.util.Attributes r12 = r12.f
            io.ktor.util.AttributeKey r9 = defpackage.h31.a
            java.lang.Object r12 = r12.getOrNull(r9)
            r9 = r12
            io.ktor.util.reflect.TypeInfo r9 = (io.ktor.util.reflect.TypeInfo) r9
            r11.L$0 = r1
            r11.label = r4
            r10 = r11
            java.lang.Object r12 = r5.invoke(r6, r7, r8, r9, r10)
            if (r12 != r0) goto L50
            goto L5e
        L50:
            io.ktor.http.content.OutgoingContent r12 = (io.ktor.http.content.OutgoingContent) r12
            if (r12 == 0) goto L5f
            r10.L$0 = r2
            r10.label = r3
            java.lang.Object r11 = r1.e(r12, r10)
            if (r11 != r0) goto L5f
        L5e:
            return r0
        L5f:
            mk1 r11 = defpackage.mk1.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.api.TransformRequestBodyHook$install$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
