package io.ktor.client.plugins.websocket;

import defpackage.j03;
import defpackage.le0;
import defpackage.mk1;
import defpackage.rp1;
import defpackage.u7;
import defpackage.yg0;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.http.Headers;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.websocket.DefaultWebSocketSession;
import io.ktor.websocket.DefaultWebSocketSessionImpl;
import io.ktor.websocket.WebSocketExtension;
import io.ktor.websocket.WebSocketExtensionHeader;
import io.ktor.websocket.WebSocketSession;
import io.ktor.websocket.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.c;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Reflection;
import kotlin.text.g;
import org.slf4j.Logger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "<destruct>", "Lmk1;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponseContainer;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.websocket.WebSockets$Plugin$install$2", f = "WebSockets.kt", i = {}, l = {215}, m = "invokeSuspend", n = {}, s = {})
final class WebSockets$Plugin$install$2 extends SuspendLambda implements Function3<PipelineContext<HttpResponseContainer, HttpClientCall>, HttpResponseContainer, Continuation<? super mk1>, Object> {
    final /* synthetic */ boolean $extensionsSupported;
    final /* synthetic */ WebSockets $plugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSockets$Plugin$install$2(WebSockets webSockets, boolean z, Continuation<? super WebSockets$Plugin$install$2> continuation) {
        super(3, continuation);
        this.$plugin = webSockets;
        this.$extensionsSupported = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, Continuation<? super mk1> continuation) {
        WebSockets$Plugin$install$2 webSockets$Plugin$install$2 = new WebSockets$Plugin$install$2(this.$plugin, this.$extensionsSupported, continuation);
        webSockets$Plugin$install$2.L$0 = pipelineContext;
        webSockets$Plugin$install$2.L$1 = httpResponseContainer;
        return webSockets$Plugin$install$2.invokeSuspend(mk1.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v8, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3, types: [io.ktor.websocket.WebSocketExtension] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [io.ktor.client.plugins.websocket.DefaultClientWebSocketSession] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r9v17, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? delegatingClientWebSocketSession;
        DefaultWebSocketSession defaultWebSocketSession;
        ?? arrayList;
        ?? arrayList2;
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
        Object obj3 = pipelineContext.a;
        HttpResponse httpResponseD = ((HttpClientCall) obj3).d();
        HttpStatusCode c = httpResponseD.getC();
        OutgoingContent d = httpResponseD.getA().c().getD();
        if (d instanceof WebSocketContent) {
            HttpStatusCode.c.getClass();
            HttpStatusCode httpStatusCode = HttpStatusCode.d;
            if (!yg0.a(c, httpStatusCode)) {
                throw new WebSocketException("Handshake exception, expected status code " + httpStatusCode.a + " but was " + c.a);
            }
            if (!(obj2 instanceof WebSocketSession)) {
                throw new WebSocketException("Handshake exception, expected `WebSocketSession` content but was " + Reflection.a(obj2.getClass()));
            }
            Logger logger = rp1.b;
            if (j03.p(logger)) {
                logger.trace("Receive websocket session from " + ((HttpClientCall) obj3).c().getB() + ": " + obj2);
            }
            long j = this.$plugin.b;
            if (j != 2147483647L) {
                ((WebSocketSession) obj2).setMaxFrameSize(j);
            }
            if (yg0.a(typeInfo.a, Reflection.a(DefaultClientWebSocketSession.class))) {
                WebSockets webSockets = this.$plugin;
                WebSocketSession webSocketSession = (WebSocketSession) obj2;
                webSockets.getClass();
                boolean z = webSocketSession instanceof DefaultWebSocketSession;
                if (z) {
                    defaultWebSocketSession = (DefaultWebSocketSession) webSocketSession;
                } else {
                    long j2 = webSockets.a;
                    long j3 = 2 * j2;
                    Logger logger2 = a.a;
                    if (z) {
                        u7.r("Cannot wrap other DefaultWebSocketSession");
                        return null;
                    }
                    DefaultWebSocketSessionImpl defaultWebSocketSessionImpl = new DefaultWebSocketSessionImpl(webSocketSession, j2, j3);
                    defaultWebSocketSessionImpl.setMaxFrameSize(webSockets.b);
                    defaultWebSocketSession = defaultWebSocketSessionImpl;
                }
                HttpClientCall httpClientCall = (HttpClientCall) obj3;
                ?? defaultClientWebSocketSession = new DefaultClientWebSocketSession(httpClientCall, defaultWebSocketSession);
                if (this.$extensionsSupported) {
                    this.$plugin.getClass();
                    Headers d2 = httpClientCall.d().getD();
                    List list = le0.a;
                    String str = d2.get("Sec-WebSocket-Extensions");
                    if (str != null) {
                        int i2 = 6;
                        List listO = g.O(str, new String[]{","}, 6);
                        arrayList2 = new ArrayList(c.l(listO, 10));
                        Iterator it = listO.iterator();
                        while (it.hasNext()) {
                            List listO2 = g.O((String) it.next(), new String[]{";"}, i2);
                            String string = g.c0((String) c.r(listO2)).toString();
                            List listN = c.n(listO2);
                            ArrayList arrayList3 = new ArrayList(c.l(listN, 10));
                            Iterator it2 = listN.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(g.c0((String) it2.next()).toString());
                            }
                            arrayList2.add(new WebSocketExtensionHeader(string, arrayList3));
                            i2 = 6;
                        }
                    } else {
                        arrayList2 = EmptyList.INSTANCE;
                    }
                    List list2 = (List) httpClientCall.getAttributes().get(rp1.a);
                    arrayList = new ArrayList();
                    for (Object obj4 : list2) {
                        if (((WebSocketExtension) obj4).clientNegotiation(arrayList2)) {
                            arrayList.add(obj4);
                        }
                    }
                } else {
                    arrayList = EmptyList.INSTANCE;
                }
                defaultClientWebSocketSession.start(arrayList);
                delegatingClientWebSocketSession = defaultClientWebSocketSession;
            } else {
                delegatingClientWebSocketSession = new DelegatingClientWebSocketSession((HttpClientCall) obj3, (WebSocketSession) obj2);
            }
            HttpResponseContainer httpResponseContainer2 = new HttpResponseContainer(typeInfo, delegatingClientWebSocketSession);
            this.L$0 = null;
            this.label = 1;
            if (pipelineContext.e(httpResponseContainer2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            Logger logger3 = rp1.b;
            if (j03.p(logger3)) {
                logger3.trace("Skipping non-websocket response from " + ((HttpClientCall) obj3).c().getB() + ": " + d);
                return mk1Var;
            }
        }
        return mk1Var;
    }
}
