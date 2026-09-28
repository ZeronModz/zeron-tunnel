package io.ktor.utils.io;

import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.if3;
import defpackage.mk1;
import defpackage.u7;
import defpackage.vh;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", i = {0, 0, 0}, l = {182}, m = "read", n = {"$this$read", "consumer", "min"}, s = {"L$0", "L$1", "I$0"})
final class ByteReadChannelOperations_jvmKt$read$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperations_jvmKt$read$1(Continuation<? super ByteReadChannelOperations_jvmKt$read$1> continuation) {
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
            c.i(null);
            throw null;
        }
        if (i != 1) {
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i2 = this.I$0;
        Function1 function1 = (Function1) this.L$1;
        ByteReadChannel byteReadChannel = (ByteReadChannel) this.L$0;
        kotlin.d.b(obj);
        if (byteReadChannel.isClosedForRead() && i2 > 0) {
            StringBuilder sbV = vh.v(i2, "Not enough bytes available: required ", " but ");
            sbV.append(c.i(byteReadChannel));
            sbV.append(" available");
            throw new EOFException(sbV.toString());
        }
        int i3 = c.i(byteReadChannel);
        mk1 mk1Var = mk1.a;
        if (i3 > 0) {
            if3.z(byteReadChannel.getReadBuffer(), function1);
        }
        return mk1Var;
    }
}
