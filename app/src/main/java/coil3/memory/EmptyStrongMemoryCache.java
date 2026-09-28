package coil3.memory;

import coil3.Image;
import coil3.memory.MemoryCache;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcoil3/memory/EmptyStrongMemoryCache;", "Lcoil3/memory/StrongMemoryCache;", "Lcoil3/memory/WeakMemoryCache;", "weakMemoryCache", "<init>", "(Lcoil3/memory/WeakMemoryCache;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EmptyStrongMemoryCache implements StrongMemoryCache {
    public final WeakMemoryCache a;

    public EmptyStrongMemoryCache(WeakMemoryCache weakMemoryCache) {
        this.a = weakMemoryCache;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final MemoryCache.Value get(MemoryCache.Key key) {
        return null;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final Set getKeys() {
        return EmptySet.INSTANCE;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final long getMaxSize() {
        return 0L;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final long getSize() {
        return 0L;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final boolean remove(MemoryCache.Key key) {
        return false;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final void set(MemoryCache.Key key, Image image, Map map, long j) {
        this.a.set(key, image, map, j);
    }

    @Override // coil3.memory.StrongMemoryCache
    public final void clear() {
    }

    @Override // coil3.memory.StrongMemoryCache
    public final void trimToSize(long j) {
    }
}
