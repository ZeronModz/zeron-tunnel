package io.ktor.client.plugins.sse;

import io.ktor.client.HttpClient;
import io.ktor.client.plugins.api.ClientHook;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.util.pipeline.InvalidPhaseException;
import io.ktor.util.pipeline.PipelinePhase;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements ClientHook {
    public static final a a = new a();

    @Override // io.ktor.client.plugins.api.ClientHook
    public final void install(HttpClient httpClient, Object obj) throws InvalidPhaseException {
        Function3 function3 = (Function3) obj;
        httpClient.getClass();
        function3.getClass();
        PipelinePhase pipelinePhase = new PipelinePhase("AfterRender");
        HttpRequestPipeline httpRequestPipeline = httpClient.e;
        HttpRequestPipeline.g.getClass();
        httpRequestPipeline.f(HttpRequestPipeline.k, pipelinePhase);
        httpRequestPipeline.g(pipelinePhase, new AfterRender$install$1(function3, null));
    }
}
