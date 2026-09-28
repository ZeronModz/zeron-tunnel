package coil3.memory;

import coil3.Image;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ep0;
import defpackage.xg0;
import defpackage.xu;
import defpackage.yg0;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.d;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003\u001c\u001d\u001eJ\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH&¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000f\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, d2 = {"Lcoil3/memory/MemoryCache;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcoil3/memory/MemoryCache$Key;", "key", "Lcoil3/memory/MemoryCache$Value;", "get", "(Lcoil3/memory/MemoryCache$Key;)Lcoil3/memory/MemoryCache$Value;", "value", "Lmk1;", "set", "(Lcoil3/memory/MemoryCache$Key;Lcoil3/memory/MemoryCache$Value;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "remove", "(Lcoil3/memory/MemoryCache$Key;)Z", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "size", "trimToSize", "(J)V", "clear", "()V", "getSize", "()J", "getMaxSize", "maxSize", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "getKeys", "()Ljava/util/Set;", "keys", "Key", "Value", "Builder", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MemoryCache {

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcoil3/memory/MemoryCache$Builder;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public ep0 a;
    }

    void clear();

    Value get(Key key);

    Set<Key> getKeys();

    long getMaxSize();

    long getSize();

    boolean remove(Key key);

    void set(Key key, Value value);

    void trimToSize(long size);

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcoil3/memory/MemoryCache$Key;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "key", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "extras", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Key {
        public final String a;
        public final Map b;

        public Key(String str, Map<String, String> map) {
            this.a = str;
            this.b = xg0.w(map);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return yg0.a(this.a, key.a) && yg0.a(this.b, key.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Key(key=" + this.a + ", extras=" + this.b + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Key(String str) {
            this(str, null, 2, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Key(String str, Map map, int i, xu xuVar) {
            this(str, (i & 2) != 0 ? d.a() : map);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcoil3/memory/MemoryCache$Value;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcoil3/Image;", "image", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "extras", "<init>", "(Lcoil3/Image;Ljava/util/Map;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Value {
        public final Image a;
        public final Map b;

        public Value(Image image, Map<String, ? extends Object> map) {
            this.a = image;
            this.b = xg0.w(map);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return yg0.a(this.a, value.a) && yg0.a(this.b, value.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Value(image=" + this.a + ", extras=" + this.b + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Value(Image image) {
            this(image, null, 2, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Value(Image image, Map map, int i, xu xuVar) {
            this(image, (i & 2) != 0 ? d.a() : map);
        }
    }
}
