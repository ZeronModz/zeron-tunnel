package io.ktor.util.pipeline;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0004¨\u0006\u0007"}, d2 = {"Lio/ktor/util/pipeline/PipelinePhaseRelation;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "After", "Before", "tw0", "Lio/ktor/util/pipeline/PipelinePhaseRelation$After;", "Lio/ktor/util/pipeline/PipelinePhaseRelation$Before;", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PipelinePhaseRelation {

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelinePhaseRelation$After;", "Lio/ktor/util/pipeline/PipelinePhaseRelation;", "Lio/ktor/util/pipeline/PipelinePhase;", "relativeTo", "<init>", "(Lio/ktor/util/pipeline/PipelinePhase;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class After extends PipelinePhaseRelation {
        public final PipelinePhase a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public After(PipelinePhase pipelinePhase) {
            super(null);
            pipelinePhase.getClass();
            this.a = pipelinePhase;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelinePhaseRelation$Before;", "Lio/ktor/util/pipeline/PipelinePhaseRelation;", "Lio/ktor/util/pipeline/PipelinePhase;", "relativeTo", "<init>", "(Lio/ktor/util/pipeline/PipelinePhase;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Before extends PipelinePhaseRelation {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Before(PipelinePhase pipelinePhase) {
            super(null);
            pipelinePhase.getClass();
        }
    }

    public PipelinePhaseRelation(xu xuVar) {
    }
}
