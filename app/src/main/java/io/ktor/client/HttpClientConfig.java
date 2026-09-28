package io.ktor.client;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ng;
import defpackage.t;
import defpackage.z3;
import io.ktor.client.engine.HttpClientEngineConfig;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.util.AttributeKey;
import io.ktor.util.d;
import io.ktor.utils.io.KtorDsl;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@KtorDsl
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lio/ktor/client/engine/HttpClientEngineConfig;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpClientConfig<T extends HttpClientEngineConfig> {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final z3 d = new z3(18);
    public boolean e = true;
    public boolean f = true;

    public HttpClientConfig() {
        boolean z = d.a;
    }

    public final void a(HttpClientPlugin httpClientPlugin, Function1 function1) {
        httpClientPlugin.getClass();
        AttributeKey c = httpClientPlugin.getC();
        LinkedHashMap linkedHashMap = this.b;
        linkedHashMap.put(httpClientPlugin.getC(), new ng(2, (Function1) linkedHashMap.get(c), function1));
        AttributeKey c2 = httpClientPlugin.getC();
        LinkedHashMap linkedHashMap2 = this.a;
        if (linkedHashMap2.containsKey(c2)) {
            return;
        }
        linkedHashMap2.put(httpClientPlugin.getC(), new t(httpClientPlugin, 10));
    }
}
