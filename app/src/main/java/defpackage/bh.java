package defpackage;

import com.google.common.cache.AbstractCache$StatsCounter;
import com.google.common.cache.CacheStats;
import com.google.common.cache.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class bh implements AbstractCache$StatsCounter {
    @Override // com.google.common.cache.AbstractCache$StatsCounter
    public final CacheStats snapshot() {
        return a.p;
    }

    @Override // com.google.common.cache.AbstractCache$StatsCounter
    public final void recordEviction() {
    }

    @Override // com.google.common.cache.AbstractCache$StatsCounter
    public final void recordHits(int i) {
    }

    @Override // com.google.common.cache.AbstractCache$StatsCounter
    public final void recordLoadException(long j) {
    }

    @Override // com.google.common.cache.AbstractCache$StatsCounter
    public final void recordLoadSuccess(long j) {
    }

    @Override // com.google.common.cache.AbstractCache$StatsCounter
    public final void recordMisses(int i) {
    }
}
