package io.ktor.client.plugins.websocket;

import io.ktor.client.call.HttpClientCall;
import io.ktor.websocket.Frame;
import io.ktor.websocket.WebSocketSession;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/client/plugins/websocket/DelegatingClientWebSocketSession;", "Lio/ktor/client/plugins/websocket/ClientWebSocketSession;", "Lio/ktor/websocket/WebSocketSession;", "Lio/ktor/client/call/HttpClientCall;", "call", "session", "<init>", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/websocket/WebSocketSession;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DelegatingClientWebSocketSession implements ClientWebSocketSession, WebSocketSession {
    public final /* synthetic */ WebSocketSession a;
    public final HttpClientCall b;

    public DelegatingClientWebSocketSession(HttpClientCall httpClientCall, WebSocketSession webSocketSession) {
        httpClientCall.getClass();
        webSocketSession.getClass();
        this.a = webSocketSession;
        this.b = httpClientCall;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final Object flush(Continuation continuation) {
        return this.a.flush(continuation);
    }

    @Override // io.ktor.client.plugins.websocket.ClientWebSocketSession
    /* JADX INFO: renamed from: getCall, reason: from getter */
    public final HttpClientCall getB() {
        return this.b;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getH() {
        return this.a.getH();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final List getExtensions() {
        return this.a.getExtensions();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final ReceiveChannel getIncoming() {
        return this.a.getIncoming();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final boolean getMasking() {
        return this.a.getMasking();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final long getMaxFrameSize() {
        return this.a.getMaxFrameSize();
    }

    @Override // io.ktor.websocket.WebSocketSession
    /* JADX INFO: renamed from: getOutgoing */
    public final SendChannel getH() {
        return this.a.getH();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final Object send(Frame frame, Continuation continuation) {
        return this.a.send(frame, continuation);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void setMasking(boolean z) {
        this.a.setMasking(z);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void setMaxFrameSize(long j) {
        this.a.setMaxFrameSize(j);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void terminate() {
        this.a.terminate();
    }
}
