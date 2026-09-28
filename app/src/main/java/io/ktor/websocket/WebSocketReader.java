package io.ktor.websocket;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.kf2;
import defpackage.lg;
import defpackage.xu;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferedChannel;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\rB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lio/ktor/websocket/WebSocketReader;", "Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/utils/io/ByteReadChannel;", "byteChannel", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "maxFrameSize", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/CoroutineContext;JLio/ktor/utils/io/pool/ObjectPool;)V", "State", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebSocketReader implements CoroutineScope {
    public final ByteReadChannel a;
    public final CoroutineContext b;
    public long c;
    public State d;
    public final FrameParser e;
    public final SimpleFrameCollector f;
    public final BufferedChannel g;
    public final Job h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/websocket/WebSocketReader$State;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "(Ljava/lang/String;I)V", "HEADER", "BODY", "CLOSED", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State HEADER = new State("HEADER", 0);
        public static final State BODY = new State("BODY", 1);
        public static final State CLOSED = new State("CLOSED", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{HEADER, BODY, CLOSED};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = kotlin.enums.a.a(stateArr$values);
        }

        private State(String str, int i) {
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public WebSocketReader(ByteReadChannel byteReadChannel, CoroutineContext coroutineContext, long j, ObjectPool<ByteBuffer> objectPool) {
        byteReadChannel.getClass();
        coroutineContext.getClass();
        objectPool.getClass();
        this.a = byteReadChannel;
        this.b = coroutineContext;
        this.c = j;
        this.d = State.HEADER;
        this.e = new FrameParser();
        this.f = new SimpleFrameCollector();
        this.g = kf2.a(8, 6, null);
        this.h = kotlinx.coroutines.c.c(this, new CoroutineName("ws-reader"), CoroutineStart.ATOMIC, new WebSocketReader$readerJob$1(objectPool, this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketReader.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0243, code lost:
    
        return defpackage.mk1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0108, code lost:
    
        if (r4.get() != io.ktor.websocket.FrameParser.State.BODY) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010a, code lost:
    
        r2.d = io.ktor.websocket.WebSocketReader.State.BODY;
        r10 = r9.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0115, code lost:
    
        if (r10 > 2147483647L) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011b, code lost:
    
        if (r10 > r2.c) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011d, code lost:
    
        r4 = (int) r10;
        r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0123, code lost:
    
        if (r8.a != 0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0125, code lost:
    
        r8.a = r4;
        r9 = r8.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0129, code lost:
    
        if (r9 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012f, code lost:
    
        if (r9.capacity() >= r4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0131, code lost:
    
        r8.b = java.nio.ByteBuffer.allocate(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0137, code lost:
    
        r4 = r8.b;
        r4.getClass();
        r4.clear();
        r4 = r8.a;
        r9 = r8.b;
        r9.getClass();
        r8.a = r4 - defpackage.ii2.o(r0, r9, r8.a);
        r1.L$0 = r2;
        r1.L$1 = r0;
        r1.label = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0159, code lost:
    
        if (r2.a(r1) != r3) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015b, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015c, code lost:
    
        defpackage.u7.p("remaining should be 0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0161, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0169, code lost:
    
        throw new io.ktor.websocket.FrameTooBigException(r9.j);
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.nio.ByteBuffer r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketReader.b(java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (r7.b(r6, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0081 -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.nio.ByteBuffer r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.ktor.websocket.WebSocketReader$readLoop$1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.websocket.WebSocketReader$readLoop$1 r0 = (io.ktor.websocket.WebSocketReader$readLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.WebSocketReader$readLoop$1 r0 = new io.ktor.websocket.WebSocketReader$readLoop$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.L$1
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            java.lang.Object r7 = r0.L$0
            io.ktor.websocket.WebSocketReader r7 = (io.ktor.websocket.WebSocketReader) r7
            kotlin.d.b(r8)
        L31:
            r5 = r7
            r7 = r6
            r6 = r5
            goto L84
        L35:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            r6 = 0
            return r6
        L3c:
            java.lang.Object r6 = r0.L$1
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            java.lang.Object r7 = r0.L$0
            io.ktor.websocket.WebSocketReader r7 = (io.ktor.websocket.WebSocketReader) r7
            kotlin.d.b(r8)
            goto L66
        L48:
            kotlin.d.b(r8)
            r7.clear()
        L4e:
            io.ktor.websocket.WebSocketReader$State r8 = r6.d
            io.ktor.websocket.WebSocketReader$State r2 = io.ktor.websocket.WebSocketReader.State.CLOSED
            if (r8 == r2) goto L88
            io.ktor.utils.io.ByteReadChannel r8 = r6.a
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = io.ktor.utils.io.c.j(r8, r7, r0)
            if (r8 != r1) goto L63
            goto L83
        L63:
            r5 = r7
            r7 = r6
            r6 = r5
        L66:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r2 = -1
            if (r8 != r2) goto L74
            io.ktor.websocket.WebSocketReader$State r6 = io.ktor.websocket.WebSocketReader.State.CLOSED
            r7.d = r6
            goto L88
        L74:
            r6.flip()
            r0.L$0 = r7
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r8 = r7.b(r6, r0)
            if (r8 != r1) goto L31
        L83:
            return r1
        L84:
            r7.compact()
            goto L4e
        L88:
            mk1 r6 = defpackage.mk1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketReader.c(java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getB() {
        return this.b;
    }

    public WebSocketReader(ByteReadChannel byteReadChannel, CoroutineContext coroutineContext, long j, ObjectPool objectPool, int i, xu xuVar) {
        this(byteReadChannel, coroutineContext, j, (i & 8) != 0 ? lg.a : objectPool);
    }
}
