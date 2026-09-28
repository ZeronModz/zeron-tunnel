package coil3.memory;

import coil3.Image;
import coil3.memory.MemoryCache;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcoil3/memory/RealStrongMemoryCache;", "Lcoil3/memory/StrongMemoryCache;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "maxSize", "Lcoil3/memory/WeakMemoryCache;", "weakMemoryCache", "<init>", "(JLcoil3/memory/WeakMemoryCache;)V", "InternalValue", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RealStrongMemoryCache implements StrongMemoryCache {
    public final WeakMemoryCache a;
    public final a b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcoil3/memory/RealStrongMemoryCache$InternalValue;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcoil3/Image;", "image", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "extras", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "size", "<init>", "(Lcoil3/Image;Ljava/util/Map;J)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InternalValue {
        public final Image a;
        public final Map b;
        public final long c;

        public InternalValue(Image image, Map<String, ? extends Object> map, long j) {
            this.a = image;
            this.b = map;
            this.c = j;
        }
    }

    public RealStrongMemoryCache(long j, WeakMemoryCache weakMemoryCache) {
        this.a = weakMemoryCache;
        this.b = new a(j, this);
    }

    @Override // coil3.memory.StrongMemoryCache
    public final void clear() {
        this.b.e(-1L);
    }

    @Override // coil3.memory.StrongMemoryCache
    public final MemoryCache.Value get(MemoryCache.Key key) {
        InternalValue internalValue = (InternalValue) this.b.b.get(key);
        if (internalValue != null) {
            return new MemoryCache.Value(internalValue.a, internalValue.b);
        }
        return null;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final Set getKeys() {
        return c.U(this.b.b.keySet());
    }

    @Override // coil3.memory.StrongMemoryCache
    public final long getMaxSize() {
        return this.b.a;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final long getSize() {
        return this.b.b();
    }

    @Override // coil3.memory.StrongMemoryCache
    public final boolean remove(MemoryCache.Key key) {
        a aVar = this.b;
        Object objRemove = aVar.b.remove(key);
        if (objRemove != null) {
            aVar.c = aVar.b() - aVar.c(key, objRemove);
            aVar.a(key, objRemove, null);
        }
        return objRemove != null;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final void set(MemoryCache.Key key, Image image, Map map, long j) {
        a aVar = this.b;
        long j2 = aVar.a;
        LinkedHashMap linkedHashMap = aVar.b;
        if (j > j2) {
            Object objRemove = linkedHashMap.remove(key);
            if (objRemove != null) {
                aVar.c = aVar.b() - aVar.c(key, objRemove);
                aVar.a(key, objRemove, null);
            }
            this.a.set(key, image, map, j);
            return;
        }
        InternalValue internalValue = new InternalValue(image, map, j);
        Object objPut = linkedHashMap.put(key, internalValue);
        aVar.c = aVar.c(key, internalValue) + aVar.b();
        if (objPut != null) {
            aVar.c = aVar.b() - aVar.c(key, objPut);
            aVar.a(key, objPut, internalValue);
        }
        aVar.e(aVar.a);
    }

    @Override // coil3.memory.StrongMemoryCache
    public final void trimToSize(long j) {
        this.b.e(j);
    }
}
