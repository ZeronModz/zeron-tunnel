package io.ktor.websocket;

import com.trilead.ssh2.packets.Packets;
import defpackage.mk1;
import io.ktor.websocket.Frame;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.websocket.PingPongKt$pinger$1$rc$1", f = "PingPong.kt", i = {}, l = {76, Packets.SSH_MSG_GLOBAL_REQUEST}, m = "invokeSuspend", n = {}, s = {})
public final class PingPongKt$pinger$1$rc$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ Channel<Frame.Pong> $channel;
    final /* synthetic */ SendChannel<Frame> $outgoing;
    final /* synthetic */ String $pingMessage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PingPongKt$pinger$1$rc$1(SendChannel<? super Frame> sendChannel, String str, Channel<Frame.Pong> channel, Continuation<? super PingPongKt$pinger$1$rc$1> continuation) {
        super(2, continuation);
        this.$outgoing = sendChannel;
        this.$pingMessage = str;
        this.$channel = channel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new PingPongKt$pinger$1$rc$1(this.$outgoing, this.$pingMessage, this.$channel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((PingPongKt$pinger$1$rc$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r7 == r0) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0045 -> B:16:0x0048). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            kotlin.d.b(r7)
            goto L48
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            r6 = 0
            return r6
        L17:
            kotlin.d.b(r7)
            goto L3d
        L1b:
            kotlin.d.b(r7)
            org.slf4j.Logger r7 = io.ktor.websocket.a.a
            java.lang.String r1 = "WebSocket Pinger: sending ping frame"
            r7.trace(r1)
            kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame> r7 = r6.$outgoing
            io.ktor.websocket.Frame$Ping r1 = new io.ktor.websocket.Frame$Ping
            java.lang.String r4 = r6.$pingMessage
            java.nio.charset.Charset r5 = defpackage.xm.b
            byte[] r4 = defpackage.if3.M(r4, r5)
            r1.<init>(r4)
            r6.label = r3
            java.lang.Object r7 = r7.send(r1, r6)
            if (r7 != r0) goto L3d
            goto L47
        L3d:
            kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame$Pong> r7 = r6.$channel
            r6.label = r2
            java.lang.Object r7 = r7.receive(r6)
            if (r7 != r0) goto L48
        L47:
            return r0
        L48:
            io.ktor.websocket.Frame$Pong r7 = (io.ktor.websocket.Frame.Pong) r7
            byte[] r1 = r7.c
            int r3 = r1.length
            r4 = 4
            java.lang.String r1 = kotlin.text.g.r(r3, r4, r1)
            java.lang.String r3 = r6.$pingMessage
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L70
            org.slf4j.Logger r6 = io.ktor.websocket.a.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WebSocket Pinger: received valid pong frame "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.trace(r7)
            mk1 r6 = defpackage.mk1.a
            return r6
        L70:
            org.slf4j.Logger r1 = io.ktor.websocket.a.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "WebSocket Pinger: received invalid pong frame "
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r7 = ", continue waiting"
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r1.trace(r7)
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.PingPongKt$pinger$1$rc$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
