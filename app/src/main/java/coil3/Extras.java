package coil3;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xg0;
import defpackage.xu;
import defpackage.yg0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/Extras;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Key", "Builder", "Companion", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Extras {
    public static final Extras b;
    public final Map a;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/Extras$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcoil3/Extras;", "EMPTY", "Lcoil3/Extras;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcoil3/Extras$Key;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "default", "<init>", "(Ljava/lang/Object;)V", "Companion", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Key<T> {
        public static final /* synthetic */ int b = 0;
        public final Object a;

        /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/Extras$Key$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public Companion(xu xuVar) {
            }
        }

        static {
            new Companion(null);
        }

        public Key(T t) {
            this.a = t;
        }
    }

    static {
        new Companion(null);
        b = new Builder().a();
    }

    public Extras(Map map, xu xuVar) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Extras) && yg0.a(this.a, ((Extras) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Extras(data=" + this.a + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B!\b\u0016\u0012\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcoil3/Extras$Builder;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcoil3/Extras$Key;", "map", "(Ljava/util/Map;)V", "Lcoil3/Extras;", "extras", "(Lcoil3/Extras;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public final LinkedHashMap a;

        public Builder(Extras extras) {
            this.a = kotlin.collections.d.k(extras.a);
        }

        public final Extras a() {
            return new Extras(xg0.w(this.a), null);
        }

        public final void b(Key key, Object obj) {
            LinkedHashMap linkedHashMap = this.a;
            if (obj != null) {
                linkedHashMap.put(key, obj);
            } else {
                linkedHashMap.remove(key);
            }
        }

        public Builder(Map<Key<?>, ? extends Object> map) {
            this.a = kotlin.collections.d.k(map);
        }

        public Builder() {
            this.a = new LinkedHashMap();
        }
    }
}
