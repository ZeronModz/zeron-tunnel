package io.ktor.client.plugins.internal;

import com.trilead.ssh2.packets.Packets;
import defpackage.mk1;
import io.ktor.client.plugins.internal.ByteChannelReplay;
import io.ktor.utils.io.WriterScope;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.conscrypt.HpkeSuite;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "Lmk1;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.internal.ByteChannelReplay$CopyFromSourceTask$receiveBody$1", f = "ByteChannelReplay.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 3}, l = {59, Packets.SSH_MSG_USERAUTH_INFO_REQUEST, 64, HpkeSuite.KEM_MLKEM_768}, m = "invokeSuspend", n = {"$this$writer", "body", "$this$writer", "body", "$this$writer", "body", "packet", "$this$writer", "body", "packet"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
final class ByteChannelReplay$CopyFromSourceTask$receiveBody$1 extends SuspendLambda implements Function2<WriterScope, Continuation<? super mk1>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ByteChannelReplay this$0;
    final /* synthetic */ ByteChannelReplay.CopyFromSourceTask this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelReplay$CopyFromSourceTask$receiveBody$1(ByteChannelReplay byteChannelReplay, ByteChannelReplay.CopyFromSourceTask copyFromSourceTask, Continuation<? super ByteChannelReplay$CopyFromSourceTask$receiveBody$1> continuation) {
        super(2, continuation);
        this.this$0 = byteChannelReplay;
        this.this$1 = copyFromSourceTask;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        ByteChannelReplay$CopyFromSourceTask$receiveBody$1 byteChannelReplay$CopyFromSourceTask$receiveBody$1 = new ByteChannelReplay$CopyFromSourceTask$receiveBody$1(this.this$0, this.this$1, continuation);
        byteChannelReplay$CopyFromSourceTask$receiveBody$1.L$0 = obj;
        return byteChannelReplay$CopyFromSourceTask$receiveBody$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WriterScope writerScope, Continuation<? super mk1> continuation) {
        return ((ByteChannelReplay$CopyFromSourceTask$receiveBody$1) create(writerScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00fc: INVOKE (r7 I:kotlinx.io.RawSink) INTERFACE call: kotlinx.io.RawSink.close():void A[MD:():void (m)] (LINE:253), block:B:52:0x00fc */
    /* JADX WARN: Path cross not found for [B:30:0x007b, B:33:0x008e], limit reached: 54 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a A[PHI: r1 r7 r11
      0x004a: PHI (r1v2 io.ktor.utils.io.WriterScope) = (r1v5 io.ktor.utils.io.WriterScope), (r1v16 io.ktor.utils.io.WriterScope) binds: [B:34:0x00a2, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x004a: PHI (r7v2 ??) = (r7v19 ??), (r7v20 ??) binds: [B:34:0x00a2, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x004a: PHI (r11v4 java.lang.Object) = (r11v11 java.lang.Object), (r11v0 java.lang.Object) binds: [B:34:0x00a2, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073 A[Catch: all -> 0x0024, TRY_ENTER, TryCatch #0 {all -> 0x0024, blocks: (B:9:0x001f, B:45:0x00d6, B:25:0x0067, B:28:0x0073, B:30:0x007b, B:33:0x008e, B:36:0x00a5, B:37:0x00a8, B:39:0x00b0, B:42:0x00c5, B:46:0x00e1, B:48:0x00e9, B:51:0x00fb, B:16:0x0039, B:19:0x0047, B:22:0x0055), top: B:55:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0 A[Catch: all -> 0x0024, Exception -> 0x00d6, TryCatch #0 {all -> 0x0024, blocks: (B:9:0x001f, B:45:0x00d6, B:25:0x0067, B:28:0x0073, B:30:0x007b, B:33:0x008e, B:36:0x00a5, B:37:0x00a8, B:39:0x00b0, B:42:0x00c5, B:46:0x00e1, B:48:0x00e9, B:51:0x00fb, B:16:0x0039, B:19:0x0047, B:22:0x0055), top: B:55:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:9:0x001f, B:45:0x00d6, B:25:0x0067, B:28:0x0073, B:30:0x007b, B:33:0x008e, B:36:0x00a5, B:37:0x00a8, B:39:0x00b0, B:42:0x00c5, B:46:0x00e1, B:48:0x00e9, B:51:0x00fb, B:16:0x0039, B:19:0x0047, B:22:0x0055), top: B:55:0x0009 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [kotlinx.io.Source] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlinx.io.Source] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlinx.io.RawSource] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [kotlinx.io.Sink] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlinx.io.Sink] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlinx.io.Sink] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ae -> B:45:0x00d6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00d3 -> B:45:0x00d6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:54:0x00d6
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.internal.ByteChannelReplay$CopyFromSourceTask$receiveBody$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
