package io.ktor.util;

import defpackage.mk1;
import defpackage.u7;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ReaderScope;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/ReaderScope;", "Lmk1;", "<anonymous>", "(Lio/ktor/utils/io/ReaderScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.util.DeflaterKt$deflated$2", f = "Deflater.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
final class DeflaterKt$deflated$2 extends SuspendLambda implements Function2<ReaderScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ boolean $gzip;
    final /* synthetic */ ObjectPool<ByteBuffer> $pool;
    final /* synthetic */ ByteWriteChannel $this_deflated;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeflaterKt$deflated$2(ByteWriteChannel byteWriteChannel, boolean z, ObjectPool<ByteBuffer> objectPool, Continuation<? super DeflaterKt$deflated$2> continuation) {
        super(2, continuation);
        this.$this_deflated = byteWriteChannel;
        this.$gzip = z;
        this.$pool = objectPool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        DeflaterKt$deflated$2 deflaterKt$deflated$2 = new DeflaterKt$deflated$2(this.$this_deflated, this.$gzip, this.$pool, continuation);
        deflaterKt$deflated$2.L$0 = obj;
        return deflaterKt$deflated$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ReaderScope readerScope, Continuation<? super mk1> continuation) {
        return ((DeflaterKt$deflated$2) create(readerScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.d.b(obj);
            ByteReadChannel byteReadChannel = ((ReaderScope) this.L$0).a;
            ByteWriteChannel byteWriteChannel = this.$this_deflated;
            boolean z = this.$gzip;
            ObjectPool<ByteBuffer> objectPool = this.$pool;
            this.label = 1;
            if (a.b(byteReadChannel, byteWriteChannel, z, objectPool, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.d.b(obj);
        }
        return mk1.a;
    }
}
