package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.pc0;
import defpackage.xu;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lio/ktor/http/HeaderValueWithParameters;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "content", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/http/HeaderValueParam;", "parameters", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Companion", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class HeaderValueWithParameters {
    public static final /* synthetic */ int c = 0;
    public final String a;
    public final List b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/HeaderValueWithParameters$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    public HeaderValueWithParameters(String str, List<HeaderValueParam> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final String a(String str) {
        str.getClass();
        List list = this.b;
        int iT = kotlin.collections.c.t(list);
        if (iT < 0) {
            return null;
        }
        int i = 0;
        while (true) {
            HeaderValueParam headerValueParam = (HeaderValueParam) list.get(i);
            if (g.w(headerValueParam.a, str, true)) {
                return headerValueParam.b;
            }
            if (i == iT) {
                return null;
            }
            i++;
        }
    }

    public final String toString() {
        List<HeaderValueParam> list = this.b;
        boolean zIsEmpty = list.isEmpty();
        String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int length2 = 0;
        for (HeaderValueParam headerValueParam : list) {
            length2 += headerValueParam.b.length() + headerValueParam.a.length() + 3;
        }
        StringBuilder sb = new StringBuilder(length + length2);
        sb.append(str);
        int iT = kotlin.collections.c.t(list);
        if (iT >= 0) {
            while (true) {
                HeaderValueParam headerValueParam2 = (HeaderValueParam) list.get(i);
                sb.append("; ");
                sb.append(headerValueParam2.a);
                sb.append("=");
                String str2 = headerValueParam2.b;
                if (pc0.a(str2)) {
                    sb.append(pc0.b(str2));
                } else {
                    sb.append(str2);
                }
                if (i == iT) {
                    break;
                }
                i++;
            }
        }
        return sb.toString();
    }

    public HeaderValueWithParameters(String str, List list, int i, xu xuVar) {
        this(str, (i & 2) != 0 ? EmptyList.INSTANCE : list);
    }
}
