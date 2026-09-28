package io.ktor.websocket;

import androidx.datastore.preferences.protobuf.x0;
import com.trilead.ssh2.sftp.AttribFlags;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", i = {0, 0, 1, 1, 2, 3, 4}, l = {x0.RUBY_PACKAGE_FIELD_NUMBER, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA, 62, 62, 62, 62}, m = "writeLoop", n = {"this", "buffer", "this", "buffer", "this", "this", "this"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
final class WebSocketWriter$writeLoop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebSocketWriter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketWriter$writeLoop$1(WebSocketWriter webSocketWriter, Continuation<? super WebSocketWriter$writeLoop$1> continuation) {
        super(continuation);
        this.this$0 = webSocketWriter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        return this.this$0.b(null, this);
    }
}
