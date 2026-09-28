package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.util.pipeline.PipelinePhase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final Logger a;

    static {
        Logger logger = LoggerFactory.getLogger("io.ktor.client.plugins.defaultTransformers");
        logger.getClass();
        a = logger;
    }

    public static final void a(HttpClient httpClient) {
        HttpRequestPipeline httpRequestPipeline = httpClient.e;
        HttpRequestPipeline.g.getClass();
        httpRequestPipeline.g(HttpRequestPipeline.k, new DefaultTransformKt$defaultTransformers$1(null));
        HttpResponsePipeline httpResponsePipeline = httpClient.f;
        HttpResponsePipeline.g.getClass();
        PipelinePhase pipelinePhase = HttpResponsePipeline.i;
        httpResponsePipeline.g(pipelinePhase, new DefaultTransformKt$defaultTransformers$2(httpClient, null));
        httpResponsePipeline.g(pipelinePhase, new DefaultTransformersJvmKt$platformResponseDefaultTransformers$1(null));
    }
}
