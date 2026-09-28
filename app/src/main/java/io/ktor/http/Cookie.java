package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.bb1;
import defpackage.eg;
import defpackage.f61;
import defpackage.if3;
import defpackage.mr;
import defpackage.vh;
import defpackage.xu;
import defpackage.yg0;
import io.ktor.util.date.GMTDate;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017¨\u0006\u001a"}, d2 = {"Lio/ktor/http/Cookie;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "name", "value", "Lio/ktor/http/CookieEncoding;", "encoding", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "maxAge", "Lio/ktor/util/date/GMTDate;", "expires", "domain", "path", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "secure", "httpOnly", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "extensions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/http/CookieEncoding;Ljava/lang/Integer;Lio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;)V", "seen0", "Lf61;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lio/ktor/http/CookieEncoding;Ljava/lang/Integer;Lio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Lf61;)V", "Companion", "mr", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class Cookie {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final KSerializer[] k;
    public final String a;
    public final String b;
    public final CookieEncoding c;
    public final Integer d;
    public final GMTDate e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final Map j;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/http/Cookie$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lkotlinx/serialization/KSerializer;", "Lio/ktor/http/Cookie;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }

        public final KSerializer<Cookie> serializer() {
            return mr.a;
        }
    }

    static {
        CookieEncoding[] cookieEncodingArrValues = CookieEncoding.values();
        cookieEncodingArrValues.getClass();
        EnumSerializer enumSerializer = new EnumSerializer("io.ktor.http.CookieEncoding", cookieEncodingArrValues);
        bb1 bb1Var = bb1.a;
        k = new KSerializer[]{null, null, enumSerializer, null, null, null, null, null, null, new LinkedHashMapSerializer(bb1Var, eg.a(bb1Var))};
    }

    public /* synthetic */ Cookie(int i, String str, String str2, CookieEncoding cookieEncoding, Integer num, GMTDate gMTDate, String str3, String str4, boolean z, boolean z2, Map map, f61 f61Var) {
        if (3 != (i & 3)) {
            if3.L(mr.a.getDescriptor(), i, 3);
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = CookieEncoding.URI_ENCODING;
        } else {
            this.c = cookieEncoding;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = gMTDate;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z2;
        }
        if ((i & 512) == 0) {
            this.j = kotlin.collections.d.a();
        } else {
            this.j = map;
        }
    }

    public static Cookie a(Cookie cookie, String str, String str2, int i) {
        String str3 = cookie.a;
        String str4 = cookie.b;
        CookieEncoding cookieEncoding = cookie.c;
        Integer num = cookie.d;
        GMTDate gMTDate = cookie.e;
        if ((i & 32) != 0) {
            str = cookie.f;
        }
        String str5 = str;
        if ((i & 64) != 0) {
            str2 = cookie.g;
        }
        boolean z = cookie.h;
        boolean z2 = cookie.i;
        Map map = cookie.j;
        cookie.getClass();
        str3.getClass();
        str4.getClass();
        cookieEncoding.getClass();
        map.getClass();
        return new Cookie(str3, str4, cookieEncoding, num, gMTDate, str5, str2, z, z2, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return yg0.a(this.a, cookie.a) && yg0.a(this.b, cookie.b) && this.c == cookie.c && yg0.a(this.d, cookie.d) && yg0.a(this.e, cookie.e) && yg0.a(this.f, cookie.f) && yg0.a(this.g, cookie.g) && this.h == cookie.h && this.i == cookie.i && yg0.a(this.j, cookie.j);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + vh.c(this.a.hashCode() * 31, 31, this.b)) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        GMTDate gMTDate = this.e;
        int iHashCode3 = (iHashCode2 + (gMTDate == null ? 0 : gMTDate.hashCode())) * 31;
        String str = this.f;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return this.j.hashCode() + ((((((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "Cookie(name=" + this.a + ", value=" + this.b + ", encoding=" + this.c + ", maxAge=" + this.d + ", expires=" + this.e + ", domain=" + this.f + ", path=" + this.g + ", secure=" + this.h + ", httpOnly=" + this.i + ", extensions=" + this.j + ')';
    }

    public Cookie(String str, String str2, CookieEncoding cookieEncoding, Integer num, GMTDate gMTDate, String str3, String str4, boolean z, boolean z2, Map<String, String> map) {
        str.getClass();
        str2.getClass();
        cookieEncoding.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = cookieEncoding;
        this.d = num;
        this.e = gMTDate;
        this.f = str3;
        this.g = str4;
        this.h = z;
        this.i = z2;
        this.j = map;
    }

    public /* synthetic */ Cookie(String str, String str2, CookieEncoding cookieEncoding, Integer num, GMTDate gMTDate, String str3, String str4, boolean z, boolean z2, Map map, int i, xu xuVar) {
        this(str, str2, (i & 4) != 0 ? CookieEncoding.URI_ENCODING : cookieEncoding, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : gMTDate, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? false : z, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? kotlin.collections.d.a() : map);
    }
}
