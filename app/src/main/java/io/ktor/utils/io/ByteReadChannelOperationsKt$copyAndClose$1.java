package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 1, 1, 1, 2}, l = {114, 115, 124, 124}, m = "copyAndClose", n = {"$this$copyAndClose", "channel", "result", "$this$copyAndClose", "channel", "result", "result"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "J$0"})
final class ByteReadChannelOperationsKt$copyAndClose$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperationsKt$copyAndClose$1(Continuation<? super ByteReadChannelOperationsKt$copyAndClose$1> continuation) {
        super(continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:13:0x003b, B:21:0x0056, B:23:0x005c, B:26:0x0078, B:29:0x0087, B:37:0x00a3, B:18:0x004b), top: B:48:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #1 {all -> 0x003f, blocks: (B:13:0x003b, B:21:0x0056, B:23:0x005c, B:26:0x0078, B:29:0x0087, B:37:0x00a3, B:18:0x004b), top: B:48:0x0011 }] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [io.ktor.utils.io.ByteWriteChannel] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0084 -> B:21:0x0056). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            r12.result = r13
            int r0 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r12.label = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L4f
            if (r0 == r6) goto L41
            if (r0 == r5) goto L31
            if (r0 == r4) goto L2a
            if (r0 == r3) goto L21
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r12)
            return r2
        L21:
            java.lang.Object r12 = r12.L$0
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            kotlin.d.b(r13)
            goto Lba
        L2a:
            long r0 = r12.J$0
            kotlin.d.b(r13)
            goto L9d
        L31:
            long r7 = r12.J$0
            java.lang.Object r0 = r12.L$1
            io.ktor.utils.io.ByteWriteChannel r0 = (io.ktor.utils.io.ByteWriteChannel) r0
            java.lang.Object r9 = r12.L$0
            io.ktor.utils.io.ByteReadChannel r9 = (io.ktor.utils.io.ByteReadChannel) r9
            kotlin.d.b(r13)     // Catch: java.lang.Throwable -> L3f
            goto L56
        L3f:
            r13 = move-exception
            goto La4
        L41:
            long r7 = r12.J$0
            java.lang.Object r0 = r12.L$1
            io.ktor.utils.io.ByteWriteChannel r0 = (io.ktor.utils.io.ByteWriteChannel) r0
            java.lang.Object r9 = r12.L$0
            io.ktor.utils.io.ByteReadChannel r9 = (io.ktor.utils.io.ByteReadChannel) r9
            kotlin.d.b(r13)     // Catch: java.lang.Throwable -> L3f
            goto L78
        L4f:
            kotlin.d.b(r13)
            r7 = 0
            r0 = r2
            r9 = r0
        L56:
            boolean r13 = r9.isClosedForRead()     // Catch: java.lang.Throwable -> L3f
            if (r13 != 0) goto L87
            kotlinx.io.Source r13 = r9.getReadBuffer()     // Catch: java.lang.Throwable -> L3f
            kotlinx.io.Sink r10 = r0.getWriteBuffer()     // Catch: java.lang.Throwable -> L3f
            long r10 = r13.transferTo(r10)     // Catch: java.lang.Throwable -> L3f
            long r7 = r7 + r10
            r12.L$0 = r9     // Catch: java.lang.Throwable -> L3f
            r12.L$1 = r0     // Catch: java.lang.Throwable -> L3f
            r12.J$0 = r7     // Catch: java.lang.Throwable -> L3f
            r12.label = r6     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r13 = r0.flush(r12)     // Catch: java.lang.Throwable -> L3f
            if (r13 != r1) goto L78
            goto Lb8
        L78:
            r12.L$0 = r9     // Catch: java.lang.Throwable -> L3f
            r12.L$1 = r0     // Catch: java.lang.Throwable -> L3f
            r12.J$0 = r7     // Catch: java.lang.Throwable -> L3f
            r12.label = r5     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r13 = r9.awaitContent(r6, r12)     // Catch: java.lang.Throwable -> L3f
            if (r13 != r1) goto L56
            goto Lb8
        L87:
            java.lang.Throwable r13 = r9.getClosedCause()     // Catch: java.lang.Throwable -> L3f
            if (r13 != 0) goto La3
            r12.L$0 = r2
            r12.L$1 = r2
            r12.J$0 = r7
            r12.label = r4
            java.lang.Object r12 = r0.flushAndClose(r12)
            if (r12 != r1) goto L9c
            goto Lb8
        L9c:
            r0 = r7
        L9d:
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r0)
            return r12
        La3:
            throw r13     // Catch: java.lang.Throwable -> L3f
        La4:
            r9.cancel(r13)     // Catch: java.lang.Throwable -> Lab
            io.ktor.utils.io.d.a(r0, r13)     // Catch: java.lang.Throwable -> Lab
            throw r13     // Catch: java.lang.Throwable -> Lab
        Lab:
            r13 = move-exception
            r12.L$0 = r13
            r12.L$1 = r2
            r12.label = r3
            java.lang.Object r12 = r0.flushAndClose(r12)
            if (r12 != r1) goto Lb9
        Lb8:
            return r1
        Lb9:
            r12 = r13
        Lba:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt$copyAndClose$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
