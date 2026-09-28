package io.ktor.websocket;

import com.trilead.ssh2.packets.Packets;
import defpackage.mk1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.websocket.RawWebSocketCommon$writerJob$1", f = "RawWebSocketCommon.kt", i = {1, 2}, l = {59, Packets.SSH_MSG_USERAUTH_INFO_RESPONSE, 62, Packets.SSH_MSG_REQUEST_SUCCESS, Packets.SSH_MSG_REQUEST_SUCCESS, Packets.SSH_MSG_REQUEST_SUCCESS, Packets.SSH_MSG_REQUEST_SUCCESS}, m = "invokeSuspend", n = {"message", "message"}, s = {"L$0", "L$0"})
public final class RawWebSocketCommon$writerJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super mk1>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ RawWebSocketCommon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawWebSocketCommon$writerJob$1(RawWebSocketCommon rawWebSocketCommon, Continuation<? super RawWebSocketCommon$writerJob$1> continuation) {
        super(2, continuation);
        this.this$0 = rawWebSocketCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        return new RawWebSocketCommon$writerJob$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super mk1> continuation) {
        return ((RawWebSocketCommon$writerJob$1) create(coroutineScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        if (r9.flushAndClose(r8) == r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
    
        if (r9.flushAndClose(r8) != r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0109, code lost:
    
        if (r9.flushAndClose(r8) != r0) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[Catch: all -> 0x0026, ChannelWriteException -> 0x0029, TRY_ENTER, TryCatch #3 {ChannelWriteException -> 0x0029, all -> 0x0026, blocks: (B:9:0x0022, B:32:0x0076, B:20:0x0039, B:23:0x004a, B:25:0x004e, B:29:0x0065, B:38:0x009d, B:40:0x00a1, B:41:0x00a9, B:42:0x00bf, B:34:0x007a, B:16:0x002e, B:17:0x0032), top: B:67:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[Catch: all -> 0x0026, ChannelWriteException -> 0x0029, PHI: r9
      0x004a: PHI (r9v24 java.lang.Object) = (r9v0 java.lang.Object), (r9v30 java.lang.Object) binds: [B:17:0x0032, B:21:0x0046] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {ChannelWriteException -> 0x0029, all -> 0x0026, blocks: (B:9:0x0022, B:32:0x0076, B:20:0x0039, B:23:0x004a, B:25:0x004e, B:29:0x0065, B:38:0x009d, B:40:0x00a1, B:41:0x00a9, B:42:0x00bf, B:34:0x007a, B:16:0x002e, B:17:0x0032), top: B:67:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e A[Catch: all -> 0x0026, ChannelWriteException -> 0x0029, TryCatch #3 {ChannelWriteException -> 0x0029, all -> 0x0026, blocks: (B:9:0x0022, B:32:0x0076, B:20:0x0039, B:23:0x004a, B:25:0x004e, B:29:0x0065, B:38:0x009d, B:40:0x00a1, B:41:0x00a9, B:42:0x00bf, B:34:0x007a, B:16:0x002e, B:17:0x0032), top: B:67:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076 A[Catch: all -> 0x0026, ChannelWriteException -> 0x0029, PHI: r1
      0x0076: PHI (r1v23 java.lang.Object) = (r1v14 java.lang.Object), (r1v26 java.lang.Object) binds: [B:30:0x0072, B:9:0x0022] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {ChannelWriteException -> 0x0029, all -> 0x0026, blocks: (B:9:0x0022, B:32:0x0076, B:20:0x0039, B:23:0x004a, B:25:0x004e, B:29:0x0065, B:38:0x009d, B:40:0x00a1, B:41:0x00a9, B:42:0x00bf, B:34:0x007a, B:16:0x002e, B:17:0x0032), top: B:67:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[Catch: all -> 0x0026, ChannelWriteException -> 0x0029, TRY_LEAVE, TryCatch #3 {ChannelWriteException -> 0x0029, all -> 0x0026, blocks: (B:9:0x0022, B:32:0x0076, B:20:0x0039, B:23:0x004a, B:25:0x004e, B:29:0x0065, B:38:0x009d, B:40:0x00a1, B:41:0x00a9, B:42:0x00bf, B:34:0x007a, B:16:0x002e, B:17:0x0032), top: B:67:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d A[Catch: all -> 0x0026, ChannelWriteException -> 0x0029, TRY_ENTER, TryCatch #3 {ChannelWriteException -> 0x0029, all -> 0x0026, blocks: (B:9:0x0022, B:32:0x0076, B:20:0x0039, B:23:0x004a, B:25:0x004e, B:29:0x0065, B:38:0x009d, B:40:0x00a1, B:41:0x00a9, B:42:0x00bf, B:34:0x007a, B:16:0x002e, B:17:0x0032), top: B:67:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.intrinsics.CoroutineSingletons] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0072 -> B:32:0x0076). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00a1 -> B:20:0x0039). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x010c -> B:53:0x010c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.RawWebSocketCommon$writerJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
