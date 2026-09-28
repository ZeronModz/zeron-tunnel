package io.ktor.util.pipeline;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mk1;
import defpackage.u7;
import defpackage.xu;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001\u0013Bh\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012O\u0010\u000f\u001aK\u0012G\u0012E\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r¢\u0006\u0002\b\u000e0\b¢\u0006\u0004\b\u0010\u0010\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lio/ktor/util/pipeline/PhaseContent;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "TSubject", "Call", "Lio/ktor/util/pipeline/PipelinePhase;", TypedValues.CycleType.S_WAVE_PHASE, "Lio/ktor/util/pipeline/PipelinePhaseRelation;", "relation", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lkotlin/Function3;", "Lio/ktor/util/pipeline/PipelineContext;", "Lkotlin/coroutines/Continuation;", "Lmk1;", "Lio/ktor/util/pipeline/PipelineInterceptor;", "Lkotlin/ExtensionFunctionType;", "interceptors", "<init>", "(Lio/ktor/util/pipeline/PipelinePhase;Lio/ktor/util/pipeline/PipelinePhaseRelation;Ljava/util/List;)V", "(Lio/ktor/util/pipeline/PipelinePhase;Lio/ktor/util/pipeline/PipelinePhaseRelation;)V", "Companion", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PhaseContent<TSubject, Call> {
    public static final ArrayList e;
    public final PipelinePhase a;
    public final PipelinePhaseRelation b;
    public List c;
    public boolean d;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/util/pipeline/PhaseContent$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
        e = new ArrayList();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PhaseContent(PipelinePhase pipelinePhase, PipelinePhaseRelation pipelinePhaseRelation) {
        pipelinePhase.getClass();
        pipelinePhaseRelation.getClass();
        ArrayList arrayList = e;
        arrayList.getClass();
        this(pipelinePhase, pipelinePhaseRelation, TypeIntrinsics.a(arrayList));
        if (arrayList.isEmpty()) {
            return;
        }
        u7.p("The shared empty array list has been modified");
        throw null;
    }

    public final String toString() {
        return "Phase `" + this.a.a + "`, " + this.c.size() + " handlers";
    }

    public PhaseContent(PipelinePhase pipelinePhase, PipelinePhaseRelation pipelinePhaseRelation, List<Function3<PipelineContext<TSubject, Call>, TSubject, Continuation<? super mk1>, Object>> list) {
        pipelinePhase.getClass();
        pipelinePhaseRelation.getClass();
        list.getClass();
        this.a = pipelinePhase;
        this.b = pipelinePhaseRelation;
        this.c = list;
        this.d = true;
    }
}
