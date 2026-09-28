package io.ktor.utils.io;

import com.google.android.gms.ads.RequestConfiguration;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.mk1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlinx.io.Sink;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/utils/io/CloseHookByteWriteChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "delegate", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lmk1;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "onClose", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/jvm/functions/Function1;)V", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CloseHookByteWriteChannel implements ByteWriteChannel {
    public final ByteWriteChannel a;
    public final Function1 b;

    /* JADX INFO: renamed from: io.ktor.utils.io.CloseHookByteWriteChannel$flushAndClose$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.CloseHookByteWriteChannel", f = "CloseHookByteWriteChannel.kt", i = {0}, l = {21, 22}, m = "flushAndClose", n = {"this"}, s = {"L$0"})
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
            return CloseHookByteWriteChannel.this.flushAndClose(this);
        }
    }

    public CloseHookByteWriteChannel(ByteWriteChannel byteWriteChannel, Function1<? super Continuation<? super mk1>, ? extends Object> function1) {
        byteWriteChannel.getClass();
        function1.getClass();
        this.a = byteWriteChannel;
        this.b = function1;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final void cancel(Throwable th) {
        this.a.cancel(th);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final Object flush(Continuation continuation) {
        return this.a.flush(continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r6.invoke(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.ByteWriteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object flushAndClose(kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.CloseHookByteWriteChannel.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.CloseHookByteWriteChannel$flushAndClose$1 r0 = (io.ktor.utils.io.CloseHookByteWriteChannel.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.CloseHookByteWriteChannel$flushAndClose$1 r0 = new io.ktor.utils.io.CloseHookByteWriteChannel$flushAndClose$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            kotlin.d.b(r7)
            goto L56
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            return r3
        L31:
            java.lang.Object r6 = r0.L$0
            io.ktor.utils.io.CloseHookByteWriteChannel r6 = (io.ktor.utils.io.CloseHookByteWriteChannel) r6
            kotlin.d.b(r7)
            goto L49
        L39:
            kotlin.d.b(r7)
            r0.L$0 = r6
            r0.label = r5
            io.ktor.utils.io.ByteWriteChannel r7 = r6.a
            java.lang.Object r7 = r7.flushAndClose(r0)
            if (r7 != r1) goto L49
            goto L55
        L49:
            kotlin.jvm.functions.Function1 r6 = r6.b
            r0.L$0 = r3
            r0.label = r4
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L56
        L55:
            return r1
        L56:
            mk1 r6 = defpackage.mk1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.CloseHookByteWriteChannel.flushAndClose(kotlin.coroutines.Continuation):java.lang.Object");
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
