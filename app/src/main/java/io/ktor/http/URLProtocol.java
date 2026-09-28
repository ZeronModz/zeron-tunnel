package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.u7;
import defpackage.vh;
import defpackage.xu;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lio/ktor/http/URLProtocol;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "name", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "defaultPort", "<init>", "(Ljava/lang/String;I)V", "Companion", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class URLProtocol {
    public static final Companion c = new Companion(null);
    public static final URLProtocol d;
    public static final LinkedHashMap e;
    public final String a;
    public final int b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/URLProtocol$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        URLProtocol uRLProtocol = new URLProtocol("http", 80);
        d = uRLProtocol;
        List listA = kotlin.collections.c.A(uRLProtocol, new URLProtocol("https", 443), new URLProtocol("ws", 80), new URLProtocol("wss", 443), new URLProtocol("socks", 1080));
        int iC = kotlin.collections.d.c(kotlin.collections.c.l(listA, 10));
        if (iC < 16) {
            iC = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iC);
        for (Object obj : listA) {
            linkedHashMap.put(((URLProtocol) obj).a, obj);
        }
        e = linkedHashMap;
    }

    public URLProtocol(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.toLowerCase(cCharAt) != cCharAt) {
                u7.r("All characters should be lower case");
                throw null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof URLProtocol)) {
            return false;
        }
        URLProtocol uRLProtocol = (URLProtocol) obj;
        return this.a.equals(uRLProtocol.a) && this.b == uRLProtocol.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("URLProtocol(name=");
        sb.append(this.a);
        sb.append(", defaultPort=");
        return vh.o(sb, this.b, ')');
    }
}
