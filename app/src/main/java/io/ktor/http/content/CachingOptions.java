package io.ktor.http.content;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import defpackage.yg0;
import io.ktor.http.CacheControl;
import io.ktor.util.date.GMTDate;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/http/content/CachingOptions;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/http/CacheControl;", "cacheControl", "Lio/ktor/util/date/GMTDate;", "expires", "<init>", "(Lio/ktor/http/CacheControl;Lio/ktor/util/date/GMTDate;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CachingOptions {
    public final CacheControl a;
    public final GMTDate b;

    public /* synthetic */ CachingOptions(CacheControl cacheControl, GMTDate gMTDate, int i, xu xuVar) {
        this((i & 1) != 0 ? null : cacheControl, (i & 2) != 0 ? null : gMTDate);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachingOptions)) {
            return false;
        }
        CachingOptions cachingOptions = (CachingOptions) obj;
        return yg0.a(this.a, cachingOptions.a) && yg0.a(this.b, cachingOptions.b);
    }

    public final int hashCode() {
        CacheControl cacheControl = this.a;
        int iHashCode = (cacheControl == null ? 0 : cacheControl.hashCode()) * 31;
        GMTDate gMTDate = this.b;
        return iHashCode + (gMTDate != null ? gMTDate.hashCode() : 0);
    }

    public final String toString() {
        return "CachingOptions(cacheControl=" + this.a + ", expires=" + this.b + ')';
    }

    public CachingOptions(CacheControl cacheControl, GMTDate gMTDate) {
        this.a = cacheControl;
        this.b = gMTDate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CachingOptions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
