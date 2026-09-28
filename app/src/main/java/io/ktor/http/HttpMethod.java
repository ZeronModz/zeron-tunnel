package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.vh;
import defpackage.xu;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lio/ktor/http/HttpMethod;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "value", "<init>", "(Ljava/lang/String;)V", "Companion", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HttpMethod {
    public static final Companion b = new Companion(null);
    public static final HttpMethod c;
    public static final HttpMethod d;
    public static final HttpMethod e;
    public static final List f;
    public final String a;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/HttpMethod$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        HttpMethod httpMethod = new HttpMethod("GET");
        c = httpMethod;
        HttpMethod httpMethod2 = new HttpMethod("POST");
        d = httpMethod2;
        HttpMethod httpMethod3 = new HttpMethod("PUT");
        HttpMethod httpMethod4 = new HttpMethod("PATCH");
        HttpMethod httpMethod5 = new HttpMethod("DELETE");
        HttpMethod httpMethod6 = new HttpMethod("HEAD");
        e = httpMethod6;
        f = kotlin.collections.c.A(httpMethod, httpMethod2, httpMethod3, httpMethod4, httpMethod5, httpMethod6, new HttpMethod("OPTIONS"));
    }

    public HttpMethod(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HttpMethod) && this.a.equals(((HttpMethod) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return vh.q(new StringBuilder("HttpMethod(value="), this.a, ')');
    }
}
