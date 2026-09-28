package io.ktor.utils.io.jvm.nio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSession", f = "WriteSuspendSession.kt", i = {0}, l = {30, 32}, m = "written", n = {"this"}, s = {"L$0"})
final class WriteSuspendSession$written$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WriteSuspendSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WriteSuspendSession$written$1(WriteSuspendSession writeSuspendSession, Continuation<? super WriteSuspendSession$written$1> continuation) {
        super(continuation);
        this.this$0 = writeSuspendSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r8.flush(r7) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            r7.result = r8
            int r0 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            r7.label = r0
            io.ktor.utils.io.jvm.nio.WriteSuspendSession r2 = r7.this$0
            java.nio.ByteBuffer r3 = r2.b
            int r0 = r0 - r1
            r7.label = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r4 = 0
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L2e
            if (r0 == r6) goto L25
            if (r0 != r5) goto L1f
            kotlin.d.b(r8)
            goto L53
        L1f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r7)
            return r4
        L25:
            java.lang.Object r0 = r7.L$0
            r2 = r0
            io.ktor.utils.io.jvm.nio.WriteSuspendSession r2 = (io.ktor.utils.io.jvm.nio.WriteSuspendSession) r2
            kotlin.d.b(r8)
            goto L41
        L2e:
            kotlin.d.b(r8)
            r3.flip()
            io.ktor.utils.io.ByteWriteChannel r8 = r2.a
            r7.L$0 = r2
            r7.label = r6
            java.lang.Object r8 = defpackage.xg0.C(r8, r3, r7)
            if (r8 != r1) goto L41
            goto L52
        L41:
            java.nio.ByteBuffer r8 = r2.b
            r8.clear()
            io.ktor.utils.io.ByteWriteChannel r8 = r2.a
            r7.L$0 = r4
            r7.label = r5
            java.lang.Object r7 = r8.flush(r7)
            if (r7 != r1) goto L53
        L52:
            return r1
        L53:
            mk1 r7 = defpackage.mk1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.nio.WriteSuspendSession$written$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
