package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lio/ktor/http/HttpProtocolVersion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "name", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "major", "minor", "<init>", "(Ljava/lang/String;II)V", "Companion", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HttpProtocolVersion {
    public static final Companion d = new Companion(null);
    public static final HttpProtocolVersion e = new HttpProtocolVersion("HTTP", 2, 0);
    public static final HttpProtocolVersion f = new HttpProtocolVersion("HTTP", 1, 1);
    public static final HttpProtocolVersion g = new HttpProtocolVersion("HTTP", 1, 0);
    public static final HttpProtocolVersion h = new HttpProtocolVersion("SPDY", 3, 0);
    public static final HttpProtocolVersion i = new HttpProtocolVersion("QUIC", 1, 0);
    public final String a;
    public final int b;
    public final int c;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/HttpProtocolVersion$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    public HttpProtocolVersion(String str, int i2, int i3) {
        str.getClass();
        this.a = str;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpProtocolVersion)) {
            return false;
        }
        HttpProtocolVersion httpProtocolVersion = (HttpProtocolVersion) obj;
        return this.a.equals(httpProtocolVersion.a) && this.b == httpProtocolVersion.b && this.c == httpProtocolVersion.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return this.a + '/' + this.b + '.' + this.c;
    }
}
