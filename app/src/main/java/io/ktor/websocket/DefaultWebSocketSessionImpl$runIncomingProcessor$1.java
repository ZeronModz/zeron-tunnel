package io.ktor.websocket;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.mk1;
import io.ktor.websocket.Frame;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1", f = "DefaultWebSocketSession.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7}, l = {377, 183, 236, 189, 190, 192, 207, 222, 236, 236, 236, 236}, m = "invokeSuspend", n = {"$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", TypedValues.AttributesType.S_FRAME, "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6", "L$8", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6"})
final class DefaultWebSocketSessionImpl$runIncomingProcessor$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    final /* synthetic */ SendChannel<Frame.Ping> $ponger;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ DefaultWebSocketSessionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DefaultWebSocketSessionImpl$runIncomingProcessor$1(DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, SendChannel<? super Frame.Ping> sendChannel, Continuation<? super DefaultWebSocketSessionImpl$runIncomingProcessor$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultWebSocketSessionImpl;
        this.$ponger = sendChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        DefaultWebSocketSessionImpl$runIncomingProcessor$1 defaultWebSocketSessionImpl$runIncomingProcessor$1 = new DefaultWebSocketSessionImpl$runIncomingProcessor$1(this.this$0, this.$ponger, continuation);
        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$0 = obj;
        return defaultWebSocketSessionImpl$runIncomingProcessor$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((DefaultWebSocketSessionImpl$runIncomingProcessor$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x035b, code lost:
    
        if (r5.send(r0, r24) == r3) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x035f, code lost:
    
        defpackage.ay2.y((kotlinx.io.Sink) r6, r0.c);
        r0 = r13;
        r13 = r7;
        r7 = r0;
        r0 = r12;
        r12 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r0;
        r0 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02c3, code lost:
    
        r0 = r7;
        r7 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r12 = r13;
        r13 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0363 A[Catch: all -> 0x01df, ClosedSendChannelException -> 0x043c, TRY_ENTER, TRY_LEAVE, TryCatch #7 {ClosedSendChannelException -> 0x043c, all -> 0x01df, blocks: (B:53:0x019f, B:109:0x0363, B:122:0x03a9, B:123:0x03ac, B:30:0x00f9), top: B:162:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x047b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0138 A[Catch: all -> 0x004c, TryCatch #5 {all -> 0x004c, blocks: (B:11:0x0047, B:36:0x0130, B:38:0x0138, B:40:0x0146, B:41:0x0162, B:43:0x0166, B:45:0x016e, B:47:0x017a, B:48:0x017c, B:51:0x019b, B:65:0x01e3, B:67:0x01e7, B:69:0x01ed, B:72:0x0208, B:74:0x020c, B:77:0x0227, B:24:0x00b8, B:27:0x00dd), top: B:160:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x025a A[Catch: all -> 0x009a, TryCatch #3 {all -> 0x009a, blocks: (B:81:0x0256, B:83:0x025a, B:85:0x025e, B:86:0x0260, B:88:0x0264, B:89:0x026b, B:90:0x027d, B:92:0x0281, B:93:0x0289, B:95:0x028f, B:96:0x029d, B:101:0x02d0, B:102:0x032f, B:104:0x0335, B:105:0x0340, B:17:0x0095), top: B:158:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x027d A[Catch: all -> 0x009a, TryCatch #3 {all -> 0x009a, blocks: (B:81:0x0256, B:83:0x025a, B:85:0x025e, B:86:0x0260, B:88:0x0264, B:89:0x026b, B:90:0x027d, B:92:0x0281, B:93:0x0289, B:95:0x028f, B:96:0x029d, B:101:0x02d0, B:102:0x032f, B:104:0x0335, B:105:0x0340, B:17:0x0095), top: B:158:0x0095 }] */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, io.ktor.websocket.Frame] */
    /* JADX WARN: Type inference failed for: r0v47, types: [io.ktor.websocket.Frame, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r5v20, types: [io.ktor.websocket.WebSocketExtension] */
    /* JADX WARN: Type inference failed for: r6v21, types: [T, kotlinx.io.Buffer] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01eb -> B:100:0x02c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0204 -> B:100:0x02c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0223 -> B:100:0x02c3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
