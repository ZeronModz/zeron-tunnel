package io.ktor.client.plugins.observer;

import defpackage.fw;
import defpackage.xu;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.http.Headers;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/client/plugins/observer/DelegatedCall;", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/HttpClient;", "client", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "block", "originCall", "Lio/ktor/http/Headers;", "responseHeaders", "<init>", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function0;Lio/ktor/client/call/HttpClientCall;Lio/ktor/http/Headers;)V", "content", "(Lio/ktor/client/HttpClient;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/client/call/HttpClientCall;Lio/ktor/http/Headers;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DelegatedCall extends HttpClientCall {
    public static final /* synthetic */ int g = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelegatedCall(HttpClient httpClient, Function0<? extends ByteReadChannel> function0, HttpClientCall httpClientCall, Headers headers) {
        super(httpClient);
        httpClient.getClass();
        function0.getClass();
        httpClientCall.getClass();
        headers.getClass();
        this.b = new DelegatedRequest(this, httpClientCall.c());
        this.c = new DelegatedResponse(this, function0, httpClientCall.d(), headers);
    }

    public /* synthetic */ DelegatedCall(HttpClient httpClient, Function0 function0, HttpClientCall httpClientCall, Headers headers, int i, xu xuVar) {
        this(httpClient, (Function0<? extends ByteReadChannel>) function0, httpClientCall, (i & 8) != 0 ? httpClientCall.d().getD() : headers);
    }

    public /* synthetic */ DelegatedCall(HttpClient httpClient, ByteReadChannel byteReadChannel, HttpClientCall httpClientCall, Headers headers, int i, xu xuVar) {
        this(httpClient, byteReadChannel, httpClientCall, (i & 8) != 0 ? httpClientCall.d().getD() : headers);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DelegatedCall(HttpClient httpClient, ByteReadChannel byteReadChannel, HttpClientCall httpClientCall, Headers headers) {
        this(httpClient, new fw(byteReadChannel, 0), httpClientCall, headers);
        httpClient.getClass();
        byteReadChannel.getClass();
        httpClientCall.getClass();
        headers.getClass();
    }
}
