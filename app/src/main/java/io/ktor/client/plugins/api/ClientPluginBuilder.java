package io.ktor.client.plugins.api;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.o0;
import io.ktor.client.HttpClient;
import io.ktor.util.AttributeKey;
import io.ktor.utils.io.KtorDsl;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@KtorDsl
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B-\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/client/plugins/api/ClientPluginBuilder;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "PluginConfig", "Lio/ktor/util/AttributeKey;", "Lio/ktor/client/plugins/api/ClientPluginInstance;", "key", "Lio/ktor/client/HttpClient;", "client", "pluginConfig", "<init>", "(Lio/ktor/util/AttributeKey;Lio/ktor/client/HttpClient;Ljava/lang/Object;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClientPluginBuilder<PluginConfig> {
    public final HttpClient a;
    public final Object b;
    public final ArrayList c;
    public final o0 d;

    public ClientPluginBuilder(AttributeKey<ClientPluginInstance<PluginConfig>> attributeKey, HttpClient httpClient, PluginConfig pluginconfig) {
        attributeKey.getClass();
        httpClient.getClass();
        pluginconfig.getClass();
        this.a = httpClient;
        this.b = pluginconfig;
        this.c = new ArrayList();
        this.d = new o0(6);
    }

    public final void a(ClientHook clientHook, SuspendLambda suspendLambda) {
        clientHook.getClass();
        this.c.add(new HookHandler(clientHook, suspendLambda));
    }
}
