package io.ktor.utils.io;

import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.mc2;
import defpackage.u7;
import defpackage.xu;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.io.Source;
import kotlinx.io.bytestring.ByteString;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0}, l = {592}, m = "peek", n = {"$this$peek", "count"}, s = {"L$0", "I$0"})
final class ByteReadChannelOperationsKt$peek$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperationsKt$peek$1(Continuation<? super ByteReadChannelOperationsKt$peek$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        int i = this.label | AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        this.label = i;
        if ((i & AttribFlags.SSH_FILEXFER_ATTR_EXTENDED) != 0) {
            this.label = i - AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        } else {
            this = new ByteReadChannelOperationsKt$peek$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.d.b(obj2);
            throw null;
        }
        if (i2 != 1) {
            u7.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.I$0;
        ByteReadChannel byteReadChannel = (ByteReadChannel) this.L$0;
        kotlin.d.b(obj2);
        if (!((Boolean) obj2).booleanValue()) {
            return null;
        }
        Source sourcePeek = byteReadChannel.getReadBuffer().peek();
        sourcePeek.getClass();
        byte[] bArrC = mc2.C(sourcePeek, i3);
        ByteString.c.getClass();
        return new ByteString(bArrC, (Object) null, (xu) null);
    }
}
