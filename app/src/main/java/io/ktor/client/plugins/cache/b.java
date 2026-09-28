package io.ktor.client.plugins.cache;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(io.ktor.client.plugins.cache.HttpCache r7, io.ktor.client.statement.HttpResponse r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.ktor.client.plugins.cache.HttpCacheLegacyKt$cacheResponse$1
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.client.plugins.cache.HttpCacheLegacyKt$cacheResponse$1 r0 = (io.ktor.client.plugins.cache.HttpCacheLegacyKt$cacheResponse$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.HttpCacheLegacyKt$cacheResponse$1 r0 = new io.ktor.client.plugins.cache.HttpCacheLegacyKt$cacheResponse$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            kotlin.d.b(r9)
            goto L6c
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r7)
            r7 = 0
            return r7
        L2e:
            kotlin.d.b(r9)
            io.ktor.client.call.HttpClientCall r9 = r8.getA()
            io.ktor.client.request.HttpRequest r9 = r9.c()
            java.util.List r2 = io.ktor.http.c.a(r8)
            java.util.List r4 = io.ktor.http.c.a(r9)
            io.ktor.http.HeaderValue r5 = defpackage.fh.c
            boolean r5 = r2.contains(r5)
            if (r5 == 0) goto L4c
            io.ktor.client.plugins.cache.storage.HttpCacheStorage r5 = r7.b
            goto L4e
        L4c:
            io.ktor.client.plugins.cache.storage.HttpCacheStorage r5 = r7.a
        L4e:
            io.ktor.http.HeaderValue r6 = defpackage.fh.a
            boolean r2 = r2.contains(r6)
            if (r2 != 0) goto L73
            boolean r2 = r4.contains(r6)
            if (r2 == 0) goto L5d
            goto L73
        L5d:
            io.ktor.http.Url r9 = r9.getB()
            boolean r7 = r7.f
            r0.label = r3
            java.lang.Object r9 = io.ktor.client.plugins.cache.storage.c.c(r5, r9, r8, r7, r0)
            if (r9 != r1) goto L6c
            return r1
        L6c:
            io.ktor.client.plugins.cache.HttpCacheEntry r9 = (io.ktor.client.plugins.cache.HttpCacheEntry) r9
            io.ktor.client.statement.HttpResponse r7 = r9.a()
            return r7
        L73:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.b.a(io.ktor.client.plugins.cache.HttpCache, io.ktor.client.statement.HttpResponse, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(io.ktor.util.pipeline.PipelineContext r17, io.ktor.client.statement.HttpResponse r18, io.ktor.client.plugins.cache.HttpCache r19, io.ktor.client.HttpClient r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.b.b(io.ktor.util.pipeline.PipelineContext, io.ktor.client.statement.HttpResponse, io.ktor.client.plugins.cache.HttpCache, io.ktor.client.HttpClient, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
