package io.ktor.client.request;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ge0;
import defpackage.pe0;
import io.ktor.http.Headers;
import io.ktor.http.HttpMethod;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.Attributes;
import io.ktor.utils.io.InternalAPI;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/ktor/client/request/HttpRequestData;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/http/Url;", "url", "Lio/ktor/http/HttpMethod;", "method", "Lio/ktor/http/Headers;", "headers", "Lio/ktor/http/content/OutgoingContent;", "body", "Lkotlinx/coroutines/Job;", "executionContext", "Lio/ktor/util/Attributes;", "attributes", "<init>", "(Lio/ktor/http/Url;Lio/ktor/http/HttpMethod;Lio/ktor/http/Headers;Lio/ktor/http/content/OutgoingContent;Lkotlinx/coroutines/Job;Lio/ktor/util/Attributes;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpRequestData {
    public final Url a;
    public final HttpMethod b;
    public final Headers c;
    public final OutgoingContent d;
    public final Job e;
    public final Attributes f;
    public final Set g;

    @InternalAPI
    public HttpRequestData(Url url, HttpMethod httpMethod, Headers headers, OutgoingContent outgoingContent, Job job, Attributes attributes) {
        Set setKeySet;
        url.getClass();
        httpMethod.getClass();
        headers.getClass();
        outgoingContent.getClass();
        job.getClass();
        attributes.getClass();
        this.a = url;
        this.b = httpMethod;
        this.c = headers;
        this.d = outgoingContent;
        this.e = job;
        this.f = attributes;
        Map map = (Map) attributes.getOrNull(ge0.a);
        this.g = (map == null || (setKeySet = map.keySet()) == null) ? EmptySet.INSTANCE : setKeySet;
    }

    public final Object a() {
        Map map = (Map) this.f.getOrNull(ge0.a);
        if (map != null) {
            return map.get(pe0.a);
        }
        return null;
    }

    public final String toString() {
        return "HttpRequestData(url=" + this.a + ", method=" + this.b + ')';
    }
}
