package coil3.memory;

import coil3.Image;
import coil3.memory.MemoryCache;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcoil3/memory/EmptyWeakMemoryCache;", "Lcoil3/memory/WeakMemoryCache;", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EmptyWeakMemoryCache implements WeakMemoryCache {
    @Override // coil3.memory.WeakMemoryCache
    public final MemoryCache.Value get(MemoryCache.Key key) {
        return null;
    }

    @Override // coil3.memory.WeakMemoryCache
    public final Set getKeys() {
        return EmptySet.INSTANCE;
    }

    @Override // coil3.memory.WeakMemoryCache
    public final boolean remove(MemoryCache.Key key) {
        return false;
    }

    @Override // coil3.memory.WeakMemoryCache
    public final void clear() {
    }

    @Override // coil3.memory.WeakMemoryCache
    public final void set(MemoryCache.Key key, Image image, Map map, long j) {
    }
}
