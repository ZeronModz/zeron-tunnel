package io.ktor.http;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.RequestConfiguration;
import com.trilead.ssh2.sftp.Packet;
import defpackage.xu;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lio/ktor/http/HttpStatusCode;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "value", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "description", "<init>", "(ILjava/lang/String;)V", "Companion", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HttpStatusCode implements Comparable<HttpStatusCode> {
    public static final Companion c = new Companion(null);
    public static final HttpStatusCode d;
    public static final HttpStatusCode e;
    public static final HttpStatusCode f;
    public static final HttpStatusCode g;
    public static final HttpStatusCode h;
    public static final HttpStatusCode i;
    public static final HttpStatusCode j;
    public static final HttpStatusCode k;
    public static final HttpStatusCode l;
    public static final HttpStatusCode m;
    public static final HttpStatusCode n;
    public static final List o;
    public final int a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/http/HttpStatusCode$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/http/HttpStatusCode;", "statusCodesMap", "Ljava/util/Map;", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        HttpStatusCode httpStatusCode = new HttpStatusCode(100, "Continue");
        HttpStatusCode httpStatusCode2 = new HttpStatusCode(101, "Switching Protocols");
        d = httpStatusCode2;
        HttpStatusCode httpStatusCode3 = new HttpStatusCode(Packet.SSH_FXP_HANDLE, "Processing");
        HttpStatusCode httpStatusCode4 = new HttpStatusCode(200, "OK");
        e = httpStatusCode4;
        HttpStatusCode httpStatusCode5 = new HttpStatusCode(Packet.SSH_FXP_EXTENDED_REPLY, "Created");
        HttpStatusCode httpStatusCode6 = new HttpStatusCode(202, "Accepted");
        HttpStatusCode httpStatusCode7 = new HttpStatusCode(203, "Non-Authoritative Information");
        HttpStatusCode httpStatusCode8 = new HttpStatusCode(204, "No Content");
        HttpStatusCode httpStatusCode9 = new HttpStatusCode(205, "Reset Content");
        HttpStatusCode httpStatusCode10 = new HttpStatusCode(206, "Partial Content");
        HttpStatusCode httpStatusCode11 = new HttpStatusCode(207, "Multi-Status");
        HttpStatusCode httpStatusCode12 = new HttpStatusCode(300, "Multiple Choices");
        HttpStatusCode httpStatusCode13 = new HttpStatusCode(301, "Moved Permanently");
        f = httpStatusCode13;
        HttpStatusCode httpStatusCode14 = new HttpStatusCode(302, "Found");
        g = httpStatusCode14;
        HttpStatusCode httpStatusCode15 = new HttpStatusCode(303, "See Other");
        h = httpStatusCode15;
        HttpStatusCode httpStatusCode16 = new HttpStatusCode(304, "Not Modified");
        i = httpStatusCode16;
        HttpStatusCode httpStatusCode17 = new HttpStatusCode(305, "Use Proxy");
        HttpStatusCode httpStatusCode18 = new HttpStatusCode(306, "Switch Proxy");
        HttpStatusCode httpStatusCode19 = new HttpStatusCode(307, "Temporary Redirect");
        j = httpStatusCode19;
        HttpStatusCode httpStatusCode20 = new HttpStatusCode(308, "Permanent Redirect");
        k = httpStatusCode20;
        HttpStatusCode httpStatusCode21 = new HttpStatusCode(400, "Bad Request");
        HttpStatusCode httpStatusCode22 = new HttpStatusCode(TypedValues.CycleType.TYPE_CURVE_FIT, "Unauthorized");
        l = httpStatusCode22;
        HttpStatusCode httpStatusCode23 = new HttpStatusCode(TypedValues.CycleType.TYPE_VISIBILITY, "Payment Required");
        HttpStatusCode httpStatusCode24 = new HttpStatusCode(TypedValues.CycleType.TYPE_ALPHA, "Forbidden");
        HttpStatusCode httpStatusCode25 = new HttpStatusCode(404, "Not Found");
        HttpStatusCode httpStatusCode26 = new HttpStatusCode(405, "Method Not Allowed");
        HttpStatusCode httpStatusCode27 = new HttpStatusCode(406, "Not Acceptable");
        HttpStatusCode httpStatusCode28 = new HttpStatusCode(407, "Proxy Authentication Required");
        HttpStatusCode httpStatusCode29 = new HttpStatusCode(408, "Request Timeout");
        HttpStatusCode httpStatusCode30 = new HttpStatusCode(409, "Conflict");
        HttpStatusCode httpStatusCode31 = new HttpStatusCode(410, "Gone");
        HttpStatusCode httpStatusCode32 = new HttpStatusCode(411, "Length Required");
        HttpStatusCode httpStatusCode33 = new HttpStatusCode(412, "Precondition Failed");
        m = httpStatusCode33;
        HttpStatusCode httpStatusCode34 = new HttpStatusCode(413, "Payload Too Large");
        HttpStatusCode httpStatusCode35 = new HttpStatusCode(414, "Request-URI Too Long");
        HttpStatusCode httpStatusCode36 = new HttpStatusCode(415, "Unsupported Media Type");
        HttpStatusCode httpStatusCode37 = new HttpStatusCode(TypedValues.CycleType.TYPE_PATH_ROTATE, "Requested Range Not Satisfiable");
        HttpStatusCode httpStatusCode38 = new HttpStatusCode(417, "Expectation Failed");
        HttpStatusCode httpStatusCode39 = new HttpStatusCode(TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, "Unprocessable Entity");
        HttpStatusCode httpStatusCode40 = new HttpStatusCode(TypedValues.CycleType.TYPE_WAVE_PERIOD, "Locked");
        HttpStatusCode httpStatusCode41 = new HttpStatusCode(TypedValues.CycleType.TYPE_WAVE_OFFSET, "Failed Dependency");
        HttpStatusCode httpStatusCode42 = new HttpStatusCode(TypedValues.CycleType.TYPE_WAVE_PHASE, "Too Early");
        HttpStatusCode httpStatusCode43 = new HttpStatusCode(426, "Upgrade Required");
        HttpStatusCode httpStatusCode44 = new HttpStatusCode(429, "Too Many Requests");
        HttpStatusCode httpStatusCode45 = new HttpStatusCode(431, "Request Header Fields Too Large");
        HttpStatusCode httpStatusCode46 = new HttpStatusCode(500, "Internal Server Error");
        HttpStatusCode httpStatusCode47 = new HttpStatusCode(TypedValues.PositionType.TYPE_TRANSITION_EASING, "Not Implemented");
        HttpStatusCode httpStatusCode48 = new HttpStatusCode(TypedValues.PositionType.TYPE_DRAWPATH, "Bad Gateway");
        HttpStatusCode httpStatusCode49 = new HttpStatusCode(TypedValues.PositionType.TYPE_PERCENT_WIDTH, "Service Unavailable");
        HttpStatusCode httpStatusCode50 = new HttpStatusCode(TypedValues.PositionType.TYPE_PERCENT_HEIGHT, "Gateway Timeout");
        n = httpStatusCode50;
        List listA = kotlin.collections.c.A(httpStatusCode, httpStatusCode2, httpStatusCode3, httpStatusCode4, httpStatusCode5, httpStatusCode6, httpStatusCode7, httpStatusCode8, httpStatusCode9, httpStatusCode10, httpStatusCode11, httpStatusCode12, httpStatusCode13, httpStatusCode14, httpStatusCode15, httpStatusCode16, httpStatusCode17, httpStatusCode18, httpStatusCode19, httpStatusCode20, httpStatusCode21, httpStatusCode22, httpStatusCode23, httpStatusCode24, httpStatusCode25, httpStatusCode26, httpStatusCode27, httpStatusCode28, httpStatusCode29, httpStatusCode30, httpStatusCode31, httpStatusCode32, httpStatusCode33, httpStatusCode34, httpStatusCode35, httpStatusCode36, httpStatusCode37, httpStatusCode38, httpStatusCode39, httpStatusCode40, httpStatusCode41, httpStatusCode42, httpStatusCode43, httpStatusCode44, httpStatusCode45, httpStatusCode46, httpStatusCode47, httpStatusCode48, httpStatusCode49, httpStatusCode50, new HttpStatusCode(TypedValues.PositionType.TYPE_SIZE_PERCENT, "HTTP Version Not Supported"), new HttpStatusCode(TypedValues.PositionType.TYPE_PERCENT_X, "Variant Also Negotiates"), new HttpStatusCode(TypedValues.PositionType.TYPE_PERCENT_Y, "Insufficient Storage"));
        o = listA;
        int iC = kotlin.collections.d.c(kotlin.collections.c.l(listA, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iC >= 16 ? iC : 16);
        for (Object obj : listA) {
            linkedHashMap.put(Integer.valueOf(((HttpStatusCode) obj).a), obj);
        }
    }

    public HttpStatusCode(int i2, String str) {
        str.getClass();
        this.a = i2;
        this.b = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(HttpStatusCode httpStatusCode) {
        HttpStatusCode httpStatusCode2 = httpStatusCode;
        httpStatusCode2.getClass();
        return this.a - httpStatusCode2.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HttpStatusCode) && ((HttpStatusCode) obj).a == this.a;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getA() {
        return this.a;
    }

    public final String toString() {
        return this.a + ' ' + this.b;
    }
}
