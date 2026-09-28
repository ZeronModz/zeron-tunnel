package io.ktor.client.plugins.observer;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"io/ktor/client/plugins/observer/AfterReceiveHook$Context", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponse;", "Lmk1;", "context", "<init>", "(Lio/ktor/util/pipeline/PipelineContext;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AfterReceiveHook$Context {
    public final PipelineContext a;

    public AfterReceiveHook$Context(PipelineContext<HttpResponse, mk1> pipelineContext) {
        pipelineContext.getClass();
        this.a = pipelineContext;
    }
}
