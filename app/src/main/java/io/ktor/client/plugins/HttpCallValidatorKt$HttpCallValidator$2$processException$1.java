package io.ktor.client.plugins;

import com.trilead.ssh2.sftp.AttribFlags;
import com.trilead.ssh2.sftp.Packet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidatorKt", f = "HttpCallValidator.kt", i = {0, 0, 1, 1}, l = {101, Packet.SSH_FXP_HANDLE}, m = "HttpCallValidator$lambda$2$processException", n = {"cause", "request", "cause", "request"}, s = {"L$0", "L$1", "L$0", "L$1"})
final class HttpCallValidatorKt$HttpCallValidator$2$processException$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public HttpCallValidatorKt$HttpCallValidator$2$processException$1(Continuation<? super HttpCallValidatorKt$HttpCallValidator$2$processException$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        return i.a(null, null, null, this);
    }
}
