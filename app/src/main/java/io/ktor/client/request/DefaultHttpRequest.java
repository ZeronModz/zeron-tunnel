package io.ktor.client.request;

import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import io.ktor.client.call.HttpClientCall;
import io.ktor.http.Headers;
import io.ktor.http.HttpMethod;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.Attributes;
import io.ktor.utils.io.InternalAPI;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/client/request/DefaultHttpRequest;", "Lio/ktor/client/request/HttpRequest;", "Lio/ktor/client/call/HttpClientCall;", "call", "Lio/ktor/client/request/HttpRequestData;", Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "<init>", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/client/request/HttpRequestData;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DefaultHttpRequest implements HttpRequest {
    public final HttpClientCall a;
    public final HttpMethod b;
    public final Url c;
    public final OutgoingContent d;
    public final Headers e;
    public final Attributes f;

    public DefaultHttpRequest(HttpClientCall httpClientCall, HttpRequestData httpRequestData) {
        httpClientCall.getClass();
        httpRequestData.getClass();
        this.a = httpClientCall;
        this.b = httpRequestData.b;
        this.c = httpRequestData.a;
        this.d = httpRequestData.d;
        this.e = httpRequestData.c;
        this.f = httpRequestData.f;
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getAttributes, reason: from getter */
    public final Attributes getC() {
        return this.f;
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getCall, reason: from getter */
    public final HttpClientCall getB() {
        return this.a;
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getContent, reason: from getter */
    public final OutgoingContent getD() {
        return this.d;
    }

    @Override // io.ktor.client.request.HttpRequest, kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getH() {
        return this.a.getH();
    }

    @Override // io.ktor.http.HttpMessage
    /* JADX INFO: renamed from: getHeaders, reason: from getter */
    public final Headers getG() {
        return this.e;
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getMethod, reason: from getter */
    public final HttpMethod getA() {
        return this.b;
    }

    @Override // io.ktor.client.request.HttpRequest
    /* JADX INFO: renamed from: getUrl, reason: from getter */
    public final Url getB() {
        return this.c;
    }
}
