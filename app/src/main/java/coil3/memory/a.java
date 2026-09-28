package coil3.memory;

import coil3.memory.MemoryCache;
import coil3.memory.RealStrongMemoryCache;
import coil3.util.LruCache;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends LruCache {
    public final /* synthetic */ RealStrongMemoryCache d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j, RealStrongMemoryCache realStrongMemoryCache) {
        super(j);
        this.d = realStrongMemoryCache;
    }

    @Override // coil3.util.LruCache
    public final void a(Object obj, Object obj2, Object obj3) {
        RealStrongMemoryCache.InternalValue internalValue = (RealStrongMemoryCache.InternalValue) obj2;
        this.d.a.set((MemoryCache.Key) obj, internalValue.a, internalValue.b, internalValue.c);
    }

    @Override // coil3.util.LruCache
    public final long d(Object obj, Object obj2) {
        return ((RealStrongMemoryCache.InternalValue) obj2).c;
    }
}
