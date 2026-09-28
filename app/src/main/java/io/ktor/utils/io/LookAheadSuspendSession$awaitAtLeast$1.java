package io.ktor.utils.io;

import androidx.datastore.preferences.protobuf.x0;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.sg;
import defpackage.u7;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.LookAheadSuspendSession", f = "LookAheadSession.kt", i = {0, 0}, l = {x0.SWIFT_PREFIX_FIELD_NUMBER}, m = "awaitAtLeast", n = {"this", "min"}, s = {"L$0", "I$0"})
final class LookAheadSuspendSession$awaitAtLeast$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LookAheadSuspendSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LookAheadSuspendSession$awaitAtLeast$1(LookAheadSuspendSession lookAheadSuspendSession, Continuation<? super LookAheadSuspendSession$awaitAtLeast$1> continuation) {
        super(continuation);
        this.this$0 = lookAheadSuspendSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        this.result = obj;
        int i2 = this.label | AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        this.label = i2;
        LookAheadSuspendSession lookAheadSuspendSession = this.this$0;
        ByteReadChannel byteReadChannel = lookAheadSuspendSession.a;
        int i3 = i2 - AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
        this.label = i3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i3 == 0) {
            kotlin.d.b(obj);
            if (sg.c(byteReadChannel.getReadBuffer()) >= 0) {
                return Boolean.TRUE;
            }
            this.L$0 = lookAheadSuspendSession;
            this.I$0 = 0;
            this.label = 1;
            if (byteReadChannel.awaitContent(0, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i = 0;
        } else {
            if (i3 != 1) {
                u7.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            lookAheadSuspendSession = (LookAheadSuspendSession) this.L$0;
            kotlin.d.b(obj);
        }
        return Boolean.valueOf(sg.c(lookAheadSuspendSession.a.getReadBuffer()) >= ((long) i));
    }
}
