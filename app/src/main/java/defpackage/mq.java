package defpackage;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.ExchangeFinder;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class mq implements Interceptor {
    public static final mq a = new mq();

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        chain.getClass();
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        RealCall realCall = realInterceptorChain.a;
        synchronized (realCall) {
            try {
                if (!realCall.o) {
                    throw new IllegalStateException("released");
                }
                if (realCall.n) {
                    throw new IllegalStateException("Check failed.");
                }
                if (realCall.m) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ExchangeFinder exchangeFinder = realCall.i;
        exchangeFinder.getClass();
        OkHttpClient okHttpClient = realCall.a;
        try {
            Exchange exchange = new Exchange(realCall, realCall.e, exchangeFinder, exchangeFinder.a(realInterceptorChain.f, okHttpClient.f, !realInterceptorChain.e.b.equals("GET"), realInterceptorChain.g, realInterceptorChain.h).k(okHttpClient, realInterceptorChain));
            realCall.l = exchange;
            realCall.q = exchange;
            synchronized (realCall) {
                realCall.m = true;
                realCall.n = true;
            }
            if (!realCall.p) {
                return RealInterceptorChain.a(realInterceptorChain, 0, exchange, null, 0, 0, 0, 61).proceed(realInterceptorChain.e);
            }
            p60.f("Canceled");
            return null;
        } catch (IOException e) {
            exchangeFinder.b(e);
            throw new RouteException(e);
        } catch (RouteException e2) {
            exchangeFinder.b(e2.getLastConnectException());
            throw e2;
        }
    }
}
