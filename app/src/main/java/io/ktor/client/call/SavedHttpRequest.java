package io.ktor.client.call;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/client/call/SavedHttpRequest;", "Lio/ktor/client/request/HttpRequest;", "Lio/ktor/client/call/SavedHttpCall;", "call", "origin", "<init>", "(Lio/ktor/client/call/SavedHttpCall;Lio/ktor/client/request/HttpRequest;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedHttpRequest implements HttpRequest {
    public final /* synthetic */ HttpRequest a;
    public final SavedHttpCall b;

    public SavedHttpRequest(SavedHttpCall savedHttpCall, HttpRequest httpRequest) {
        savedHttpCall.getClass();
        httpRequest.getClass();
        this.a = httpRequest;
        this.b = savedHttpCall;
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getAttributes */
    public final Attributes getC() {
        return this.a.getC();
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getCall */
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
    public final CoroutineContext getH() {
        return this.a.getH();
    }

    @Override // io.ktor.http.HttpMessage
    /* JADX INFO: renamed from: getHeaders */
    public final Headers getG() {
        return this.a.getG();
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getMethod */
    public final HttpMethod getA() {
        return this.a.getA();
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getUrl */
    public final Url getB() {
        return this.a.getB();
    }
}
