package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.eo;
import defpackage.hz;
import defpackage.ii2;
import defpackage.mu;
import defpackage.sb2;
import defpackage.sg;
import defpackage.t;
import defpackage.xm;
import defpackage.xu;
import defpackage.z10;
import defpackage.zu0;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.io.Buffer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0013Bm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lio/ktor/http/URLBuilder;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/http/URLProtocol;", "protocol", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "host", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "port", "user", "password", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "pathSegments", "Lio/ktor/http/Parameters;", "parameters", "fragment", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "trailingQuery", "<init>", "(Lio/ktor/http/URLProtocol;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/ktor/http/Parameters;Ljava/lang/String;Z)V", "Companion", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class URLBuilder {
    public static final Url k;
    public String a;
    public boolean b;
    public int c;
    public URLProtocol d;
    public String e;
    public String f;
    public String g;
    public List h;
    public ParametersBuilder i;
    public UrlDecodedParametersBuilder j;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/http/URLBuilder$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/http/Url;", "originUrl", "Lio/ktor/http/Url;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "INITIAL_CAPACITY", "I", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
        URLBuilder uRLBuilder = new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null);
        f.b(uRLBuilder, "http://localhost");
        k = uRLBuilder.b();
    }

    public URLBuilder(URLProtocol uRLProtocol, String str, int i, String str2, String str3, List<String> list, Parameters parameters, String str4, boolean z) {
        str.getClass();
        list.getClass();
        parameters.getClass();
        str4.getClass();
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = uRLProtocol;
        this.e = str2 != null ? eo.e(str2, false) : null;
        this.f = str3 != null ? eo.e(str3, false) : null;
        Set set = eo.a;
        Charset charset = xm.a;
        charset.getClass();
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        charsetEncoderNewEncoder.getClass();
        int length = str4.length();
        Buffer buffer = new Buffer();
        ii2.g(charsetEncoderNewEncoder, buffer, str4, 0, length);
        eo.f(buffer, new t(sb, 2));
        this.g = sb.toString();
        ArrayList arrayList = new ArrayList(kotlin.collections.c.l(list, 10));
        for (String str5 : list) {
            str5.getClass();
            StringBuilder sb2 = new StringBuilder();
            Charset charset2 = xm.a;
            int i2 = 0;
            while (i2 < str5.length()) {
                char cCharAt = str5.charAt(i2);
                if (eo.b.contains(Character.valueOf(cCharAt)) || eo.d.contains(Character.valueOf(cCharAt))) {
                    sb2.append(cCharAt);
                    i2++;
                } else {
                    int i3 = (55296 > cCharAt || cCharAt >= 57344) ? 1 : 2;
                    CharsetEncoder charsetEncoderNewEncoder2 = charset2.newEncoder();
                    charsetEncoderNewEncoder2.getClass();
                    int i4 = i3 + i2;
                    Buffer buffer2 = new Buffer();
                    ii2.g(charsetEncoderNewEncoder2, buffer2, str5, i2, i4);
                    int i5 = sg.a;
                    while (!buffer2.exhausted()) {
                        while (!buffer2.exhausted()) {
                            sb2.append(eo.g(buffer2.readByte()));
                        }
                    }
                    i2 = i4;
                }
            }
            arrayList.add(sb2.toString());
        }
        this.h = arrayList;
        ParametersBuilderImpl parametersBuilderImplA = sb2.a();
        mu.a(parametersBuilderImplA, parameters);
        this.i = parametersBuilderImplA;
        this.j = new UrlDecodedParametersBuilder(parametersBuilderImplA);
    }

    public final void a() {
        if (this.a.length() <= 0 && !c().a.equals("file")) {
            Url url = k;
            this.a = url.a;
            if (this.d == null) {
                this.d = url.k;
            }
            if (this.c == 0) {
                e(url.b);
            }
        }
    }

    public final Url b() {
        a();
        URLProtocol uRLProtocol = this.d;
        String str = this.a;
        int i = this.c;
        List list = this.h;
        ArrayList arrayList = new ArrayList(kotlin.collections.c.l(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(eo.c((String) it.next()));
        }
        Parameters parametersJ = mu.j(this.j.a);
        String strD = eo.d(0, 0, this.g, 15);
        String str2 = this.e;
        String strC = str2 != null ? eo.c(str2) : null;
        String str3 = this.f;
        String strC2 = str3 != null ? eo.c(str3) : null;
        boolean z = this.b;
        a();
        StringBuilder sb = new StringBuilder(256);
        e.a(this, sb);
        return new Url(uRLProtocol, str, i, arrayList, parametersJ, strD, strC, strC2, z, sb.toString());
    }

    public final URLProtocol c() {
        URLProtocol uRLProtocol = this.d;
        if (uRLProtocol != null) {
            return uRLProtocol;
        }
        URLProtocol.c.getClass();
        return URLProtocol.d;
    }

    public final void d(List list) {
        list.getClass();
        this.h = list;
    }

    public final void e(int i) {
        if (i < 0 || i >= 65536) {
            zu0.e(hz.o(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
        } else {
            this.c = i;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(256);
        e.a(this, sb);
        return sb.toString();
    }

    public URLBuilder() {
        this(null, null, 0, null, null, null, null, null, false, 511, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public URLBuilder(URLProtocol uRLProtocol, String str, int i, String str2, String str3, List list, Parameters parameters, String str4, boolean z, int i2, xu xuVar) {
        uRLProtocol = (i2 & 1) != 0 ? null : uRLProtocol;
        str = (i2 & 2) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str;
        i = (i2 & 4) != 0 ? 0 : i;
        str2 = (i2 & 8) != 0 ? null : str2;
        str3 = (i2 & 16) != 0 ? null : str3;
        list = (i2 & 32) != 0 ? EmptyList.INSTANCE : list;
        if ((i2 & 64) != 0) {
            Parameters.Companion.getClass();
            parameters = z10.a;
        }
        this(uRLProtocol, str, i, str2, str3, list, parameters, (i2 & 128) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str4, (i2 & 256) != 0 ? false : z);
    }
}
