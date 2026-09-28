package io.ktor.client.engine.okhttp;

import defpackage.vh;
import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.plugins.HttpTimeoutConfig;
import io.ktor.client.plugins.n;
import io.ktor.client.request.HttpRequestData;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.text.g;
import kotlinx.coroutines.CancellableContinuation;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.slf4j.Logger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttpCallback;", "Lokhttp3/Callback;", "Lio/ktor/client/request/HttpRequestData;", "requestData", "Lkotlinx/coroutines/CancellableContinuation;", "Lokhttp3/Response;", "continuation", "<init>", "(Lio/ktor/client/request/HttpRequestData;Lkotlinx/coroutines/CancellableContinuation;)V", "ktor-client-okhttp"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class OkHttpCallback implements Callback {
    public final HttpRequestData a;
    public final CancellableContinuation b;

    public OkHttpCallback(HttpRequestData httpRequestData, CancellableContinuation<? super Response> cancellableContinuation) {
        httpRequestData.getClass();
        cancellableContinuation.getClass();
        this.a = httpRequestData;
        this.b = cancellableContinuation;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        Object obj;
        call.getClass();
        iOException.getClass();
        CancellableContinuation cancellableContinuation = this.b;
        if (cancellableContinuation.isCancelled()) {
            return;
        }
        Result.Companion companion = Result.INSTANCE;
        if (iOException instanceof StreamAdapterIOException) {
            Throwable cause = iOException.getCause();
            if (cause != null) {
                iOException = cause;
            }
        } else if (iOException instanceof SocketTimeoutException) {
            String message = iOException.getMessage();
            HttpRequestData httpRequestData = this.a;
            if (message == null || !g.o(message, "connect", true)) {
                iOException = n.a(httpRequestData, iOException);
            } else {
                Logger logger = n.a;
                StringBuilder sb = new StringBuilder("Connect timeout has expired [url=");
                sb.append(httpRequestData.a);
                sb.append(", connect_timeout=");
                HttpTimeoutConfig httpTimeoutConfig = (HttpTimeoutConfig) httpRequestData.a();
                if (httpTimeoutConfig == null || (obj = httpTimeoutConfig.b) == null) {
                    obj = "unknown";
                }
                iOException = new ConnectTimeoutException(vh.k(obj, " ms]", sb), iOException);
            }
        }
        cancellableContinuation.resumeWith(Result.m36constructorimpl(new Result.Failure(iOException)));
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        call.getClass();
        response.getClass();
        if (call.getP()) {
            return;
        }
        this.b.resumeWith(Result.m36constructorimpl(response));
    }
}
