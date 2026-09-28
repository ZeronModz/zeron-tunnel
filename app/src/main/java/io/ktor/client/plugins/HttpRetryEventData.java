package io.ktor.client.plugins;

import com.google.android.gms.ads.RequestConfiguration;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/client/plugins/HttpRetryEventData;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/client/request/HttpRequestBuilder;", "request", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "retryCount", "Lio/ktor/client/statement/HttpResponse;", "response", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "cause", "<init>", "(Lio/ktor/client/request/HttpRequestBuilder;ILio/ktor/client/statement/HttpResponse;Ljava/lang/Throwable;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpRetryEventData {
    public final HttpRequestBuilder a;
    public final int b;
    public final HttpResponse c;
    public final Throwable d;

    public HttpRetryEventData(HttpRequestBuilder httpRequestBuilder, int i, HttpResponse httpResponse, Throwable th) {
        httpRequestBuilder.getClass();
        this.a = httpRequestBuilder;
        this.b = i;
        this.c = httpResponse;
        this.d = th;
    }
}
