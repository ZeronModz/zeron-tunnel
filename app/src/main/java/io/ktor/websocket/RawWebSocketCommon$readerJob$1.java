package io.ktor.websocket;

import com.trilead.ssh2.packets.Packets;
import com.trilead.ssh2.sftp.Packet;
import defpackage.mk1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.websocket.RawWebSocketCommon$readerJob$1", f = "RawWebSocketCommon.kt", i = {2, 3}, l = {Packets.SSH_MSG_CHANNEL_EXTENDED_DATA, Packets.SSH_MSG_CHANNEL_SUCCESS, Packet.SSH_FXP_HANDLE, 106}, m = "invokeSuspend", n = {"cause", "cause"}, s = {"L$0", "L$0"})
public final class RawWebSocketCommon$readerJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ RawWebSocketCommon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawWebSocketCommon$readerJob$1(RawWebSocketCommon rawWebSocketCommon, Continuation<? super RawWebSocketCommon$readerJob$1> continuation) {
        super(2, continuation);
        this.this$0 = rawWebSocketCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new RawWebSocketCommon$readerJob$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((RawWebSocketCommon$readerJob$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0054 A[Catch: all -> 0x0032, CancellationException -> 0x0034, ProtocolViolationException -> 0x0036, FrameTooBigException -> 0x0038, EOFException | ClosedReceiveChannelException -> 0x0083, EOFException | ClosedReceiveChannelException -> 0x0083, PHI: r10
      0x0054: PHI (r10v10 java.lang.Object) = (r10v15 java.lang.Object), (r10v0 java.lang.Object) binds: [B:31:0x0050, B:27:0x003b] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {EOFException | ClosedReceiveChannelException -> 0x0083, blocks: (B:18:0x002e, B:30:0x0042, B:30:0x0042, B:33:0x0054, B:33:0x0054, B:35:0x005e, B:35:0x005e, B:39:0x006c, B:39:0x006c, B:38:0x0066, B:38:0x0066, B:40:0x006e, B:40:0x006e, B:27:0x003b), top: B:63:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e A[Catch: all -> 0x0032, CancellationException -> 0x0034, ProtocolViolationException -> 0x0036, FrameTooBigException -> 0x0038, EOFException | ClosedReceiveChannelException -> 0x0083, EOFException | ClosedReceiveChannelException -> 0x0083, TryCatch #0 {EOFException | ClosedReceiveChannelException -> 0x0083, blocks: (B:18:0x002e, B:30:0x0042, B:30:0x0042, B:33:0x0054, B:33:0x0054, B:35:0x005e, B:35:0x005e, B:39:0x006c, B:39:0x006c, B:38:0x0066, B:38:0x0066, B:40:0x006e, B:40:0x006e, B:27:0x003b), top: B:63:0x0009 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0078 -> B:30:0x0042). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.RawWebSocketCommon$readerJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
