package io.ktor.client.plugins.sse;

import com.trilead.ssh2.packets.Packets;
import defpackage.ir;
import defpackage.le0;
import defpackage.mk1;
import defpackage.u7;
import defpackage.yg0;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "<destruct>", "Lmk1;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponseContainer;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.sse.SSEKt$SSE$2$2", f = "SSE.kt", i = {}, l = {Packets.SSH_MSG_CHANNEL_SUCCESS}, m = "invokeSuspend", n = {}, s = {})
final class SSEKt$SSE$2$2 extends SuspendLambda implements Function3<PipelineContext<HttpResponseContainer, HttpClientCall>, HttpResponseContainer, Continuation<? super mk1>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public SSEKt$SSE$2$2(Continuation<? super SSEKt$SSE$2$2> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, Continuation<? super mk1> continuation) {
        SSEKt$SSE$2$2 sSEKt$SSE$2$2 = new SSEKt$SSE$2$2(continuation);
        sSEKt$SSE$2$2.L$0 = pipelineContext;
        sSEKt$SSE$2$2.L$1 = httpResponseContainer;
        return sSEKt$SSE$2$2.invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ContentType contentTypeA;
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
        PipelineContext pipelineContext = (PipelineContext) this.L$0;
        HttpResponseContainer httpResponseContainer = (HttpResponseContainer) this.L$1;
        TypeInfo typeInfo = httpResponseContainer.a;
        Object obj2 = httpResponseContainer.b;
        HttpResponse httpResponseD = ((HttpClientCall) pipelineContext.a).d();
        HttpStatusCode c = httpResponseD.getC();
        Headers h = httpResponseD.getD();
        List list = le0.a;
        String str = h.get("Content-Type");
        if (str != null) {
            ContentType.f.getClass();
            contentTypeA = ContentType.Companion.a(str);
        } else {
            contentTypeA = null;
        }
        if (!(httpResponseD.getA().c().getD() instanceof SSEClientContent)) {
            c.a.trace("Skipping non SSE response from " + httpResponseD.getA().c().getB());
            return mk1Var;
        }
        HttpStatusCode.c.getClass();
        HttpStatusCode httpStatusCode = HttpStatusCode.e;
        if (!yg0.a(c, httpStatusCode)) {
            throw new SSEClientException(httpResponseD, null, "Expected status code " + httpStatusCode.a + " but was " + c.a, 2, null);
        }
        ContentType contentTypeD = contentTypeA != null ? contentTypeA.d() : null;
        ContentType contentType = ir.c;
        if (!yg0.a(contentTypeD, contentType)) {
            throw new SSEClientException(httpResponseD, null, "Expected Content-Type " + contentType + " but was " + contentTypeA, 2, null);
        }
        if (!(obj2 instanceof SSESession)) {
            throw new SSEClientException(httpResponseD, null, "Expected " + Reflection.a(SSESession.class).getSimpleName() + " content but was " + obj2, 2, null);
        }
        c.a.trace("Receive SSE session from " + httpResponseD.getA().c().getB() + ": " + obj2);
        HttpResponseContainer httpResponseContainer2 = new HttpResponseContainer(typeInfo, new ClientSSESession((HttpClientCall) pipelineContext.a, (SSESession) obj2));
        this.L$0 = null;
        this.label = 1;
        return pipelineContext.e(httpResponseContainer2, this) == coroutineSingletons ? coroutineSingletons : mk1Var;
    }
}
