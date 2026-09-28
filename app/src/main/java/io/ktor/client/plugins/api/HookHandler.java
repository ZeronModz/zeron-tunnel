package io.ktor.client.plugins.api;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/client/plugins/api/HookHandler;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/client/plugins/api/ClientHook;", "hook", "handler", "<init>", "(Lio/ktor/client/plugins/api/ClientHook;Ljava/lang/Object;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HookHandler<T> {
    public final ClientHook a;
    public final Object b;

    public HookHandler(ClientHook<T> clientHook, T t) {
        clientHook.getClass();
        this.a = clientHook;
        this.b = t;
    }
}
