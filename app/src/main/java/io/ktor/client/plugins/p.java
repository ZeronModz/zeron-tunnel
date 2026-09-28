package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.plugins.api.ClientHook;
import io.ktor.client.request.HttpRequestPipeline;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements ClientHook {
    public static final p a = new p();

    @Override // io.ktor.client.plugins.api.ClientHook
    public final void install(HttpClient httpClient, Object obj) {
        Function3 function3 = (Function3) obj;
        httpClient.getClass();
        function3.getClass();
        HttpRequestPipeline httpRequestPipeline = httpClient.e;
        HttpRequestPipeline.g.getClass();
        httpRequestPipeline.g(HttpRequestPipeline.k, new RenderRequestHook$install$1(function3, null));
    }
}
