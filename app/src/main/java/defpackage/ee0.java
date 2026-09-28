package defpackage;

import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.Headers;
import io.ktor.http.HeadersImpl;
import io.ktor.http.HttpMethod;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.Attributes;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ee0 implements HttpRequest {
    public final HttpMethod a;
    public final Url b;
    public final Attributes c;
    public final HeadersImpl d;
    public final /* synthetic */ HttpRequestBuilder e;

    public ee0(HttpRequestBuilder httpRequestBuilder) {
        this.e = httpRequestBuilder;
        this.a = httpRequestBuilder.b;
        this.b = httpRequestBuilder.a.b();
        this.c = httpRequestBuilder.f;
        this.d = httpRequestBuilder.c.build();
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getAttributes */
    public final Attributes getC() {
        return this.c;
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getCall */
    public final HttpClientCall getB() {
        throw new IllegalStateException("Call is not initialized");
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getContent */
    public final OutgoingContent getD() {
        HttpRequestBuilder httpRequestBuilder = this.e;
        Object obj = httpRequestBuilder.d;
        OutgoingContent outgoingContent = obj instanceof OutgoingContent ? (OutgoingContent) obj : null;
        if (outgoingContent != null) {
            return outgoingContent;
        }
        throw new IllegalStateException(("Content was not transformed to OutgoingContent yet. Current body is " + httpRequestBuilder.d).toString());
    }

    @Override // io.ktor.client.request.HttpRequest, kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getB() {
        getB();
        throw null;
    }

    @Override // io.ktor.http.HttpMessage
    /* JADX INFO: renamed from: getHeaders */
    public final Headers getG() {
        return this.d;
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getMethod */
    public final HttpMethod getA() {
        return this.a;
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getUrl */
    public final Url getB() {
        return this.b;
    }
}
