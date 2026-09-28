package io.ktor.client.plugins.cookies;

import defpackage.eo;
import defpackage.if3;
import defpackage.mc2;
import defpackage.p60;
import defpackage.pr;
import defpackage.qr;
import defpackage.u7;
import defpackage.vd;
import defpackage.vh;
import defpackage.yg0;
import io.ktor.http.Cookie;
import io.ktor.http.CookieEncoding;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.g;
import kotlinx.io.Buffer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class HttpCookiesKt$renderClientCookies$1 extends FunctionReferenceImpl implements Function1<Cookie, String> {
    public static final HttpCookiesKt$renderClientCookies$1 INSTANCE = new HttpCookiesKt$renderClientCookies$1();

    public HttpCookiesKt$renderClientCookies$1() {
        super(1, qr.class, "renderCookieHeader", "renderCookieHeader(Lio/ktor/http/Cookie;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(Cookie cookie) {
        cookie.getClass();
        Set set = qr.a;
        StringBuilder sb = new StringBuilder();
        sb.append(cookie.a);
        sb.append('=');
        String strF = cookie.b;
        CookieEncoding cookieEncoding = cookie.c;
        strF.getClass();
        cookieEncoding.getClass();
        int i = pr.a[cookieEncoding.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (g.p(strF, '\"')) {
                    u7.r("The cookie value contains characters that cannot be encoded in DQUOTES format. Consider URL_ENCODING mode");
                    return null;
                }
                for (int i2 = 0; i2 < strF.length(); i2++) {
                    char cCharAt = strF.charAt(i2);
                    if (kotlin.text.a.c(cCharAt) || yg0.q(cCharAt, 32) < 0 || qr.c.contains(Character.valueOf(cCharAt))) {
                        strF = vh.f('\"', "\"", strF);
                        break;
                    }
                }
            } else if (i == 3) {
                int[] iArr = vd.a;
                Buffer buffer = new Buffer();
                if3.P(buffer, strF);
                strF = vd.a(mc2.D(buffer, -1));
            } else {
                if (i != 4) {
                    p60.b();
                    return null;
                }
                strF = eo.e(strF, true);
            }
        }
        sb.append(strF);
        return sb.toString();
    }
}
