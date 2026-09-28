package io.ktor.utils.io;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.trilead.ssh2.sftp.AttribFlags;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2}, l = {374, 383, TypedValues.CycleType.TYPE_ALPHA}, m = "readUTF8LineTo", n = {"$this$readUTF8LineTo", "out", "max", "$this$readUTF8LineTo", "out", "lineBuffer", "$this$readUTF8LineTo", "out", "lineBuffer", "max"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "I$0"})
final class ByteReadChannelOperationsKt$readUTF8LineTo$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperationsKt$readUTF8LineTo$1(Continuation<? super ByteReadChannelOperationsKt$readUTF8LineTo$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        return c.v(null, null, 0, this);
    }
}
