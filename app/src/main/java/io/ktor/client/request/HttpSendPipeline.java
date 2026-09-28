package io.ktor.client.request;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import io.ktor.util.pipeline.Pipeline;
import io.ktor.util.pipeline.PipelinePhase;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lio/ktor/client/request/HttpSendPipeline;", "Lio/ktor/util/pipeline/Pipeline;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/client/request/HttpRequestBuilder;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "developmentMode", "<init>", "(Z)V", "Phases", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpSendPipeline extends Pipeline<Object, HttpRequestBuilder> {
    public static final Phases g = new Phases(null);
    public static final PipelinePhase h = new PipelinePhase("Before");
    public static final PipelinePhase i = new PipelinePhase("State");
    public static final PipelinePhase j = new PipelinePhase("Monitoring");
    public static final PipelinePhase k = new PipelinePhase("Engine");
    public static final PipelinePhase l = new PipelinePhase("Receive");
    public final boolean f;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/request/HttpSendPipeline$Phases;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Phases {
        public Phases(xu xuVar) {
        }
    }

    public HttpSendPipeline(boolean z) {
        super(h, i, j, k, l);
        this.f = z;
    }

    @Override // io.ktor.util.pipeline.Pipeline
    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    public /* synthetic */ HttpSendPipeline(boolean z, int i2, xu xuVar) {
        this((i2 & 1) != 0 ? true : z);
    }

    public HttpSendPipeline() {
        this(false, 1, null);
    }
}
