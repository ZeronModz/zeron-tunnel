package io.ktor.util.cio;

import com.trilead.ssh2.sftp.Packet;
import defpackage.mk1;
import io.ktor.utils.io.ReaderScope;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/ReaderScope;", "Lmk1;", "<anonymous>", "(Lio/ktor/utils/io/ReaderScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.util.cio.FileChannelsKt$writeChannel$1", f = "FileChannels.kt", i = {0, 0, 0}, l = {Packet.SSH_FXP_NAME}, m = "invokeSuspend", n = {"$this$use$iv", "file", "closed$iv"}, s = {"L$0", "L$1", "I$0"})
final class FileChannelsKt$writeChannel$1 extends SuspendLambda implements Function2<ReaderScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ File $this_writeChannel;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileChannelsKt$writeChannel$1(File file, Continuation<? super FileChannelsKt$writeChannel$1> continuation) {
        super(2, continuation);
        this.$this_writeChannel = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        FileChannelsKt$writeChannel$1 fileChannelsKt$writeChannel$1 = new FileChannelsKt$writeChannel$1(this.$this_writeChannel, continuation);
        fileChannelsKt$writeChannel$1.L$0 = obj;
        return fileChannelsKt$writeChannel$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ReaderScope readerScope, Continuation<? super mk1> continuation) {
        return ((FileChannelsKt$writeChannel$1) create(readerScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 != r2) goto L17
            java.lang.Object r0 = r6.L$1
            java.io.RandomAccessFile r0 = (java.io.RandomAccessFile) r0
            java.lang.Object r6 = r6.L$0
            java.io.Closeable r6 = (java.io.Closeable) r6
            kotlin.d.b(r7)     // Catch: java.lang.Throwable -> L15
            goto L4e
        L15:
            r7 = move-exception
            goto L61
        L17:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            r6 = 0
            return r6
        L1e:
            kotlin.d.b(r7)
            java.lang.Object r7 = r6.L$0
            io.ktor.utils.io.ReaderScope r7 = (io.ktor.utils.io.ReaderScope) r7
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.io.File r3 = r6.$this_writeChannel
            java.lang.String r4 = "rw"
            r1.<init>(r3, r4)
            io.ktor.utils.io.ByteReadChannel r7 = r7.a     // Catch: java.lang.Throwable -> L5f
            java.nio.channels.FileChannel r3 = r1.getChannel()     // Catch: java.lang.Throwable -> L5f
            r3.getClass()     // Catch: java.lang.Throwable -> L5f
            r6.L$0 = r1     // Catch: java.lang.Throwable -> L5f
            r6.L$1 = r1     // Catch: java.lang.Throwable -> L5f
            r4 = 0
            r6.I$0 = r4     // Catch: java.lang.Throwable -> L5f
            r6.label = r2     // Catch: java.lang.Throwable -> L5f
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r7 = io.ktor.utils.io.c.e(r7, r3, r4, r6)     // Catch: java.lang.Throwable -> L5f
            if (r7 != r0) goto L4c
            return r0
        L4c:
            r6 = r1
            r0 = r6
        L4e:
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> L15
            long r1 = r7.longValue()     // Catch: java.lang.Throwable -> L15
            r0.setLength(r1)     // Catch: java.lang.Throwable -> L15
            if (r6 == 0) goto L5c
            r6.close()
        L5c:
            mk1 r6 = defpackage.mk1.a
            return r6
        L5f:
            r7 = move-exception
            r6 = r1
        L61:
            if (r6 == 0) goto L6b
            r6.close()     // Catch: java.lang.Throwable -> L67
            goto L6b
        L67:
            r6 = move-exception
            kotlin.b.a(r7, r6)
        L6b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.cio.FileChannelsKt$writeChannel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
