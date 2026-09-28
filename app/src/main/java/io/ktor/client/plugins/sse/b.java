package io.ktor.client.plugins.sse;

import defpackage.mk1;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.statement.HttpResponsePipeline;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ClientPluginBuilder clientPluginBuilder = (ClientPluginBuilder) obj;
        clientPluginBuilder.getClass();
        clientPluginBuilder.a(a.a, new SSEKt$SSE$2$1(((SSEConfig) clientPluginBuilder.b).a, false, false, null));
        HttpResponsePipeline httpResponsePipeline = clientPluginBuilder.a.f;
        HttpResponsePipeline.g.getClass();
        httpResponsePipeline.g(HttpResponsePipeline.j, new SSEKt$SSE$2$2(null));
        return mk1.a;
    }
}
