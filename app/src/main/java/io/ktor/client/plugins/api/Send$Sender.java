package io.ktor.client.plugins.api;

import io.ktor.client.plugins.Sender;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"io/ktor/client/plugins/api/Send$Sender", "Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/client/plugins/Sender;", "httpSendSender", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lio/ktor/client/plugins/Sender;Lkotlin/coroutines/CoroutineContext;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Send$Sender implements CoroutineScope {
    public final Sender a;
    public final CoroutineContext b;

    public Send$Sender(Sender sender, CoroutineContext coroutineContext) {
        sender.getClass();
        coroutineContext.getClass();
        this.a = sender;
        this.b = coroutineContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getB() {
        return this.b;
    }
}
