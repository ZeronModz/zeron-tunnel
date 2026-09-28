package io.ktor.client.statement;

import defpackage.qg;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpResponseData;
import io.ktor.http.Headers;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.InternalAPI;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/client/statement/DefaultHttpResponse;", "Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/client/call/HttpClientCall;", "call", "Lio/ktor/client/request/HttpResponseData;", "responseData", "<init>", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/client/request/HttpResponseData;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultHttpResponse extends HttpResponse {
    public final HttpClientCall a;
    public final CoroutineContext b;
    public final HttpStatusCode c;
    public final HttpProtocolVersion d;
    public final GMTDate e;
    public final GMTDate f;
    public final ByteReadChannel g;
    public final Headers h;

    public DefaultHttpResponse(HttpClientCall httpClientCall, HttpResponseData httpResponseData) {
        httpClientCall.getClass();
        httpResponseData.getClass();
        this.a = httpClientCall;
        this.b = httpResponseData.f;
        this.c = httpResponseData.a;
        this.d = httpResponseData.d;
        this.e = httpResponseData.b;
        this.f = httpResponseData.g;
        Object obj = httpResponseData.e;
        ByteReadChannel byteReadChannel = obj instanceof ByteReadChannel ? (ByteReadChannel) obj : null;
        if (byteReadChannel == null) {
            ByteReadChannel.Companion.getClass();
            byteReadChannel = qg.b;
        }
        this.g = byteReadChannel;
        this.h = httpResponseData.c;
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ByteReadChannel getG() {
        return this.g;
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: b, reason: from getter */
    public final GMTDate getE() {
        return this.e;
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: c, reason: from getter */
    public final GMTDate getF() {
        return this.f;
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: d, reason: from getter */
    public final HttpStatusCode getC() {
        return this.c;
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: e, reason: from getter */
    public final HttpProtocolVersion getD() {
        return this.d;
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: getCall, reason: from getter */
    public final HttpClientCall getA() {
        return this.a;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getE() {
        return this.b;
    }

    @Override // io.ktor.http.HttpMessage
    /* JADX INFO: renamed from: getHeaders, reason: from getter */
    public final Headers getD() {
        return this.h;
    }
}
