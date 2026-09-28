package io.ktor.client.plugins.sse;

import io.ktor.client.call.HttpClientCall;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/client/plugins/sse/ClientSSESession;", "Lio/ktor/client/plugins/sse/SSESession;", "Lio/ktor/client/call/HttpClientCall;", "call", "delegate", "<init>", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/client/plugins/sse/SSESession;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClientSSESession implements SSESession {
    public final /* synthetic */ SSESession a;
    public final HttpClientCall b;

    public ClientSSESession(HttpClientCall httpClientCall, SSESession sSESession) {
        httpClientCall.getClass();
        sSESession.getClass();
        this.a = sSESession;
        this.b = httpClientCall;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getB() {
        return this.a.getB();
    }

    @Override // io.ktor.client.plugins.sse.SSESession
    /* JADX INFO: renamed from: getIncoming */
    public final Flow getF() {
        return this.a.getF();
    }
}
