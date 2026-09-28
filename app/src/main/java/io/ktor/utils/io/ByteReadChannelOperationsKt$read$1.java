package io.ktor.utils.io;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.u7;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.io.Buffer;
import kotlinx.io.Segment;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 1, 1, 1}, l = {417, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE}, m = "read", n = {"$this$read", "block", "result", "buffer$iv", "head$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
final class ByteReadChannelOperationsKt$read$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperationsKt$read$1(Continuation<? super ByteReadChannelOperationsKt$read$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref$IntRef ref$IntRef;
        Buffer buffer;
        Segment segment;
        Ref$IntRef ref$IntRef2;
        this.result = obj;
        int i = (this.label | AttribFlags.SSH_FILEXFER_ATTR_EXTENDED) - AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            kotlin.d.b(obj);
            throw null;
        }
        if (i == 1) {
            Function4 function4 = (Function4) this.L$1;
            ByteReadChannel byteReadChannel = (ByteReadChannel) this.L$0;
            kotlin.d.b(obj);
            if (byteReadChannel.isClosedForRead()) {
                return new Integer(-1);
            }
            Ref$IntRef ref$IntRef3 = new Ref$IntRef();
            Buffer c = byteReadChannel.getReadBuffer().getC();
            if (c.exhausted()) {
                u7.r("Buffer is empty");
                return null;
            }
            Segment segment2 = c.a;
            segment2.getClass();
            byte[] bArr = segment2.a;
            int i2 = segment2.b;
            int i3 = segment2.c;
            Integer num = new Integer(i2);
            Integer num2 = new Integer(i3);
            this.L$0 = ref$IntRef3;
            this.L$1 = c;
            this.L$2 = segment2;
            this.L$3 = ref$IntRef3;
            this.label = 2;
            Object objInvoke = function4.invoke(bArr, num, num2, this);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$IntRef = ref$IntRef3;
            buffer = c;
            segment = segment2;
            obj = objInvoke;
            ref$IntRef2 = ref$IntRef;
        } else {
            if (i != 2) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$IntRef = (Ref$IntRef) this.L$3;
            segment = (Segment) this.L$2;
            buffer = (Buffer) this.L$1;
            ref$IntRef2 = (Ref$IntRef) this.L$0;
            kotlin.d.b(obj);
        }
        ref$IntRef.element = ((Number) obj).intValue();
        int i4 = ref$IntRef2.element;
        if (i4 != 0) {
            if (i4 < 0) {
                u7.p("Returned negative read bytes count");
                return null;
            }
            if (i4 > segment.b()) {
                u7.p("Returned too many bytes");
                return null;
            }
            buffer.skip(i4);
        }
        return new Integer(ref$IntRef2.element);
    }
}
