package io.ktor.websocket;

import com.google.android.gms.ads.RequestConfiguration;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.kf2;
import defpackage.lg;
import defpackage.mk1;
import defpackage.xu;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\rB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lio/ktor/websocket/WebSocketWriter;", "Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/utils/io/ByteWriteChannel;", "writeChannel", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "masking", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/CoroutineContext;ZLio/ktor/utils/io/pool/ObjectPool;)V", "FlushRequest", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebSocketWriter implements CoroutineScope {
    public final ByteWriteChannel a;
    public final CoroutineContext b;
    public boolean c;
    public final ObjectPool d;
    public final BufferedChannel e;
    public final Serializer f;
    public final Job g;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/websocket/WebSocketWriter$FlushRequest;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lkotlinx/coroutines/Job;", "parent", "<init>", "(Lkotlinx/coroutines/Job;)V", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FlushRequest {
        public final JobImpl a;

        public FlushRequest(Job job) {
            this.a = new JobImpl(job);
        }

        public final void a() {
            this.a.v(mk1.a);
        }
    }

    /* JADX INFO: renamed from: io.ktor.websocket.WebSocketWriter$flush$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", i = {0, 0}, l = {154, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_GCM_SHA384, 162}, m = "flush", n = {"this", "it"}, s = {"L$0", "L$2"})
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
            return WebSocketWriter.this.flush(this);
        }
    }

    public WebSocketWriter(ByteWriteChannel byteWriteChannel, CoroutineContext coroutineContext, boolean z, ObjectPool<ByteBuffer> objectPool) {
        byteWriteChannel.getClass();
        coroutineContext.getClass();
        objectPool.getClass();
        this.a = byteWriteChannel;
        this.b = coroutineContext;
        this.c = z;
        this.d = objectPool;
        this.e = kf2.a(8, 6, null);
        this.f = new Serializer();
        this.g = kotlinx.coroutines.c.c(this, new CoroutineName("ws-writer"), CoroutineStart.ATOMIC, new WebSocketWriter$writeLoopJob$1(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:165:0x02ab, B:166:0x02ad], limit reached: 178 */
    /* JADX WARN: Path cross not found for [B:67:0x013b, B:64:0x0130], limit reached: 178 */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r12v10, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x0296 -> B:160:0x0299). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x02a4 -> B:161:0x029f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:20:0x008e
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(io.ktor.websocket.Frame r20, java.nio.ByteBuffer r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketWriter.a(io.ktor.websocket.Frame, java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fd, code lost:
    
        if (r9.flushAndClose(r2) != r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0122, code lost:
    
        if (r8.flushAndClose(r0) == r1) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0126, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014e, code lost:
    
        if (r8.flushAndClose(r0) == r1) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095 A[Catch: all -> 0x00bc, ChannelWriteException -> 0x00c1, TryCatch #6 {ChannelWriteException -> 0x00c1, all -> 0x00bc, blocks: (B:38:0x00b0, B:31:0x008d, B:33:0x0095, B:35:0x009d, B:48:0x00c6, B:50:0x00ca, B:51:0x00d0, B:52:0x00e4), top: B:106:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5 A[PHI: r2 r8
      0x00e5: PHI (r2v15 io.ktor.websocket.WebSocketWriter$writeLoop$1) = (r2v11 io.ktor.websocket.WebSocketWriter$writeLoop$1), (r2v16 io.ktor.websocket.WebSocketWriter$writeLoop$1) binds: [B:32:0x0093, B:40:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r8v32 ??) = (r8v42 ??), (r8v43 ??) binds: [B:32:0x0093, B:40:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [io.ktor.websocket.WebSocketWriter] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [io.ktor.websocket.WebSocketWriter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [io.ktor.websocket.WebSocketWriter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [io.ktor.websocket.WebSocketWriter] */
    /* JADX WARN: Type inference failed for: r8v14, types: [io.ktor.websocket.WebSocketWriter] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29, types: [io.ktor.websocket.WebSocketWriter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32, types: [io.ktor.websocket.WebSocketWriter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v38, types: [io.ktor.websocket.WebSocketWriter] */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ac -> B:106:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00ca -> B:41:0x00b9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.nio.ByteBuffer r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketWriter.b(java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object flush(kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof io.ktor.websocket.WebSocketWriter.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.websocket.WebSocketWriter$flush$1 r0 = (io.ktor.websocket.WebSocketWriter.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.WebSocketWriter$flush$1 r0 = new io.ktor.websocket.WebSocketWriter$flush$1
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
            if (r2 == 0) goto L52
            if (r2 == r6) goto L3e
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
            io.ktor.websocket.WebSocketWriter$FlushRequest r10 = (io.ktor.websocket.WebSocketWriter.FlushRequest) r10
            kotlin.d.b(r11)
            goto L98
        L3e:
            java.lang.Object r10 = r0.L$2
            io.ktor.websocket.WebSocketWriter$FlushRequest r10 = (io.ktor.websocket.WebSocketWriter.FlushRequest) r10
            java.lang.Object r2 = r0.L$1
            io.ktor.websocket.WebSocketWriter$FlushRequest r2 = (io.ktor.websocket.WebSocketWriter.FlushRequest) r2
            java.lang.Object r6 = r0.L$0
            io.ktor.websocket.WebSocketWriter r6 = (io.ktor.websocket.WebSocketWriter) r6
            kotlin.d.b(r11)     // Catch: java.lang.Throwable -> L4e kotlinx.coroutines.channels.ClosedSendChannelException -> L50
            goto L99
        L4e:
            r11 = move-exception
            goto L7f
        L50:
            r11 = r2
            goto L83
        L52:
            kotlin.d.b(r11)
            io.ktor.websocket.WebSocketWriter$FlushRequest r11 = new io.ktor.websocket.WebSocketWriter$FlushRequest
            kotlin.coroutines.CoroutineContext r2 = r10.b
            ai0 r8 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r8)
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            r11.<init>(r2)
            kotlinx.coroutines.channels.BufferedChannel r2 = r10.e     // Catch: java.lang.Throwable -> L77 kotlinx.coroutines.channels.ClosedSendChannelException -> L7c
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L77 kotlinx.coroutines.channels.ClosedSendChannelException -> L7c
            r0.L$1 = r11     // Catch: java.lang.Throwable -> L77 kotlinx.coroutines.channels.ClosedSendChannelException -> L7c
            r0.L$2 = r11     // Catch: java.lang.Throwable -> L77 kotlinx.coroutines.channels.ClosedSendChannelException -> L7c
            r0.label = r6     // Catch: java.lang.Throwable -> L77 kotlinx.coroutines.channels.ClosedSendChannelException -> L7c
            java.lang.Object r10 = r2.send(r11, r0)     // Catch: java.lang.Throwable -> L77 kotlinx.coroutines.channels.ClosedSendChannelException -> L7c
            if (r10 != r1) goto L75
            goto Laf
        L75:
            r2 = r11
            goto L99
        L77:
            r10 = move-exception
            r9 = r11
            r11 = r10
            r10 = r9
            goto L7f
        L7c:
            r6 = r10
            r10 = r11
            goto L83
        L7f:
            r10.a()
            throw r11
        L83:
            r10.a()
            kotlinx.coroutines.Job r10 = r6.g
            r0.L$0 = r11
            r0.L$1 = r7
            r0.L$2 = r7
            r0.label = r5
            java.lang.Object r10 = r10.join(r0)
            if (r10 != r1) goto L97
            goto Laf
        L97:
            r10 = r11
        L98:
            r2 = r10
        L99:
            r0.L$0 = r7
            r0.L$1 = r7
            r0.L$2 = r7
            r0.label = r4
            kotlinx.coroutines.JobImpl r10 = r2.a
            java.lang.Object r10 = r10.join(r0)
            kotlin.coroutines.intrinsics.CoroutineSingletons r11 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r10 != r11) goto Lac
            goto Lad
        Lac:
            r10 = r3
        Lad:
            if (r10 != r1) goto Lb0
        Laf:
            return r1
        Lb0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketWriter.flush(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getB() {
        return this.b;
    }

    public WebSocketWriter(ByteWriteChannel byteWriteChannel, CoroutineContext coroutineContext, boolean z, ObjectPool objectPool, int i, xu xuVar) {
        this(byteWriteChannel, coroutineContext, (i & 4) != 0 ? false : z, (i & 8) != 0 ? lg.a : objectPool);
    }
}
