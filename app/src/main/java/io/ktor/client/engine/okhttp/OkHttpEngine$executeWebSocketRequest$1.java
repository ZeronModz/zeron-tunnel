package io.ktor.client.engine.okhttp;

import com.trilead.ssh2.packets.Packets;
import com.trilead.ssh2.sftp.AttribFlags;
import io.ktor.client.engine.okhttp.OkHttpEngine;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", i = {0, 0, 0, 0}, l = {Packets.SSH_MSG_CHANNEL_OPEN_CONFIRMATION}, m = "executeWebSocketRequest", n = {"this", "callContext", "requestTime", "session"}, s = {"L$0", "L$1", "L$2", "L$3"})
final class OkHttpEngine$executeWebSocketRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OkHttpEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttpEngine$executeWebSocketRequest$1(OkHttpEngine okHttpEngine, Continuation<? super OkHttpEngine$executeWebSocketRequest$1> continuation) {
        super(continuation);
        this.this$0 = okHttpEngine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        OkHttpEngine okHttpEngine = this.this$0;
        OkHttpEngine.Companion companion = OkHttpEngine.k;
        return okHttpEngine.d(null, null, null, this);
    }
}
