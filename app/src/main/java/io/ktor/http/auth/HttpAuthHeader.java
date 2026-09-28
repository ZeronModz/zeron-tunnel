package io.ktor.http.auth;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.t;
import defpackage.vh;
import defpackage.xu;
import defpackage.yg0;
import io.ktor.http.HeaderValueParam;
import io.ktor.http.parsing.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.c;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/http/auth/HttpAuthHeader;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Single", "Parameterized", "Companion", "Lio/ktor/http/auth/HttpAuthHeader$Parameterized;", "Lio/ktor/http/auth/HttpAuthHeader$Single;", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class HttpAuthHeader {
    public final String a;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/auth/HttpAuthHeader$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/http/auth/HttpAuthHeader$Single;", "Lio/ktor/http/auth/HttpAuthHeader;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "authScheme", "blob", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Single extends HttpAuthHeader {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Single(String str, String str2) {
            super(str, null);
            str.getClass();
            str2.getClass();
            this.b = str2;
            if (!b.a.matches(str2)) {
                throw new ParseException("Invalid blob value: it should be token68", null, 2, null);
            }
        }

        @Override // io.ktor.http.auth.HttpAuthHeader
        public final String a() {
            return this.a + ' ' + this.b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Single)) {
                return false;
            }
            Single single = (Single) obj;
            return g.w(single.a, this.a, true) && g.w(single.b, this.b, true);
        }

        public final int hashCode() {
            Locale locale = Locale.ROOT;
            String lowerCase = this.a.toLowerCase(locale);
            lowerCase.getClass();
            String lowerCase2 = this.b.toLowerCase(locale);
            lowerCase2.getClass();
            return kotlin.collections.b.w(new Object[]{lowerCase, lowerCase2}).hashCode();
        }
    }

    static {
        new Companion(null);
    }

    public HttpAuthHeader(String str, xu xuVar) {
        this.a = str;
        if (!b.a.matches(str)) {
            throw new ParseException(vh.l("Invalid authScheme value: it should be token, but instead it is ", str), null, 2, null);
        }
    }

    public abstract String a();

    public final String toString() {
        return a();
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/http/auth/HttpAuthHeader$Parameterized;", "Lio/ktor/http/auth/HttpAuthHeader;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "authScheme", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/http/HeaderValueParam;", "parameters", "Lio/ktor/http/auth/HeaderValueEncoding;", "encoding", "<init>", "(Ljava/lang/String;Ljava/util/List;Lio/ktor/http/auth/HeaderValueEncoding;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "(Ljava/lang/String;Ljava/util/Map;Lio/ktor/http/auth/HeaderValueEncoding;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Parameterized extends HttpAuthHeader {
        public static final /* synthetic */ int d = 0;
        public final List b;
        public final HeaderValueEncoding c;

        public Parameterized(String str, Map<String, String> map, HeaderValueEncoding headerValueEncoding) {
            str.getClass();
            map.getClass();
            headerValueEncoding.getClass();
            Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
            ArrayList arrayList = new ArrayList(c.l(setEntrySet, 10));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(new HeaderValueParam((String) entry.getKey(), (String) entry.getValue()));
            }
            this(str, arrayList, headerValueEncoding);
        }

        @Override // io.ktor.http.auth.HttpAuthHeader
        public final String a() {
            HeaderValueEncoding headerValueEncoding = this.c;
            headerValueEncoding.getClass();
            boolean zIsEmpty = this.b.isEmpty();
            String str = this.a;
            if (zIsEmpty) {
                return str;
            }
            return c.w(this.b, ", ", str + ' ', null, new t(this, headerValueEncoding), 28);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Parameterized)) {
                return false;
            }
            Parameterized parameterized = (Parameterized) obj;
            return g.w(parameterized.a, this.a, true) && yg0.a(parameterized.b, this.b);
        }

        public final int hashCode() {
            String lowerCase = this.a.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return kotlin.collections.b.w(new Object[]{lowerCase, this.b}).hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Parameterized(String str, List<HeaderValueParam> list, HeaderValueEncoding headerValueEncoding) {
            super(str, null);
            str.getClass();
            list.getClass();
            headerValueEncoding.getClass();
            this.b = list;
            this.c = headerValueEncoding;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!b.a.matches(((HeaderValueParam) it.next()).a)) {
                    throw new ParseException("Parameter name should be a token", null, 2, null);
                }
            }
        }

        public /* synthetic */ Parameterized(String str, Map map, HeaderValueEncoding headerValueEncoding, int i, xu xuVar) {
            this(str, (Map<String, String>) map, (i & 4) != 0 ? HeaderValueEncoding.QUOTED_WHEN_REQUIRED : headerValueEncoding);
        }

        public /* synthetic */ Parameterized(String str, List list, HeaderValueEncoding headerValueEncoding, int i, xu xuVar) {
            this(str, (List<HeaderValueParam>) list, (i & 4) != 0 ? HeaderValueEncoding.QUOTED_WHEN_REQUIRED : headerValueEncoding);
        }
    }
}
