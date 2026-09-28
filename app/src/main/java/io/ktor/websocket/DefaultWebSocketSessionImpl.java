package io.ktor.websocket;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.j03;
import defpackage.kf2;
import defpackage.km;
import defpackage.m8;
import defpackage.mk1;
import defpackage.oy;
import defpackage.rt0;
import defpackage.t;
import defpackage.xu;
import defpackage.zr;
import defpackage.zu0;
import io.ktor.websocket.Frame;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelResult$Companion;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.i;
import org.slf4j.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lio/ktor/websocket/DefaultWebSocketSessionImpl;", "Lio/ktor/websocket/DefaultWebSocketSession;", "Lio/ktor/websocket/WebSocketSession;", "raw", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "pingIntervalMillis", "timeoutMillis", "<init>", "(Lio/ktor/websocket/WebSocketSession;JJ)V", "Companion", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultWebSocketSessionImpl implements DefaultWebSocketSession, WebSocketSession {
    public static final /* synthetic */ AtomicReferenceFieldUpdater k;
    public static final /* synthetic */ AtomicIntegerFieldUpdater l;
    public static final /* synthetic */ AtomicIntegerFieldUpdater m;
    public static final Frame.Pong n;
    public static final /* synthetic */ long o;
    public static final /* synthetic */ long p;
    public static final /* synthetic */ long q;
    public final WebSocketSession a;
    public final CompletableDeferred b;
    public final BufferedChannel c;
    private volatile /* synthetic */ int closed;
    public final BufferedChannel d;
    public final JobImpl e;
    public final ArrayList f;
    public final CoroutineContext g;
    public long h;
    public long i;
    public final Deferred j;
    volatile /* synthetic */ Object pinger;
    private volatile /* synthetic */ int started;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/websocket/DefaultWebSocketSessionImpl$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/websocket/Frame$Pong;", "EmptyPong", "Lio/ktor/websocket/Frame$Pong;", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
        n = new Frame.Pong(new byte[0], rt0.a);
        k = AtomicReferenceFieldUpdater.newUpdater(DefaultWebSocketSessionImpl.class, Object.class, "pinger");
        Unsafe unsafe = m8.a;
        p = unsafe.objectFieldOffset(DefaultWebSocketSessionImpl.class.getDeclaredField("pinger"));
        l = AtomicIntegerFieldUpdater.newUpdater(DefaultWebSocketSessionImpl.class, "closed");
        o = unsafe.objectFieldOffset(DefaultWebSocketSessionImpl.class.getDeclaredField("closed"));
        m = AtomicIntegerFieldUpdater.newUpdater(DefaultWebSocketSessionImpl.class, "started");
        q = unsafe.objectFieldOffset(DefaultWebSocketSessionImpl.class.getDeclaredField("started"));
    }

    public DefaultWebSocketSessionImpl(WebSocketSession webSocketSession, long j, long j2) {
        webSocketSession.getClass();
        this.a = webSocketSession;
        this.pinger = null;
        CompletableDeferred completableDeferredA = kotlinx.coroutines.a.a();
        this.b = completableDeferredA;
        this.c = kf2.a(8, 6, null);
        String property = System.getProperty("io.ktor.websocket.outgoingChannelCapacity");
        this.d = kf2.a(property != null ? Integer.parseInt(property) : 8, 6, null);
        this.closed = 0;
        JobImpl jobImpl = new JobImpl((Job) webSocketSession.getG().get(Job.Key));
        this.e = jobImpl;
        this.f = new ArrayList();
        this.started = 0;
        this.g = webSocketSession.getG().plus(jobImpl).plus(new CoroutineName("ws-default"));
        this.h = j;
        this.i = j2;
        this.j = completableDeferredA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlinx.io.Sink r9, io.ktor.websocket.Frame r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1 r0 = (io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1 r0 = new io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 == r3) goto L2a
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r8)
            r8 = 0
            return r8
        L2a:
            int r8 = r0.I$0
            kotlin.d.b(r11)
            goto L78
        L30:
            kotlin.d.b(r11)
            byte[] r10 = r10.c
            int r10 = r10.length
            if (r9 == 0) goto L40
            kotlinx.io.Buffer r11 = r9.getC()
            long r4 = r11.c
            int r11 = (int) r4
            goto L41
        L40:
            r11 = 0
        L41:
            int r10 = r10 + r11
            long r4 = (long) r10
            io.ktor.websocket.WebSocketSession r11 = r8.a
            long r6 = r11.getMaxFrameSize()
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L7f
            if (r9 == 0) goto L52
            r9.close()
        L52:
            io.ktor.websocket.CloseReason r9 = new io.ktor.websocket.CloseReason
            io.ktor.websocket.CloseReason$Codes r2 = io.ktor.websocket.CloseReason.Codes.TOO_BIG
            java.lang.String r4 = "Frame is too big: "
            java.lang.String r5 = ". Max size is "
            java.lang.StringBuilder r4 = defpackage.vh.v(r10, r4, r5)
            long r5 = r11.getMaxFrameSize()
            r4.append(r5)
            java.lang.String r11 = r4.toString()
            r9.<init>(r2, r11)
            r0.I$0 = r10
            r0.label = r3
            java.lang.Object r8 = io.ktor.websocket.h.a(r8, r9, r0)
            if (r8 != r1) goto L77
            return r1
        L77:
            r8 = r10
        L78:
            io.ktor.websocket.FrameTooBigException r9 = new io.ktor.websocket.FrameTooBigException
            long r10 = (long) r8
            r9.<init>(r10)
            throw r9
        L7f:
            mk1 r8 = defpackage.mk1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.DefaultWebSocketSessionImpl.a(kotlinx.io.Sink, io.ktor.websocket.Frame, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        if (r2.d(r11, null, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00df, code lost:
    
        if (r7.send(r12, r0) == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00df -> B:14:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.DefaultWebSocketSessionImpl.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void c() {
        BufferedChannel bufferedChannelA;
        long j = this.h;
        if (this.closed == 0 && j > 0) {
            SendChannel<Frame> h = this.a.getH();
            long j2 = this.i;
            DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1 defaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1 = new DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1(this, null);
            CoroutineName coroutineName = e.a;
            h.getClass();
            JobImpl jobImplA = kotlinx.coroutines.g.a();
            bufferedChannelA = kf2.a(Integer.MAX_VALUE, 6, null);
            kotlinx.coroutines.c.d(this, kotlin.coroutines.b.d(e.b, jobImplA), null, new PingPongKt$pinger$1(j, j2, defaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1, bufferedChannelA, h, null), 2);
            CoroutineContext.Element element = this.g.get(Job.Key);
            element.getClass();
            ((Job) element).invokeOnCompletion(new t(jobImplA, 20));
        } else {
            bufferedChannelA = null;
        }
        k.getClass();
        SendChannel sendChannel = (SendChannel) m8.a(this, bufferedChannelA, p);
        if (sendChannel != null) {
            sendChannel.close(null);
        }
        if (bufferedChannelA != null) {
            bufferedChannelA.mo56trySendJP2dKIU(n);
            ChannelResult$Companion channelResult$Companion = km.b;
        }
        if (this.closed == 0 || bufferedChannelA == null) {
            return;
        }
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(io.ktor.websocket.CloseReason r13, java.io.IOException r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.DefaultWebSocketSessionImpl.d(io.ktor.websocket.CloseReason, java.io.IOException, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final Object flush(Continuation continuation) {
        Object objFlush = this.a.flush(continuation);
        return objFlush == CoroutineSingletons.COROUTINE_SUSPENDED ? objFlush : mk1.a;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    /* JADX INFO: renamed from: getCloseReason, reason: from getter */
    public final Deferred getJ() {
        return this.j;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getG() {
        return this.g;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final List getExtensions() {
        return this.f;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final ReceiveChannel getIncoming() {
        return this.c;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final boolean getMasking() {
        return this.a.getMasking();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final long getMaxFrameSize() {
        return this.a.getMaxFrameSize();
    }

    @Override // io.ktor.websocket.WebSocketSession
    /* JADX INFO: renamed from: getOutgoing */
    public final SendChannel getH() {
        return this.d;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    /* JADX INFO: renamed from: getPingIntervalMillis, reason: from getter */
    public final long getH() {
        return this.h;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    /* JADX INFO: renamed from: getTimeoutMillis, reason: from getter */
    public final long getI() {
        return this.i;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final Object send(Frame frame, Continuation continuation) {
        Object objSend = getH().send(frame, continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        mk1 mk1Var = mk1.a;
        if (objSend != coroutineSingletons) {
            objSend = mk1Var;
        }
        return objSend == coroutineSingletons ? objSend : mk1Var;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void setMasking(boolean z) {
        this.a.setMasking(z);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void setMaxFrameSize(long j) {
        this.a.setMaxFrameSize(j);
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public final void setPingIntervalMillis(long j) {
        this.h = j;
        c();
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public final void setTimeoutMillis(long j) {
        this.i = j;
        c();
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public final void start(List list) {
        List list2;
        list.getClass();
        m.getClass();
        if (!m8.a.compareAndSwapInt(this, q, 0, 1)) {
            zu0.q("WebSocket session ", this, " is already started.");
            return;
        }
        Logger logger = a.a;
        if (j03.p(logger)) {
            StringBuilder sb = new StringBuilder("Starting default WebSocketSession(");
            sb.append(this);
            sb.append(") with negotiated extensions: ");
            list2 = list;
            sb.append(kotlin.collections.c.w(list2, null, null, null, null, 63));
            logger.trace(sb.toString());
        } else {
            list2 = list;
        }
        this.f.addAll(list2);
        c();
        CoroutineName coroutineName = e.a;
        BufferedChannel bufferedChannel = this.d;
        bufferedChannel.getClass();
        BufferedChannel bufferedChannelA = kf2.a(5, 6, null);
        kotlinx.coroutines.c.d(this, e.a, null, new PingPongKt$ponger$1(bufferedChannelA, bufferedChannel, null), 2);
        CoroutineName coroutineName2 = a.b;
        i iVar = oy.b;
        coroutineName2.getClass();
        kotlinx.coroutines.c.d(this, kotlin.coroutines.b.d(iVar, coroutineName2), null, new DefaultWebSocketSessionImpl$runIncomingProcessor$1(this, bufferedChannelA, null), 2);
        CoroutineName coroutineName3 = a.c;
        coroutineName3.getClass();
        kotlinx.coroutines.c.c(this, kotlin.coroutines.b.d(iVar, coroutineName3), CoroutineStart.UNDISPATCHED, new DefaultWebSocketSessionImpl$runOutgoingProcessor$1(this, null));
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void terminate() {
        this.e.cancel((CancellationException) null);
        zr.b(this.a, null);
    }
}
