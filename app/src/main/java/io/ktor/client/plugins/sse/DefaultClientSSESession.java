package io.ktor.client.plugins.sse;

import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.time.Duration$Companion;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/client/plugins/sse/DefaultClientSSESession;", "Lio/ktor/client/plugins/sse/SSESession;", "Lio/ktor/client/plugins/sse/SSEClientContent;", "content", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lio/ktor/client/plugins/sse/SSEClientContent;Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/CoroutineContext;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultClientSSESession implements SSESession {
    public final ByteReadChannel a;
    public final CoroutineContext b;
    public String c;
    public final boolean d;
    public final boolean e;
    public final Flow f;

    public DefaultClientSSESession(SSEClientContent sSEClientContent, ByteReadChannel byteReadChannel, CoroutineContext coroutineContext) {
        sSEClientContent.getClass();
        byteReadChannel.getClass();
        coroutineContext.getClass();
        this.a = byteReadChannel;
        this.b = coroutineContext;
        long j = sSEClientContent.b;
        if ((((int) j) & 1) == 1) {
            if (kotlin.time.a.e(j)) {
            }
            this.d = sSEClientContent.c;
            this.e = sSEClientContent.d;
            this.f = kotlinx.coroutines.flow.c.c(new DefaultClientSSESession$_incoming$1(this, null));
        }
        Duration$Companion duration$Companion = kotlin.time.a.b;
        kotlin.time.a.i(j, DurationUnit.MILLISECONDS);
        this.d = sSEClientContent.c;
        this.e = sSEClientContent.d;
        this.f = kotlinx.coroutines.flow.c.c(new DefaultClientSSESession$_incoming$1(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e6, code lost:
    
        if (r2 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ee, code lost:
    
        if (kotlin.text.g.B(r2) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f0, code lost:
    
        r3.L$0 = r15;
        r3.L$1 = r14;
        r3.L$2 = r13;
        r3.L$3 = r12;
        r3.L$4 = r11;
        r3.L$5 = r5;
        r3.I$0 = r1;
        r3.I$1 = r0;
        r3.label = 2;
        r2 = io.ktor.utils.io.c.u(r14, Integer.MAX_VALUE, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0106, code lost:
    
        if (r2 != r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010c, code lost:
    
        if (r2 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0110, code lost:
    
        r8 = r14;
        r14 = r5;
        r5 = r15;
        r15 = r8;
        r8 = r11;
        r11 = r13;
        r13 = r12;
        r12 = r19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0238  */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0106 -> B:30:0x010a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x022e -> B:96:0x0232). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(io.ktor.utils.io.ByteReadChannel r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.DefaultClientSSESession.a(io.ktor.utils.io.ByteReadChannel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getB() {
        return this.b;
    }

    @Override // io.ktor.client.plugins.sse.SSESession
    /* JADX INFO: renamed from: getIncoming, reason: from getter */
    public final Flow getF() {
        return this.f;
    }
}
