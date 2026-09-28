package io.ktor.client.plugins;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ge0;
import defpackage.pe0;
import defpackage.vh;
import defpackage.xu;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestData;
import io.ktor.http.URLBuilder;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.CopyableThrowable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/client/plugins/HttpRequestTimeoutException;", "Ljava/io/IOException;", "Lkotlinx/io/IOException;", "Lkotlinx/coroutines/CopyableThrowable;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "url", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "timeoutMillis", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Throwable;)V", "Lio/ktor/client/request/HttpRequestBuilder;", "request", "(Lio/ktor/client/request/HttpRequestBuilder;)V", "Lio/ktor/client/request/HttpRequestData;", "(Lio/ktor/client/request/HttpRequestData;)V", "createCopy", "()Lio/ktor/client/plugins/HttpRequestTimeoutException;", "Ljava/lang/String;", "Ljava/lang/Long;", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpRequestTimeoutException extends IOException implements CopyableThrowable<HttpRequestTimeoutException> {
    private final Long timeoutMillis;
    private final String url;

    public HttpRequestTimeoutException(HttpRequestBuilder httpRequestBuilder) {
        httpRequestBuilder.getClass();
        URLBuilder uRLBuilder = httpRequestBuilder.a;
        uRLBuilder.a();
        StringBuilder sb = new StringBuilder(256);
        io.ktor.http.e.a(uRLBuilder, sb);
        String string = sb.toString();
        Map map = (Map) httpRequestBuilder.f.getOrNull(ge0.a);
        HttpTimeoutConfig httpTimeoutConfig = (HttpTimeoutConfig) (map != null ? map.get(pe0.a) : null);
        this(string, httpTimeoutConfig != null ? httpTimeoutConfig.a : null, null, 4, null);
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    public HttpRequestTimeoutException createCopy() {
        return new HttpRequestTimeoutException(this.url, this.timeoutMillis, getCause());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpRequestTimeoutException(HttpRequestData httpRequestData) {
        httpRequestData.getClass();
        String str = httpRequestData.a.g;
        HttpTimeoutConfig httpTimeoutConfig = (HttpTimeoutConfig) httpRequestData.a();
        this(str, httpTimeoutConfig != null ? httpTimeoutConfig.a : null, null, 4, null);
    }

    public /* synthetic */ HttpRequestTimeoutException(String str, Long l, Throwable th, int i, xu xuVar) {
        this(str, l, (i & 4) != 0 ? null : th);
    }

    public HttpRequestTimeoutException(String str, Long l, Throwable th) {
        str.getClass();
        StringBuilder sb = new StringBuilder("Request timeout has expired [url=");
        sb.append(str);
        sb.append(", request_timeout=");
        super(vh.k(l == null ? "unknown" : l, " ms]", sb), th);
        this.url = str;
        this.timeoutMillis = l;
    }
}
