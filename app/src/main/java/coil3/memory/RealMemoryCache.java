package coil3.memory;

import coil3.memory.MemoryCache;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.h;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcoil3/memory/RealMemoryCache;", "Lcoil3/memory/MemoryCache;", "Lcoil3/memory/StrongMemoryCache;", "strongMemoryCache", "Lcoil3/memory/WeakMemoryCache;", "weakMemoryCache", "<init>", "(Lcoil3/memory/StrongMemoryCache;Lcoil3/memory/WeakMemoryCache;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RealMemoryCache implements MemoryCache {
    public final StrongMemoryCache a;
    public final WeakMemoryCache b;
    public final Object c = new Object();

    public RealMemoryCache(StrongMemoryCache strongMemoryCache, WeakMemoryCache weakMemoryCache) {
        this.a = strongMemoryCache;
        this.b = weakMemoryCache;
    }

    @Override // coil3.memory.MemoryCache
    public final void clear() {
        synchronized (this.c) {
            this.a.clear();
            this.b.clear();
        }
    }

    @Override // coil3.memory.MemoryCache
    public final MemoryCache.Value get(MemoryCache.Key key) {
        MemoryCache.Value value;
        synchronized (this.c) {
            try {
                value = this.a.get(key);
                if (value == null) {
                    value = this.b.get(key);
                }
                if (value != null && !value.a.getE()) {
                    remove(key);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return value;
    }

    @Override // coil3.memory.MemoryCache
    public final Set getKeys() {
        LinkedHashSet linkedHashSetA;
        synchronized (this.c) {
            linkedHashSetA = h.a(this.a.getKeys(), this.b.getKeys());
        }
        return linkedHashSetA;
    }

    @Override // coil3.memory.MemoryCache
    public final long getMaxSize() {
        long maxSize;
        synchronized (this.c) {
            maxSize = this.a.getMaxSize();
        }
        return maxSize;
    }

    @Override // coil3.memory.MemoryCache
    public final long getSize() {
        long size;
        synchronized (this.c) {
            size = this.a.getSize();
        }
        return size;
    }

    @Override // coil3.memory.MemoryCache
    public final boolean remove(MemoryCache.Key key) {
        boolean z;
        synchronized (this.c) {
            z = this.a.remove(key) || this.b.remove(key);
        }
        return z;
    }

    @Override // coil3.memory.MemoryCache
    public final void set(MemoryCache.Key key, MemoryCache.Value value) {
        synchronized (this.c) {
            long d = value.a.getD();
            if (d < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + d).toString());
            }
            this.a.set(key, value.a, value.b, d);
        }
    }

    @Override // coil3.memory.MemoryCache
    public final void trimToSize(long j) {
        synchronized (this.c) {
            this.a.trimToSize(j);
        }
    }
}
