package io.ktor.client.request;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ay2;
import defpackage.ge0;
import defpackage.h31;
import defpackage.kf2;
import defpackage.o0;
import defpackage.v10;
import defpackage.xu;
import io.ktor.client.engine.HttpClientEngineCapability;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HeadersImpl;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.http.HttpMethod;
import io.ktor.http.URLBuilder;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.reflect.TypeInfo;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/http/HttpMessageBuilder;", "<init>", "()V", "Companion", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpRequestBuilder implements HttpMessageBuilder {
    public static final /* synthetic */ int g = 0;
    public final URLBuilder a = new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null);
    public HttpMethod b;
    public final HeadersBuilder c;
    public Object d;
    public Job e;
    public final Attributes f;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    public HttpRequestBuilder() {
        HttpMethod.b.getClass();
        this.b = HttpMethod.c;
        this.c = new HeadersBuilder(0, 1, null);
        this.d = v10.a;
        this.e = kotlinx.coroutines.a.c();
        this.f = io.ktor.util.a.a();
    }

    public final HttpRequestData a() {
        Url urlB = this.a.b();
        HttpMethod httpMethod = this.b;
        HeadersImpl headersImplD = this.c.build();
        Object obj = this.d;
        OutgoingContent outgoingContent = obj instanceof OutgoingContent ? (OutgoingContent) obj : null;
        if (outgoingContent != null) {
            return new HttpRequestData(urlB, httpMethod, headersImplD, outgoingContent, this.e, this.f);
        }
        throw new IllegalStateException(("No request transformation found: " + this.d).toString());
    }

    public final void b(TypeInfo typeInfo) {
        Attributes attributes = this.f;
        if (typeInfo != null) {
            attributes.put(h31.a, typeInfo);
        } else {
            attributes.remove(h31.a);
        }
    }

    public final void c(HttpClientEngineCapability httpClientEngineCapability, Object obj) {
        ((Map) this.f.computeIfAbsent(ge0.a, new o0(17))).put(httpClientEngineCapability, obj);
    }

    public final void d(HttpRequestBuilder httpRequestBuilder) {
        httpRequestBuilder.getClass();
        this.b = httpRequestBuilder.b;
        this.d = httpRequestBuilder.d;
        Attributes attributes = httpRequestBuilder.f;
        b((TypeInfo) attributes.getOrNull(h31.a));
        URLBuilder uRLBuilder = httpRequestBuilder.a;
        URLBuilder uRLBuilder2 = this.a;
        kf2.w(uRLBuilder2, uRLBuilder);
        uRLBuilder2.d(uRLBuilder2.h);
        ay2.b(this.c, httpRequestBuilder.c);
        Attributes attributes2 = this.f;
        attributes2.getClass();
        attributes.getClass();
        Iterator<T> it = attributes.getAllKeys().iterator();
        while (it.hasNext()) {
            AttributeKey attributeKey = (AttributeKey) it.next();
            attributeKey.getClass();
            attributes2.put(attributeKey, attributes.get(attributeKey));
        }
    }

    @Override // io.ktor.http.HttpMessageBuilder
    /* JADX INFO: renamed from: getHeaders, reason: from getter */
    public final HeadersBuilder getC() {
        return this.c;
    }
}
