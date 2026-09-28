package io.ktor.http.header;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import defpackage.yg0;
import io.ktor.http.HeaderValueParam;
import io.ktor.http.HeaderValueWithParameters;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.c;
import kotlin.text.g;
import org.slf4j.Marker;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lio/ktor/http/header/AcceptEncoding;", "Lio/ktor/http/HeaderValueWithParameters;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "acceptEncoding", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/http/HeaderValueParam;", "parameters", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "qValue", "(Ljava/lang/String;D)V", "Companion", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AcceptEncoding extends HeaderValueWithParameters {
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/header/AcceptEncoding$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
        new AcceptEncoding("gzip", null, 2, null);
        new AcceptEncoding("compress", null, 2, null);
        new AcceptEncoding("deflate", null, 2, null);
        new AcceptEncoding("br", null, 2, null);
        new AcceptEncoding("zstd", null, 2, null);
        new AcceptEncoding("identity", null, 2, null);
        new AcceptEncoding(Marker.ANY_MARKER, null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AcceptEncoding(String str, double d) {
        this(str, (List<HeaderValueParam>) c.z(new HeaderValueParam("q", String.valueOf(d))));
        str.getClass();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AcceptEncoding)) {
            return false;
        }
        AcceptEncoding acceptEncoding = (AcceptEncoding) obj;
        return g.w(this.d, acceptEncoding.d, true) && yg0.a(this.b, acceptEncoding.b);
    }

    public final int hashCode() {
        String lowerCase = this.d.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return (this.b.hashCode() * 31) + lowerCase.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptEncoding(String str, List<HeaderValueParam> list) {
        super(str, list);
        str.getClass();
        list.getClass();
        this.d = str;
    }

    public AcceptEncoding(String str, List list, int i, xu xuVar) {
        this(str, (List<HeaderValueParam>) ((i & 2) != 0 ? EmptyList.INSTANCE : list));
    }
}
