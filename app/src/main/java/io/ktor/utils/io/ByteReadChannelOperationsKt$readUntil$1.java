package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 4}, l = {513, 516, 526, 536, 537}, m = "readUntil", n = {"$this$readUntil", "matchString", "writeChannel", "partialMatchTable", "matchIndex", "matchBuffer", "rc", "limit", "ignoreMissing", "$this$readUntil", "matchString", "writeChannel", "partialMatchTable", "matchIndex", "matchBuffer", "rc", "limit", "ignoreMissing", "byte", "$this$readUntil", "matchString", "writeChannel", "partialMatchTable", "matchIndex", "matchBuffer", "rc", "limit", "ignoreMissing", "writeChannel", "rc", "rc"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "Z$0", "B$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "Z$0", "L$0", "L$1", "L$0"})
final class ByteReadChannelOperationsKt$readUntil$1 extends ContinuationImpl {
    byte B$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperationsKt$readUntil$1(Continuation<? super ByteReadChannelOperationsKt$readUntil$1> continuation) {
        super(continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e6, code lost:
    
        if (io.ktor.utils.io.c.w(r14, r11, r12, r10, r0) == r3) goto L57;
     */
    /* JADX WARN: Path cross not found for [B:19:0x00c6, B:30:0x00fe], limit reached: 65 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x011f -> B:36:0x0129). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0154 -> B:41:0x0156). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt$readUntil$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
