package io.ktor.client.engine.okhttp;

import defpackage.kf2;
import defpackage.mk1;
import defpackage.u7;
import defpackage.xm;
import io.ktor.client.plugins.websocket.WebSocketException;
import io.ktor.http.HttpStatusCode;
import io.ktor.websocket.CloseReason;
import io.ktor.websocket.DefaultWebSocketSession;
import io.ktor.websocket.Frame;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.g;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.ws.RealWebSocket;
import okio.ByteString;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttpWebsocketSession;", "Lio/ktor/websocket/DefaultWebSocketSession;", "Lokhttp3/WebSocketListener;", "Lokhttp3/OkHttpClient;", "engine", "Lokhttp3/WebSocket$Factory;", "webSocketFactory", "Lokhttp3/Request;", "engineRequest", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/WebSocket$Factory;Lokhttp3/Request;Lkotlin/coroutines/CoroutineContext;)V", "ktor-client-okhttp"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OkHttpWebsocketSession extends WebSocketListener implements DefaultWebSocketSession {
    public final OkHttpClient a;
    public final WebSocket.Factory b;
    public final CoroutineContext c;
    public final CompletableDeferred d;
    public final CompletableDeferred e;
    public final BufferedChannel f;
    public final CompletableDeferred g;
    public final SendChannel h;

    public OkHttpWebsocketSession(OkHttpClient okHttpClient, WebSocket.Factory factory, Request request, CoroutineContext coroutineContext) {
        okHttpClient.getClass();
        factory.getClass();
        request.getClass();
        coroutineContext.getClass();
        this.a = okHttpClient;
        this.b = factory;
        this.c = coroutineContext;
        this.d = kotlinx.coroutines.a.a();
        this.e = kotlinx.coroutines.a.a();
        this.f = kf2.a(0, 7, null);
        this.g = kotlinx.coroutines.a.a();
        this.h = kotlinx.coroutines.channels.a.a(this, new OkHttpWebsocketSession$outgoing$1(this, request, null));
    }

    @Override // okhttp3.WebSocketListener
    public final void a(RealWebSocket realWebSocket, int i, String str) {
        Object objValueOf;
        realWebSocket.getClass();
        short s = (short) i;
        this.g.complete(new CloseReason(s, str));
        this.f.close(null);
        StringBuilder sb = new StringBuilder("WebSocket session closed with code ");
        CloseReason.Codes.INSTANCE.getClass();
        CloseReason.Codes codes = (CloseReason.Codes) CloseReason.Codes.byCodeMap.get(Short.valueOf(s));
        if (codes == null || (objValueOf = codes.toString()) == null) {
            objValueOf = Integer.valueOf(i);
        }
        sb.append(objValueOf);
        sb.append('.');
        this.h.close(new CancellationException(sb.toString()));
    }

    @Override // okhttp3.WebSocketListener
    public final void b(RealWebSocket realWebSocket, int i, String str) {
        short s = (short) i;
        this.g.complete(new CloseReason(s, str));
        try {
            kotlinx.coroutines.channels.a.g(this.h, new Frame.Close(new CloseReason(s, str)));
        } catch (Throwable unused) {
        }
        this.f.close(null);
    }

    @Override // okhttp3.WebSocketListener
    public final void c(RealWebSocket realWebSocket, Throwable th, Response response) {
        Integer numValueOf = response != null ? Integer.valueOf(response.d) : null;
        HttpStatusCode.c.getClass();
        int i = HttpStatusCode.l.a;
        SendChannel sendChannel = this.h;
        BufferedChannel bufferedChannel = this.f;
        CompletableDeferred completableDeferred = this.e;
        if (numValueOf != null && numValueOf.intValue() == i) {
            completableDeferred.complete(response);
            bufferedChannel.close(null);
            sendChannel.close(null);
        } else {
            completableDeferred.completeExceptionally(th);
            this.g.completeExceptionally(th);
            bufferedChannel.close(th);
            sendChannel.close(th);
        }
    }

    @Override // okhttp3.WebSocketListener
    public final void d(RealWebSocket realWebSocket, String str) {
        byte[] bytes = str.getBytes(xm.a);
        bytes.getClass();
        kotlinx.coroutines.channels.a.g(this.f, new Frame.Text(true, bytes));
    }

    @Override // okhttp3.WebSocketListener
    public final void e(RealWebSocket realWebSocket, ByteString byteString) {
        kotlinx.coroutines.channels.a.g(this.f, new Frame.Binary(true, byteString.toByteArray()));
    }

    @Override // okhttp3.WebSocketListener
    public final void f(WebSocket webSocket, Response response) {
        this.e.complete(response);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final Object flush(Continuation continuation) {
        return mk1.a;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    /* JADX INFO: renamed from: getCloseReason */
    public final Deferred getJ() {
        return this.g;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getI() {
        return this.c;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final List getExtensions() {
        return EmptyList.INSTANCE;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final ReceiveChannel getIncoming() {
        return this.f;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final boolean getMasking() {
        return true;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final long getMaxFrameSize() {
        return Long.MAX_VALUE;
    }

    @Override // io.ktor.websocket.WebSocketSession
    /* JADX INFO: renamed from: getOutgoing, reason: from getter */
    public final SendChannel getH() {
        return this.h;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    /* JADX INFO: renamed from: getPingIntervalMillis */
    public final long getH() {
        this.a.getClass();
        return 0L;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    /* JADX INFO: renamed from: getTimeoutMillis */
    public final long getI() {
        return this.a.w;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final Object send(Frame frame, Continuation continuation) {
        Object objSend = getH().send(frame, continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        mk1 mk1Var = mk1.a;
        if (objSend != coroutineSingletons) {
            objSend = mk1Var;
        }
        return objSend == coroutineSingletons ? objSend : mk1Var;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void setMasking(boolean z) {
        throw new WebSocketException("Masking switch is not supported in OkHttp engine.");
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void setMaxFrameSize(long j) {
        throw new WebSocketException("Max frame size switch is not supported in OkHttp engine.");
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public final void setPingIntervalMillis(long j) {
        throw new WebSocketException("OkHttp doesn't support dynamic ping interval. You could switch it in the engine configuration.");
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public final void setTimeoutMillis(long j) {
        throw new WebSocketException("Websocket timeout should be configured in OkHttp engine.");
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public final void start(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        u7.r("Extensions are not supported.");
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void terminate() {
        g.b(this.c);
    }
}
