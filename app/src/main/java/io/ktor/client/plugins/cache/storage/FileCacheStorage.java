package io.ktor.client.plugins.cache.storage;

import com.trilead.ssh2.packets.Packets;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.hv;
import defpackage.lv;
import defpackage.mk1;
import defpackage.os;
import defpackage.oy;
import defpackage.xm;
import defpackage.xu;
import io.ktor.http.Url;
import io.ktor.util.collections.ConcurrentMap;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/client/plugins/cache/storage/FileCacheStorage;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "Ljava/io/File;", "directory", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Ljava/io/File;Lkotlinx/coroutines/CoroutineDispatcher;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class FileCacheStorage implements CacheStorage {
    public final File a;
    public final CoroutineDispatcher b;
    public final ConcurrentMap c;

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$find$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0}, l = {Packets.SSH_MSG_REQUEST_FAILURE}, m = "find", n = {"varyKeys"}, s = {"L$0"})
    final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
            return FileCacheStorage.this.find(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$findAll$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {}, l = {78}, m = "findAll", n = {}, s = {})
    final class C00261 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C00261(Continuation<? super C00261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
            return FileCacheStorage.this.findAll(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2", f = "FileCacheStorage.kt", i = {0}, l = {73, 74}, m = "invokeSuspend", n = {"urlHex"}, s = {"L$0"})
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        final /* synthetic */ CachedResponseData $data;
        final /* synthetic */ Url $url;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Url url, CachedResponseData cachedResponseData, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$url = url;
            this.$data = cachedResponseData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return FileCacheStorage.this.new AnonymousClass2(this.$url, this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
        
            if (defpackage.zr.c(new io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2(r4, r1, r10, null), r9) == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r9.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L17
                if (r1 != r3) goto L11
                kotlin.d.b(r10)
                goto L7d
            L11:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.u7.p(r9)
                return r2
            L17:
                java.lang.Object r1 = r9.L$0
                java.lang.String r1 = (java.lang.String) r1
                kotlin.d.b(r10)
                goto L3a
            L1f:
                kotlin.d.b(r10)
                io.ktor.client.plugins.cache.storage.FileCacheStorage r10 = io.ktor.client.plugins.cache.storage.FileCacheStorage.this
                io.ktor.http.Url r1 = r9.$url
                r10.getClass()
                java.lang.String r1 = io.ktor.client.plugins.cache.storage.FileCacheStorage.b(r1)
                io.ktor.client.plugins.cache.storage.FileCacheStorage r10 = io.ktor.client.plugins.cache.storage.FileCacheStorage.this
                r9.L$0 = r1
                r9.label = r4
                java.lang.Object r10 = r10.d(r1, r9)
                if (r10 != r0) goto L3a
                goto L7c
            L3a:
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                io.ktor.client.plugins.cache.storage.CachedResponseData r4 = r9.$data
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r10 = r10.iterator()
            L47:
                boolean r6 = r10.hasNext()
                if (r6 == 0) goto L62
                java.lang.Object r6 = r10.next()
                r7 = r6
                io.ktor.client.plugins.cache.storage.CachedResponseData r7 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r7
                java.util.Map r7 = r7.h
                java.util.Map r8 = r4.h
                boolean r7 = r7.equals(r8)
                if (r7 != 0) goto L47
                r5.add(r6)
                goto L47
            L62:
                io.ktor.client.plugins.cache.storage.CachedResponseData r10 = r9.$data
                java.util.ArrayList r10 = kotlin.collections.c.D(r5, r10)
                io.ktor.client.plugins.cache.storage.FileCacheStorage r4 = io.ktor.client.plugins.cache.storage.FileCacheStorage.this
                r9.L$0 = r2
                r9.label = r3
                r4.getClass()
                io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2 r3 = new io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2
                r3.<init>(r4, r1, r10, r2)
                java.lang.Object r9 = defpackage.zr.c(r3, r9)
                if (r9 != r0) goto L7d
            L7c:
                return r0
            L7d:
                mk1 r9 = defpackage.mk1.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public FileCacheStorage(File file, CoroutineDispatcher coroutineDispatcher) {
        file.getClass();
        coroutineDispatcher.getClass();
        this.a = file;
        this.b = coroutineDispatcher;
        this.c = new ConcurrentMap(0, 1, null);
        file.mkdirs();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01dc, code lost:
    
        if (io.ktor.utils.io.d.e(r1, r11, r0) != r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0290, code lost:
    
        if (io.ktor.utils.io.d.e(r13, r11, r0) != r14) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02fb, code lost:
    
        if (io.ktor.utils.io.d.h(r1, r12, r0) != r14) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0322, code lost:
    
        if (io.ktor.utils.io.d.d(r13, r11, 0, r11.length, r0) != r14) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e5 A[PHI: r12 r13
      0x00e5: PHI (r12v12 io.ktor.client.plugins.cache.storage.CachedResponseData) = 
      (r12v9 io.ktor.client.plugins.cache.storage.CachedResponseData)
      (r12v15 io.ktor.client.plugins.cache.storage.CachedResponseData)
     binds: [B:40:0x017c, B:24:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r13v11 io.ktor.utils.io.ByteChannel) = (r13v8 io.ktor.utils.io.ByteChannel), (r13v14 io.ktor.utils.io.ByteChannel) binds: [B:40:0x017c, B:24:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0160 A[PHI: r12 r13
      0x0160: PHI (r12v9 io.ktor.client.plugins.cache.storage.CachedResponseData) = 
      (r12v6 io.ktor.client.plugins.cache.storage.CachedResponseData)
      (r12v11 io.ktor.client.plugins.cache.storage.CachedResponseData)
     binds: [B:37:0x015c, B:26:0x00e9] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r13v8 io.ktor.utils.io.ByteChannel) = (r13v5 io.ktor.utils.io.ByteChannel), (r13v10 io.ktor.utils.io.ByteChannel) binds: [B:37:0x015c, B:26:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e4 A[PHI: r1 r11 r13
      0x01e4: PHI (r1v16 io.ktor.utils.io.ByteChannel) = (r1v9 io.ktor.utils.io.ByteChannel), (r1v15 io.ktor.utils.io.ByteChannel), (r1v18 io.ktor.utils.io.ByteChannel) binds: [B:53:0x01e0, B:60:0x023c, B:21:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r11v23 java.util.Iterator) = (r11v20 java.util.Iterator), (r11v22 java.util.Iterator), (r11v27 java.util.Iterator) binds: [B:53:0x01e0, B:60:0x023c, B:21:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r13v22 io.ktor.client.plugins.cache.storage.CachedResponseData) = 
      (r13v15 io.ktor.client.plugins.cache.storage.CachedResponseData)
      (r13v21 io.ktor.client.plugins.cache.storage.CachedResponseData)
      (r13v25 io.ktor.client.plugins.cache.storage.CachedResponseData)
     binds: [B:53:0x01e0, B:60:0x023c, B:21:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026c A[PHI: r12 r13
      0x026c: PHI (r12v35 io.ktor.client.plugins.cache.storage.CachedResponseData) = 
      (r12v32 io.ktor.client.plugins.cache.storage.CachedResponseData)
      (r12v37 io.ktor.client.plugins.cache.storage.CachedResponseData)
     binds: [B:67:0x0268, B:19:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x026c: PHI (r13v29 io.ktor.utils.io.ByteChannel) = (r13v26 io.ktor.utils.io.ByteChannel), (r13v31 io.ktor.utils.io.ByteChannel) binds: [B:67:0x0268, B:19:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x027e A[PHI: r12 r13
      0x027e: PHI (r12v38 io.ktor.client.plugins.cache.storage.CachedResponseData) = 
      (r12v35 io.ktor.client.plugins.cache.storage.CachedResponseData)
      (r12v40 io.ktor.client.plugins.cache.storage.CachedResponseData)
     binds: [B:70:0x027a, B:18:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r13v32 io.ktor.utils.io.ByteChannel) = (r13v29 io.ktor.utils.io.ByteChannel), (r13v34 io.ktor.utils.io.ByteChannel) binds: [B:70:0x027a, B:18:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02fe  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x023c -> B:54:0x01e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x02fb -> B:15:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(io.ktor.client.plugins.cache.storage.FileCacheStorage r11, io.ktor.utils.io.ByteChannel r12, io.ktor.client.plugins.cache.storage.CachedResponseData r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.a(io.ktor.client.plugins.cache.storage.FileCacheStorage, io.ktor.utils.io.ByteChannel, io.ktor.client.plugins.cache.storage.CachedResponseData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static String b(Url url) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = url.g.getBytes(xm.a);
        bytes.getClass();
        byte[] bArrDigest = messageDigest.digest(bytes);
        bArrDigest.getClass();
        return os.a(bArrDigest);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0408, code lost:
    
        if (r1 != r3) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03c2 A[PHI: r0 r1 r4 r5 r6 r7 r8
      0x03c2: PHI (r0v39 io.ktor.util.date.GMTDate) = (r0v36 io.ktor.util.date.GMTDate), (r0v41 io.ktor.util.date.GMTDate) binds: [B:82:0x03be, B:19:0x015b] A[DONT_GENERATE, DONT_INLINE]
      0x03c2: PHI (r1v43 java.lang.Object) = (r1v42 java.lang.Object), (r1v1 java.lang.Object) binds: [B:82:0x03be, B:19:0x015b] A[DONT_GENERATE, DONT_INLINE]
      0x03c2: PHI (r4v30 io.ktor.http.HeadersBuilder) = (r4v26 io.ktor.http.HeadersBuilder), (r4v33 io.ktor.http.HeadersBuilder) binds: [B:82:0x03be, B:19:0x015b] A[DONT_GENERATE, DONT_INLINE]
      0x03c2: PHI (r5v7 io.ktor.http.HttpProtocolVersion) = (r5v3 io.ktor.http.HttpProtocolVersion), (r5v10 io.ktor.http.HttpProtocolVersion) binds: [B:82:0x03be, B:19:0x015b] A[DONT_GENERATE, DONT_INLINE]
      0x03c2: PHI (r6v28 io.ktor.http.HttpStatusCode) = (r6v24 io.ktor.http.HttpStatusCode), (r6v31 io.ktor.http.HttpStatusCode) binds: [B:82:0x03be, B:19:0x015b] A[DONT_GENERATE, DONT_INLINE]
      0x03c2: PHI (r7v24 java.lang.String) = (r7v20 java.lang.String), (r7v27 java.lang.String) binds: [B:82:0x03be, B:19:0x015b] A[DONT_GENERATE, DONT_INLINE]
      0x03c2: PHI (r8v15 io.ktor.utils.io.ByteReadChannel) = (r8v13 io.ktor.utils.io.ByteReadChannel), (r8v18 io.ktor.utils.io.ByteReadChannel) binds: [B:82:0x03be, B:19:0x015b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x041a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x0483 -> B:101:0x048e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x036d -> B:76:0x0371). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(io.ktor.utils.io.ByteReadChannel r37, kotlin.coroutines.jvm.internal.ContinuationImpl r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.c(io.ktor.utils.io.ByteReadChannel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162 A[Catch: all -> 0x015e, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x015e, blocks: (B:51:0x012b, B:61:0x0162), top: B:110:0x012b }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0182 A[Catch: all -> 0x0186, Exception -> 0x0189, TRY_ENTER, TRY_LEAVE, TryCatch #13 {Exception -> 0x0189, all -> 0x0186, blocks: (B:66:0x0182, B:86:0x01a7, B:85:0x01a6, B:82:0x01a0, B:79:0x019b), top: B:114:0x002a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a6 A[Catch: all -> 0x01a4, TRY_LEAVE, TryCatch #1 {all -> 0x01a4, blocks: (B:85:0x01a6, B:82:0x01a0, B:79:0x019b), top: B:95:0x0199, outer: #13, inners: #12 }] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [io.ktor.client.plugins.cache.storage.FileCacheStorage, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$1, kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0146 -> B:103:0x014e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.d(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object find(io.ktor.http.Url r6, java.util.Map r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.client.plugins.cache.storage.FileCacheStorage.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.plugins.cache.storage.FileCacheStorage$find$1 r0 = (io.ktor.client.plugins.cache.storage.FileCacheStorage.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.FileCacheStorage$find$1 r0 = new io.ktor.client.plugins.cache.storage.FileCacheStorage$find$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2d
            java.lang.Object r5 = r0.L$0
            r7 = r5
            java.util.Map r7 = (java.util.Map) r7
            kotlin.d.b(r8)
            goto L45
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r5)
            return r3
        L33:
            kotlin.d.b(r8)
            java.lang.String r6 = b(r6)
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r5.d(r6, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            java.util.Set r8 = (java.util.Set) r8
            java.util.Iterator r5 = r8.iterator()
        L4b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8d
            java.lang.Object r6 = r5.next()
            r8 = r6
            io.ktor.client.plugins.cache.storage.CachedResponseData r8 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r8
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L5f
            goto L8c
        L5f:
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L67:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map r4 = r8.h
            java.lang.Object r2 = r4.get(r2)
            boolean r1 = defpackage.yg0.a(r2, r1)
            if (r1 != 0) goto L67
            goto L4b
        L8c:
            return r6
        L8d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.find(io.ktor.http.Url, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
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
            boolean r0 = r6 instanceof io.ktor.client.plugins.cache.storage.FileCacheStorage.C00261
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.cache.storage.FileCacheStorage$findAll$1 r0 = (io.ktor.client.plugins.cache.storage.FileCacheStorage.C00261) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.FileCacheStorage$findAll$1 r0 = new io.ktor.client.plugins.cache.storage.FileCacheStorage$findAll$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            kotlin.d.b(r6)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r4)
            r4 = 0
            return r4
        L2e:
            kotlin.d.b(r6)
            java.lang.String r5 = b(r5)
            r0.label = r3
            java.lang.Object r6 = r4.d(r5, r0)
            if (r6 != r1) goto L3e
            return r1
        L3e:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Set r4 = kotlin.collections.c.U(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.findAll(io.ktor.http.Url, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public final Object store(Url url, CachedResponseData cachedResponseData, Continuation continuation) {
        Object objE = kotlinx.coroutines.c.e(this.b, new AnonymousClass2(url, cachedResponseData, null), continuation);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : mk1.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FileCacheStorage(File file, CoroutineDispatcher coroutineDispatcher, int i, xu xuVar) {
        if ((i & 2) != 0) {
            lv lvVar = oy.a;
            coroutineDispatcher = hv.c;
        }
        this(file, coroutineDispatcher);
    }
}
