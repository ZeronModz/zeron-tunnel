package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/http/HeaderValueParam;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "name", "value", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "escapeValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "(Ljava/lang/String;Ljava/lang/String;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HeaderValueParam {
    public final String a;
    public final String b;
    public final boolean c;

    public HeaderValueParam(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HeaderValueParam)) {
            return false;
        }
        HeaderValueParam headerValueParam = (HeaderValueParam) obj;
        return g.w(headerValueParam.a, this.a, true) && g.w(headerValueParam.b, this.b, true);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.a.toLowerCase(locale);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.b.toLowerCase(locale);
        lowerCase2.getClass();
        return lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "HeaderValueParam(name=" + this.a + ", value=" + this.b + ", escapeValue=" + this.c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeaderValueParam(String str, String str2) {
        this(str, str2, false);
        str.getClass();
        str2.getClass();
    }
}
