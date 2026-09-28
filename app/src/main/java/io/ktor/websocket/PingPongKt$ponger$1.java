package io.ktor.websocket;

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
@DebugMetadata(c = "io.ktor.websocket.PingPongKt$ponger$1", f = "PingPong.kt", i = {0, 1}, l = {117, 32}, m = "invokeSuspend", n = {"$this$consume$iv$iv", "$this$consume$iv$iv"}, s = {"L$1", "L$1"})
final class PingPongKt$ponger$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ Channel<Frame.Ping> $channel;
    final /* synthetic */ SendChannel<Frame.Pong> $outgoing;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PingPongKt$ponger$1(Channel<Frame.Ping> channel, SendChannel<? super Frame.Pong> sendChannel, Continuation<? super PingPongKt$ponger$1> continuation) {
        super(2, continuation);
        this.$channel = channel;
        this.$outgoing = sendChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new PingPongKt$ponger$1(this.$channel, this.$outgoing, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((PingPongKt$ponger$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (r6.send(r7, r10) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #2 {all -> 0x001e, blocks: (B:7:0x0019, B:19:0x0041, B:23:0x0053, B:25:0x005b, B:14:0x0032, B:18:0x003d), top: B:39:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e A[Catch: ClosedSendChannelException -> 0x0088, TRY_ENTER, TRY_LEAVE, TryCatch #1 {ClosedSendChannelException -> 0x0088, blocks: (B:28:0x007e, B:32:0x0084, B:33:0x0087, B:17:0x0039, B:30:0x0082, B:7:0x0019, B:19:0x0041, B:23:0x0053, B:25:0x005b, B:14:0x0032, B:18:0x003d), top: B:39:0x0007, inners: #0, #2 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007b -> B:8:0x001c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L36
            if (r1 == r2) goto L26
            if (r1 != r4) goto L20
            java.lang.Object r1 = r10.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r10.L$1
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            java.lang.Object r6 = r10.L$0
            kotlinx.coroutines.channels.SendChannel r6 = (kotlinx.coroutines.channels.SendChannel) r6
            kotlin.d.b(r11)     // Catch: java.lang.Throwable -> L1e
        L1c:
            r11 = r6
            goto L41
        L1e:
            r10 = move-exception
            goto L82
        L20:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r10)
            return r3
        L26:
            java.lang.Object r1 = r10.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r10.L$1
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            java.lang.Object r6 = r10.L$0
            kotlinx.coroutines.channels.SendChannel r6 = (kotlinx.coroutines.channels.SendChannel) r6
            kotlin.d.b(r11)     // Catch: java.lang.Throwable -> L1e
            goto L53
        L36:
            kotlin.d.b(r11)
            kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame$Ping> r5 = r10.$channel     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L88
            kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame$Pong> r11 = r10.$outgoing     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L88
            kotlinx.coroutines.channels.ChannelIterator r1 = r5.iterator()     // Catch: java.lang.Throwable -> L1e
        L41:
            r10.L$0 = r11     // Catch: java.lang.Throwable -> L1e
            r10.L$1 = r5     // Catch: java.lang.Throwable -> L1e
            r10.L$2 = r1     // Catch: java.lang.Throwable -> L1e
            r10.label = r2     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r6 = r1.hasNext(r10)     // Catch: java.lang.Throwable -> L1e
            if (r6 != r0) goto L50
            goto L7d
        L50:
            r9 = r6
            r6 = r11
            r11 = r9
        L53:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1e
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1e
            if (r11 == 0) goto L7e
            java.lang.Object r11 = r1.next()     // Catch: java.lang.Throwable -> L1e
            io.ktor.websocket.Frame$Ping r11 = (io.ktor.websocket.Frame.Ping) r11     // Catch: java.lang.Throwable -> L1e
            org.slf4j.Logger r7 = io.ktor.websocket.a.a     // Catch: java.lang.Throwable -> L1e
            java.lang.String r8 = "Received ping message, sending pong message"
            r7.trace(r8)     // Catch: java.lang.Throwable -> L1e
            io.ktor.websocket.Frame$Pong r7 = new io.ktor.websocket.Frame$Pong     // Catch: java.lang.Throwable -> L1e
            byte[] r11 = r11.c     // Catch: java.lang.Throwable -> L1e
            r7.<init>(r11, r3, r4, r3)     // Catch: java.lang.Throwable -> L1e
            r10.L$0 = r6     // Catch: java.lang.Throwable -> L1e
            r10.L$1 = r5     // Catch: java.lang.Throwable -> L1e
            r10.L$2 = r1     // Catch: java.lang.Throwable -> L1e
            r10.label = r4     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r11 = r6.send(r7, r10)     // Catch: java.lang.Throwable -> L1e
            if (r11 != r0) goto L1c
        L7d:
            return r0
        L7e:
            r5.cancel(r3)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L88
            goto L88
        L82:
            throw r10     // Catch: java.lang.Throwable -> L83
        L83:
            r11 = move-exception
            defpackage.ii2.c(r5, r10)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L88
            throw r11     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L88
        L88:
            mk1 r10 = defpackage.mk1.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.PingPongKt$ponger$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
