package io.ktor.client.plugins.cache.storage;

import androidx.datastore.preferences.protobuf.x0;
import com.trilead.ssh2.sftp.AttribFlags;
import io.ktor.util.collections.ConcurrentMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/client/plugins/cache/storage/CachingCacheStorage;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "delegate", "<init>", "(Lio/ktor/client/plugins/cache/storage/CacheStorage;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CachingCacheStorage implements CacheStorage {
    public final CacheStorage a;
    public final ConcurrentMap b;

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.CachingCacheStorage$find$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 0}, l = {x0.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "find", n = {"this", "url", "varyKeys"}, s = {"L$0", "L$1", "L$2"})
    final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
            return CachingCacheStorage.this.find(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.CachingCacheStorage$findAll$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0, 0}, l = {54}, m = "findAll", n = {"this", "url"}, s = {"L$0", "L$1"})
    final class C00241 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C00241(Continuation<? super C00241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
            return CachingCacheStorage.this.findAll(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.CachingCacheStorage$store$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0, 0}, l = {38, x0.SWIFT_PREFIX_FIELD_NUMBER}, m = "store", n = {"this", "url"}, s = {"L$0", "L$1"})
    final class C00251 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C00251(Continuation<? super C00251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
            return CachingCacheStorage.this.store(null, null, this);
        }
    }

    public CachingCacheStorage(CacheStorage cacheStorage) {
        cacheStorage.getClass();
        this.a = cacheStorage;
        this.b = new ConcurrentMap(0, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object find(io.ktor.http.Url r6, java.util.Map r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.client.plugins.cache.storage.CachingCacheStorage.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.plugins.cache.storage.CachingCacheStorage$find$1 r0 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.CachingCacheStorage$find$1 r0 = new io.ktor.client.plugins.cache.storage.CachingCacheStorage$find$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 != r4) goto L3d
            java.lang.Object r5 = r0.L$4
            r6 = r5
            io.ktor.http.Url r6 = (io.ktor.http.Url) r6
            java.lang.Object r5 = r0.L$3
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r7 = r0.L$2
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r1 = r0.L$1
            io.ktor.http.Url r1 = (io.ktor.http.Url) r1
            java.lang.Object r0 = r0.L$0
            io.ktor.client.plugins.cache.storage.CachingCacheStorage r0 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage) r0
            kotlin.d.b(r8)
            goto L6a
        L3d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r5)
            return r3
        L43:
            kotlin.d.b(r8)
            io.ktor.util.collections.ConcurrentMap r8 = r5.b
            java.util.concurrent.ConcurrentHashMap r2 = r8.a
            boolean r2 = r2.containsKey(r6)
            if (r2 != 0) goto L6f
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.L$3 = r8
            r0.L$4 = r6
            r0.label = r4
            io.ktor.client.plugins.cache.storage.CacheStorage r2 = r5.a
            java.lang.Object r0 = r2.findAll(r6, r0)
            if (r0 != r1) goto L65
            return r1
        L65:
            r1 = r0
            r0 = r5
            r5 = r8
            r8 = r1
            r1 = r6
        L6a:
            r5.put(r6, r8)
            r5 = r0
            r6 = r1
        L6f:
            io.ktor.util.collections.ConcurrentMap r5 = r5.b
            java.lang.Object r5 = kotlin.collections.d.b(r6, r5)
            java.util.Set r5 = (java.util.Set) r5
            java.util.Iterator r5 = r5.iterator()
        L7b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lbd
            java.lang.Object r6 = r5.next()
            r8 = r6
            io.ktor.client.plugins.cache.storage.CachedResponseData r8 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r8
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L8f
            goto Lbc
        L8f:
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L97:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lbc
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map r4 = r8.h
            java.lang.Object r2 = r4.get(r2)
            boolean r1 = defpackage.yg0.a(r2, r1)
            if (r1 != 0) goto L97
            goto L7b
        Lbc:
            return r6
        Lbd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.CachingCacheStorage.find(io.ktor.http.Url, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object findAll(io.ktor.http.Url r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.plugins.cache.storage.CachingCacheStorage.C00241
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.cache.storage.CachingCacheStorage$findAll$1 r0 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage.C00241) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.CachingCacheStorage$findAll$1 r0 = new io.ktor.client.plugins.cache.storage.CachingCacheStorage$findAll$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L38
            java.lang.Object r4 = r0.L$3
            r5 = r4
            io.ktor.http.Url r5 = (io.ktor.http.Url) r5
            java.lang.Object r4 = r0.L$2
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r1 = r0.L$1
            io.ktor.http.Url r1 = (io.ktor.http.Url) r1
            java.lang.Object r0 = r0.L$0
            io.ktor.client.plugins.cache.storage.CachingCacheStorage r0 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage) r0
            kotlin.d.b(r6)
            goto L64
        L38:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r4)
            r4 = 0
            return r4
        L3f:
            kotlin.d.b(r6)
            io.ktor.util.collections.ConcurrentMap r6 = r4.b
            java.util.concurrent.ConcurrentHashMap r2 = r6.a
            boolean r2 = r2.containsKey(r5)
            if (r2 != 0) goto L69
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r6
            r0.L$3 = r5
            r0.label = r3
            io.ktor.client.plugins.cache.storage.CacheStorage r2 = r4.a
            java.lang.Object r0 = r2.findAll(r5, r0)
            if (r0 != r1) goto L5f
            return r1
        L5f:
            r1 = r0
            r0 = r4
            r4 = r6
            r6 = r1
            r1 = r5
        L64:
            r4.put(r5, r6)
            r4 = r0
            r5 = r1
        L69:
            io.ktor.util.collections.ConcurrentMap r4 = r4.b
            java.lang.Object r4 = kotlin.collections.d.b(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.CachingCacheStorage.findAll(io.ktor.http.Url, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object store(io.ktor.http.Url r6, io.ktor.client.plugins.cache.storage.CachedResponseData r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.client.plugins.cache.storage.CachingCacheStorage.C00251
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.plugins.cache.storage.CachingCacheStorage$store$1 r0 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage.C00251) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.CachingCacheStorage$store$1 r0 = new io.ktor.client.plugins.cache.storage.CachingCacheStorage$store$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L39
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.L$1
            io.ktor.http.Url r5 = (io.ktor.http.Url) r5
            java.lang.Object r6 = r0.L$0
            java.util.Map r6 = (java.util.Map) r6
            kotlin.d.b(r8)
            goto L6b
        L32:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r5)
            r5 = 0
            return r5
        L39:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            io.ktor.http.Url r6 = (io.ktor.http.Url) r6
            java.lang.Object r5 = r0.L$0
            io.ktor.client.plugins.cache.storage.CachingCacheStorage r5 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage) r5
            kotlin.d.b(r8)
            goto L58
        L46:
            kotlin.d.b(r8)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            io.ktor.client.plugins.cache.storage.CacheStorage r8 = r5.a
            java.lang.Object r7 = r8.store(r6, r7, r0)
            if (r7 != r1) goto L58
            goto L68
        L58:
            io.ktor.util.collections.ConcurrentMap r7 = r5.b
            io.ktor.client.plugins.cache.storage.CacheStorage r5 = r5.a
            r0.L$0 = r7
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r8 = r5.findAll(r6, r0)
            if (r8 != r1) goto L69
        L68:
            return r1
        L69:
            r5 = r6
            r6 = r7
        L6b:
            r6.put(r5, r8)
            mk1 r5 = defpackage.mk1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.CachingCacheStorage.store(io.ktor.http.Url, io.ktor.client.plugins.cache.storage.CachedResponseData, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
