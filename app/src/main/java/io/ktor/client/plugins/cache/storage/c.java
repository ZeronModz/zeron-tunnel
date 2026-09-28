package io.ktor.client.plugins.cache.storage;

import defpackage.de0;
import io.ktor.client.HttpClient;
import io.ktor.client.call.SavedHttpCall;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.statement.HttpResponse;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final HttpResponse a(CachedResponseData cachedResponseData, HttpClient httpClient, HttpRequest httpRequest, CoroutineContext coroutineContext) {
        cachedResponseData.getClass();
        httpClient.getClass();
        coroutineContext.getClass();
        return new SavedHttpCall(httpClient, httpRequest, new de0(cachedResponseData, coroutineContext), cachedResponseData.i).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(io.ktor.client.plugins.cache.storage.CacheStorage r19, io.ktor.client.statement.HttpResponse r20, java.util.Map r21, boolean r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) throws java.lang.Throwable {
        /*
            r0 = r23
            boolean r1 = r0 instanceof io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$3
            if (r1 == 0) goto L15
            r1 = r0
            io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$3 r1 = (io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$3) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$3 r1 = new io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$3
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 1
            r5 = 2
            r6 = 0
            if (r3 == 0) goto L50
            if (r3 == r4) goto L37
            if (r3 != r5) goto L31
            java.lang.Object r1 = r1.L$0
            io.ktor.client.plugins.cache.storage.CachedResponseData r1 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r1
            kotlin.d.b(r0)
            return r1
        L31:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r0)
            return r6
        L37:
            boolean r3 = r1.Z$0
            java.lang.Object r4 = r1.L$3
            io.ktor.http.Url r4 = (io.ktor.http.Url) r4
            java.lang.Object r7 = r1.L$2
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r8 = r1.L$1
            io.ktor.client.statement.HttpResponse r8 = (io.ktor.client.statement.HttpResponse) r8
            java.lang.Object r9 = r1.L$0
            io.ktor.client.plugins.cache.storage.CacheStorage r9 = (io.ktor.client.plugins.cache.storage.CacheStorage) r9
            kotlin.d.b(r0)
            r17 = r7
            r7 = r9
            goto L83
        L50:
            kotlin.d.b(r0)
            io.ktor.client.call.HttpClientCall r0 = r20.getA()
            io.ktor.client.request.HttpRequest r0 = r0.c()
            io.ktor.http.Url r0 = r0.getC()
            io.ktor.utils.io.ByteReadChannel r3 = r20.getG()
            r7 = r19
            r1.L$0 = r7
            r8 = r20
            r1.L$1 = r8
            r9 = r21
            r1.L$2 = r9
            r1.L$3 = r0
            r10 = r22
            r1.Z$0 = r10
            r1.label = r4
            java.lang.Object r3 = io.ktor.utils.io.c.s(r3, r1)
            if (r3 != r2) goto L7e
            goto Lc6
        L7e:
            r4 = r0
            r0 = r3
            r17 = r9
            r3 = r10
        L83:
            kotlinx.io.Source r0 = (kotlinx.io.Source) r0
            r0.getClass()
            r9 = -1
            byte[] r18 = defpackage.mc2.D(r0, r9)
            io.ktor.client.call.HttpClientCall r0 = r8.getA()
            io.ktor.client.request.HttpRequest r0 = r0.c()
            io.ktor.http.Url r10 = r0.getC()
            io.ktor.http.HttpStatusCode r11 = r8.getC()
            io.ktor.util.date.GMTDate r12 = r8.getE()
            io.ktor.http.Headers r16 = r8.getH()
            io.ktor.http.HttpProtocolVersion r14 = r8.getD()
            io.ktor.util.date.GMTDate r13 = r8.getF()
            io.ktor.util.date.GMTDate r15 = io.ktor.client.plugins.cache.a.b(r8, r3)
            io.ktor.client.plugins.cache.storage.CachedResponseData r9 = new io.ktor.client.plugins.cache.storage.CachedResponseData
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.L$0 = r9
            r1.L$1 = r6
            r1.L$2 = r6
            r1.L$3 = r6
            r1.label = r5
            java.lang.Object r0 = r7.store(r4, r9, r1)
            if (r0 != r2) goto Lc7
        Lc6:
            return r2
        Lc7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.c.b(io.ktor.client.plugins.cache.storage.CacheStorage, io.ktor.client.statement.HttpResponse, java.util.Map, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(io.ktor.client.plugins.cache.storage.HttpCacheStorage r4, io.ktor.http.Url r5, io.ktor.client.statement.HttpResponse r6, boolean r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$1 r0 = (io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$1 r0 = new io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.L$1
            r5 = r4
            io.ktor.http.Url r5 = (io.ktor.http.Url) r5
            java.lang.Object r4 = r0.L$0
            io.ktor.client.plugins.cache.storage.HttpCacheStorage r4 = (io.ktor.client.plugins.cache.storage.HttpCacheStorage) r4
            kotlin.d.b(r8)
            goto L47
        L30:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r4)
            r4 = 0
            return r4
        L37:
            kotlin.d.b(r8)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r8 = io.ktor.client.plugins.cache.a.a(r7, r6, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            io.ktor.client.plugins.cache.HttpCacheEntry r8 = (io.ktor.client.plugins.cache.HttpCacheEntry) r8
            r4.c(r5, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.c.c(io.ktor.client.plugins.cache.storage.HttpCacheStorage, io.ktor.http.Url, io.ktor.client.statement.HttpResponse, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
