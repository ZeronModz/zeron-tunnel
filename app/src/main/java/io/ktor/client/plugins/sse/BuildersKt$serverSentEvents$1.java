package io.ktor.client.plugins.sse;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.sse.BuildersKt", f = "builders.kt", i = {0, 1}, l = {106, 108}, m = "serverSentEvents-mY9Nd3A", n = {"block", "session"}, s = {"L$0", "L$0"})
final class BuildersKt$serverSentEvents$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public BuildersKt$serverSentEvents$1(Continuation<? super BuildersKt$serverSentEvents$1> continuation) {
        super(continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a A[Catch: all -> 0x006e, TryCatch #4 {all -> 0x006e, blocks: (B:27:0x0050, B:29:0x005a, B:33:0x006d, B:32:0x0064, B:36:0x0070), top: B:41:0x0015 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            r6.result = r7
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            r6.label = r0
            io.ktor.util.AttributeKey r2 = defpackage.dg.a
            int r0 = r0 - r1
            r6.label = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L75
            r4 = 2
            if (r0 == r3) goto L2b
            if (r0 != r4) goto L25
            java.lang.Object r6 = r6.L$0
            io.ktor.client.plugins.sse.ClientSSESession r6 = (io.ktor.client.plugins.sse.ClientSSESession) r6
            kotlin.d.b(r7)     // Catch: java.lang.Throwable -> L21 java.util.concurrent.CancellationException -> L23
            goto L40
        L21:
            r7 = move-exception
            goto L50
        L23:
            r7 = move-exception
            goto L70
        L25:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r6)
            return r2
        L2b:
            java.lang.Object r0 = r6.L$0
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            kotlin.d.b(r7)
            io.ktor.client.plugins.sse.ClientSSESession r7 = (io.ktor.client.plugins.sse.ClientSSESession) r7
            r6.L$0 = r7     // Catch: java.lang.Throwable -> L46 java.util.concurrent.CancellationException -> L4b
            r6.label = r4     // Catch: java.lang.Throwable -> L46 java.util.concurrent.CancellationException -> L4b
            java.lang.Object r6 = r0.invoke(r7, r6)     // Catch: java.lang.Throwable -> L46 java.util.concurrent.CancellationException -> L4b
            if (r6 != r1) goto L3f
            return r1
        L3f:
            r6 = r7
        L40:
            defpackage.zr.b(r6, r2)
            mk1 r6 = defpackage.mk1.a
            return r6
        L46:
            r6 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
            goto L50
        L4b:
            r6 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
            goto L70
        L50:
            io.ktor.client.call.HttpClientCall r0 = r6.b     // Catch: java.lang.Throwable -> L6e
            io.ktor.client.statement.HttpResponse r0 = r0.d()     // Catch: java.lang.Throwable -> L6e
            boolean r1 = r7 instanceof io.ktor.client.plugins.sse.SSEClientException     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L64
            r1 = r7
            io.ktor.client.plugins.sse.SSEClientException r1 = (io.ktor.client.plugins.sse.SSEClientException) r1     // Catch: java.lang.Throwable -> L6e
            io.ktor.client.statement.HttpResponse r3 = r1.getResponse()     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L64
            goto L6d
        L64:
            io.ktor.client.plugins.sse.SSEClientException r1 = new io.ktor.client.plugins.sse.SSEClientException     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = r7.getMessage()     // Catch: java.lang.Throwable -> L6e
            r1.<init>(r0, r7, r3)     // Catch: java.lang.Throwable -> L6e
        L6d:
            throw r1     // Catch: java.lang.Throwable -> L6e
        L6e:
            r7 = move-exception
            goto L71
        L70:
            throw r7     // Catch: java.lang.Throwable -> L6e
        L71:
            defpackage.zr.b(r6, r2)
            throw r7
        L75:
            kotlin.d.b(r7)
            r6.L$0 = r2
            r6.label = r3
            io.ktor.client.plugins.api.ClientPlugin r6 = io.ktor.client.plugins.sse.c.b
            defpackage.ie0.a(r2, r6)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.BuildersKt$serverSentEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
