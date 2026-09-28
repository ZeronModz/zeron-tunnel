package io.ktor.client.plugins.cache;

import com.trilead.ssh2.sftp.AttribFlags;
import io.ktor.client.plugins.cache.HttpCache;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", i = {0, 0, 0, 0, 0, 1, 1, 1}, l = {319, 321}, m = "findAndRefresh", n = {"this", "request", "response", "storage", "varyKeysFrom304", "request", "response", "cache"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2"})
final class HttpCache$findAndRefresh$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCache$findAndRefresh$1(HttpCache httpCache, Continuation<? super HttpCache$findAndRefresh$1> continuation) {
        super(continuation);
        this.this$0 = httpCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        HttpCache httpCache = this.this$0;
        HttpCache.Companion companion = HttpCache.g;
        return httpCache.a(null, null, this);
    }
}
