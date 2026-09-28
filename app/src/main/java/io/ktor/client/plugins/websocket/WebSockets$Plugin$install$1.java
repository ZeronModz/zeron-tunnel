package io.ktor.client.plugins.websocket;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.j03;
import defpackage.le0;
import defpackage.mk1;
import defpackage.op1;
import defpackage.qj1;
import defpackage.rp1;
import defpackage.u7;
import io.ktor.client.plugins.websocket.WebSockets;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.URLProtocol;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.websocket.WebSocketExtension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.c;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import org.slf4j.Logger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/client/request/HttpRequestBuilder;", "it", "Lmk1;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.websocket.WebSockets$Plugin$install$1", f = "WebSockets.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
final class WebSockets$Plugin$install$1 extends SuspendLambda implements Function3<PipelineContext<Object, HttpRequestBuilder>, Object, Continuation<? super mk1>, Object> {
    final /* synthetic */ boolean $extensionsSupported;
    final /* synthetic */ WebSockets $plugin;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSockets$Plugin$install$1(boolean z, WebSockets webSockets, Continuation<? super WebSockets$Plugin$install$1> continuation) {
        super(3, continuation);
        this.$extensionsSupported = z;
        this.$plugin = webSockets;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, Continuation<? super mk1> continuation) {
        WebSockets$Plugin$install$1 webSockets$Plugin$install$1 = new WebSockets$Plugin$install$1(this.$extensionsSupported, this.$plugin, continuation);
        webSockets$Plugin$install$1.L$0 = pipelineContext;
        return webSockets$Plugin$install$1.invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
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
        Object obj2 = pipelineContext.a;
        URLProtocol uRLProtocolC = ((HttpRequestBuilder) obj2).a.c();
        uRLProtocolC.getClass();
        String str = uRLProtocolC.a;
        if (str.equals("ws") || str.equals("wss")) {
            Logger logger = rp1.b;
            if (j03.p(logger)) {
                logger.trace("Sending WebSocket request " + ((HttpRequestBuilder) obj2).a);
            }
            HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) obj2;
            httpRequestBuilder.c(op1.a, mk1Var);
            if (this.$extensionsSupported) {
                WebSockets webSockets = this.$plugin;
                WebSockets.Plugin plugin = WebSockets.e;
                ArrayList arrayList = webSockets.c.a;
                ArrayList arrayList2 = new ArrayList(c.l(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((WebSocketExtension) ((Function0) it.next()).invoke());
                }
                httpRequestBuilder.f.put(rp1.a, arrayList2);
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    c.i(arrayList3, ((WebSocketExtension) it2.next()).getProtocols());
                }
                if (!arrayList3.isEmpty()) {
                    String strW = c.w(arrayList3, ";", null, null, null, 62);
                    List list = le0.a;
                    qj1.u(httpRequestBuilder, "Sec-WebSocket-Extensions", strW);
                }
            }
            WebSocketContent webSocketContent = new WebSocketContent();
            this.label = 1;
            if (pipelineContext.e(webSocketContent, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            Logger logger2 = rp1.b;
            if (j03.p(logger2)) {
                logger2.trace("Skipping WebSocket plugin for non-websocket request: " + ((HttpRequestBuilder) obj2).a);
                return mk1Var;
            }
        }
        return mk1Var;
    }
}
