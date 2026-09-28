package io.ktor.client.engine.okhttp;

import defpackage.sl1;
import io.ktor.client.engine.okhttp.OkHttpEngine;
import io.ktor.client.plugins.HttpTimeoutConfig;
import io.ktor.client.plugins.n;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import org.slf4j.Logger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class OkHttpEngine$clientCache$1 extends FunctionReferenceImpl implements Function1<HttpTimeoutConfig, OkHttpClient> {
    public OkHttpEngine$clientCache$1(Object obj) {
        super(1, obj, OkHttpEngine.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeoutConfig;)Lokhttp3/OkHttpClient;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final OkHttpClient invoke(HttpTimeoutConfig httpTimeoutConfig) {
        OkHttpEngine okHttpEngine = (OkHttpEngine) this.receiver;
        OkHttpEngine.Companion companion = OkHttpEngine.k;
        OkHttpConfig okHttpConfig = okHttpEngine.f;
        okHttpConfig.getClass();
        OkHttpEngine.k.getClass();
        OkHttpClient okHttpClient = (OkHttpClient) OkHttpEngine.l.getValue();
        okHttpClient.getClass();
        OkHttpClient.Builder builder = new OkHttpClient.Builder(okHttpClient);
        builder.a = new Dispatcher();
        okHttpConfig.a.invoke(builder);
        if (httpTimeoutConfig != null) {
            Long l = httpTimeoutConfig.b;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (l != null) {
                long jLongValue = l.longValue();
                Logger logger = n.a;
                if (jLongValue == Long.MAX_VALUE) {
                    jLongValue = 0;
                }
                timeUnit.getClass();
                builder.v = sl1.b("timeout", jLongValue, timeUnit);
            }
            Long l2 = httpTimeoutConfig.c;
            if (l2 != null) {
                long jLongValue2 = l2.longValue();
                Logger logger2 = n.a;
                long j = jLongValue2 == Long.MAX_VALUE ? 0L : jLongValue2;
                timeUnit.getClass();
                builder.w = sl1.b("timeout", j, timeUnit);
                builder.x = sl1.b("timeout", jLongValue2 != Long.MAX_VALUE ? jLongValue2 : 0L, timeUnit);
            }
        }
        return new OkHttpClient(builder);
    }
}
