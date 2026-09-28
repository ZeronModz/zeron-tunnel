package io.ktor.utils.io.jvm.nio;

import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.dn0;
import defpackage.mk1;
import defpackage.u7;
import defpackage.vh;
import io.ktor.utils.io.ByteWriteChannel;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.io.Buffer;
import kotlinx.io.Segment;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
@DebugMetadata(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt", f = "WriteSuspendSession.kt", i = {0, 0, 0}, l = {59}, m = "writeWhile", n = {"$this$writeWhile", "block", "done"}, s = {"L$0", "L$1", "L$2"})
final class WriteSuspendSessionKt$writeWhile$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public WriteSuspendSessionKt$writeWhile$1(Continuation<? super WriteSuspendSessionKt$writeWhile$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref$BooleanRef ref$BooleanRef;
        Function1 function1;
        ByteWriteChannel byteWriteChannel;
        this.result = obj;
        int i = (this.label | AttribFlags.SSH_FILEXFER_ATTR_EXTENDED) - AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            d.b(obj);
            ref$BooleanRef = new Ref$BooleanRef();
            function1 = null;
            byteWriteChannel = null;
        } else {
            if (i != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$BooleanRef = (Ref$BooleanRef) this.L$2;
            function1 = (Function1) this.L$1;
            byteWriteChannel = (ByteWriteChannel) this.L$0;
            d.b(obj);
        }
        while (!ref$BooleanRef.element) {
            Buffer c = byteWriteChannel.getWriteBuffer().getC();
            Segment segmentE = c.e(1);
            byte[] bArr = segmentE.a;
            int i2 = segmentE.c;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i2, bArr.length - i2);
            byteBufferWrap.getClass();
            ref$BooleanRef.element = !((Boolean) function1.invoke(byteBufferWrap)).booleanValue();
            int iPosition = byteBufferWrap.position() - i2;
            if (iPosition == 1) {
                segmentE.c += iPosition;
                c.c += (long) iPosition;
            } else {
                if (iPosition < 0 || iPosition > segmentE.a()) {
                    u7.n(segmentE.a(), vh.v(iPosition, "Invalid number of bytes written: ", ". Should be in 0.."));
                    return null;
                }
                if (iPosition != 0) {
                    segmentE.c += iPosition;
                    c.c += (long) iPosition;
                } else if (dn0.v(segmentE)) {
                    c.c();
                }
            }
            this.L$0 = byteWriteChannel;
            this.L$1 = function1;
            this.L$2 = ref$BooleanRef;
            this.label = 1;
            if (byteWriteChannel.flush(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return mk1.a;
    }
}
