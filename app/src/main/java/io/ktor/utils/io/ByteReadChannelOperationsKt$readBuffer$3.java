package io.ktor.utils.io;

import com.trilead.ssh2.packets.Packets;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0}, l = {Packets.SSH_MSG_CHANNEL_REQUEST}, m = "readBuffer", n = {"$this$readBuffer", "result", "remaining"}, s = {"L$0", "L$1", "I$0"})
final class ByteReadChannelOperationsKt$readBuffer$3 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperationsKt$readBuffer$3(Continuation<? super ByteReadChannelOperationsKt$readBuffer$3> continuation) {
        super(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003f -> B:19:0x0054). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:18:0x0052). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            r8.result = r9
            int r0 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r8.label = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L26
            if (r0 != r3) goto L20
            int r0 = r8.I$0
            java.lang.Object r2 = r8.L$1
            kotlinx.io.Buffer r2 = (kotlinx.io.Buffer) r2
            java.lang.Object r4 = r8.L$0
            io.ktor.utils.io.ByteReadChannel r4 = (io.ktor.utils.io.ByteReadChannel) r4
            kotlin.d.b(r9)
            goto L52
        L20:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r8)
            return r2
        L26:
            kotlin.d.b(r9)
            kotlinx.io.Buffer r9 = new kotlinx.io.Buffer
            r9.<init>()
            r0 = 0
        L2f:
            if (r0 <= 0) goto L6b
            boolean r4 = r2.isClosedForRead()
            if (r4 != 0) goto L6b
            kotlinx.io.Source r4 = r2.getReadBuffer()
            boolean r4 = r4.exhausted()
            if (r4 == 0) goto L54
            r8.L$0 = r2
            r8.L$1 = r9
            r8.I$0 = r0
            r8.label = r3
            java.lang.Object r4 = r2.awaitContent(r3, r8)
            if (r4 != r1) goto L50
            return r1
        L50:
            r4 = r2
            r2 = r9
        L52:
            r9 = r2
            r2 = r4
        L54:
            long r4 = (long) r0
            kotlinx.io.Source r6 = r2.getReadBuffer()
            long r6 = defpackage.sg.c(r6)
            long r4 = java.lang.Math.min(r4, r6)
            kotlinx.io.Source r6 = r2.getReadBuffer()
            r6.readTo(r9, r4)
            int r4 = (int) r4
            int r0 = r0 - r4
            goto L2f
        L6b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
