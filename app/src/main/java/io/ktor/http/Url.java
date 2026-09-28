package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.hz;
import defpackage.l8;
import defpackage.up;
import defpackage.xu;
import defpackage.zu0;
import io.ktor.http.Url;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0014Be\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lio/ktor/http/Url;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/http/URLProtocol;", "protocol", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "host", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "specifiedPort", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "pathSegments", "Lio/ktor/http/Parameters;", "parameters", "fragment", "user", "password", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "trailingQuery", "urlString", "<init>", "(Lio/ktor/http/URLProtocol;Ljava/lang/String;ILjava/util/List;Lio/ktor/http/Parameters;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "Companion", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Url {
    public static final /* synthetic */ int s = 0;
    public final String a;
    public final int b;
    public final Parameters c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final List h;
    public final List i;
    public final Lazy j;
    public final URLProtocol k;
    public final URLProtocol l;
    public final Lazy m;
    public final Lazy n;
    public final Lazy o;
    public final Lazy p;
    public final Lazy q;
    public final Lazy r;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/Url$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    public Url(URLProtocol uRLProtocol, String str, int i, List<String> list, Parameters parameters, String str2, String str3, String str4, boolean z, String str5) {
        str.getClass();
        list.getClass();
        parameters.getClass();
        str2.getClass();
        str5.getClass();
        this.a = str;
        this.b = i;
        this.c = parameters;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = str5;
        if (i < 0 || i >= 65536) {
            zu0.e(hz.o(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
            throw null;
        }
        this.h = list;
        this.i = list;
        this.j = kotlin.c.b(new l8(list, 23));
        this.k = uRLProtocol;
        if (uRLProtocol == null) {
            URLProtocol.c.getClass();
            uRLProtocol = URLProtocol.d;
        }
        this.l = uRLProtocol;
        this.m = kotlin.c.b(new up(6, list, this));
        final int i2 = 0;
        this.n = kotlin.c.b(new Function0(this) { // from class: hl1
            public final /* synthetic */ Url b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                Url url = this.b;
                switch (i3) {
                    case 0:
                        String str6 = url.g;
                        int iY = g.y(str6, '?', 0, 6) + 1;
                        if (iY == 0) {
                            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        int iY2 = g.y(str6, '#', iY, 4);
                        return iY2 == -1 ? str6.substring(iY) : str6.substring(iY, iY2);
                    case 1:
                        String str7 = url.g;
                        int iY3 = g.y(str7, '/', url.l.a.length() + 3, 4);
                        if (iY3 == -1) {
                            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        int iY4 = g.y(str7, '#', iY3, 4);
                        return iY4 == -1 ? str7.substring(iY3) : str7.substring(iY3, iY4);
                    case 2:
                        String str8 = url.g;
                        String str9 = url.d;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        int length = url.l.a.length() + 3;
                        return str8.substring(length, StringsKt__StringsKt.f(str8, new char[]{':', '@'}, length, false));
                    case 3:
                        String str10 = url.g;
                        String str11 = url.e;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str10.substring(g.y(str10, ':', url.l.a.length() + 3, 4) + 1, g.y(str10, '@', 0, 6));
                    default:
                        String str12 = url.g;
                        int iY5 = g.y(str12, '#', 0, 6) + 1;
                        return iY5 == 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str12.substring(iY5);
                }
            }
        });
        final int i3 = 1;
        this.o = kotlin.c.b(new Function0(this) { // from class: hl1
            public final /* synthetic */ Url b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                Url url = this.b;
                switch (i32) {
                    case 0:
                        String str6 = url.g;
                        int iY = g.y(str6, '?', 0, 6) + 1;
                        if (iY == 0) {
                            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        int iY2 = g.y(str6, '#', iY, 4);
                        return iY2 == -1 ? str6.substring(iY) : str6.substring(iY, iY2);
                    case 1:
                        String str7 = url.g;
                        int iY3 = g.y(str7, '/', url.l.a.length() + 3, 4);
                        if (iY3 == -1) {
                            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        int iY4 = g.y(str7, '#', iY3, 4);
                        return iY4 == -1 ? str7.substring(iY3) : str7.substring(iY3, iY4);
                    case 2:
                        String str8 = url.g;
                        String str9 = url.d;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        int length = url.l.a.length() + 3;
                        return str8.substring(length, StringsKt__StringsKt.f(str8, new char[]{':', '@'}, length, false));
                    case 3:
                        String str10 = url.g;
                        String str11 = url.e;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str10.substring(g.y(str10, ':', url.l.a.length() + 3, 4) + 1, g.y(str10, '@', 0, 6));
                    default:
                        String str12 = url.g;
                        int iY5 = g.y(str12, '#', 0, 6) + 1;
                        return iY5 == 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str12.substring(iY5);
                }
            }
        });
        final int i4 = 2;
        this.p = kotlin.c.b(new Function0(this) { // from class: hl1
            public final /* synthetic */ Url b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i4;
                Url url = this.b;
                switch (i32) {
                    case 0:
                        String str6 = url.g;
                        int iY = g.y(str6, '?', 0, 6) + 1;
                        if (iY == 0) {
                            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        int iY2 = g.y(str6, '#', iY, 4);
                        return iY2 == -1 ? str6.substring(iY) : str6.substring(iY, iY2);
                    case 1:
                        String str7 = url.g;
                        int iY3 = g.y(str7, '/', url.l.a.length() + 3, 4);
                        if (iY3 == -1) {
                            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        int iY4 = g.y(str7, '#', iY3, 4);
                        return iY4 == -1 ? str7.substring(iY3) : str7.substring(iY3, iY4);
                    case 2:
                        String str8 = url.g;
                        String str9 = url.d;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        int length = url.l.a.length() + 3;
                        return str8.substring(length, StringsKt__StringsKt.f(str8, new char[]{':', '@'}, length, false));
                    case 3:
                        String str10 = url.g;
                        String str11 = url.e;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str10.substring(g.y(str10, ':', url.l.a.length() + 3, 4) + 1, g.y(str10, '@', 0, 6));
                    default:
                        String str12 = url.g;
                        int iY5 = g.y(str12, '#', 0, 6) + 1;
                        return iY5 == 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str12.substring(iY5);
                }
            }
        });
        final int i5 = 3;
        this.q = kotlin.c.b(new Function0(this) { // from class: hl1
            public final /* synthetic */ Url b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i5;
                Url url = this.b;
                switch (i32) {
                    case 0:
                        String str6 = url.g;
                        int iY = g.y(str6, '?', 0, 6) + 1;
                        if (iY == 0) {
                            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        int iY2 = g.y(str6, '#', iY, 4);
                        return iY2 == -1 ? str6.substring(iY) : str6.substring(iY, iY2);
                    case 1:
                        String str7 = url.g;
                        int iY3 = g.y(str7, '/', url.l.a.length() + 3, 4);
                        if (iY3 == -1) {
                            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        int iY4 = g.y(str7, '#', iY3, 4);
                        return iY4 == -1 ? str7.substring(iY3) : str7.substring(iY3, iY4);
                    case 2:
                        String str8 = url.g;
                        String str9 = url.d;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        int length = url.l.a.length() + 3;
                        return str8.substring(length, StringsKt__StringsKt.f(str8, new char[]{':', '@'}, length, false));
                    case 3:
                        String str10 = url.g;
                        String str11 = url.e;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str10.substring(g.y(str10, ':', url.l.a.length() + 3, 4) + 1, g.y(str10, '@', 0, 6));
                    default:
                        String str12 = url.g;
                        int iY5 = g.y(str12, '#', 0, 6) + 1;
                        return iY5 == 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str12.substring(iY5);
                }
            }
        });
        final int i6 = 4;
        this.r = kotlin.c.b(new Function0(this) { // from class: hl1
            public final /* synthetic */ Url b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i6;
                Url url = this.b;
                switch (i32) {
                    case 0:
                        String str6 = url.g;
                        int iY = g.y(str6, '?', 0, 6) + 1;
                        if (iY == 0) {
                            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        int iY2 = g.y(str6, '#', iY, 4);
                        return iY2 == -1 ? str6.substring(iY) : str6.substring(iY, iY2);
                    case 1:
                        String str7 = url.g;
                        int iY3 = g.y(str7, '/', url.l.a.length() + 3, 4);
                        if (iY3 == -1) {
                            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        int iY4 = g.y(str7, '#', iY3, 4);
                        return iY4 == -1 ? str7.substring(iY3) : str7.substring(iY3, iY4);
                    case 2:
                        String str8 = url.g;
                        String str9 = url.d;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        int length = url.l.a.length() + 3;
                        return str8.substring(length, StringsKt__StringsKt.f(str8, new char[]{':', '@'}, length, false));
                    case 3:
                        String str10 = url.g;
                        String str11 = url.e;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str10.substring(g.y(str10, ':', url.l.a.length() + 3, 4) + 1, g.y(str10, '@', 0, 6));
                    default:
                        String str12 = url.g;
                        int iY5 = g.y(str12, '#', 0, 6) + 1;
                        return iY5 == 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str12.substring(iY5);
                }
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Url.class != obj.getClass()) {
            return false;
        }
        return this.g.equals(((Url) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getG() {
        return this.g;
    }
}
