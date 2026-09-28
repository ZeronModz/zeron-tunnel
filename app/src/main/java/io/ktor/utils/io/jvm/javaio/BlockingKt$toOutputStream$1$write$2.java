package io.ktor.utils.io.jvm.javaio;

import defpackage.mk1;
import defpackage.u7;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$write$2", f = "Blocking.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
final class BlockingKt$toOutputStream$1$write$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ byte[] $b;
    final /* synthetic */ int $len;
    final /* synthetic */ int $off;
    final /* synthetic */ ByteWriteChannel $this_toOutputStream;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockingKt$toOutputStream$1$write$2(ByteWriteChannel byteWriteChannel, byte[] bArr, int i, int i2, Continuation<? super BlockingKt$toOutputStream$1$write$2> continuation) {
        super(2, continuation);
        this.$this_toOutputStream = byteWriteChannel;
        this.$b = bArr;
        this.$off = i;
        this.$len = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new BlockingKt$toOutputStream$1$write$2(this.$this_toOutputStream, this.$b, this.$off, this.$len, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((BlockingKt$toOutputStream$1$write$2) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            d.b(obj);
            ByteWriteChannel byteWriteChannel = this.$this_toOutputStream;
            byte[] bArr = this.$b;
            int i2 = this.$off;
            int i3 = this.$len + i2;
            this.label = 1;
            if (io.ktor.utils.io.d.d(byteWriteChannel, bArr, i2, i3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d.b(obj);
        }
        return mk1.a;
    }
}
