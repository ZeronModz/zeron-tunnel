package io.ktor.client.plugins;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/client/request/HttpRequestBuilder;", "content", "Lmk1;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.HttpSend$Plugin$install$1", f = "HttpSend.kt", i = {0}, l = {84, 85}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
final class HttpSend$Plugin$install$1 extends SuspendLambda implements Function3<PipelineContext<Object, HttpRequestBuilder>, Object, Continuation<? super mk1>, Object> {
    final /* synthetic */ HttpSend $plugin;
    final /* synthetic */ HttpClient $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpSend$Plugin$install$1(HttpSend httpSend, HttpClient httpClient, Continuation<? super HttpSend$Plugin$install$1> continuation) {
        super(3, continuation);
        this.$plugin = httpSend;
        this.$scope = httpClient;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, Continuation<? super mk1> continuation) {
        HttpSend$Plugin$install$1 httpSend$Plugin$install$1 = new HttpSend$Plugin$install$1(this.$plugin, this.$scope, continuation);
        httpSend$Plugin$install$1.L$0 = pipelineContext;
        httpSend$Plugin$install$1.L$1 = obj;
        return httpSend$Plugin$install$1.invokeSuspend(mk1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (r1.e((io.ktor.client.call.HttpClientCall) r9, r8) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L17
            if (r1 != r2) goto L11
            kotlin.d.b(r9)
            goto L7c
        L11:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r8)
            return r4
        L17:
            java.lang.Object r1 = r8.L$0
            io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
            kotlin.d.b(r9)
            goto L6f
        L1f:
            kotlin.d.b(r9)
            java.lang.Object r9 = r8.L$0
            r1 = r9
            io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
            java.lang.Object r9 = r8.L$1
            boolean r5 = r9 instanceof io.ktor.http.content.OutgoingContent
            if (r5 == 0) goto L7f
            java.lang.Object r5 = r1.a
            io.ktor.client.request.HttpRequestBuilder r5 = (io.ktor.client.request.HttpRequestBuilder) r5
            r5.d = r9
            r5.b(r4)
            io.ktor.client.plugins.HttpSend$DefaultSender r9 = new io.ktor.client.plugins.HttpSend$DefaultSender
            io.ktor.client.plugins.HttpSend r5 = r8.$plugin
            int r5 = r5.a
            io.ktor.client.HttpClient r6 = r8.$scope
            r9.<init>(r5, r6)
            io.ktor.client.plugins.HttpSend r5 = r8.$plugin
            java.util.ArrayList r5 = r5.b
            java.util.List r5 = kotlin.collections.c.J(r5)
            java.util.Iterator r5 = r5.iterator()
        L4d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L60
            java.lang.Object r6 = r5.next()
            kotlin.jvm.functions.Function3 r6 = (kotlin.jvm.functions.Function3) r6
            io.ktor.client.plugins.HttpSend$InterceptedSender r7 = new io.ktor.client.plugins.HttpSend$InterceptedSender
            r7.<init>(r6, r9)
            r9 = r7
            goto L4d
        L60:
            java.lang.Object r5 = r1.a
            io.ktor.client.request.HttpRequestBuilder r5 = (io.ktor.client.request.HttpRequestBuilder) r5
            r8.L$0 = r1
            r8.label = r3
            java.lang.Object r9 = r9.execute(r5, r8)
            if (r9 != r0) goto L6f
            goto L7b
        L6f:
            io.ktor.client.call.HttpClientCall r9 = (io.ktor.client.call.HttpClientCall) r9
            r8.L$0 = r4
            r8.label = r2
            java.lang.Object r8 = r1.e(r9, r8)
            if (r8 != r0) goto L7c
        L7b:
            return r0
        L7c:
            mk1 r8 = defpackage.mk1.a
            return r8
        L7f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "\n|Fail to prepare request body for sending. \n|The body type is: "
            r8.<init>(r0)
            java.lang.Class r9 = r9.getClass()
            kotlin.jvm.internal.ClassReference r9 = kotlin.jvm.internal.Reflection.a(r9)
            r8.append(r9)
            java.lang.String r9 = ", with Content-Type: "
            r8.append(r9)
            java.lang.Object r9 = r1.a
            io.ktor.http.HttpMessageBuilder r9 = (io.ktor.http.HttpMessageBuilder) r9
            io.ktor.http.ContentType r9 = io.ktor.http.c.c(r9)
            r8.append(r9)
            java.lang.String r9 = ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header."
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = kotlin.text.g.g0(r8)
            defpackage.zg1.l(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpSend$Plugin$install$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
