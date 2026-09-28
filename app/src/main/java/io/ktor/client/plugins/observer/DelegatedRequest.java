package io.ktor.client.plugins.observer;

import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequest;
import io.ktor.http.Headers;
import io.ktor.http.HttpMethod;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.Attributes;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/client/plugins/observer/DelegatedRequest;", "Lio/ktor/client/request/HttpRequest;", "Lio/ktor/client/call/HttpClientCall;", "call", "origin", "<init>", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/client/request/HttpRequest;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DelegatedRequest implements HttpRequest {
    public final /* synthetic */ HttpRequest a;
    public final HttpClientCall b;

    public DelegatedRequest(HttpClientCall httpClientCall, HttpRequest httpRequest) {
        httpClientCall.getClass();
        httpRequest.getClass();
        this.a = httpRequest;
        this.b = httpClientCall;
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getAttributes */
    public final Attributes getF() {
        return this.a.getF();
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getCall, reason: from getter */
    public final HttpClientCall getB() {
        return this.b;
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getContent */
    public final OutgoingContent getD() {
        return this.a.getD();
    }

    @Override // io.ktor.client.request.HttpRequest, kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getG() {
        return this.a.getG();
    }

    @Override // io.ktor.http.HttpMessage
    /* JADX INFO: renamed from: getHeaders */
    public final Headers getH() {
        return this.a.getH();
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getMethod */
    public final HttpMethod getB() {
        return this.a.getB();
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getUrl */
    public final Url getC() {
        return this.a.getC();
    }
}
