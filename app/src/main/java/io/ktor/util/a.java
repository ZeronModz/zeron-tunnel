package io.ktor.util;

import defpackage.km;
import defpackage.ng;
import defpackage.u7;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteReadChannel;
import java.nio.ByteBuffer;
import java.util.zip.Checksum;
import kotlin.Pair;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final byte[] a = new byte[7];

    public static final Attributes a() {
        return new ConcurrentSafeAttributes();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00e2: MOVE (r1 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:227), block:B:37:0x00df */
    /* JADX WARN: Path cross not found for [B:104:0x002c, B:41:0x010b], limit reached: 107 */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016e A[Catch: all -> 0x01fa, TRY_LEAVE, TryCatch #3 {all -> 0x01fa, blocks: (B:85:0x0229, B:56:0x0168, B:58:0x016e, B:78:0x01fd, B:80:0x0203, B:92:0x0251), top: B:101:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019c A[Catch: all -> 0x01e5, TryCatch #0 {all -> 0x01e5, blocks: (B:62:0x0194, B:64:0x019c, B:66:0x01a8, B:73:0x01eb, B:74:0x01f2), top: B:95:0x0194 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fd A[Catch: all -> 0x01fa, TRY_ENTER, TryCatch #3 {all -> 0x01fa, blocks: (B:85:0x0229, B:56:0x0168, B:58:0x016e, B:78:0x01fd, B:80:0x0203, B:92:0x0251), top: B:101:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0229 A[Catch: all -> 0x01fa, TRY_LEAVE, TryCatch #3 {all -> 0x01fa, blocks: (B:85:0x0229, B:56:0x0168, B:58:0x016e, B:78:0x01fd, B:80:0x0203, B:92:0x0251), top: B:101:0x0168 }] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r21v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01f3 -> B:101:0x0168). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(io.ktor.utils.io.ByteReadChannel r19, io.ktor.utils.io.ByteWriteChannel r20, boolean r21, io.ktor.utils.io.pool.ObjectPool r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.a.b(io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel, boolean, io.ktor.utils.io.pool.ObjectPool, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(io.ktor.utils.io.ByteWriteChannel r6, java.util.zip.Deflater r7, java.nio.ByteBuffer r8, kotlin.jvm.functions.Function0 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof io.ktor.util.DeflaterKt$deflateWhile$1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.util.DeflaterKt$deflateWhile$1 r0 = (io.ktor.util.DeflaterKt$deflateWhile$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.DeflaterKt$deflateWhile$1 r0 = new io.ktor.util.DeflaterKt$deflateWhile$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3d
            java.lang.Object r6 = r0.L$3
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            java.lang.Object r7 = r0.L$2
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            java.lang.Object r8 = r0.L$1
            java.util.zip.Deflater r8 = (java.util.zip.Deflater) r8
            java.lang.Object r9 = r0.L$0
            io.ktor.utils.io.ByteWriteChannel r9 = (io.ktor.utils.io.ByteWriteChannel) r9
            kotlin.d.b(r10)
            r5 = r9
            r9 = r6
            r6 = r5
            r5 = r8
            r8 = r7
            r7 = r5
            goto L47
        L3d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            r6 = 0
            return r6
        L44:
            kotlin.d.b(r10)
        L47:
            java.lang.Object r10 = r9.invoke()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L8d
            r8.clear()
            boolean r10 = r8.hasRemaining()
            if (r10 == 0) goto L79
            byte[] r10 = r8.array()
            int r2 = r8.arrayOffset()
            int r4 = r8.position()
            int r4 = r4 + r2
            int r2 = r8.remaining()
            int r10 = r7.deflate(r10, r4, r2)
            int r2 = r8.position()
            int r2 = r2 + r10
            r8.position(r2)
        L79:
            r8.flip()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.L$3 = r9
            r0.label = r3
            java.lang.Object r10 = defpackage.xg0.C(r6, r8, r0)
            if (r10 != r1) goto L47
            return r1
        L8d:
            mk1 r6 = defpackage.mk1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.a.c(io.ktor.utils.io.ByteWriteChannel, java.util.zip.Deflater, java.nio.ByteBuffer, kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final String d() {
        String str = (String) km.b(c.b.mo58tryReceivePtdJZtk());
        if (str != null) {
            return str;
        }
        c.c.start();
        return (String) kotlinx.coroutines.b.a(new CryptoKt__CryptoJvmKt$generateNonceBlocking$1(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(java.util.zip.Inflater r5, io.ktor.utils.io.ByteWriteChannel r6, java.nio.ByteBuffer r7, java.util.zip.CRC32 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.ktor.util.EncodersJvmKt$inflateTo$1
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.util.EncodersJvmKt$inflateTo$1 r0 = (io.ktor.util.EncodersJvmKt$inflateTo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.EncodersJvmKt$inflateTo$1 r0 = new io.ktor.util.EncodersJvmKt$inflateTo$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            int r5 = r0.I$0
            kotlin.d.b(r9)
            goto L5f
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r5)
            r5 = 0
            return r5
        L30:
            kotlin.d.b(r9)
            r7.clear()
            byte[] r9 = r7.array()
            int r2 = r7.position()
            int r4 = r7.remaining()
            int r5 = r5.inflate(r9, r2, r4)
            int r9 = r7.position()
            int r9 = r9 + r5
            r7.position(r9)
            r7.flip()
            i(r8, r7)
            r0.I$0 = r5
            r0.label = r3
            java.lang.Object r6 = defpackage.xg0.C(r6, r7, r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.a.e(java.util.zip.Inflater, io.ktor.utils.io.ByteWriteChannel, java.nio.ByteBuffer, java.util.zip.CRC32, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(io.ktor.utils.io.ByteWriteChannel r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.ktor.util.DeflaterKt$putGzipHeader$1
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.util.DeflaterKt$putGzipHeader$1 r0 = (io.ktor.util.DeflaterKt$putGzipHeader$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.DeflaterKt$putGzipHeader$1 r0 = new io.ktor.util.DeflaterKt$putGzipHeader$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            mk1 r4 = defpackage.mk1.a
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L46
            if (r2 == r7) goto L3e
            if (r2 == r6) goto L36
            if (r2 != r5) goto L30
            kotlin.d.b(r9)
            goto L83
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r8)
            return r3
        L36:
            java.lang.Object r8 = r0.L$0
            io.ktor.utils.io.ByteWriteChannel r8 = (io.ktor.utils.io.ByteWriteChannel) r8
            kotlin.d.b(r9)
            goto L74
        L3e:
            java.lang.Object r8 = r0.L$0
            io.ktor.utils.io.ByteWriteChannel r8 = (io.ktor.utils.io.ByteWriteChannel) r8
            kotlin.d.b(r9)
            goto L67
        L46:
            kotlin.d.b(r9)
            r9 = -29921(0xffffffffffff8b1f, float:NaN)
            short r9 = java.lang.Short.reverseBytes(r9)
            r0.L$0 = r8
            r0.label = r7
            yg r2 = io.ktor.utils.io.d.a
            kotlinx.io.Sink r2 = r8.getWriteBuffer()
            r2.writeShort(r9)
            java.lang.Object r9 = io.ktor.utils.io.c.h(r8, r0)
            if (r9 != r1) goto L63
            goto L64
        L63:
            r9 = r4
        L64:
            if (r9 != r1) goto L67
            goto L82
        L67:
            r0.L$0 = r8
            r0.label = r6
            r9 = 8
            java.lang.Object r9 = io.ktor.utils.io.d.c(r8, r9, r0)
            if (r9 != r1) goto L74
            goto L82
        L74:
            r0.L$0 = r3
            r0.label = r5
            r9 = 0
            r2 = 7
            byte[] r3 = io.ktor.util.a.a
            java.lang.Object r8 = io.ktor.utils.io.d.d(r8, r3, r9, r2, r0)
            if (r8 != r1) goto L83
        L82:
            return r1
        L83:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.a.f(io.ktor.utils.io.ByteWriteChannel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (io.ktor.utils.io.d.e(r8, r9, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(io.ktor.utils.io.ByteWriteChannel r8, java.util.zip.CRC32 r9, java.util.zip.Deflater r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof io.ktor.util.DeflaterKt$putGzipTrailer$1
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.util.DeflaterKt$putGzipTrailer$1 r0 = (io.ktor.util.DeflaterKt$putGzipTrailer$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.DeflaterKt$putGzipTrailer$1 r0 = new io.ktor.util.DeflaterKt$putGzipTrailer$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            kotlin.d.b(r11)
            goto L6c
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r8)
            return r3
        L31:
            java.lang.Object r8 = r0.L$1
            r10 = r8
            java.util.zip.Deflater r10 = (java.util.zip.Deflater) r10
            java.lang.Object r8 = r0.L$0
            io.ktor.utils.io.ByteWriteChannel r8 = (io.ktor.utils.io.ByteWriteChannel) r8
            kotlin.d.b(r11)
            goto L57
        L3e:
            kotlin.d.b(r11)
            long r6 = r9.getValue()
            int r9 = (int) r6
            int r9 = java.lang.Integer.reverseBytes(r9)
            r0.L$0 = r8
            r0.L$1 = r10
            r0.label = r5
            java.lang.Object r9 = io.ktor.utils.io.d.e(r8, r9, r0)
            if (r9 != r1) goto L57
            goto L6b
        L57:
            int r9 = r10.getTotalIn()
            int r9 = java.lang.Integer.reverseBytes(r9)
            r0.L$0 = r3
            r0.L$1 = r3
            r0.label = r4
            java.lang.Object r8 = io.ktor.utils.io.d.e(r8, r9, r0)
            if (r8 != r1) goto L6c
        L6b:
            return r1
        L6c:
            mk1 r8 = defpackage.mk1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.a.g(io.ktor.utils.io.ByteWriteChannel, java.util.zip.CRC32, java.util.zip.Deflater, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final Pair h(ByteReadChannel byteReadChannel, CoroutineScope coroutineScope) {
        byteReadChannel.getClass();
        coroutineScope.getClass();
        ByteChannel byteChannel = new ByteChannel(true);
        ByteChannel byteChannel2 = new ByteChannel(true);
        kotlinx.coroutines.c.d(coroutineScope, null, null, new ByteChannelsKt$split$1(byteReadChannel, byteChannel, byteChannel2, null), 3).invokeOnCompletion(new ng(0, byteChannel, byteChannel2));
        return new Pair(byteChannel, byteChannel2);
    }

    public static final void i(Checksum checksum, ByteBuffer byteBuffer) {
        checksum.getClass();
        byteBuffer.getClass();
        if (!byteBuffer.hasArray()) {
            u7.r("buffer need to be array-backed");
            return;
        }
        checksum.update(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
    }
}
