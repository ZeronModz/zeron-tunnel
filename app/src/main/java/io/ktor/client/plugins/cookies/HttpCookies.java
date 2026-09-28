package io.ktor.client.plugins.cookies;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import defpackage.oy;
import defpackage.tb0;
import defpackage.xu;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.KtorDsl;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeReference;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u000e\u000fB@\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012-\u0010\u000b\u001a)\u0012%\u0012#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n0\u0005¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lio/ktor/client/plugins/cookies/HttpCookies;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "storage", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lmk1;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lkotlin/ExtensionFunctionType;", "defaults", "<init>", "(Lio/ktor/client/plugins/cookies/CookiesStorage;Ljava/util/List;)V", "Config", "Companion", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpCookies implements Closeable {
    public static final Companion d = new Companion(null);
    public static final AttributeKey e;
    public final CookiesStorage a;
    public final List b;
    public final Job c;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/cookies/HttpCookies$Companion;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/cookies/HttpCookies$Config;", "Lio/ktor/client/plugins/cookies/HttpCookies;", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements HttpClientPlugin<Config, HttpCookies> {
        public Companion(xu xuVar) {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        /* JADX INFO: renamed from: getKey */
        public final AttributeKey<HttpCookies> getC() {
            return HttpCookies.e;
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final void install(HttpCookies httpCookies, HttpClient httpClient) {
            HttpCookies httpCookies2 = httpCookies;
            httpCookies2.getClass();
            httpClient.getClass();
            HttpRequestPipeline httpRequestPipeline = httpClient.e;
            HttpRequestPipeline.g.getClass();
            httpRequestPipeline.g(HttpRequestPipeline.i, new HttpCookies$Companion$install$1(httpCookies2, null));
            HttpSendPipeline httpSendPipeline = httpClient.g;
            HttpSendPipeline.g.getClass();
            httpSendPipeline.g(HttpSendPipeline.i, new HttpCookies$Companion$install$2(httpCookies2, null));
            HttpReceivePipeline httpReceivePipeline = httpClient.h;
            HttpReceivePipeline.g.getClass();
            httpReceivePipeline.g(HttpReceivePipeline.i, new HttpCookies$Companion$install$3(httpCookies2, null));
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final HttpCookies prepare(Function1<? super Config, mk1> function1) {
            function1.getClass();
            Config config = new Config();
            function1.invoke(config);
            return new HttpCookies(config.b, config.a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @KtorDsl
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/cookies/HttpCookies$Config;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Config {
        public final ArrayList a = new ArrayList();
        public final AcceptAllCookiesStorage b = new AcceptAllCookiesStorage(null, 1, 0 == true ? 1 : 0);
    }

    static {
        TypeReference typeReferenceB = null;
        ClassReference classReferenceA = Reflection.a(HttpCookies.class);
        try {
            typeReferenceB = Reflection.b(HttpCookies.class);
        } catch (Throwable unused) {
        }
        e = new AttributeKey("HttpCookies", new TypeInfo(classReferenceA, typeReferenceB));
    }

    public HttpCookies(CookiesStorage cookiesStorage, List<? extends Function2<? super CookiesStorage, ? super Continuation<? super mk1>, ? extends Object>> list) {
        cookiesStorage.getClass();
        list.getClass();
        this.a = cookiesStorage;
        this.b = list;
        this.c = kotlinx.coroutines.c.d(tb0.a, oy.b, null, new HttpCookies$initializer$1(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(io.ktor.client.request.HttpRequestBuilder r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.HttpCookies.a(io.ktor.client.request.HttpRequestBuilder, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(io.ktor.http.Url r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.ktor.client.plugins.cookies.HttpCookies$get$1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.plugins.cookies.HttpCookies$get$1 r0 = (io.ktor.client.plugins.cookies.HttpCookies$get$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cookies.HttpCookies$get$1 r0 = new io.ktor.client.plugins.cookies.HttpCookies$get$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            kotlin.d.b(r8)
            return r8
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            return r3
        L31:
            java.lang.Object r6 = r0.L$1
            r7 = r6
            io.ktor.http.Url r7 = (io.ktor.http.Url) r7
            java.lang.Object r6 = r0.L$0
            io.ktor.client.plugins.cookies.HttpCookies r6 = (io.ktor.client.plugins.cookies.HttpCookies) r6
            kotlin.d.b(r8)
            goto L50
        L3e:
            kotlin.d.b(r8)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r5
            kotlinx.coroutines.Job r8 = r6.c
            java.lang.Object r8 = r8.join(r0)
            if (r8 != r1) goto L50
            goto L5e
        L50:
            io.ktor.client.plugins.cookies.CookiesStorage r6 = r6.a
            r0.L$0 = r3
            r0.L$1 = r3
            r0.label = r4
            java.lang.Object r6 = r6.get(r7, r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.HttpCookies.b(io.ktor.http.Url, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [io.ktor.util.date.GMTDate] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(io.ktor.client.statement.HttpResponse r32, kotlin.coroutines.jvm.internal.ContinuationImpl r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 977
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.HttpCookies.c(io.ktor.client.statement.HttpResponse, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(io.ktor.client.request.HttpRequestBuilder r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) throws java.lang.Throwable {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r2 instanceof io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1
            if (r3 == 0) goto L19
            r3 = r2
            io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1 r3 = (io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.label = r4
            goto L1e
        L19:
            io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1 r3 = new io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r3.label
            r6 = 1
            if (r5 == 0) goto L38
            if (r5 != r6) goto L31
            java.lang.Object r0 = r3.L$0
            io.ktor.client.request.HttpRequestBuilder r0 = (io.ktor.client.request.HttpRequestBuilder) r0
            kotlin.d.b(r2)
            goto L66
        L31:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r0)
            r0 = 0
            return r0
        L38:
            kotlin.d.b(r2)
            io.ktor.http.URLBuilder r2 = r1.a
            r2.getClass()
            io.ktor.http.URLBuilder r7 = new io.ktor.http.URLBuilder
            r17 = 511(0x1ff, float:7.16E-43)
            r18 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            defpackage.kf2.w(r7, r2)
            io.ktor.http.Url r2 = r7.b()
            r3.L$0 = r1
            r3.label = r6
            java.lang.Object r2 = r0.b(r2, r3)
            if (r2 != r4) goto L65
            return r4
        L65:
            r0 = r1
        L66:
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            boolean r1 = r3.isEmpty()
            java.lang.String r2 = "Cookie"
            if (r1 != 0) goto L9d
            org.slf4j.Logger r1 = io.ktor.client.plugins.cookies.c.a
            io.ktor.client.plugins.cookies.HttpCookiesKt$renderClientCookies$1 r7 = io.ktor.client.plugins.cookies.HttpCookiesKt$renderClientCookies$1.INSTANCE
            r8 = 30
            java.lang.String r4 = "; "
            r5 = 0
            r6 = 0
            java.lang.String r1 = kotlin.collections.c.w(r3, r4, r5, r6, r7, r8)
            io.ktor.http.HeadersBuilder r3 = r0.c
            java.util.List r4 = defpackage.le0.a
            r3.set(r2, r1)
            org.slf4j.Logger r2 = io.ktor.client.plugins.cookies.c.a
            java.lang.String r3 = "Sending cookie "
            java.lang.String r4 = " for "
            java.lang.StringBuilder r1 = defpackage.vh.x(r3, r1, r4)
            io.ktor.http.URLBuilder r0 = r0.a
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.trace(r0)
            goto La9
        L9d:
            io.ktor.http.HeadersBuilder r0 = r0.c
            java.util.List r1 = defpackage.le0.a
            r0.getClass()
            java.util.Map r0 = r0.b
            r0.remove(r2)
        La9:
            mk1 r0 = defpackage.mk1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.HttpCookies.d(io.ktor.client.request.HttpRequestBuilder, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
