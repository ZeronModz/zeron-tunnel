package io.ktor.websocket;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r6.flush(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(io.ktor.websocket.WebSocketSession r6, io.ktor.websocket.CloseReason r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof io.ktor.websocket.WebSocketSessionKt$close$1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.websocket.WebSocketSessionKt$close$1 r0 = (io.ktor.websocket.WebSocketSessionKt$close$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.WebSocketSessionKt$close$1 r0 = new io.ktor.websocket.WebSocketSessionKt$close$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            kotlin.d.b(r8)     // Catch: java.lang.Throwable -> L57
            goto L57
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            return r3
        L31:
            java.lang.Object r6 = r0.L$0
            io.ktor.websocket.WebSocketSession r6 = (io.ktor.websocket.WebSocketSession) r6
            kotlin.d.b(r8)     // Catch: java.lang.Throwable -> L57
            goto L4c
        L39:
            kotlin.d.b(r8)
            io.ktor.websocket.Frame$Close r8 = new io.ktor.websocket.Frame$Close     // Catch: java.lang.Throwable -> L57
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L57
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L57
            r0.label = r5     // Catch: java.lang.Throwable -> L57
            java.lang.Object r7 = r6.send(r8, r0)     // Catch: java.lang.Throwable -> L57
            if (r7 != r1) goto L4c
            goto L56
        L4c:
            r0.L$0 = r3     // Catch: java.lang.Throwable -> L57
            r0.label = r4     // Catch: java.lang.Throwable -> L57
            java.lang.Object r6 = r6.flush(r0)     // Catch: java.lang.Throwable -> L57
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            mk1 r6 = defpackage.mk1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.h.a(io.ktor.websocket.WebSocketSession, io.ktor.websocket.CloseReason, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
