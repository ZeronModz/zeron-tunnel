package io.ktor.client.plugins.sse;

import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.trilead.ssh2.packets.Packets;
import com.trilead.ssh2.sftp.AttribFlags;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.sse.DefaultClientSSESession", f = "DefaultClientSSESession.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_CBC_SHA, 49, Packets.SSH_MSG_CHANNEL_REQUEST}, m = "parseEvent", n = {"this", "$this$parseEvent", Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "comments", "curRetry", "lastEventId", "wasData", "wasComments", "this", "$this$parseEvent", Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "comments", "curRetry", "lastEventId", "wasData", "wasComments", "this", "$this$parseEvent", Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "comments", "eventType", "curRetry", "lastEventId", "wasData", "wasComments"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"})
final class DefaultClientSSESession$parseEvent$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultClientSSESession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultClientSSESession$parseEvent$1(DefaultClientSSESession defaultClientSSESession, Continuation<? super DefaultClientSSESession$parseEvent$1> continuation) {
        super(continuation);
        this.this$0 = defaultClientSSESession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        return this.this$0.a(null, this);
    }
}
