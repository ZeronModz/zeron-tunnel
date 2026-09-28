package io.ktor.client.plugins;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ne0;
import defpackage.oe0;
import defpackage.so;
import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.plugins.HttpRequestTimeoutException;
import io.ktor.client.plugins.HttpRetryShouldRetryContext;
import io.ktor.client.plugins.l;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.utils.io.KtorDsl;
import java.net.SocketTimeoutException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.slf4j.Logger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@KtorDsl
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/HttpRequestRetryConfig;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpRequestRetryConfig {
    public final ne0 a;
    public final ne0 b;
    public final oe0 c;
    public final so d = new so(8);
    public final Function2 e = new HttpRequestRetryConfig$delay$1(null);
    public final int f;

    /* JADX WARN: Type inference failed for: r0v2, types: [ne0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ne0] */
    public HttpRequestRetryConfig() {
        final int i = 1;
        this.a = new Function3() { // from class: ne0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                HttpRetryShouldRetryContext httpRetryShouldRetryContext = (HttpRetryShouldRetryContext) obj;
                switch (i) {
                    case 0:
                        Throwable th = (Throwable) obj3;
                        httpRetryShouldRetryContext.getClass();
                        ((HttpRequestBuilder) obj2).getClass();
                        th.getClass();
                        Logger logger = l.a;
                        Throwable thW = ay2.w(th);
                        return Boolean.valueOf(((thW instanceof HttpRequestTimeoutException) || (thW instanceof ConnectTimeoutException) || (thW instanceof SocketTimeoutException) || (th instanceof CancellationException)) ? false : true);
                    default:
                        HttpResponse httpResponse = (HttpResponse) obj3;
                        httpRetryShouldRetryContext.getClass();
                        ((HttpRequest) obj2).getClass();
                        httpResponse.getClass();
                        int i2 = httpResponse.d().a;
                        return Boolean.valueOf(500 <= i2 && i2 < 600);
                }
            }
        };
        final int i2 = 0;
        ?? r0 = new Function3() { // from class: ne0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                HttpRetryShouldRetryContext httpRetryShouldRetryContext = (HttpRetryShouldRetryContext) obj;
                switch (i2) {
                    case 0:
                        Throwable th = (Throwable) obj3;
                        httpRetryShouldRetryContext.getClass();
                        ((HttpRequestBuilder) obj2).getClass();
                        th.getClass();
                        Logger logger = l.a;
                        Throwable thW = ay2.w(th);
                        return Boolean.valueOf(((thW instanceof HttpRequestTimeoutException) || (thW instanceof ConnectTimeoutException) || (thW instanceof SocketTimeoutException) || (th instanceof CancellationException)) ? false : true);
                    default:
                        HttpResponse httpResponse = (HttpResponse) obj3;
                        httpRetryShouldRetryContext.getClass();
                        ((HttpRequest) obj2).getClass();
                        httpResponse.getClass();
                        int i22 = httpResponse.d().a;
                        return Boolean.valueOf(500 <= i22 && i22 < 600);
                }
            }
        };
        this.f = 3;
        this.b = r0;
        this.c = new oe0(new so(this), 0);
    }
}
