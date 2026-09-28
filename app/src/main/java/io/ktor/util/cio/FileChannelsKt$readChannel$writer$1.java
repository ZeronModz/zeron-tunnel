package io.ktor.util.cio;

import defpackage.mk1;
import io.ktor.utils.io.WriterScope;
import java.io.RandomAccessFile;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "Lmk1;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.util.cio.FileChannelsKt$readChannel$writer$1", f = "FileChannels.kt", i = {0, 0}, l = {42}, m = "invokeSuspend", n = {"$this$use$iv", "closed$iv"}, s = {"L$0", "I$0"})
final class FileChannelsKt$readChannel$writer$1 extends SuspendLambda implements Function2<WriterScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ long $endInclusive;
    final /* synthetic */ long $fileLength;
    final /* synthetic */ Lazy<RandomAccessFile> $randomAccessFile$delegate;
    final /* synthetic */ long $start;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FileChannelsKt$readChannel$writer$1(long j, long j2, long j3, Lazy<? extends RandomAccessFile> lazy, Continuation<? super FileChannelsKt$readChannel$writer$1> continuation) {
        super(2, continuation);
        this.$start = j;
        this.$endInclusive = j2;
        this.$fileLength = j3;
        this.$randomAccessFile$delegate = lazy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        FileChannelsKt$readChannel$writer$1 fileChannelsKt$readChannel$writer$1 = new FileChannelsKt$readChannel$writer$1(this.$start, this.$endInclusive, this.$fileLength, this.$randomAccessFile$delegate, continuation);
        fileChannelsKt$readChannel$writer$1.L$0 = obj;
        return fileChannelsKt$readChannel$writer$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WriterScope writerScope, Continuation<? super mk1> continuation) {
        return ((FileChannelsKt$readChannel$writer$1) create(writerScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 != r3) goto L15
            java.lang.Object r12 = r12.L$0
            java.io.Closeable r12 = (java.io.Closeable) r12
            kotlin.d.b(r13)     // Catch: java.lang.Throwable -> L12
            goto L5a
        L12:
            r0 = move-exception
            r13 = r0
            goto L67
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r12)
            return r2
        L1b:
            kotlin.d.b(r13)
            java.lang.Object r13 = r12.L$0
            r5 = r13
            io.ktor.utils.io.WriterScope r5 = (io.ktor.utils.io.WriterScope) r5
            long r6 = r12.$start
            r8 = 0
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 < 0) goto L8c
            long r1 = r12.$endInclusive
            long r6 = r12.$fileLength
            r8 = 1
            long r8 = r6 - r8
            int r13 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r13 > 0) goto L73
            kotlin.Lazy<java.io.RandomAccessFile> r13 = r12.$randomAccessFile$delegate
            java.lang.Object r13 = r13.getValue()
            java.io.RandomAccessFile r13 = (java.io.RandomAccessFile) r13
            long r6 = r12.$start
            long r8 = r12.$endInclusive
            java.nio.channels.FileChannel r4 = r13.getChannel()     // Catch: java.lang.Throwable -> L62
            r4.getClass()     // Catch: java.lang.Throwable -> L62
            r12.L$0 = r13     // Catch: java.lang.Throwable -> L62
            r1 = 0
            r12.I$0 = r1     // Catch: java.lang.Throwable -> L62
            r12.label = r3     // Catch: java.lang.Throwable -> L62
            r10 = r12
            java.lang.Object r12 = io.ktor.util.cio.a.b(r4, r5, r6, r8, r10)     // Catch: java.lang.Throwable -> L62
            if (r12 != r0) goto L59
            return r0
        L59:
            r12 = r13
        L5a:
            if (r12 == 0) goto L5f
            r12.close()
        L5f:
            mk1 r12 = defpackage.mk1.a
            return r12
        L62:
            r0 = move-exception
            r12 = r0
            r11 = r13
            r13 = r12
            r12 = r11
        L67:
            if (r12 == 0) goto L72
            r12.close()     // Catch: java.lang.Throwable -> L6d
            goto L72
        L6d:
            r0 = move-exception
            r12 = r0
            kotlin.b.a(r13, r12)
        L72:
            throw r13
        L73:
            java.lang.String r12 = "endInclusive points to the position out of the file: file size = "
            java.lang.String r13 = ", endInclusive = "
            java.lang.StringBuilder r12 = defpackage.vh.w(r6, r12, r13)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
        L8c:
            java.lang.String r12 = "start position shouldn't be negative but it is "
            java.lang.String r12 = defpackage.hz.r(r6, r12)
            defpackage.zu0.e(r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.cio.FileChannelsKt$readChannel$writer$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
