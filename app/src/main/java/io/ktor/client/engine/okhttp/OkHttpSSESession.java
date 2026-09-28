package io.ktor.client.engine.okhttp;

import defpackage.h30;
import defpackage.kf2;
import defpackage.q21;
import defpackage.sl1;
import io.ktor.client.plugins.sse.SSESession;
import io.ktor.sse.ServerSentEvent;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.c;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.sse.RealEventSource;
import okhttp3.sse.EventSourceListener;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttpSSESession;", "Lio/ktor/client/plugins/sse/SSESession;", "Lokhttp3/sse/EventSourceListener;", "Lokhttp3/OkHttpClient;", "engine", "Lokhttp3/Request;", "engineRequest", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Lkotlin/coroutines/CoroutineContext;)V", "ktor-client-okhttp"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OkHttpSSESession extends EventSourceListener implements SSESession {
    public final CoroutineContext a;
    public final RealEventSource b;
    public final CompletableDeferred c;
    public final BufferedChannel d;

    public OkHttpSSESession(OkHttpClient okHttpClient, Request request, CoroutineContext coroutineContext) {
        okHttpClient.getClass();
        request.getClass();
        coroutineContext.getClass();
        this.a = coroutineContext;
        if (request.c.a("Accept") == null) {
            Request.Builder builder = new Request.Builder(request);
            builder.c.a("Accept", "text/event-stream");
            request = builder.a();
        }
        RealEventSource realEventSource = new RealEventSource(request, this);
        OkHttpClient.Builder builder2 = new OkHttpClient.Builder(okHttpClient);
        h30 h30Var = EventListener.a;
        h30Var.getClass();
        byte[] bArr = sl1.a;
        builder2.e = new q21(h30Var, 5);
        RealCall realCall = new RealCall(new OkHttpClient(builder2), realEventSource.a, false);
        realEventSource.c = realCall;
        realCall.enqueue(realEventSource);
        this.b = realEventSource;
        this.c = kotlinx.coroutines.a.a();
        this.d = kf2.a(8, 6, null);
    }

    @Override // okhttp3.sse.EventSourceListener
    public final void a(RealEventSource realEventSource) {
        this.d.close(null);
        this.b.cancel();
    }

    @Override // okhttp3.sse.EventSourceListener
    public final void b(RealEventSource realEventSource, String str, String str2, String str3) {
        kotlinx.coroutines.channels.a.g(this.d, new ServerSentEvent(str3, str2, str, null, null, 24, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    @Override // okhttp3.sse.EventSourceListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(okhttp3.internal.sse.RealEventSource r13, java.lang.Exception r14, okhttp3.Response r15) throws io.ktor.http.BadContentTypeFormatException {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.okhttp.OkHttpSSESession.c(okhttp3.internal.sse.RealEventSource, java.lang.Exception, okhttp3.Response):void");
    }

    @Override // okhttp3.sse.EventSourceListener
    public final void d(RealEventSource realEventSource, Response response) {
        this.c.complete(response);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getC() {
        return this.a;
    }

    @Override // io.ktor.client.plugins.sse.SSESession
    /* JADX INFO: renamed from: getIncoming */
    public final Flow getF() {
        return c.o(this.d);
    }
}
