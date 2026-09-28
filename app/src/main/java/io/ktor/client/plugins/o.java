package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.plugins.api.ClientHook;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.util.pipeline.InvalidPhaseException;
import io.ktor.util.pipeline.PhaseContent;
import io.ktor.util.pipeline.PipelinePhase;
import io.ktor.util.pipeline.PipelinePhaseRelation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements ClientHook {
    public static final o a = new o();

    @Override // io.ktor.client.plugins.api.ClientHook
    public final void install(HttpClient httpClient, Object obj) throws InvalidPhaseException {
        Function3 function3 = (Function3) obj;
        httpClient.getClass();
        function3.getClass();
        PipelinePhase pipelinePhase = new PipelinePhase("BeforeReceive");
        HttpResponsePipeline httpResponsePipeline = httpClient.f;
        HttpResponsePipeline.g.getClass();
        PipelinePhase pipelinePhase2 = HttpResponsePipeline.h;
        httpResponsePipeline.getClass();
        pipelinePhase2.getClass();
        if (!httpResponsePipeline.e(pipelinePhase)) {
            int iC = httpResponsePipeline.c(pipelinePhase2);
            if (iC == -1) {
                throw new InvalidPhaseException("Phase " + pipelinePhase2 + " was not registered for this pipeline");
            }
            httpResponsePipeline.b.add(iC, new PhaseContent(pipelinePhase, new PipelinePhaseRelation.Before(pipelinePhase2)));
        }
        httpResponsePipeline.g(pipelinePhase, new ReceiveError$install$1(function3, null));
    }
}
