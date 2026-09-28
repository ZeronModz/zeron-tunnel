package coil3.memory;

import coil3.Image;
import coil3.memory.MemoryCache;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcoil3/memory/RealWeakMemoryCache;", "Lcoil3/memory/WeakMemoryCache;", "<init>", "()V", "InternalValue", "Companion", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RealWeakMemoryCache implements WeakMemoryCache {
    public final LinkedHashMap a = new LinkedHashMap();
    public int b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/memory/RealWeakMemoryCache$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "CLEAN_UP_INTERVAL", "I", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcoil3/memory/RealWeakMemoryCache$InternalValue;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Ljava/lang/ref/WeakReference;", "Lcoil3/Image;", "Lcoil3/util/WeakReference;", "image", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "extras", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "size", "<init>", "(Ljava/lang/ref/WeakReference;Ljava/util/Map;J)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InternalValue {
        public final WeakReference a;
        public final Map b;
        public final long c;

        public InternalValue(WeakReference<Image> weakReference, Map<String, ? extends Object> map, long j) {
            this.a = weakReference;
            this.b = map;
            this.c = j;
        }
    }

    static {
        new Companion(null);
    }

    public final void a() {
        WeakReference weakReference;
        int i = this.b;
        this.b = i + 1;
        if (i >= 10) {
            this.b = 0;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    InternalValue internalValue = (InternalValue) c.s(arrayList);
                    if (((internalValue == null || (weakReference = internalValue.a) == null) ? null : (Image) weakReference.get()) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((InternalValue) arrayList.get(i4)).a.get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    @Override // coil3.memory.WeakMemoryCache
    public final void clear() {
        this.b = 0;
        this.a.clear();
    }

    @Override // coil3.memory.WeakMemoryCache
    public final MemoryCache.Value get(MemoryCache.Key key) {
        ArrayList arrayList = (ArrayList) this.a.get(key);
        MemoryCache.Value value = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            InternalValue internalValue = (InternalValue) arrayList.get(i);
            Image image = (Image) internalValue.a.get();
            MemoryCache.Value value2 = image != null ? new MemoryCache.Value(image, internalValue.b) : null;
            if (value2 != null) {
                value = value2;
                break;
            }
            i++;
        }
        a();
        return value;
    }

    @Override // coil3.memory.WeakMemoryCache
    public final Set getKeys() {
        return c.U(this.a.keySet());
    }

    @Override // coil3.memory.WeakMemoryCache
    public final boolean remove(MemoryCache.Key key) {
        return this.a.remove(key) != null;
    }

    @Override // coil3.memory.WeakMemoryCache
    public final void set(MemoryCache.Key key, Image image, Map map, long j) {
        LinkedHashMap linkedHashMap = this.a;
        Object arrayList = linkedHashMap.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(key, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        InternalValue internalValue = new InternalValue(new WeakReference(image), map, j);
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                InternalValue internalValue2 = (InternalValue) arrayList2.get(i);
                if (j < internalValue2.c) {
                    i++;
                } else if (internalValue2.a.get() == image) {
                    arrayList2.set(i, internalValue);
                } else {
                    arrayList2.add(i, internalValue);
                }
            }
        } else {
            arrayList2.add(internalValue);
        }
        a();
    }
}
