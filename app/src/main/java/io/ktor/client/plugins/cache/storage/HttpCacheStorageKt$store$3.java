package io.ktor.client.plugins.cache.storage;

import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.trilead.ssh2.sftp.AttribFlags;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.HttpCacheStorageKt", f = "HttpCacheStorage.kt", i = {0, 0, 0, 0, 0, 1}, l = {119, 131}, m = "store", n = {"$this$store", "response", "varyKeys", "url", "isShared", Constants$ScionAnalytics$MessageType.DATA_MESSAGE}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0"})
final class HttpCacheStorageKt$store$3 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public HttpCacheStorageKt$store$3(Continuation<? super HttpCacheStorageKt$store$3> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        return c.b(null, null, null, false, this);
    }
}
