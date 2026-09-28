package io.ktor.client.plugins.cache.storage;

import com.trilead.ssh2.packets.Packets;
import defpackage.mk1;
import io.ktor.utils.io.ByteChannel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2$1$1$1", f = "FileCacheStorage.kt", i = {}, l = {Packets.SSH_MSG_CHANNEL_CLOSE, Packets.SSH_MSG_CHANNEL_SUCCESS}, m = "invokeSuspend", n = {}, s = {})
public final class FileCacheStorage$writeCache$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ List<CachedResponseData> $caches;
    final /* synthetic */ ByteChannel $channel;
    Object L$0;
    int label;
    final /* synthetic */ FileCacheStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileCacheStorage$writeCache$2$1$1$1(ByteChannel byteChannel, List<CachedResponseData> list, FileCacheStorage fileCacheStorage, Continuation<? super FileCacheStorage$writeCache$2$1$1$1> continuation) {
        super(2, continuation);
        this.$channel = byteChannel;
        this.$caches = list;
        this.this$0 = fileCacheStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new FileCacheStorage$writeCache$2$1$1$1(this.$channel, this.$caches, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((FileCacheStorage$writeCache$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (io.ktor.utils.io.d.e(r6, r1, r5) == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L14
            java.lang.Object r1 = r5.L$0
            java.util.Iterator r1 = (java.util.Iterator) r1
            kotlin.d.b(r6)
            goto L3a
        L14:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r5)
            r5 = 0
            return r5
        L1b:
            kotlin.d.b(r6)
            goto L33
        L1f:
            kotlin.d.b(r6)
            io.ktor.utils.io.ByteChannel r6 = r5.$channel
            java.util.List<io.ktor.client.plugins.cache.storage.CachedResponseData> r1 = r5.$caches
            int r1 = r1.size()
            r5.label = r3
            java.lang.Object r6 = io.ktor.utils.io.d.e(r6, r1, r5)
            if (r6 != r0) goto L33
            goto L54
        L33:
            java.util.List<io.ktor.client.plugins.cache.storage.CachedResponseData> r6 = r5.$caches
            java.util.Iterator r6 = r6.iterator()
            r1 = r6
        L3a:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L55
            java.lang.Object r6 = r1.next()
            io.ktor.client.plugins.cache.storage.CachedResponseData r6 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r6
            io.ktor.client.plugins.cache.storage.FileCacheStorage r3 = r5.this$0
            io.ktor.utils.io.ByteChannel r4 = r5.$channel
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r6 = io.ktor.client.plugins.cache.storage.FileCacheStorage.a(r3, r4, r6, r5)
            if (r6 != r0) goto L3a
        L54:
            return r0
        L55:
            io.ktor.utils.io.ByteChannel r5 = r5.$channel
            r5.close()
            mk1 r5 = defpackage.mk1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
