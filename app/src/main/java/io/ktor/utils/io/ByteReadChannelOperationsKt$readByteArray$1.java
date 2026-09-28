package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0}, l = {188}, m = "readByteArray", n = {"$this$readByteArray", "builder$iv", "$this$readByteArray_u24lambda_u242", "count"}, s = {"L$0", "L$1", "L$2", "I$0"})
final class ByteReadChannelOperationsKt$readByteArray$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperationsKt$readByteArray$1(Continuation<? super ByteReadChannelOperationsKt$readByteArray$1> continuation) {
        super(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0059 -> B:15:0x005c). Please report as a decompilation issue!!! */
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
            if (r0 == 0) goto L2a
            if (r0 != r3) goto L24
            int r0 = r8.I$0
            java.lang.Object r2 = r8.L$2
            kotlinx.io.Sink r2 = (kotlinx.io.Sink) r2
            java.lang.Object r4 = r8.L$1
            kotlinx.io.Buffer r4 = (kotlinx.io.Buffer) r4
            java.lang.Object r5 = r8.L$0
            io.ktor.utils.io.ByteReadChannel r5 = (io.ktor.utils.io.ByteReadChannel) r5
            kotlin.d.b(r9)
            goto L5c
        L24:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r8)
            return r2
        L2a:
            kotlin.d.b(r9)
            kotlinx.io.Buffer r9 = new kotlinx.io.Buffer
            r9.<init>()
            r0 = 0
            r4 = r9
            r9 = r2
            r2 = r4
        L36:
            kotlinx.io.Buffer r5 = r2.getC()
            long r5 = r5.c
            int r5 = (int) r5
            if (r5 >= r0) goto L69
            kotlinx.io.Buffer r5 = r2.getC()
            long r5 = r5.c
            int r5 = (int) r5
            int r5 = r0 - r5
            r8.L$0 = r9
            r8.L$1 = r4
            r8.L$2 = r2
            r8.I$0 = r0
            r8.label = r3
            java.lang.Object r5 = io.ktor.utils.io.c.q(r9, r5, r8)
            if (r5 != r1) goto L59
            return r1
        L59:
            r7 = r5
            r5 = r9
            r9 = r7
        L5c:
            kotlinx.io.Source r9 = (kotlinx.io.Source) r9
            r2.getClass()
            r9.getClass()
            r2.transferFrom(r9)
            r9 = r5
            goto L36
        L69:
            byte[] r8 = defpackage.mc2.B(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt$readByteArray$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
