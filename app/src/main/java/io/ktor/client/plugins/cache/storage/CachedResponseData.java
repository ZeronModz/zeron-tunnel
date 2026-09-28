package io.ktor.client.plugins.cache.storage;

import com.google.android.gms.ads.RequestConfiguration;
import io.ktor.http.Headers;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.Url;
import io.ktor.util.date.GMTDate;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/client/plugins/cache/storage/CachedResponseData;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/http/Url;", "url", "Lio/ktor/http/HttpStatusCode;", "statusCode", "Lio/ktor/util/date/GMTDate;", "requestTime", "responseTime", "Lio/ktor/http/HttpProtocolVersion;", "version", "expires", "Lio/ktor/http/Headers;", "headers", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "varyKeys", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "body", "<init>", "(Lio/ktor/http/Url;Lio/ktor/http/HttpStatusCode;Lio/ktor/util/date/GMTDate;Lio/ktor/util/date/GMTDate;Lio/ktor/http/HttpProtocolVersion;Lio/ktor/util/date/GMTDate;Lio/ktor/http/Headers;Ljava/util/Map;[B)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CachedResponseData {
    public final Url a;
    public final HttpStatusCode b;
    public final GMTDate c;
    public final GMTDate d;
    public final HttpProtocolVersion e;
    public final GMTDate f;
    public final Headers g;
    public final Map h;
    public final byte[] i;

    public CachedResponseData(Url url, HttpStatusCode httpStatusCode, GMTDate gMTDate, GMTDate gMTDate2, HttpProtocolVersion httpProtocolVersion, GMTDate gMTDate3, Headers headers, Map<String, String> map, byte[] bArr) {
        url.getClass();
        httpStatusCode.getClass();
        gMTDate.getClass();
        gMTDate2.getClass();
        httpProtocolVersion.getClass();
        gMTDate3.getClass();
        headers.getClass();
        map.getClass();
        bArr.getClass();
        this.a = url;
        this.b = httpStatusCode;
        this.c = gMTDate;
        this.d = gMTDate2;
        this.e = httpProtocolVersion;
        this.f = gMTDate3;
        this.g = headers;
        this.h = map;
        this.i = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedResponseData)) {
            return false;
        }
        CachedResponseData cachedResponseData = (CachedResponseData) obj;
        return this.a.equals(cachedResponseData.a) && this.h.equals(cachedResponseData.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + (this.a.g.hashCode() * 31);
    }
}
