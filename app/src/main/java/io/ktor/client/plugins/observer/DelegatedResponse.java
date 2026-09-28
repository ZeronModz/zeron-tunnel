package io.ktor.client.plugins.observer;

import defpackage.fw;
import defpackage.xu;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/client/plugins/observer/DelegatedResponse;", "Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/client/call/HttpClientCall;", "call", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "block", "origin", "Lio/ktor/http/Headers;", "headers", "<init>", "(Lio/ktor/client/call/HttpClientCall;Lkotlin/jvm/functions/Function0;Lio/ktor/client/statement/HttpResponse;Lio/ktor/http/Headers;)V", "content", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/client/statement/HttpResponse;Lio/ktor/http/Headers;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DelegatedResponse extends HttpResponse {
    public final HttpClientCall a;
    public final Function0 b;
    public final HttpResponse c;
    public final Headers d;
    public final CoroutineContext e;

    public DelegatedResponse(HttpClientCall httpClientCall, Function0<? extends ByteReadChannel> function0, HttpResponse httpResponse, Headers headers) {
        httpClientCall.getClass();
        function0.getClass();
        httpResponse.getClass();
        headers.getClass();
        this.a = httpClientCall;
        this.b = function0;
        this.c = httpResponse;
        this.d = headers;
        this.e = httpResponse.getE();
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: a */
    public final ByteReadChannel getG() {
        return (ByteReadChannel) this.b.invoke();
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: b */
    public final GMTDate getE() {
        return this.c.getE();
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: c */
    public final GMTDate getF() {
        return this.c.getF();
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: d */
    public final HttpStatusCode getC() {
        return this.c.getC();
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: e */
    public final HttpProtocolVersion getD() {
        return this.c.getD();
    }

    @Override // io.ktor.client.statement.HttpResponse
    /* JADX INFO: renamed from: getCall, reason: from getter */
    public final HttpClientCall getA() {
        return this.a;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getE() {
        return this.e;
    }

    @Override // io.ktor.http.HttpMessage
    /* JADX INFO: renamed from: getHeaders, reason: from getter */
    public final Headers getD() {
        return this.d;
    }

    public /* synthetic */ DelegatedResponse(HttpClientCall httpClientCall, Function0 function0, HttpResponse httpResponse, Headers headers, int i, xu xuVar) {
        this(httpClientCall, (Function0<? extends ByteReadChannel>) function0, httpResponse, (i & 8) != 0 ? httpResponse.getD() : headers);
    }

    public /* synthetic */ DelegatedResponse(HttpClientCall httpClientCall, ByteReadChannel byteReadChannel, HttpResponse httpResponse, Headers headers, int i, xu xuVar) {
        this(httpClientCall, byteReadChannel, httpResponse, (i & 8) != 0 ? httpResponse.getD() : headers);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DelegatedResponse(HttpClientCall httpClientCall, ByteReadChannel byteReadChannel, HttpResponse httpResponse, Headers headers) {
        this(httpClientCall, new fw(byteReadChannel, 1), httpResponse, headers);
        httpClientCall.getClass();
        byteReadChannel.getClass();
        httpResponse.getClass();
        headers.getClass();
    }
}
