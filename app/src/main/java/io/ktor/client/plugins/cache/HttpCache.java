package io.ktor.client.plugins.cache;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ii2;
import defpackage.mk1;
import defpackage.o0;
import defpackage.x10;
import defpackage.xu;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.plugins.cache.storage.CacheStorage;
import io.ktor.client.plugins.cache.storage.HttpCacheStorage;
import io.ktor.client.plugins.cache.storage.UnlimitedStorage;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.events.EventDefinition;
import io.ktor.http.Headers;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.AttributeKey;
import io.ktor.util.date.GMTDate;
import io.ktor.util.pipeline.InvalidPhaseException;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.pipeline.PipelinePhase;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.KtorDsl;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/cache/HttpCache;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Config", "Companion", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpCache {
    public static final Companion g = new Companion(null);
    public static final AttributeKey h;
    public static final EventDefinition i;
    public final HttpCacheStorage a;
    public final HttpCacheStorage b;
    public final CacheStorage c;
    public final CacheStorage d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/cache/HttpCache$Companion;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/cache/HttpCache$Config;", "Lio/ktor/client/plugins/cache/HttpCache;", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements HttpClientPlugin<Config, HttpCache> {
        public Companion(xu xuVar) {
        }

        public static Object a(PipelineContext pipelineContext, HttpClient httpClient, Continuation continuation) {
            pipelineContext.b();
            HttpRequestData httpRequestDataA = ((HttpRequestBuilder) pipelineContext.a).a();
            HttpStatusCode.c.getClass();
            HttpStatusCode httpStatusCode = HttpStatusCode.n;
            GMTDate gMTDateB = io.ktor.util.date.a.b(null);
            Headers.Companion.getClass();
            HttpProtocolVersion.d.getClass();
            Object objE = pipelineContext.e(new HttpClientCall(httpClient, httpRequestDataA, new HttpResponseData(httpStatusCode, gMTDateB, x10.a, HttpProtocolVersion.f, ii2.a(new byte[0]), httpRequestDataA.e)), continuation);
            return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : mk1.a;
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        /* JADX INFO: renamed from: getKey */
        public final AttributeKey<HttpCache> getC() {
            return HttpCache.h;
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final void install(HttpCache httpCache, HttpClient httpClient) throws InvalidPhaseException {
            HttpCache httpCache2 = httpCache;
            httpCache2.getClass();
            httpClient.getClass();
            PipelinePhase pipelinePhase = new PipelinePhase("Cache");
            HttpSendPipeline httpSendPipeline = httpClient.g;
            HttpSendPipeline.g.getClass();
            httpSendPipeline.f(HttpSendPipeline.i, pipelinePhase);
            httpSendPipeline.g(pipelinePhase, new HttpCache$Companion$install$1(httpCache2, httpClient, null));
            PipelinePhase pipelinePhase2 = new PipelinePhase("Cache");
            HttpReceivePipeline httpReceivePipeline = httpClient.h;
            HttpReceivePipeline.g.getClass();
            httpReceivePipeline.f(HttpReceivePipeline.i, pipelinePhase2);
            httpReceivePipeline.g(pipelinePhase2, new HttpCache$Companion$install$2(httpCache2, httpClient, null));
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final HttpCache prepare(Function1<? super Config, mk1> function1) {
            function1.getClass();
            Config config = new Config();
            function1.invoke(config);
            return new HttpCache(config.c, config.d, config.a, config.b, false, false, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @KtorDsl
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/cache/HttpCache$Config;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Config {
        public final CacheStorage a;
        public final CacheStorage b;
        public final HttpCacheStorage c;
        public final HttpCacheStorage d;

        public Config() {
            CacheStorage.Companion.getClass();
            this.a = new UnlimitedStorage();
            this.b = new UnlimitedStorage();
            HttpCacheStorage.a.getClass();
            o0 o0Var = HttpCacheStorage.b;
            this.c = (HttpCacheStorage) o0Var.invoke();
            this.d = (HttpCacheStorage) o0Var.invoke();
        }
    }

    static {
        TypeReference typeReferenceB = null;
        ClassReference classReferenceA = Reflection.a(HttpCache.class);
        try {
            typeReferenceB = Reflection.b(HttpCache.class);
        } catch (Throwable unused) {
        }
        h = new AttributeKey("HttpCache", new TypeInfo(classReferenceA, typeReferenceB));
        i = new EventDefinition();
    }

    public HttpCache(HttpCacheStorage httpCacheStorage, HttpCacheStorage httpCacheStorage2, CacheStorage cacheStorage, CacheStorage cacheStorage2, boolean z, boolean z2, xu xuVar) {
        this.a = httpCacheStorage;
        this.b = httpCacheStorage2;
        this.c = cacheStorage;
        this.d = cacheStorage2;
        this.e = z;
        this.f = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(io.ktor.client.request.HttpRequest r21, io.ktor.client.statement.HttpResponse r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.HttpCache.a(io.ktor.client.request.HttpRequest, io.ktor.client.statement.HttpResponse, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(io.ktor.client.plugins.cache.storage.CacheStorage r7, java.util.Map r8, io.ktor.http.Url r9, io.ktor.client.request.HttpRequest r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r11 instanceof io.ktor.client.plugins.cache.HttpCache$findResponse$1
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.client.plugins.cache.HttpCache$findResponse$1 r0 = (io.ktor.client.plugins.cache.HttpCache$findResponse$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.HttpCache$findResponse$1 r0 = new io.ktor.client.plugins.cache.HttpCache$findResponse$1
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r11 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L39
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            java.lang.Object r7 = r0.L$0
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            kotlin.d.b(r6)
            goto L74
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            return r2
        L35:
            kotlin.d.b(r6)
            return r6
        L39:
            kotlin.d.b(r6)
            boolean r6 = r8.isEmpty()
            if (r6 != 0) goto L4c
            r0.label = r4
            java.lang.Object r6 = r7.find(r9, r8, r0)
            if (r6 != r11) goto L4b
            goto L70
        L4b:
            return r6
        L4c:
            io.ktor.http.content.OutgoingContent r6 = r10.getD()
            io.ktor.client.plugins.cache.HttpCache$findResponse$requestHeaders$1 r8 = new io.ktor.client.plugins.cache.HttpCache$findResponse$requestHeaders$1
            io.ktor.http.Headers r1 = r10.getG()
            r8.<init>(r1)
            io.ktor.client.plugins.cache.HttpCache$findResponse$requestHeaders$2 r1 = new io.ktor.client.plugins.cache.HttpCache$findResponse$requestHeaders$2
            io.ktor.http.Headers r10 = r10.getG()
            r1.<init>(r10)
            id0 r6 = defpackage.ce0.a(r6, r8, r1)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.findAll(r9, r0)
            if (r7 != r11) goto L71
        L70:
            return r11
        L71:
            r5 = r7
            r7 = r6
            r6 = r5
        L74:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            io.ktor.client.plugins.cache.HttpCache$findResponse$$inlined$sortedByDescending$1 r8 = new io.ktor.client.plugins.cache.HttpCache$findResponse$$inlined$sortedByDescending$1
            r8.<init>()
            java.util.List r6 = kotlin.collections.c.N(r6, r8)
            java.util.Iterator r6 = r6.iterator()
        L83:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lc5
            java.lang.Object r8 = r6.next()
            r9 = r8
            io.ktor.client.plugins.cache.storage.CachedResponseData r9 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r9
            java.util.Map r9 = r9.h
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L99
            goto Lc4
        L99:
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        La1:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lc4
            java.lang.Object r10 = r9.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getKey()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r10.getValue()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r7.invoke(r11)
            boolean r10 = defpackage.yg0.a(r11, r10)
            if (r10 != 0) goto La1
            goto L83
        Lc4:
            r2 = r8
        Lc5:
            io.ktor.client.plugins.cache.storage.CachedResponseData r2 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.HttpCache.b(io.ktor.client.plugins.cache.storage.CacheStorage, java.util.Map, io.ktor.http.Url, io.ktor.client.request.HttpRequest, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(io.ktor.client.request.HttpRequestBuilder r23, io.ktor.http.content.OutgoingContent r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.HttpCache.c(io.ktor.client.request.HttpRequestBuilder, io.ktor.http.content.OutgoingContent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
