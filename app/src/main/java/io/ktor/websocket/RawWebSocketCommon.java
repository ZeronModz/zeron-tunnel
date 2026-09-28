package io.ktor.websocket;

import com.google.android.gms.ads.RequestConfiguration;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.kf2;
import defpackage.mk1;
import defpackage.xu;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lio/ktor/websocket/RawWebSocketCommon;", "Lio/ktor/websocket/WebSocketSession;", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/utils/io/ByteWriteChannel;", "output", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "maxFrameSize", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "masking", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JZLkotlin/coroutines/CoroutineContext;)V", "FlushRequest", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RawWebSocketCommon implements WebSocketSession {
    public final ByteReadChannel a;
    public final ByteWriteChannel b;
    public long c;
    public boolean d;
    public final JobImpl e;
    public final BufferedChannel f;
    public final BufferedChannel g;
    public int h;
    public final CoroutineContext i;
    public final Job j;
    public final Job k;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/websocket/RawWebSocketCommon$FlushRequest;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lkotlinx/coroutines/Job;", "parent", "<init>", "(Lkotlinx/coroutines/Job;)V", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FlushRequest {
        public final JobImpl a;

        public FlushRequest(Job job) {
            this.a = new JobImpl(job);
        }
    }

    /* JADX INFO: renamed from: io.ktor.websocket.RawWebSocketCommon$flush$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.websocket.RawWebSocketCommon", f = "RawWebSocketCommon.kt", i = {0, 0}, l = {128, 131, 136}, m = "flush", n = {"this", "it"}, s = {"L$0", "L$2"})
    final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= AttribFlags.SSH_FILEXFER_ATTR_EXTENDED;
            return RawWebSocketCommon.this.flush(this);
        }
    }

    public RawWebSocketCommon(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j, boolean z, CoroutineContext coroutineContext) {
        byteReadChannel.getClass();
        byteWriteChannel.getClass();
        coroutineContext.getClass();
        this.a = byteReadChannel;
        this.b = byteWriteChannel;
        this.c = j;
        this.d = z;
        JobImpl jobImpl = new JobImpl((Job) coroutineContext.get(Job.Key));
        this.e = jobImpl;
        this.f = kf2.a(8, 6, null);
        this.g = kf2.a(8, 6, null);
        this.i = coroutineContext.plus(jobImpl).plus(new CoroutineName("raw-ws"));
        CoroutineName coroutineName = new CoroutineName("ws-writer");
        CoroutineStart coroutineStart = CoroutineStart.ATOMIC;
        this.j = kotlinx.coroutines.c.c(this, coroutineName, coroutineStart, new RawWebSocketCommon$writerJob$1(this, null));
        this.k = kotlinx.coroutines.c.c(this, new CoroutineName("ws-reader"), coroutineStart, new RawWebSocketCommon$readerJob$1(this, null));
        jobImpl.complete();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.websocket.WebSocketSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object flush(kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof io.ktor.websocket.RawWebSocketCommon.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.websocket.RawWebSocketCommon$flush$1 r0 = (io.ktor.websocket.RawWebSocketCommon.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.RawWebSocketCommon$flush$1 r0 = new io.ktor.websocket.RawWebSocketCommon$flush$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            mk1 r3 = defpackage.mk1.a
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L53
            if (r2 == r6) goto L3f
            if (r2 == r5) goto L36
            if (r2 != r4) goto L30
            kotlin.d.b(r11)
            return r3
        L30:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r10)
            return r7
        L36:
            java.lang.Object r10 = r0.L$0
            io.ktor.websocket.RawWebSocketCommon$FlushRequest r10 = (io.ktor.websocket.RawWebSocketCommon.FlushRequest) r10
            kotlin.d.b(r11)
            goto L9d
        L3f:
            java.lang.Object r10 = r0.L$2
            io.ktor.websocket.RawWebSocketCommon$FlushRequest r10 = (io.ktor.websocket.RawWebSocketCommon.FlushRequest) r10
            java.lang.Object r2 = r0.L$1
            io.ktor.websocket.RawWebSocketCommon$FlushRequest r2 = (io.ktor.websocket.RawWebSocketCommon.FlushRequest) r2
            java.lang.Object r6 = r0.L$0
            io.ktor.websocket.RawWebSocketCommon r6 = (io.ktor.websocket.RawWebSocketCommon) r6
            kotlin.d.b(r11)     // Catch: java.lang.Throwable -> L4f kotlinx.coroutines.channels.ClosedSendChannelException -> L51
            goto L9e
        L4f:
            r11 = move-exception
            goto L80
        L51:
            r11 = r2
            goto L86
        L53:
            kotlin.d.b(r11)
            io.ktor.websocket.RawWebSocketCommon$FlushRequest r11 = new io.ktor.websocket.RawWebSocketCommon$FlushRequest
            kotlin.coroutines.CoroutineContext r2 = r10.i
            ai0 r8 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r8)
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            r11.<init>(r2)
            kotlinx.coroutines.channels.BufferedChannel r2 = r10.g     // Catch: java.lang.Throwable -> L78 kotlinx.coroutines.channels.ClosedSendChannelException -> L7d
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L78 kotlinx.coroutines.channels.ClosedSendChannelException -> L7d
            r0.L$1 = r11     // Catch: java.lang.Throwable -> L78 kotlinx.coroutines.channels.ClosedSendChannelException -> L7d
            r0.L$2 = r11     // Catch: java.lang.Throwable -> L78 kotlinx.coroutines.channels.ClosedSendChannelException -> L7d
            r0.label = r6     // Catch: java.lang.Throwable -> L78 kotlinx.coroutines.channels.ClosedSendChannelException -> L7d
            java.lang.Object r10 = r2.send(r11, r0)     // Catch: java.lang.Throwable -> L78 kotlinx.coroutines.channels.ClosedSendChannelException -> L7d
            if (r10 != r1) goto L76
            goto Lb4
        L76:
            r2 = r11
            goto L9e
        L78:
            r10 = move-exception
            r9 = r11
            r11 = r10
            r10 = r9
            goto L80
        L7d:
            r6 = r10
            r10 = r11
            goto L86
        L80:
            kotlinx.coroutines.JobImpl r10 = r10.a
            r10.v(r3)
            throw r11
        L86:
            kotlinx.coroutines.JobImpl r10 = r10.a
            r10.v(r3)
            kotlinx.coroutines.Job r10 = r6.j
            r0.L$0 = r11
            r0.L$1 = r7
            r0.L$2 = r7
            r0.label = r5
            java.lang.Object r10 = r10.join(r0)
            if (r10 != r1) goto L9c
            goto Lb4
        L9c:
            r10 = r11
        L9d:
            r2 = r10
        L9e:
            r0.L$0 = r7
            r0.L$1 = r7
            r0.L$2 = r7
            r0.label = r4
            kotlinx.coroutines.JobImpl r10 = r2.a
            java.lang.Object r10 = r10.join(r0)
            kotlin.coroutines.intrinsics.CoroutineSingletons r11 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r10 != r11) goto Lb1
            goto Lb2
        Lb1:
            r10 = r3
        Lb2:
            if (r10 != r1) goto Lb5
        Lb4:
            return r1
        Lb5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.RawWebSocketCommon.flush(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getI() {
        return this.i;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final List getExtensions() {
        return EmptyList.INSTANCE;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final ReceiveChannel getIncoming() {
        return this.f;
    }

    @Override // io.ktor.websocket.WebSocketSession
    /* JADX INFO: renamed from: getMasking, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    @Override // io.ktor.websocket.WebSocketSession
    /* JADX INFO: renamed from: getMaxFrameSize, reason: from getter */
    public final long getC() {
        return this.c;
    }

    @Override // io.ktor.websocket.WebSocketSession
    /* JADX INFO: renamed from: getOutgoing */
    public final SendChannel getH() {
        return this.g;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final Object send(Frame frame, Continuation continuation) {
        Object objSend = getH().send(frame, continuation);
        return objSend == CoroutineSingletons.COROUTINE_SUSPENDED ? objSend : mk1.a;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void setMasking(boolean z) {
        this.d = z;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void setMaxFrameSize(long j) {
        this.c = j;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void terminate() {
        this.g.close(null);
        this.e.complete();
    }

    public /* synthetic */ RawWebSocketCommon(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j, boolean z, CoroutineContext coroutineContext, int i, xu xuVar) {
        this(byteReadChannel, byteWriteChannel, (i & 4) != 0 ? 2147483647L : j, (i & 8) != 0 ? false : z, coroutineContext);
    }
}
