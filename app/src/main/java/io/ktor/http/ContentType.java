package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import defpackage.yg0;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.text.g;
import org.slf4j.Marker;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lio/ktor/http/ContentType;", "Lio/ktor/http/HeaderValueWithParameters;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "contentType", "contentSubtype", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/http/HeaderValueParam;", "parameters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Companion", "fr", "gr", "hr", "ir", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContentType extends HeaderValueWithParameters {
    public static final Companion f = new Companion(null);
    public static final ContentType g = new ContentType(Marker.ANY_MARKER, Marker.ANY_MARKER, null, 4, null);
    public final String d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/ContentType$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }

        public static ContentType a(String str) throws BadContentTypeFormatException {
            str.getClass();
            if (g.B(str)) {
                return ContentType.g;
            }
            int i = HeaderValueWithParameters.c;
            HeaderValue headerValue = (HeaderValue) kotlin.collections.c.x(b.a(str));
            String str2 = headerValue.a;
            List list = headerValue.b;
            int iY = g.y(str2, '/', 0, 6);
            if (iY == -1) {
                if (!yg0.a(g.c0(str2).toString(), Marker.ANY_MARKER)) {
                    throw new BadContentTypeFormatException(str);
                }
                ContentType.f.getClass();
                return ContentType.g;
            }
            String string = g.c0(str2.substring(0, iY)).toString();
            if (string.length() == 0) {
                throw new BadContentTypeFormatException(str);
            }
            String string2 = g.c0(str2.substring(iY + 1)).toString();
            if (g.p(string, ' ') || g.p(string2, ' ')) {
                throw new BadContentTypeFormatException(str);
            }
            if (string2.length() == 0 || g.p(string2, '/')) {
                throw new BadContentTypeFormatException(str);
            }
            return new ContentType(string, string2, list);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContentType(String str, String str2, List<HeaderValueParam> list) {
        this(str, str2, str + '/' + str2, list);
        str.getClass();
        str2.getClass();
        list.getClass();
    }

    public final boolean b(ContentType contentType) {
        boolean zW;
        contentType.getClass();
        String str = contentType.e;
        String str2 = contentType.d;
        if ((yg0.a(str2, Marker.ANY_MARKER) || g.w(str2, this.d, true)) && (yg0.a(str, Marker.ANY_MARKER) || g.w(str, this.e, true))) {
            for (HeaderValueParam headerValueParam : contentType.b) {
                String str3 = headerValueParam.a;
                String str4 = headerValueParam.b;
                if (yg0.a(str3, Marker.ANY_MARKER)) {
                    if (!yg0.a(str4, Marker.ANY_MARKER)) {
                        List list = this.b;
                        if (list == null || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (g.w(((HeaderValueParam) it.next()).b, str4, true)) {
                                }
                            }
                        }
                        zW = false;
                    }
                    zW = true;
                    break;
                }
                String strA = a(str3);
                if (!yg0.a(str4, Marker.ANY_MARKER)) {
                    zW = g.w(strA, str4, true);
                } else {
                    if (strA != null) {
                        zW = true;
                        break;
                        break;
                    }
                    zW = false;
                }
                if (!zW) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (kotlin.text.g.w(r1.b, r7, true) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.ktor.http.ContentType c(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            r7.getClass()
            java.util.List r0 = r5.b
            int r1 = r0.size()
            if (r1 == 0) goto L4e
            r2 = 1
            if (r1 == r2) goto L36
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L15
            goto L4e
        L15:
            java.util.Iterator r1 = r0.iterator()
        L19:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r1.next()
            io.ktor.http.HeaderValueParam r3 = (io.ktor.http.HeaderValueParam) r3
            java.lang.String r4 = r3.a
            boolean r4 = kotlin.text.g.w(r4, r6, r2)
            if (r4 == 0) goto L19
            java.lang.String r3 = r3.b
            boolean r3 = kotlin.text.g.w(r3, r7, r2)
            if (r3 == 0) goto L19
            goto L4d
        L36:
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            io.ktor.http.HeaderValueParam r1 = (io.ktor.http.HeaderValueParam) r1
            java.lang.String r3 = r1.a
            boolean r3 = kotlin.text.g.w(r3, r6, r2)
            if (r3 == 0) goto L4e
            java.lang.String r1 = r1.b
            boolean r1 = kotlin.text.g.w(r1, r7, r2)
            if (r1 == 0) goto L4e
        L4d:
            return r5
        L4e:
            io.ktor.http.ContentType r1 = new io.ktor.http.ContentType
            io.ktor.http.HeaderValueParam r2 = new io.ktor.http.HeaderValueParam
            r2.<init>(r6, r7)
            java.util.ArrayList r6 = kotlin.collections.c.D(r0, r2)
            java.lang.String r7 = r5.d
            java.lang.String r0 = r5.e
            java.lang.String r5 = r5.a
            r1.<init>(r7, r0, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.ContentType.c(java.lang.String, java.lang.String):io.ktor.http.ContentType");
    }

    public final ContentType d() {
        return this.b.isEmpty() ? this : new ContentType(this.d, this.e, null, 4, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ContentType)) {
            return false;
        }
        ContentType contentType = (ContentType) obj;
        return g.w(this.d, contentType.d, true) && g.w(this.e, contentType.e, true) && yg0.a(this.b, contentType.b);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.d.toLowerCase(locale);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.e.toLowerCase(locale);
        lowerCase2.getClass();
        int iHashCode2 = lowerCase2.hashCode();
        return (this.b.hashCode() * 31) + iHashCode2 + (iHashCode * 31) + iHashCode;
    }

    public ContentType(String str, String str2, String str3, List list) {
        super(str3, list);
        this.d = str;
        this.e = str2;
    }

    public ContentType(String str, String str2, List list, int i, xu xuVar) {
        this(str, str2, (i & 4) != 0 ? EmptyList.INSTANCE : list);
    }
}
