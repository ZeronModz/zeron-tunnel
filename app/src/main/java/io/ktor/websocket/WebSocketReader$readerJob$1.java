package io.ktor.websocket;

import defpackage.mk1;
import defpackage.u7;
import io.ktor.utils.io.pool.ObjectPool;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.websocket.WebSocketReader$readerJob$1", f = "WebSocketReader.kt", i = {0}, l = {40}, m = "invokeSuspend", n = {"buffer"}, s = {"L$0"})
public final class WebSocketReader$readerJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ ObjectPool<ByteBuffer> $pool;
    Object L$0;
    int label;
    final /* synthetic */ WebSocketReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketReader$readerJob$1(ObjectPool<ByteBuffer> objectPool, WebSocketReader webSocketReader, Continuation<? super WebSocketReader$readerJob$1> continuation) {
        super(2, continuation);
        this.$pool = objectPool;
        this.this$0 = webSocketReader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new WebSocketReader$readerJob$1(this.$pool, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((WebSocketReader$readerJob$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        ByteBuffer byteBuffer;
        ProtocolViolationException e;
        FrameTooBigException e2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.d.b(obj);
                ByteBuffer byteBufferBorrow = this.$pool.borrow();
                try {
                    WebSocketReader webSocketReader = this.this$0;
                    this.L$0 = byteBufferBorrow;
                    this.label = 1;
                    if (webSocketReader.c(byteBufferBorrow, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (FrameTooBigException e3) {
                    byteBuffer = byteBufferBorrow;
                    e2 = e3;
                    this.this$0.g.close(e2);
                    this.$pool.recycle(byteBuffer);
                    this.this$0.g.close(null);
                    return mk1.a;
                } catch (ProtocolViolationException e4) {
                    byteBuffer = byteBufferBorrow;
                    e = e4;
                    this.this$0.g.close(e);
                    this.$pool.recycle(byteBuffer);
                    this.this$0.g.close(null);
                    return mk1.a;
                } catch (ClosedChannelException | CancellationException unused) {
                } catch (IOException unused2) {
                    byteBuffer = byteBufferBorrow;
                    this.this$0.g.cancel((CancellationException) null);
                    this.$pool.recycle(byteBuffer);
                    this.this$0.g.close(null);
                    return mk1.a;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
                byteBuffer = byteBufferBorrow;
            } else {
                if (i != 1) {
                    u7.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                byteBuffer = (ByteBuffer) this.L$0;
                try {
                    kotlin.d.b(obj);
                } catch (FrameTooBigException e5) {
                    e2 = e5;
                    this.this$0.g.close(e2);
                } catch (ProtocolViolationException e6) {
                    e = e6;
                    this.this$0.g.close(e);
                } catch (ClosedChannelException | CancellationException unused3) {
                } catch (IOException unused4) {
                    this.this$0.g.cancel((CancellationException) null);
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
            this.$pool.recycle(byteBuffer);
            this.this$0.g.close(null);
            return mk1.a;
        } catch (Throwable th4) {
            this.$pool.recycle(coroutineSingletons);
            this.this$0.g.close(null);
            throw th4;
        }
    }
}
