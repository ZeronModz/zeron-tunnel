package io.ktor.client.plugins.api;

import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestPipeline;
import kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements ClientHook {
    public static final b a = new b();

    @Override // io.ktor.client.plugins.api.ClientHook
    public final void install(HttpClient httpClient, Object obj) {
        Function4 function4 = (Function4) obj;
        httpClient.getClass();
        function4.getClass();
        HttpRequestPipeline httpRequestPipeline = httpClient.e;
        HttpRequestPipeline.g.getClass();
        httpRequestPipeline.g(HttpRequestPipeline.i, new RequestHook$install$1(function4, null));
    }
}
