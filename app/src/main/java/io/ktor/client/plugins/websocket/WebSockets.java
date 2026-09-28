package io.ktor.client.plugins.websocket;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import defpackage.pp1;
import defpackage.xu;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.serialization.WebsocketContentConverter;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.KtorDsl;
import io.ktor.websocket.WebSocketExtensionsConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\r\u000eB-\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u000bB\t\b\u0016¢\u0006\u0004\b\t\u0010\f¨\u0006\u000f"}, d2 = {"Lio/ktor/client/plugins/websocket/WebSockets;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "pingIntervalMillis", "maxFrameSize", "Lio/ktor/websocket/WebSocketExtensionsConfig;", "extensionsConfig", "Lio/ktor/serialization/WebsocketContentConverter;", "contentConverter", "<init>", "(JJLio/ktor/websocket/WebSocketExtensionsConfig;Lio/ktor/serialization/WebsocketContentConverter;)V", "(JJ)V", "()V", "Config", "Plugin", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebSockets {
    public static final Plugin e = new Plugin(null);
    public static final AttributeKey f;
    public final long a;
    public final long b;
    public final WebSocketExtensionsConfig c;
    public final WebsocketContentConverter d;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @KtorDsl
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/websocket/WebSockets$Config;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Config {
        public final WebSocketExtensionsConfig a = new WebSocketExtensionsConfig();
        public final long b = 2147483647L;
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/websocket/WebSockets$Plugin;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/websocket/WebSockets$Config;", "Lio/ktor/client/plugins/websocket/WebSockets;", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Plugin implements HttpClientPlugin<Config, WebSockets> {
        public Plugin(xu xuVar) {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        /* JADX INFO: renamed from: getKey */
        public final AttributeKey<WebSockets> getC() {
            return WebSockets.f;
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final void install(WebSockets webSockets, HttpClient httpClient) {
            WebSockets webSockets2 = webSockets;
            webSockets2.getClass();
            httpClient.getClass();
            boolean zContains = httpClient.a.getG().contains(pp1.a);
            HttpRequestPipeline httpRequestPipeline = httpClient.e;
            HttpRequestPipeline.g.getClass();
            httpRequestPipeline.g(HttpRequestPipeline.k, new WebSockets$Plugin$install$1(zContains, webSockets2, null));
            HttpResponsePipeline httpResponsePipeline = httpClient.f;
            HttpResponsePipeline.g.getClass();
            httpResponsePipeline.g(HttpResponsePipeline.j, new WebSockets$Plugin$install$2(webSockets2, zContains, null));
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final WebSockets prepare(Function1<? super Config, mk1> function1) {
            function1.getClass();
            Config config = new Config();
            function1.invoke(config);
            return new WebSockets(0L, config.b, config.a, (WebsocketContentConverter) null);
        }
    }

    static {
        TypeReference typeReferenceB = null;
        ClassReference classReferenceA = Reflection.a(WebSockets.class);
        try {
            typeReferenceB = Reflection.b(WebSockets.class);
        } catch (Throwable unused) {
        }
        f = new AttributeKey("Websocket", new TypeInfo(classReferenceA, typeReferenceB));
    }

    public WebSockets() {
        this(0L, 2147483647L, new WebSocketExtensionsConfig(), null, 8, null);
    }

    public /* synthetic */ WebSockets(long j, long j2, WebSocketExtensionsConfig webSocketExtensionsConfig, WebsocketContentConverter websocketContentConverter, int i, xu xuVar) {
        this(j, j2, webSocketExtensionsConfig, (i & 8) != 0 ? null : websocketContentConverter);
    }

    public /* synthetic */ WebSockets(long j, long j2, int i, xu xuVar) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 2147483647L : j2);
    }

    public WebSockets(long j, long j2) {
        this(j, j2, new WebSocketExtensionsConfig(), null, 8, null);
    }

    public WebSockets(long j, long j2, WebSocketExtensionsConfig webSocketExtensionsConfig, WebsocketContentConverter websocketContentConverter) {
        webSocketExtensionsConfig.getClass();
        this.a = j;
        this.b = j2;
        this.c = webSocketExtensionsConfig;
        this.d = websocketContentConverter;
    }
}
