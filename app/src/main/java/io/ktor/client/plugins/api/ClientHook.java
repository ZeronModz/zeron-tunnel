package io.ktor.client.plugins.api;

import com.google.android.gms.ads.RequestConfiguration;
import io.ktor.client.HttpClient;
import io.ktor.utils.io.KtorDsl;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@KtorDsl
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/client/plugins/api/ClientHook;", "HookHandler", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/client/HttpClient;", "client", "handler", "Lmk1;", "install", "(Lio/ktor/client/HttpClient;Ljava/lang/Object;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ClientHook<HookHandler> {
    void install(HttpClient client, HookHandler handler);
}
