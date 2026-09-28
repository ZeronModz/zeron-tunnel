package io.ktor.utils.io;

import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.u7;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {32}, m = "exhausted", n = {"$this$exhausted"}, s = {"L$0"})
final class ByteReadChannelOperationsKt$exhausted$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperationsKt$exhausted$1(Continuation<? super ByteReadChannelOperationsKt$exhausted$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        int i = (this.label | AttribFlags.SSH_FILEXFER_ATTR_EXTENDED) - AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            kotlin.d.b(obj);
            throw null;
        }
        if (i != 1) {
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ByteReadChannel byteReadChannel = (ByteReadChannel) this.L$0;
        kotlin.d.b(obj);
        return Boolean.valueOf(byteReadChannel.getReadBuffer().exhausted());
    }
}
