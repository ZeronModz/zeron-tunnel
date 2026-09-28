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
@DebugMetadata(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", i = {0, 0, 0, 1}, l = {347, 347}, m = "findResponse", n = {"this", "url", "lookup", "lookup"}, s = {"L$0", "L$1", "L$2", "L$0"})
final class HttpCache$findResponse$4 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCache$findResponse$4(HttpCache httpCache, Continuation<? super HttpCache$findResponse$4> continuation) {
        super(continuation);
        this.this$0 = httpCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        HttpCache httpCache = this.this$0;
        HttpCache.Companion companion = HttpCache.g;
        return httpCache.c(null, null, this);
    }
}
