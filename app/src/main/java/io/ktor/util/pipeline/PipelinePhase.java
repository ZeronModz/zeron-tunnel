package io.ktor.util.pipeline;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.vh;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelinePhase;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "name", "<init>", "(Ljava/lang/String;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PipelinePhase {
    public final String a;

    public PipelinePhase(String str) {
        str.getClass();
        this.a = str;
    }

    public final String toString() {
        return vh.s(new StringBuilder("Phase('"), this.a, "')");
    }
}
