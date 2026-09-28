package io.ktor.client.plugins.api;

import io.ktor.client.HttpClient;
import io.ktor.client.statement.HttpResponsePipeline;
import kotlin.jvm.functions.Function5;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements ClientHook {
    public static final e a = new e();

    @Override // io.ktor.client.plugins.api.ClientHook
    public final void install(HttpClient httpClient, Object obj) {
        Function5 function5 = (Function5) obj;
        httpClient.getClass();
        function5.getClass();
        HttpResponsePipeline httpResponsePipeline = httpClient.f;
        HttpResponsePipeline.g.getClass();
        httpResponsePipeline.g(HttpResponsePipeline.j, new TransformResponseBodyHook$install$1(function5, null));
    }
}
