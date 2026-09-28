package io.ktor.utils.io;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (defpackage.xg0.D(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006f -> B:13:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(io.ktor.utils.io.ByteReadChannel r6, int r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$awaitUntilReadable$1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.ByteReadChannelOperationsKt$awaitUntilReadable$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$awaitUntilReadable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$awaitUntilReadable$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$awaitUntilReadable$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L33
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r7 = (io.ktor.utils.io.ByteReadChannel) r7
            kotlin.d.b(r8)
        L2f:
            r5 = r7
            r7 = r6
            r6 = r5
            goto L47
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            r6 = 0
            return r6
        L3a:
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r7 = (io.ktor.utils.io.ByteReadChannel) r7
            kotlin.d.b(r8)
            goto L5d
        L44:
            kotlin.d.b(r8)
        L47:
            int r8 = i(r6)
            if (r8 >= r7) goto L75
            r0.L$0 = r6
            r0.I$0 = r7
            r0.label = r4
            java.lang.Object r8 = r6.awaitContent(r7, r0)
            if (r8 != r1) goto L5a
            goto L71
        L5a:
            r5 = r7
            r7 = r6
            r6 = r5
        L5d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L72
            r0.L$0 = r7
            r0.I$0 = r6
            r0.label = r3
            java.lang.Object r8 = defpackage.xg0.D(r0)
            if (r8 != r1) goto L2f
        L71:
            return r1
        L72:
            r5 = r7
            r7 = r6
            r6 = r5
        L75:
            int r6 = i(r6)
            if (r6 < r7) goto L7e
            mk1 r6 = defpackage.mk1.a
            return r6
        L7e:
            java.io.EOFException r6 = new java.io.EOFException
            java.lang.String r7 = "Not enough data available"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.a(io.ktor.utils.io.ByteReadChannel, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void b(ByteWriteChannel byteWriteChannel) throws Throwable {
        byteWriteChannel.getClass();
        d.b(new ByteWriteChannelKt$close$1(byteWriteChannel));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r1.awaitContent(r7, r13) == r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d4, code lost:
    
        if (r0 != r2) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.ByteWriteChannel] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00d4 -> B:20:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(io.ktor.utils.io.ByteReadChannel r17, io.ktor.utils.io.ByteWriteChannel r18, long r19, kotlin.coroutines.jvm.internal.ContinuationImpl r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.c(io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        if (r11.awaitContent(1, r1) != r2) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[Catch: all -> 0x00a8, TRY_LEAVE, TryCatch #1 {all -> 0x00a8, blocks: (B:27:0x0073, B:29:0x0079), top: B:54:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.ByteWriteChannel] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a5 -> B:20:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(io.ktor.utils.io.ByteReadChannel r16, io.ktor.utils.io.ByteWriteChannel r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.d(io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[PHI: r2 r3 r7 r9
      0x0069: PHI (r2v2 kotlin.jvm.functions.Function1) = (r2v1 kotlin.jvm.functions.Function1), (r2v3 kotlin.jvm.functions.Function1) binds: [B:23:0x005e, B:46:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x0069: PHI (r3v3 kotlin.jvm.internal.Ref$LongRef) = (r3v1 kotlin.jvm.internal.Ref$LongRef), (r3v4 kotlin.jvm.internal.Ref$LongRef) binds: [B:23:0x005e, B:46:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x0069: PHI (r7v8 io.ktor.utils.io.ByteReadChannel) = (r7v0 io.ktor.utils.io.ByteReadChannel), (r7v10 io.ktor.utils.io.ByteReadChannel) binds: [B:23:0x005e, B:46:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x0069: PHI (r9v2 long) = (r9v0 long), (r9v3 long) binds: [B:23:0x005e, B:46:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x007b -> B:45:0x00d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0099 -> B:35:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(io.ktor.utils.io.ByteReadChannel r7, final java.nio.channels.FileChannel r8, final long r9, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.e(io.ktor.utils.io.ByteReadChannel, java.nio.channels.FileChannel, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004a -> B:26:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005b -> B:25:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(io.ktor.utils.io.ByteReadChannel r10, long r11, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$discard$1
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.ByteReadChannelOperationsKt$discard$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$discard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$discard$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$discard$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            long r10 = r0.J$1
            long r4 = r0.J$0
            java.lang.Object r12 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r12 = (io.ktor.utils.io.ByteReadChannel) r12
            kotlin.d.b(r13)
            goto L5e
        L2f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r10)
            r10 = 0
            return r10
        L36:
            kotlin.d.b(r13)
            r4 = r11
        L3a:
            r6 = 0
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 <= 0) goto L76
            boolean r13 = r10.isClosedForRead()
            if (r13 != 0) goto L76
            int r13 = i(r10)
            if (r13 != 0) goto L61
            r0.L$0 = r10
            r0.J$0 = r4
            r0.J$1 = r11
            r0.label = r3
            java.lang.Object r13 = r10.awaitContent(r3, r0)
            if (r13 != r1) goto L5b
            return r1
        L5b:
            r8 = r11
            r12 = r10
            r10 = r8
        L5e:
            r8 = r10
            r10 = r12
            r11 = r8
        L61:
            kotlinx.io.Source r13 = r10.getReadBuffer()
            long r6 = defpackage.sg.c(r13)
            long r6 = java.lang.Math.min(r11, r6)
            kotlinx.io.Source r13 = r10.getReadBuffer()
            defpackage.sg.b(r13, r6)
            long r11 = r11 - r6
            goto L3a
        L76:
            long r4 = r4 - r11
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.f(io.ktor.utils.io.ByteReadChannel, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(io.ktor.utils.io.ByteReadChannel r4, long r5, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$discardExact$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteReadChannelOperationsKt$discardExact$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$discardExact$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$discardExact$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$discardExact$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            long r5 = r0.J$0
            kotlin.d.b(r7)
            goto L3e
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r4)
            r4 = 0
            return r4
        L30:
            kotlin.d.b(r7)
            r0.J$0 = r5
            r0.label = r3
            java.lang.Object r7 = f(r4, r5, r0)
            if (r7 != r1) goto L3e
            return r1
        L3e:
            java.lang.Number r7 = (java.lang.Number) r7
            long r0 = r7.longValue()
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 < 0) goto L4b
            mk1 r4 = defpackage.mk1.a
            return r4
        L4b:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.String r7 = "Unable to discard "
            java.lang.String r0 = " bytes"
            java.lang.String r5 = defpackage.vh.j(r5, r7, r0)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.g(io.ktor.utils.io.ByteReadChannel, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(io.ktor.utils.io.ByteWriteChannel r2, kotlin.coroutines.jvm.internal.ContinuationImpl r3) {
        /*
            r2.getClass()
            java.lang.Throwable r0 = r2.getClosedCause()
            if (r0 != 0) goto L38
            boolean r0 = r2 instanceof io.ktor.utils.io.ByteChannel
            if (r0 == 0) goto L11
            r0 = r2
            io.ktor.utils.io.ByteChannel r0 = (io.ktor.utils.io.ByteChannel) r0
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L1a
            boolean r0 = r0.a
            r1 = 1
            if (r0 != r1) goto L1a
            goto L2c
        L1a:
            kotlinx.io.Sink r0 = r2.getWriteBuffer()
            r0.getClass()
            kotlinx.io.Buffer r0 = r0.getC()
            long r0 = r0.c
            int r0 = (int) r0
            r1 = 1048576(0x100000, float:1.469368E-39)
            if (r0 < r1) goto L35
        L2c:
            java.lang.Object r2 = r2.flush(r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r2 != r3) goto L35
            return r2
        L35:
            mk1 r2 = defpackage.mk1.a
            return r2
        L38:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.h(io.ktor.utils.io.ByteWriteChannel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final int i(ByteReadChannel byteReadChannel) {
        byteReadChannel.getClass();
        return (int) byteReadChannel.getReadBuffer().getC().c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(io.ktor.utils.io.ByteReadChannel r5, java.nio.ByteBuffer r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1 r0 = (io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1 r0 = new io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = -1
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L31
            java.lang.Object r5 = r0.L$1
            r6 = r5
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            java.lang.Object r5 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r5 = (io.ktor.utils.io.ByteReadChannel) r5
            kotlin.d.b(r7)
            goto L5e
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r5)
            r5 = 0
            return r5
        L38:
            kotlin.d.b(r7)
            boolean r7 = r5.isClosedForRead()
            if (r7 == 0) goto L47
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r3)
            return r5
        L47:
            kotlinx.io.Source r7 = r5.getReadBuffer()
            boolean r7 = r7.exhausted()
            if (r7 == 0) goto L5e
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.awaitContent(r4, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            boolean r7 = r5.isClosedForRead()
            if (r7 == 0) goto L6a
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r3)
            return r5
        L6a:
            kotlinx.io.Source r5 = r5.getReadBuffer()
            int r5 = defpackage.sb2.p(r5, r6)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.j(io.ktor.utils.io.ByteReadChannel, java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(io.ktor.utils.io.ByteReadChannel r7, byte[] r8, int r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readAvailable$1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.ByteReadChannelOperationsKt$readAvailable$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readAvailable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readAvailable$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readAvailable$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = -1
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 != r5) goto L39
            int r9 = r0.I$1
            int r7 = r0.I$0
            java.lang.Object r8 = r0.L$1
            byte[] r8 = (byte[]) r8
            java.lang.Object r0 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r0 = (io.ktor.utils.io.ByteReadChannel) r0
            kotlin.d.b(r10)
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r0
            goto L6d
        L39:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r7)
            r7 = 0
            return r7
        L40:
            kotlin.d.b(r10)
            boolean r10 = r7.isClosedForRead()
            if (r10 == 0) goto L4f
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r4)
            return r7
        L4f:
            kotlinx.io.Source r10 = r7.getReadBuffer()
            boolean r10 = r10.exhausted()
            if (r10 == 0) goto L71
            r0.L$0 = r7
            r0.L$1 = r8
            r0.I$0 = r3
            r0.I$1 = r9
            r0.label = r5
            java.lang.Object r10 = r7.awaitContent(r5, r0)
            if (r10 != r1) goto L6a
            return r1
        L6a:
            r10 = r9
            r9 = r8
            r8 = r3
        L6d:
            r6 = r9
            r9 = r8
            r8 = r6
            goto L73
        L71:
            r10 = r9
            r9 = r3
        L73:
            boolean r0 = r7.isClosedForRead()
            if (r0 == 0) goto L7f
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r4)
            return r7
        L7f:
            kotlinx.io.Source r7 = r7.getReadBuffer()
            r7.getClass()
            r8.getClass()
            int r10 = r10 + r9
            int r7 = r7.readAtMostTo(r8, r9, r10)
            if (r7 != r4) goto L91
            goto L92
        L91:
            r3 = r7
        L92:
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.k(io.ktor.utils.io.ByteReadChannel, byte[], int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(io.ktor.utils.io.ByteReadChannel r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.L$1
            kotlinx.io.Buffer r4 = (kotlinx.io.Buffer) r4
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r2 = (io.ktor.utils.io.ByteReadChannel) r2
            kotlin.d.b(r5)
            r5 = r4
            r4 = r2
            goto L40
        L31:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r4)
            r4 = 0
            return r4
        L38:
            kotlin.d.b(r5)
            kotlinx.io.Buffer r5 = new kotlinx.io.Buffer
            r5.<init>()
        L40:
            boolean r2 = r4.isClosedForRead()
            if (r2 != 0) goto L5a
            kotlinx.io.Source r2 = r4.getReadBuffer()
            r5.transferFrom(r2)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r2 = r4.awaitContent(r3, r0)
            if (r2 != r1) goto L40
            return r1
        L5a:
            java.lang.Throwable r4 = r4.getClosedCause()
            if (r4 != 0) goto L61
            return r5
        L61:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.l(io.ktor.utils.io.ByteReadChannel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(io.ktor.utils.io.ByteReadChannel r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readByte$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteReadChannelOperationsKt$readByte$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readByte$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readByte$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readByte$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r4 = (io.ktor.utils.io.ByteReadChannel) r4
            kotlin.d.b(r5)
            goto L4a
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r4)
            r4 = 0
            return r4
        L32:
            kotlin.d.b(r5)
            kotlinx.io.Source r5 = r4.getReadBuffer()
            boolean r5 = r5.exhausted()
            if (r5 == 0) goto L4a
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.awaitContent(r3, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            kotlinx.io.Source r5 = r4.getReadBuffer()
            boolean r5 = r5.exhausted()
            if (r5 != 0) goto L61
            kotlinx.io.Source r4 = r4.getReadBuffer()
            byte r4 = r4.readByte()
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            return r4
        L61:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.String r5 = "Not enough data available"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.m(io.ktor.utils.io.ByteReadChannel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0055 -> B:25:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0068 -> B:24:0x006a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(io.ktor.utils.io.ByteReadChannel r8, byte[] r9, int r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            java.lang.String r3 = "Channel is already closed"
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L35
            int r8 = r0.I$1
            int r9 = r0.I$0
            java.lang.Object r10 = r0.L$1
            byte[] r10 = (byte[]) r10
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r2 = (io.ktor.utils.io.ByteReadChannel) r2
            kotlin.d.b(r11)
            goto L6a
        L35:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r8)
            r8 = 0
            return r8
        L3c:
            kotlin.d.b(r11)
            boolean r11 = r8.isClosedForRead()
            if (r11 != 0) goto L94
            r11 = 0
            r7 = r9
            r9 = r8
            r8 = r11
            r11 = r10
            r10 = r7
        L4b:
            if (r8 >= r11) goto L91
            kotlinx.io.Source r2 = r9.getReadBuffer()
            boolean r2 = r2.exhausted()
            if (r2 == 0) goto L6c
            r0.L$0 = r9
            r0.L$1 = r10
            r0.I$0 = r11
            r0.I$1 = r8
            r0.label = r4
            java.lang.Object r2 = r9.awaitContent(r4, r0)
            if (r2 != r1) goto L68
            return r1
        L68:
            r2 = r9
            r9 = r11
        L6a:
            r11 = r9
            r9 = r2
        L6c:
            boolean r2 = r9.isClosedForRead()
            if (r2 != 0) goto L8b
            int r2 = r11 - r8
            kotlinx.io.Source r5 = r9.getReadBuffer()
            long r5 = defpackage.sg.c(r5)
            int r5 = (int) r5
            int r2 = java.lang.Math.min(r2, r5)
            kotlinx.io.Source r5 = r9.getReadBuffer()
            int r2 = r2 + r8
            defpackage.mc2.E(r5, r10, r8, r2)
            r8 = r2
            goto L4b
        L8b:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>(r3)
            throw r8
        L91:
            mk1 r8 = defpackage.mk1.a
            return r8
        L94:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.n(io.ktor.utils.io.ByteReadChannel, byte[], int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(io.ktor.utils.io.ByteReadChannel r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readInt$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteReadChannelOperationsKt$readInt$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readInt$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readInt$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readInt$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r4 = (io.ktor.utils.io.ByteReadChannel) r4
            kotlin.d.b(r5)
            goto L41
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r4)
            r4 = 0
            return r4
        L32:
            kotlin.d.b(r5)
            r0.L$0 = r4
            r0.label = r3
            r5 = 4
            java.lang.Object r5 = a(r4, r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            kotlinx.io.Source r4 = r4.getReadBuffer()
            int r4 = r4.readInt()
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.o(io.ktor.utils.io.ByteReadChannel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(io.ktor.utils.io.ByteReadChannel r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readLong$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteReadChannelOperationsKt$readLong$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readLong$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readLong$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readLong$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r4 = (io.ktor.utils.io.ByteReadChannel) r4
            kotlin.d.b(r5)
            goto L42
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r4)
            r4 = 0
            return r4
        L32:
            kotlin.d.b(r5)
            r0.L$0 = r4
            r0.label = r3
            r5 = 8
            java.lang.Object r5 = a(r4, r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            kotlinx.io.Source r4 = r4.getReadBuffer()
            long r4 = r4.readLong()
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.p(io.ktor.utils.io.ByteReadChannel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:24:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0063 -> B:23:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(io.ktor.utils.io.ByteReadChannel r11, int r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            int r11 = r0.I$0
            java.lang.Object r12 = r0.L$1
            kotlinx.io.Buffer r12 = (kotlinx.io.Buffer) r12
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r2 = (io.ktor.utils.io.ByteReadChannel) r2
            kotlin.d.b(r13)
            goto L65
        L31:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r11)
            r11 = 0
            return r11
        L38:
            kotlin.d.b(r13)
            kotlinx.io.Buffer r13 = new kotlinx.io.Buffer
            r13.<init>()
            r10 = r13
            r13 = r12
            r12 = r10
        L43:
            long r4 = r12.c
            long r6 = (long) r13
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L97
            kotlinx.io.Source r2 = r11.getReadBuffer()
            boolean r2 = r2.exhausted()
            if (r2 == 0) goto L67
            r0.L$0 = r11
            r0.L$1 = r12
            r0.I$0 = r13
            r0.label = r3
            java.lang.Object r2 = r11.awaitContent(r3, r0)
            if (r2 != r1) goto L63
            return r1
        L63:
            r2 = r11
            r11 = r13
        L65:
            r13 = r11
            r11 = r2
        L67:
            boolean r2 = r11.isClosedForRead()
            if (r2 != 0) goto L97
            kotlinx.io.Source r2 = r11.getReadBuffer()
            long r4 = defpackage.sg.c(r2)
            long r6 = (long) r13
            long r8 = r12.c
            long r8 = r6 - r8
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L89
            kotlinx.io.Source r2 = r11.getReadBuffer()
            long r4 = r12.c
            long r6 = r6 - r4
            r2.readTo(r12, r6)
            goto L43
        L89:
            kotlinx.io.Source r2 = r11.getReadBuffer()
            long r4 = r2.transferTo(r12)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            goto L43
        L97:
            long r0 = r12.c
            long r2 = (long) r13
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 < 0) goto L9f
            return r12
        L9f:
            java.io.EOFException r11 = new java.io.EOFException
            java.lang.String r0 = "Not enough data available, required "
            java.lang.String r1 = " bytes but only "
            java.lang.StringBuilder r13 = defpackage.vh.v(r13, r0, r1)
            long r0 = r12.c
            java.lang.String r12 = " available"
            java.lang.String r12 = defpackage.vh.p(r13, r0, r12)
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.q(io.ktor.utils.io.ByteReadChannel, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(io.ktor.utils.io.ByteReadChannel r8, long r9, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$2
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$2 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$2 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$2
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L34
            long r8 = r0.J$0
            java.lang.Object r10 = r0.L$1
            kotlinx.io.Sink r10 = (kotlinx.io.Sink) r10
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r2 = (io.ktor.utils.io.ByteReadChannel) r2
            kotlin.d.b(r11)
            r11 = r10
            r9 = r8
            r8 = r2
            goto L43
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r8)
            r8 = 0
            return r8
        L3b:
            kotlin.d.b(r11)
            kotlinx.io.Buffer r11 = new kotlinx.io.Buffer
            r11.<init>()
        L43:
            boolean r2 = r8.isClosedForRead()
            if (r2 != 0) goto L8b
            r4 = 0
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 <= 0) goto L8b
            kotlinx.io.Source r2 = r8.getReadBuffer()
            long r6 = defpackage.sg.c(r2)
            int r2 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r2 < 0) goto L73
            kotlinx.io.Source r2 = r8.getReadBuffer()
            long r4 = defpackage.sg.c(r2)
            long r4 = r9 - r4
            kotlinx.io.Source r9 = r8.getReadBuffer()
            long r9 = r9.transferTo(r11)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r9)
            goto L7a
        L73:
            kotlinx.io.Source r2 = r8.getReadBuffer()
            r2.readTo(r11, r9)
        L7a:
            r0.L$0 = r8
            r0.L$1 = r11
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r9 = r8.awaitContent(r3, r0)
            if (r9 != r1) goto L89
            return r1
        L89:
            r9 = r4
            goto L43
        L8b:
            kotlinx.io.Buffer r8 = r11.getC()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.r(io.ktor.utils.io.ByteReadChannel, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(io.ktor.utils.io.ByteReadChannel r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.L$1
            kotlinx.io.Sink r4 = (kotlinx.io.Sink) r4
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r2 = (io.ktor.utils.io.ByteReadChannel) r2
            kotlin.d.b(r5)
            r5 = r4
            r4 = r2
            goto L40
        L31:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r4)
            r4 = 0
            return r4
        L38:
            kotlin.d.b(r5)
            kotlinx.io.Buffer r5 = new kotlinx.io.Buffer
            r5.<init>()
        L40:
            boolean r2 = r4.isClosedForRead()
            if (r2 != 0) goto L5a
            kotlinx.io.Source r2 = r4.getReadBuffer()
            r5.transferFrom(r2)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r2 = r4.awaitContent(r3, r0)
            if (r2 != r1) goto L40
            return r1
        L5a:
            java.lang.Throwable r4 = r4.getClosedCause()
            if (r4 != 0) goto L65
            kotlinx.io.Buffer r4 = r5.getC()
            return r4
        L65:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.s(io.ktor.utils.io.ByteReadChannel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(io.ktor.utils.io.ByteReadChannel r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readShort$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteReadChannelOperationsKt$readShort$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readShort$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readShort$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readShort$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r4 = (io.ktor.utils.io.ByteReadChannel) r4
            kotlin.d.b(r5)
            goto L41
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r4)
            r4 = 0
            return r4
        L32:
            kotlin.d.b(r5)
            r0.L$0 = r4
            r0.label = r3
            r5 = 2
            java.lang.Object r5 = a(r4, r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            kotlinx.io.Source r4 = r4.getReadBuffer()
            short r4 = r4.readShort()
            java.lang.Short r5 = new java.lang.Short
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.t(io.ktor.utils.io.ByteReadChannel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(io.ktor.utils.io.ByteReadChannel r6, int r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8Line$1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8Line$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8Line$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8Line$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8Line$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            java.lang.Object r6 = r0.L$0
            java.lang.StringBuilder r6 = (java.lang.StringBuilder) r6
            kotlin.d.b(r8)
            goto L48
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            return r3
        L32:
            kotlin.d.b(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r6 = v(r6, r8, r7, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r8
            r8 = r6
            r6 = r5
        L48:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 != 0) goto L51
            return r3
        L51:
            java.lang.String r6 = r6.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.u(io.ktor.utils.io.ByteReadChannel, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        if (r18.awaitContent(1, r2) == r3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015d, code lost:
    
        if (r4.c >= r0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015f, code lost:
    
        r2.L$0 = r15;
        r2.L$1 = r14;
        r2.L$2 = r13;
        r2.L$3 = r4;
        r2.I$0 = r0;
        r2.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016f, code lost:
    
        if (r15.awaitContent(1, r2) != r3) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0171, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0191, code lost:
    
        throw new io.ktor.utils.io.charsets.TooLongLineException("Line exceeds limit of " + r0 + " characters");
     */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x01b0: INVOKE (r13 I:java.lang.AutoCloseable), (r1 I:java.lang.Throwable) STATIC call: w91.j(java.lang.AutoCloseable, java.lang.Throwable):void A[MD:(java.lang.AutoCloseable, java.lang.Throwable):void throws java.lang.Exception (m)] (LINE:433), block:B:82:0x01b0 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9 A[Catch: all -> 0x004a, LOOP:0: B:38:0x00b9->B:63:0x014f, LOOP_START, TryCatch #0 {all -> 0x004a, blocks: (B:14:0x0043, B:36:0x00b3, B:38:0x00b9, B:40:0x00c3, B:42:0x00d1, B:44:0x00db, B:49:0x00f3, B:51:0x0101, B:54:0x011f, B:55:0x0128, B:52:0x010b, B:59:0x013c, B:63:0x014f, B:64:0x0154, B:66:0x015f, B:70:0x0176, B:71:0x0191, B:72:0x0192, B:75:0x019b, B:77:0x01a1, B:21:0x0065), top: B:84:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0192 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:14:0x0043, B:36:0x00b3, B:38:0x00b9, B:40:0x00c3, B:42:0x00d1, B:44:0x00db, B:49:0x00f3, B:51:0x0101, B:54:0x011f, B:55:0x0128, B:52:0x010b, B:59:0x013c, B:63:0x014f, B:64:0x0154, B:66:0x015f, B:70:0x0176, B:71:0x0191, B:72:0x0192, B:75:0x019b, B:77:0x01a1, B:21:0x0065), top: B:84:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x016f -> B:69:0x0172). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(io.ktor.utils.io.ByteReadChannel r18, java.lang.StringBuilder r19, int r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.v(io.ktor.utils.io.ByteReadChannel, java.lang.StringBuilder, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(io.ktor.utils.io.ByteWriteChannel r5, byte[] r6, kotlin.jvm.internal.Ref$IntRef r7, kotlin.jvm.internal.Ref$LongRef r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readUntil$appendPartialMatch$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L32
            java.lang.Object r5 = r0.L$1
            r8 = r5
            kotlin.jvm.internal.Ref$LongRef r8 = (kotlin.jvm.internal.Ref$LongRef) r8
            java.lang.Object r5 = r0.L$0
            r7 = r5
            kotlin.jvm.internal.Ref$IntRef r7 = (kotlin.jvm.internal.Ref$IntRef) r7
            kotlin.d.b(r9)
            goto L4b
        L32:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r5)
            r5 = 0
            return r5
        L39:
            kotlin.d.b(r9)
            int r9 = r7.element
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r5 = io.ktor.utils.io.d.d(r5, r6, r3, r9, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            long r5 = r8.element
            int r9 = r7.element
            long r0 = (long) r9
            long r5 = r5 + r0
            r8.element = r5
            r7.element = r3
            mk1 r5 = defpackage.mk1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.w(io.ktor.utils.io.ByteWriteChannel, byte[], kotlin.jvm.internal.Ref$IntRef, kotlin.jvm.internal.Ref$LongRef, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable x(io.ktor.utils.io.ByteReadChannel r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt$toByteArray$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteReadChannelOperationsKt$toByteArray$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt$toByteArray$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$toByteArray$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$toByteArray$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            kotlin.d.b(r5)
            goto L3a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r4)
            r4 = 0
            return r4
        L2e:
            kotlin.d.b(r5)
            r0.label = r3
            java.lang.Object r5 = l(r4, r0)
            if (r5 != r1) goto L3a
            return r1
        L3a:
            kotlinx.io.Buffer r5 = (kotlinx.io.Buffer) r5
            long r0 = r5.c
            int r4 = (int) r0
            byte[] r4 = defpackage.mc2.C(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.c.x(io.ktor.utils.io.ByteReadChannel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }
}
