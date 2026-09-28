package io.ktor.utils.io;

import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.mk1;
import defpackage.u7;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.io.bytestring.ByteString;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", i = {0, 0, 0}, l = {107}, m = "skipDelimiter", n = {"$this$skipDelimiter", "delimiter", "i"}, s = {"L$0", "L$1", "I$0"})
final class ByteReadChannelOperations_jvmKt$skipDelimiter$2 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperations_jvmKt$skipDelimiter$2(Continuation<? super ByteReadChannelOperations_jvmKt$skipDelimiter$2> continuation) {
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
        int i2 = this.I$1;
        int i3 = this.I$0;
        ByteString byteString = (ByteString) this.L$1;
        ByteReadChannel byteReadChannel = (ByteReadChannel) this.L$0;
        kotlin.d.b(obj);
        while (((Number) obj).byteValue() == byteString.a(i3)) {
            i3++;
            if (i3 >= i2) {
                return mk1.a;
            }
            this.L$0 = byteReadChannel;
            this.L$1 = byteString;
            this.I$0 = i3;
            this.I$1 = i2;
            this.label = 1;
            obj = c.m(byteReadChannel, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        u7.p("Delimiter is not found");
        return null;
    }
}
