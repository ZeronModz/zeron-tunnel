package io.ktor.websocket;

import com.trilead.ssh2.packets.Packets;
import defpackage.mk1;
import defpackage.u7;
import io.ktor.websocket.Frame;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;
import org.conscrypt.HpkeSuite;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.websocket.PingPongKt$pinger$1", f = "PingPong.kt", i = {0, 0, 1, 1}, l = {HpkeSuite.KEM_MLKEM_768, 74, Packets.SSH_MSG_CHANNEL_EOF}, m = "invokeSuspend", n = {"random", "pingIdBytes", "random", "pingIdBytes"}, s = {"L$0", "L$1", "L$0", "L$1"})
final class PingPongKt$pinger$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ Channel<Frame.Pong> $channel;
    final /* synthetic */ Function2<CloseReason, Continuation<? super mk1>, Object> $onTimeout;
    final /* synthetic */ SendChannel<Frame> $outgoing;
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ long $timeoutMillis;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: io.ktor.websocket.PingPongKt$pinger$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "io.ktor.websocket.PingPongKt$pinger$1$1", f = "PingPong.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        final /* synthetic */ Channel<Frame.Pong> $channel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Channel<Frame.Pong> channel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$channel = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$channel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Channel<Frame.Pong> channel;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0 && i != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.d.b(obj);
            do {
                channel = this.$channel;
                this.label = 1;
            } while (channel.receive(this) != coroutineSingletons);
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PingPongKt$pinger$1(long j, long j2, Function2<? super CloseReason, ? super Continuation<? super mk1>, ? extends Object> function2, Channel<Frame.Pong> channel, SendChannel<? super Frame> sendChannel, Continuation<? super PingPongKt$pinger$1> continuation) {
        super(2, continuation);
        this.$periodMillis = j;
        this.$timeoutMillis = j2;
        this.$onTimeout = function2;
        this.$channel = channel;
        this.$outgoing = sendChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new PingPongKt$pinger$1(this.$periodMillis, this.$timeoutMillis, this.$onTimeout, this.$channel, this.$outgoing, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((PingPongKt$pinger$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d9, code lost:
    
        if (r13.invoke(r1, r12) == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9 A[Catch: CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00de, CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00de, CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00de, PHI: r1 r6 r13
      0x00b9: PHI (r1v7 byte[]) = (r1v5 byte[]), (r1v13 byte[]) binds: [B:23:0x00b6, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r6v12 kotlin.random.Random) = (r6v8 kotlin.random.Random), (r6v16 kotlin.random.Random) binds: [B:23:0x00b6, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r13v8 java.lang.Object) = (r13v6 java.lang.Object), (r13v0 java.lang.Object) binds: [B:23:0x00b6, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00de, blocks: (B:7:0x0010, B:12:0x0023, B:12:0x0023, B:12:0x0023, B:25:0x00b9, B:25:0x00b9, B:25:0x00b9, B:27:0x00bd, B:27:0x00bd, B:27:0x00bd, B:18:0x006d, B:18:0x006d, B:18:0x006d, B:22:0x0084, B:22:0x0084, B:22:0x0084, B:15:0x0030, B:15:0x0030, B:15:0x0030), top: B:34:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd A[Catch: CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00de, CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00de, CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00de, TRY_LEAVE, TryCatch #0 {CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00de, blocks: (B:7:0x0010, B:12:0x0023, B:12:0x0023, B:12:0x0023, B:25:0x00b9, B:25:0x00b9, B:25:0x00b9, B:27:0x00bd, B:27:0x00bd, B:27:0x00bd, B:18:0x006d, B:18:0x006d, B:18:0x006d, B:22:0x0084, B:22:0x0084, B:22:0x0084, B:15:0x0030, B:15:0x0030, B:15:0x0030), top: B:34:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b6 -> B:25:0x00b9). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.PingPongKt$pinger$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
