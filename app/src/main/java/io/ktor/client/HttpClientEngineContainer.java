package io.ktor.client;

import com.google.android.gms.ads.RequestConfiguration;
import io.ktor.client.engine.HttpClientEngineFactory;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lio/ktor/client/HttpClientEngineContainer;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lio/ktor/client/engine/HttpClientEngineFactory;", "getFactory", "()Lio/ktor/client/engine/HttpClientEngineFactory;", "factory", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HttpClientEngineContainer {
    HttpClientEngineFactory<?> getFactory();
}
