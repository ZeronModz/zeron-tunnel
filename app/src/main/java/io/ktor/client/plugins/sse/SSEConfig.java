package io.ktor.client.plugins.sse;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.time.Duration$Companion;
import kotlin.time.DurationUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/sse/SSEConfig;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SSEConfig {
    public final long a;

    public SSEConfig() {
        Duration$Companion duration$Companion = kotlin.time.a.b;
        this.a = kotlin.time.b.j(3000, DurationUnit.MILLISECONDS);
    }
}
