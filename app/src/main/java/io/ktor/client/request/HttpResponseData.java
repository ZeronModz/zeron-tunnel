package io.ktor.client.request;

import com.google.android.gms.ads.RequestConfiguration;
import io.ktor.http.Headers;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.date.GMTDate;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/client/request/HttpResponseData;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/http/HttpStatusCode;", "statusCode", "Lio/ktor/util/date/GMTDate;", "requestTime", "Lio/ktor/http/Headers;", "headers", "Lio/ktor/http/HttpProtocolVersion;", "version", "body", "Lkotlin/coroutines/CoroutineContext;", "callContext", "<init>", "(Lio/ktor/http/HttpStatusCode;Lio/ktor/util/date/GMTDate;Lio/ktor/http/Headers;Lio/ktor/http/HttpProtocolVersion;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpResponseData {
    public final HttpStatusCode a;
    public final GMTDate b;
    public final Headers c;
    public final HttpProtocolVersion d;
    public final Object e;
    public final CoroutineContext f;
    public final GMTDate g;

    public HttpResponseData(HttpStatusCode httpStatusCode, GMTDate gMTDate, Headers headers, HttpProtocolVersion httpProtocolVersion, Object obj, CoroutineContext coroutineContext) {
        httpStatusCode.getClass();
        gMTDate.getClass();
        headers.getClass();
        httpProtocolVersion.getClass();
        obj.getClass();
        coroutineContext.getClass();
        this.a = httpStatusCode;
        this.b = gMTDate;
        this.c = headers;
        this.d = httpProtocolVersion;
        this.e = obj;
        this.f = coroutineContext;
        this.g = io.ktor.util.date.a.b(null);
    }

    public final String toString() {
        return "HttpResponseData=(statusCode=" + this.a + ')';
    }
}
