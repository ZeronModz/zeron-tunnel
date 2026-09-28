package io.ktor.websocket;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.kf2;
import defpackage.lg;
import defpackage.mk1;
import defpackage.xu;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/websocket/RawWebSocketJvm;", "Lio/ktor/websocket/WebSocketSession;", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/utils/io/ByteWriteChannel;", "output", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "maxFrameSize", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "masking", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JZLkotlin/coroutines/CoroutineContext;Lio/ktor/utils/io/pool/ObjectPool;)V", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RawWebSocketJvm implements WebSocketSession {
    public static final /* synthetic */ KProperty[] h;
    public final JobImpl a;
    public final BufferedChannel b;
    public final CoroutineContext c;
    public final RawWebSocketJvm$special$$inlined$observable$1 d;
    public final RawWebSocketJvm$special$$inlined$observable$2 e;
    public final WebSocketWriter f;
    public final WebSocketReader g;

    /* JADX INFO: renamed from: io.ktor.websocket.RawWebSocketJvm$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "io.ktor.websocket.RawWebSocketJvm$1", f = "RawWebSocketJvm.kt", i = {2, 3}, l = {67, 68, 71, 74}, m = "invokeSuspend", n = {"cause", "cause"}, s = {"L$0", "L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
            return RawWebSocketJvm.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x007e, code lost:
        
            if (r7.send(r10, r9) == r0) goto L53;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x006c A[Catch: all -> 0x0037, CancellationException -> 0x0039, ProtocolViolationException -> 0x003b, FrameTooBigException -> 0x003d, TRY_LEAVE, TryCatch #5 {FrameTooBigException -> 0x003d, ProtocolViolationException -> 0x003b, blocks: (B:19:0x0032, B:34:0x0055, B:38:0x0064, B:40:0x006c, B:30:0x0044, B:33:0x004b), top: B:61:0x0009, outer: #4 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x007e -> B:20:0x0035). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 250
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.RawWebSocketJvm.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(RawWebSocketJvm.class, "maxFrameSize", "getMaxFrameSize()J", 0);
        ReflectionFactory reflectionFactory = Reflection.a;
        reflectionFactory.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(RawWebSocketJvm.class, "masking", "getMasking()Z", 0);
        reflectionFactory.getClass();
        h = new KProperty[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2};
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [io.ktor.websocket.RawWebSocketJvm$special$$inlined$observable$1] */
    /* JADX WARN: Type inference failed for: r1v7, types: [io.ktor.websocket.RawWebSocketJvm$special$$inlined$observable$2] */
    public RawWebSocketJvm(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j, boolean z, CoroutineContext coroutineContext, ObjectPool<ByteBuffer> objectPool) {
        byteReadChannel.getClass();
        byteWriteChannel.getClass();
        coroutineContext.getClass();
        objectPool.getClass();
        JobImpl jobImpl = new JobImpl((Job) coroutineContext.get(Job.Key));
        this.a = jobImpl;
        this.b = kf2.a(0, 6, null);
        CoroutineContext coroutineContextPlus = coroutineContext.plus(jobImpl).plus(new CoroutineName("raw-ws"));
        this.c = coroutineContextPlus;
        final Long lValueOf = Long.valueOf(j);
        this.d = new ObservableProperty<Long>(lValueOf) { // from class: io.ktor.websocket.RawWebSocketJvm$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public final void a(Object obj, KProperty kProperty, Object obj2) {
                long jLongValue = ((Number) obj2).longValue();
                ((Number) obj).longValue();
                this.g.c = jLongValue;
            }
        };
        final Boolean boolValueOf = Boolean.valueOf(z);
        this.e = new ObservableProperty<Boolean>(boolValueOf) { // from class: io.ktor.websocket.RawWebSocketJvm$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            public final void a(Object obj, KProperty kProperty, Object obj2) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ((Boolean) obj).getClass();
                this.f.c = zBooleanValue;
            }
        };
        this.f = new WebSocketWriter(byteWriteChannel, coroutineContextPlus, z, objectPool);
        this.g = new WebSocketReader(byteReadChannel, coroutineContextPlus, j, objectPool);
        kotlinx.coroutines.c.d(this, null, null, new AnonymousClass1(null), 3);
        jobImpl.complete();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final Object flush(Continuation continuation) throws Throwable {
        Object objFlush = this.f.flush(continuation);
        return objFlush == CoroutineSingletons.COROUTINE_SUSPENDED ? objFlush : mk1.a;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getC() {
        return this.c;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final List getExtensions() {
        return EmptyList.INSTANCE;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final ReceiveChannel getIncoming() {
        return this.b;
    }

    @Override // io.ktor.websocket.WebSocketSession
    /* JADX INFO: renamed from: getMasking */
    public final boolean getD() {
        KProperty kProperty = h[1];
        RawWebSocketJvm$special$$inlined$observable$2 rawWebSocketJvm$special$$inlined$observable$2 = this.e;
        rawWebSocketJvm$special$$inlined$observable$2.getClass();
        kProperty.getClass();
        return ((Boolean) rawWebSocketJvm$special$$inlined$observable$2.a).booleanValue();
    }

    @Override // io.ktor.websocket.WebSocketSession
    /* JADX INFO: renamed from: getMaxFrameSize */
    public final long getC() {
        KProperty kProperty = h[0];
        RawWebSocketJvm$special$$inlined$observable$1 rawWebSocketJvm$special$$inlined$observable$1 = this.d;
        rawWebSocketJvm$special$$inlined$observable$1.getClass();
        kProperty.getClass();
        return ((Number) rawWebSocketJvm$special$$inlined$observable$1.a).longValue();
    }

    @Override // io.ktor.websocket.WebSocketSession
    /* JADX INFO: renamed from: getOutgoing */
    public final SendChannel getH() {
        return this.f.e;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final Object send(Frame frame, Continuation continuation) {
        Object objSend = getH().send(frame, continuation);
        return objSend == CoroutineSingletons.COROUTINE_SUSPENDED ? objSend : mk1.a;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void setMasking(boolean z) {
        setValue(this, h[1], Boolean.valueOf(z));
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void setMaxFrameSize(long j) {
        setValue(this, h[0], Long.valueOf(j));
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void terminate() {
        this.f.e.close(null);
        this.a.complete();
    }

    public RawWebSocketJvm(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j, boolean z, CoroutineContext coroutineContext, ObjectPool objectPool, int i, xu xuVar) {
        this(byteReadChannel, byteWriteChannel, (i & 4) != 0 ? 2147483647L : j, (i & 8) != 0 ? false : z, coroutineContext, (i & 32) != 0 ? lg.a : objectPool);
    }
}
