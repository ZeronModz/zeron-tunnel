package io.ktor.utils.io;

import com.google.android.gms.ads.RequestConfiguration;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.m8;
import defpackage.mk1;
import defpackage.p60;
import defpackage.vh;
import defpackage.wn;
import defpackage.xu;
import defpackage.yg0;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.io.Buffer;
import kotlinx.io.Sink;
import kotlinx.io.Source;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lio/ktor/utils/io/ByteChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/BufferedByteWriteChannel;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "autoFlush", "<init>", "(Z)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "flushBufferSize", "I", "Slot", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ByteChannel implements ByteReadChannel, BufferedByteWriteChannel {
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    volatile /* synthetic */ Object _closedCause;
    public final boolean a;
    public final Buffer b;
    public final Object c;
    public final Buffer d;
    public final Buffer e;
    private volatile int flushBufferSize;
    volatile /* synthetic */ Object suspensionSlot;

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteChannel$awaitContent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteChannel", f = "ByteChannel.kt", i = {0, 0, 0}, l = {279}, m = "awaitContent", n = {"this", "this_$iv", "min"}, s = {"L$0", "L$1", "I$0"})
    final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
            return ByteChannel.this.awaitContent(0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteChannel$flush$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteChannel", f = "ByteChannel.kt", i = {0, 0}, l = {279}, m = "flush", n = {"this", "this_$iv"}, s = {"L$0", "L$1"})
    final class C00281 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C00281(Continuation<? super C00281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
            return ByteChannel.this.flush(this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteChannel$flushAndClose$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteChannel", f = "ByteChannel.kt", i = {0}, l = {123}, m = "flushAndClose", n = {"this"}, s = {"L$0"})
    final class C00291 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00291(Continuation<? super C00291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
            return ByteChannel.this.flushAndClose(this);
        }
    }

    static {
        Unsafe unsafe = m8.a;
        g = unsafe.objectFieldOffset(ByteChannel.class.getDeclaredField("suspensionSlot"));
        f = unsafe.objectFieldOffset(ByteChannel.class.getDeclaredField("_closedCause"));
    }

    public ByteChannel(boolean z) {
        this.a = z;
        this.b = new Buffer();
        this.c = new Object();
        this.suspensionSlot = b.a;
        this.d = new Buffer();
        this.e = new Buffer();
        this._closedCause = null;
    }

    public final void a(Throwable th) {
        Slot.Closed closed;
        if (th != null) {
            closed = new Slot.Closed(th);
        } else {
            Slot.Companion.getClass();
            closed = a.b;
        }
        Slot slot = (Slot) m8.a(this, closed, g);
        if (slot instanceof Slot.Task) {
            ((Slot.Task) slot).resume(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0146, code lost:
    
        if (r9.d.c >= 1048576) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0148, code lost:
    
        r9.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0151, code lost:
    
        if (r9.d.c < r10) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0154, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0159, code lost:
    
        return java.lang.Boolean.valueOf(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9 A[EDGE_INSN: B:33:0x00a6->B:34:0x00a9 BREAK  A[LOOP:1: B:28:0x008e->B:35:0x00af], PHI: r11
      0x00a9: PHI (r11v6 io.ktor.utils.io.ByteChannel) = 
      (r11v1 io.ktor.utils.io.ByteChannel)
      (r11v1 io.ktor.utils.io.ByteChannel)
      (r11v1 io.ktor.utils.io.ByteChannel)
      (r11v10 io.ktor.utils.io.ByteChannel)
     binds: [B:44:0x00d9, B:53:0x00ff, B:50:0x00f5, B:33:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0133 A[LOOP:0: B:21:0x005a->B:65:0x0133, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0132 A[SYNTHETIC] */
    @Override // io.ktor.utils.io.ByteReadChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitContent(int r20, kotlin.coroutines.Continuation r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannel.awaitContent(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        synchronized (this.c) {
            this.b.transferTo(this.d);
            this.flushBufferSize = 0;
        }
        Slot slot = (Slot) this.suspensionSlot;
        if (!(slot instanceof Slot.Write)) {
            return;
        }
        b bVar = b.a;
        while (true) {
            ByteChannel byteChannel = this;
            if (m8.a.compareAndSwapObject(byteChannel, g, slot, bVar)) {
                ((Slot.Task) slot).resume();
                return;
            } else if (m8.a.getObjectVolatile(byteChannel, g) != slot) {
                return;
            } else {
                this = byteChannel;
            }
        }
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public final void cancel(Throwable th) {
        ByteChannel byteChannel;
        if (this._closedCause != null) {
            return;
        }
        CloseToken closeToken = new CloseToken(th);
        while (true) {
            byteChannel = this;
            if (m8.a.compareAndSwapObject(byteChannel, f, (Object) null, closeToken) || m8.a.getObjectVolatile(byteChannel, f) != null) {
                break;
            } else {
                this = byteChannel;
            }
        }
        byteChannel.a(closeToken.a());
    }

    @Override // io.ktor.utils.io.BufferedByteWriteChannel
    public final void close() {
        flushWriteBuffer();
        CloseToken closeToken = wn.a;
        while (true) {
            ByteChannel byteChannel = this;
            if (m8.a.compareAndSwapObject(byteChannel, f, (Object) null, closeToken)) {
                byteChannel.a(null);
                return;
            } else if (m8.a.getObjectVolatile(byteChannel, f) != null) {
                return;
            } else {
                this = byteChannel;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4 A[EDGE_INSN: B:32:0x00a1->B:33:0x00a4 BREAK  A[LOOP:1: B:27:0x007f->B:34:0x00a9], PHI: r13
      0x00a4: PHI (r13v6 io.ktor.utils.io.ByteChannel) = 
      (r13v1 io.ktor.utils.io.ByteChannel)
      (r13v1 io.ktor.utils.io.ByteChannel)
      (r13v1 io.ktor.utils.io.ByteChannel)
      (r13v10 io.ktor.utils.io.ByteChannel)
     binds: [B:43:0x00d8, B:52:0x00f7, B:49:0x00ed, B:32:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0129 A[LOOP:0: B:20:0x0057->B:64:0x0129, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // io.ktor.utils.io.ByteWriteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object flush(kotlin.coroutines.Continuation r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannel.flush(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.ByteWriteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object flushAndClose(kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r13 instanceof io.ktor.utils.io.ByteChannel.C00291
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.ByteChannel$flushAndClose$1 r0 = (io.ktor.utils.io.ByteChannel.C00291) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannel$flushAndClose$1 r0 = new io.ktor.utils.io.ByteChannel$flushAndClose$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            mk1 r5 = defpackage.mk1.a
            if (r2 == 0) goto L37
            if (r2 != r4) goto L31
            java.lang.Object r12 = r0.L$0
            io.ktor.utils.io.ByteChannel r12 = (io.ktor.utils.io.ByteChannel) r12
            kotlin.d.b(r13)     // Catch: java.lang.Throwable -> L2e
            goto L47
        L2e:
            r0 = move-exception
            r13 = r0
            goto L4c
        L31:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r12)
            return r3
        L37:
            kotlin.d.b(r13)
            kotlin.Result$Companion r13 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L2e
            r0.L$0 = r12     // Catch: java.lang.Throwable -> L2e
            r0.label = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r13 = r12.flush(r0)     // Catch: java.lang.Throwable -> L2e
            if (r13 != r1) goto L47
            return r1
        L47:
            kotlin.Result.m36constructorimpl(r5)     // Catch: java.lang.Throwable -> L2e
        L4a:
            r7 = r12
            goto L57
        L4c:
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            kotlin.Result$Failure r0 = new kotlin.Result$Failure
            r0.<init>(r13)
            kotlin.Result.m36constructorimpl(r0)
            goto L4a
        L57:
            io.ktor.utils.io.CloseToken r11 = defpackage.wn.a
        L59:
            if (r7 == 0) goto L77
            sun.misc.Unsafe r6 = defpackage.m8.a
            long r8 = io.ktor.utils.io.ByteChannel.f
            r10 = 0
            boolean r12 = r6.compareAndSwapObject(r7, r8, r10, r11)
            if (r12 == 0) goto L6a
            r7.a(r3)
            return r5
        L6a:
            if (r7 == 0) goto L73
            java.lang.Object r12 = r6.getObjectVolatile(r7, r8)
            if (r12 == 0) goto L59
            return r5
        L73:
            defpackage.u7.q()
            return r3
        L77:
            defpackage.u7.q()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannel.flushAndClose(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // io.ktor.utils.io.BufferedByteWriteChannel
    public final void flushWriteBuffer() {
        if (this.e.exhausted()) {
            return;
        }
        synchronized (this.c) {
            Buffer buffer = this.e;
            int i = (int) buffer.c;
            this.b.transferFrom(buffer);
            this.flushBufferSize += i;
        }
        Slot slot = (Slot) this.suspensionSlot;
        if (!(slot instanceof Slot.Read)) {
            return;
        }
        b bVar = b.a;
        while (true) {
            ByteChannel byteChannel = this;
            if (m8.a.compareAndSwapObject(byteChannel, g, slot, bVar)) {
                ((Slot.Task) slot).resume();
                return;
            } else if (m8.a.getObjectVolatile(byteChannel, g) != slot) {
                return;
            } else {
                this = byteChannel;
            }
        }
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public final Throwable getClosedCause() {
        CloseToken closeToken = (CloseToken) this._closedCause;
        if (closeToken != null) {
            return closeToken.a();
        }
        return null;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final Source getReadBuffer() throws Throwable {
        Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
        Buffer buffer = this.d;
        if (buffer.exhausted()) {
            b();
        }
        return buffer;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final Sink getWriteBuffer() throws Throwable {
        Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
        if (!isClosedForWrite()) {
            return this.e;
        }
        p60.f("Channel is closed for write");
        return null;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final boolean isClosedForRead() {
        if (getClosedCause() == null) {
            return isClosedForWrite() && this.flushBufferSize == 0 && this.d.exhausted();
        }
        return true;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public final boolean isClosedForWrite() {
        return this._closedCause != null;
    }

    public final String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0003\t\u0004\n¨\u0006\u000b"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Companion", "io/ktor/utils/io/a", "io/ktor/utils/io/b", "Closed", "Task", "Read", "Write", "Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "Lio/ktor/utils/io/ByteChannel$Slot$Task;", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Slot {
        public static final a Companion = a.a;

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "Lio/ktor/utils/io/ByteChannel$Slot;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "cause", "<init>", "(Ljava/lang/Throwable;)V", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Closed implements Slot {
            public final Throwable a;

            public Closed(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Closed) && yg0.a(this.a, ((Closed) obj).a);
            }

            public final int hashCode() {
                Throwable th = this.a;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            public final String toString() {
                return "Closed(cause=" + this.a + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0006\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Task;", "Lio/ktor/utils/io/ByteChannel$Slot;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "taskName", "()Ljava/lang/String;", "Lmk1;", "resume", "()V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "throwable", "(Ljava/lang/Throwable;)V", "getCreated", "()Ljava/lang/Throwable;", "created", "Lkotlin/coroutines/Continuation;", "getContinuation", "()Lkotlin/coroutines/Continuation;", "continuation", "Lio/ktor/utils/io/ByteChannel$Slot$Read;", "Lio/ktor/utils/io/ByteChannel$Slot$Write;", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface Task extends Slot {
            /* JADX INFO: renamed from: getContinuation */
            Continuation<mk1> getA();

            /* JADX INFO: renamed from: getCreated */
            Throwable getB();

            void resume();

            void resume(Throwable throwable);

            String taskName();
        }

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Read;", "Lio/ktor/utils/io/ByteChannel$Slot$Task;", "Lkotlin/coroutines/Continuation;", "Lmk1;", "continuation", "<init>", "(Lkotlin/coroutines/Continuation;)V", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Read implements Task {
            public final Continuation a;
            public final Throwable b;

            public Read(Continuation<? super mk1> continuation) {
                continuation.getClass();
                this.a = continuation;
                String property = System.getProperty("io.ktor.development");
                if (property == null || !Boolean.parseBoolean(property)) {
                    return;
                }
                int iHashCode = continuation.hashCode();
                kotlin.text.a.b(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                Throwable th = new Throwable("ReadTask 0x".concat(string));
                kotlin.b.b(th);
                this.b = th;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            /* JADX INFO: renamed from: getContinuation, reason: from getter */
            public final Continuation getA() {
                return this.a;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            /* JADX INFO: renamed from: getCreated, reason: from getter */
            public final Throwable getB() {
                return this.b;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public final void resume(Throwable th) {
                Object objD;
                Continuation a = getA();
                if (th != null) {
                    Result.Companion companion = Result.INSTANCE;
                    objD = vh.d(th);
                } else {
                    Slot.Companion.getClass();
                    objD = a.c;
                }
                a.resumeWith(objD);
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public final String taskName() {
                return "read";
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public final void resume() {
                Continuation a = getA();
                Slot.Companion.getClass();
                a.resumeWith(a.c);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Write;", "Lio/ktor/utils/io/ByteChannel$Slot$Task;", "Lkotlin/coroutines/Continuation;", "Lmk1;", "continuation", "<init>", "(Lkotlin/coroutines/Continuation;)V", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Write implements Task {
            public final Continuation a;
            public final Throwable b;

            public Write(Continuation<? super mk1> continuation) {
                continuation.getClass();
                this.a = continuation;
                String property = System.getProperty("io.ktor.development");
                if (property == null || !Boolean.parseBoolean(property)) {
                    return;
                }
                int iHashCode = continuation.hashCode();
                kotlin.text.a.b(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                Throwable th = new Throwable("WriteTask 0x".concat(string));
                kotlin.b.b(th);
                this.b = th;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            /* JADX INFO: renamed from: getContinuation, reason: from getter */
            public final Continuation getA() {
                return this.a;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            /* JADX INFO: renamed from: getCreated, reason: from getter */
            public final Throwable getB() {
                return this.b;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public final void resume(Throwable th) {
                Object objD;
                Continuation a = getA();
                if (th != null) {
                    Result.Companion companion = Result.INSTANCE;
                    objD = vh.d(th);
                } else {
                    Slot.Companion.getClass();
                    objD = a.c;
                }
                a.resumeWith(objD);
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public final String taskName() {
                return "write";
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public final void resume() {
                Continuation a = getA();
                Slot.Companion.getClass();
                a.resumeWith(a.c);
            }
        }
    }

    public ByteChannel() {
        this(false, 1, null);
    }

    public /* synthetic */ ByteChannel(boolean z, int i, xu xuVar) {
        this((i & 1) != 0 ? false : z);
    }
}
