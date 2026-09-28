package io.ktor.client.plugins.cache;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.qc0;
import io.ktor.client.call.SavedHttpCall;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HeadersImpl;
import io.ktor.util.date.GMTDate;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u0001B5\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/client/plugins/cache/HttpCacheEntry;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/util/date/GMTDate;", "expires", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "varyKeys", "Lio/ktor/client/statement/HttpResponse;", "response", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "body", "<init>", "(Lio/ktor/util/date/GMTDate;Ljava/util/Map;Lio/ktor/client/statement/HttpResponse;[B)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpCacheEntry {
    public final GMTDate a;
    public final Map b;
    public final HttpResponse c;
    public final byte[] d;
    public final HeadersImpl e;

    public HttpCacheEntry(GMTDate gMTDate, Map<String, String> map, HttpResponse httpResponse, byte[] bArr) {
        gMTDate.getClass();
        map.getClass();
        httpResponse.getClass();
        bArr.getClass();
        this.a = gMTDate;
        this.b = map;
        this.c = httpResponse;
        this.d = bArr;
        qc0 qc0Var = Headers.Companion;
        HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
        headersBuilder.appendAll(httpResponse.getE());
        this.e = headersBuilder.build();
    }

    public final HttpResponse a() {
        HttpResponse httpResponse = this.c;
        return new SavedHttpCall(httpResponse.getCall().a, httpResponse.getCall().c(), httpResponse, this.d).d();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof HttpCacheEntry)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return this.b.equals(((HttpCacheEntry) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
