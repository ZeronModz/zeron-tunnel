package io.ktor.client.plugins.cache;

import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestData;
import io.ktor.http.Headers;
import io.ktor.http.HttpMethod;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.Attributes;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/cache/RequestForCache;", "Lio/ktor/client/request/HttpRequest;", "Lio/ktor/client/request/HttpRequestData;", Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "<init>", "(Lio/ktor/client/request/HttpRequestData;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class RequestForCache implements HttpRequest {
    public final HttpMethod a;
    public final Url b;
    public final Attributes c;
    public final OutgoingContent d;
    public final Headers e;

    public RequestForCache(HttpRequestData httpRequestData) {
        httpRequestData.getClass();
        this.a = httpRequestData.b;
        this.b = httpRequestData.a;
        this.c = httpRequestData.f;
        this.d = httpRequestData.d;
        this.e = httpRequestData.c;
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getAttributes, reason: from getter */
    public final Attributes getC() {
        return this.c;
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getCall */
    public final HttpClientCall getB() {
        throw new IllegalStateException("This request has no call");
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getContent, reason: from getter */
    public final OutgoingContent getD() {
        return this.d;
    }

    @Override // io.ktor.client.request.HttpRequest, kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getB() {
        getB();
        throw null;
    }

    @Override // io.ktor.http.HttpMessage
    /* JADX INFO: renamed from: getHeaders, reason: from getter */
    public final Headers getE() {
        return this.e;
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getMethod, reason: from getter */
    public final HttpMethod getA() {
        return this.a;
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getUrl, reason: from getter */
    public final Url getB() {
        return this.b;
    }
}
