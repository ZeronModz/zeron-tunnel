package io.ktor.websocket;

import androidx.datastore.preferences.protobuf.x0;
import defpackage.mk1;
import defpackage.u7;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
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
@DebugMetadata(c = "io.ktor.websocket.WebSocketWriter$writeLoopJob$1", f = "WebSocketWriter.kt", i = {0, 0}, l = {x0.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", n = {"$this$useInstance$iv", "instance$iv"}, s = {"L$0", "L$1"})
public final class WebSocketWriter$writeLoopJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WebSocketWriter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketWriter$writeLoopJob$1(WebSocketWriter webSocketWriter, Continuation<? super WebSocketWriter$writeLoopJob$1> continuation) {
        super(2, continuation);
        this.this$0 = webSocketWriter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new WebSocketWriter$writeLoopJob$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((WebSocketWriter$writeLoopJob$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ObjectPool objectPool;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.L$1;
            objectPool = (ObjectPool) this.L$0;
            try {
                kotlin.d.b(obj);
                objectPool.recycle(obj2);
                return mk1.a;
            } catch (Throwable th) {
                th = th;
                objectPool.recycle(obj2);
                throw th;
            }
        }
        kotlin.d.b(obj);
        WebSocketWriter webSocketWriter = this.this$0;
        ObjectPool objectPool2 = webSocketWriter.d;
        Object objBorrow = objectPool2.borrow();
        try {
            this.L$0 = objectPool2;
            this.L$1 = objBorrow;
            this.label = 1;
            if (webSocketWriter.b((ByteBuffer) objBorrow, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            objectPool = objectPool2;
            obj2 = objBorrow;
            objectPool.recycle(obj2);
            return mk1.a;
        } catch (Throwable th2) {
            th = th2;
            objectPool = objectPool2;
            obj2 = objBorrow;
            objectPool.recycle(obj2);
            throw th;
        }
    }
}
