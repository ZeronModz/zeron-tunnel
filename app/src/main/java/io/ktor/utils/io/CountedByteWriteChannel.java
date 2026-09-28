package io.ktor.utils.io;

import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.mk1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.io.Sink;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/utils/io/CountedByteWriteChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "delegate", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;)V", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CountedByteWriteChannel implements ByteWriteChannel {
    public final ByteWriteChannel a;

    /* JADX INFO: renamed from: io.ktor.utils.io.CountedByteWriteChannel$flush$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.CountedByteWriteChannel", f = "CountedByteWriteChannel.kt", i = {0}, l = {32}, m = "flush", n = {"this"}, s = {"L$0"})
    final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
            return CountedByteWriteChannel.this.flush(this);
        }
    }

    public CountedByteWriteChannel(ByteWriteChannel byteWriteChannel) {
        byteWriteChannel.getClass();
        this.a = byteWriteChannel;
        Sink writeBuffer = byteWriteChannel.getWriteBuffer();
        writeBuffer.getClass();
        long j = writeBuffer.getC().c;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final void cancel(Throwable th) {
        this.a.cancel(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.ByteWriteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object flush(kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.CountedByteWriteChannel.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.CountedByteWriteChannel$flush$1 r0 = (io.ktor.utils.io.CountedByteWriteChannel.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.CountedByteWriteChannel$flush$1 r0 = new io.ktor.utils.io.CountedByteWriteChannel$flush$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.L$0
            io.ktor.utils.io.CountedByteWriteChannel r6 = (io.ktor.utils.io.CountedByteWriteChannel) r6
            kotlin.d.b(r7)
            goto L4f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            r6 = 0
            return r6
        L32:
            kotlin.d.b(r7)
            io.ktor.utils.io.ByteWriteChannel r7 = r6.a
            kotlinx.io.Sink r2 = r7.getWriteBuffer()
            r2.getClass()
            kotlinx.io.Buffer r2 = r2.getC()
            long r4 = r2.c
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.flush(r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            io.ktor.utils.io.ByteWriteChannel r6 = r6.a
            kotlinx.io.Sink r6 = r6.getWriteBuffer()
            r6.getClass()
            kotlinx.io.Buffer r6 = r6.getC()
            long r6 = r6.c
            mk1 r6 = defpackage.mk1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.CountedByteWriteChannel.flush(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final Object flushAndClose(Continuation continuation) {
        Object objFlushAndClose = this.a.flushAndClose(continuation);
        return objFlushAndClose == CoroutineSingletons.COROUTINE_SUSPENDED ? objFlushAndClose : mk1.a;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final Throwable getClosedCause() {
        return this.a.getClosedCause();
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final Sink getWriteBuffer() {
        return this.a.getWriteBuffer();
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final boolean isClosedForWrite() {
        return this.a.isClosedForWrite();
    }
}
