package io.ktor.client.plugins.sse;

import com.trilead.ssh2.sftp.ErrorCodes;
import defpackage.mk1;
import io.ktor.sse.ServerSentEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lio/ktor/sse/ServerSentEvent;", "Lmk1;", "<anonymous>", "(Lkotlinx/coroutines/channels/ProducerScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$1", f = "DefaultClientSSESession.kt", i = {0, 1}, l = {ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT, 30}, m = "invokeSuspend", n = {"$this$channelFlow", "$this$channelFlow"}, s = {"L$0", "L$0"})
public final class DefaultClientSSESession$_incoming$1 extends SuspendLambda implements Function2<ProducerScope<? super ServerSentEvent>, Continuation<? super mk1>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultClientSSESession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultClientSSESession$_incoming$1(DefaultClientSSESession defaultClientSSESession, Continuation<? super DefaultClientSSESession$_incoming$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultClientSSESession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<mk1> create(Object obj, Continuation<?> continuation) {
        DefaultClientSSESession$_incoming$1 defaultClientSSESession$_incoming$1 = new DefaultClientSSESession$_incoming$1(this.this$0, continuation);
        defaultClientSSESession$_incoming$1.L$0 = obj;
        return defaultClientSSESession$_incoming$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super ServerSentEvent> producerScope, Continuation<? super mk1> continuation) {
        return ((DefaultClientSSESession$_incoming$1) create(producerScope, continuation)).invokeSuspend(mk1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        if (r1.send(r12, r11) == r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0061 -> B:36:0x0079). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0076 -> B:36:0x0079). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0083 -> B:36:0x0079). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L15
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
            kotlin.d.b(r12)
            goto L79
        L15:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u7.p(r11)
            r11 = 0
            return r11
        L1c:
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
            kotlin.d.b(r12)
            goto L3d
        L24:
            kotlin.d.b(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.channels.ProducerScope r12 = (kotlinx.coroutines.channels.ProducerScope) r12
        L2b:
            io.ktor.client.plugins.sse.DefaultClientSSESession r1 = r11.this$0
            io.ktor.utils.io.ByteReadChannel r4 = r1.a
            r11.L$0 = r12
            r11.label = r3
            java.lang.Object r1 = r1.a(r4, r11)
            if (r1 != r0) goto L3a
            goto L85
        L3a:
            r10 = r1
            r1 = r12
            r12 = r10
        L3d:
            io.ktor.sse.ServerSentEvent r12 = (io.ktor.sse.ServerSentEvent) r12
            if (r12 != 0) goto L44
            mk1 r11 = defpackage.mk1.a
            return r11
        L44:
            java.lang.String r4 = r12.e
            java.lang.Long r5 = r12.d
            java.lang.String r6 = r12.c
            java.lang.String r7 = r12.b
            java.lang.String r8 = r12.a
            io.ktor.client.plugins.sse.DefaultClientSSESession r9 = r11.this$0
            r9.getClass()
            if (r8 != 0) goto L63
            if (r7 != 0) goto L63
            if (r6 != 0) goto L63
            if (r5 != 0) goto L63
            if (r4 == 0) goto L63
            io.ktor.client.plugins.sse.DefaultClientSSESession r9 = r11.this$0
            boolean r9 = r9.d
            if (r9 == 0) goto L79
        L63:
            io.ktor.client.plugins.sse.DefaultClientSSESession r9 = r11.this$0
            r9.getClass()
            if (r8 != 0) goto L7b
            if (r7 != 0) goto L7b
            if (r6 != 0) goto L7b
            if (r4 != 0) goto L7b
            if (r5 == 0) goto L7b
            io.ktor.client.plugins.sse.DefaultClientSSESession r4 = r11.this$0
            boolean r4 = r4.e
            if (r4 == 0) goto L79
            goto L7b
        L79:
            r12 = r1
            goto L2b
        L7b:
            r11.L$0 = r1
            r11.label = r2
            java.lang.Object r12 = r1.send(r12, r11)
            if (r12 != r0) goto L79
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
