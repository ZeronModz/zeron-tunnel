package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.internal.http2.Header;
import okio.ByteString;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ae0 {
    public static final Header[] a;
    public static final Map b;

    static {
        Header header = new Header(Header.i, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        ByteString byteString = Header.f;
        Header header2 = new Header(byteString, "GET");
        Header header3 = new Header(byteString, "POST");
        ByteString byteString2 = Header.g;
        Header header4 = new Header(byteString2, "/");
        Header header5 = new Header(byteString2, "/index.html");
        ByteString byteString3 = Header.h;
        Header header6 = new Header(byteString3, "http");
        Header header7 = new Header(byteString3, "https");
        ByteString byteString4 = Header.e;
        Header[] headerArr = {header, header2, header3, header4, header5, header6, header7, new Header(byteString4, "200"), new Header(byteString4, "204"), new Header(byteString4, "206"), new Header(byteString4, "304"), new Header(byteString4, "400"), new Header(byteString4, "404"), new Header(byteString4, "500"), new Header("accept-charset", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("accept-ranges", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("accept", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("access-control-allow-origin", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("age", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("allow", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("authorization", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("cache-control", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("content-disposition", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("content-encoding", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("content-language", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("content-length", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("content-location", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("content-range", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("content-type", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("cookie", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("date", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("etag", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("expect", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("expires", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header(TypedValues.TransitionType.S_FROM, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("host", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("if-match", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("if-modified-since", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("if-none-match", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("if-range", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("if-unmodified-since", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("last-modified", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("link", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("location", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("max-forwards", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("proxy-authenticate", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("proxy-authorization", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("range", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("referer", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("refresh", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("retry-after", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("server", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("set-cookie", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("strict-transport-security", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("transfer-encoding", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("user-agent", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("vary", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("via", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new Header("www-authenticate", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)};
        a = headerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(headerArr[i].a)) {
                linkedHashMap.put(headerArr[i].a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        b = mapUnmodifiableMap;
    }

    public static void a(ByteString byteString) throws IOException {
        byteString.getClass();
        int size = byteString.size();
        for (int i = 0; i < size; i++) {
            byte b2 = byteString.getByte(i);
            if (65 <= b2 && b2 < 91) {
                io0.d(byteString.utf8(), "PROTOCOL_ERROR response malformed: mixed case name: ");
                return;
            }
        }
    }
}
