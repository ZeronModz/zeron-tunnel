package coil3.util;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.u7;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcoil3/util/LruCache;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "K", "V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "maxSize", "<init>", "(J)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class LruCache<K, V> {
    public final long a;
    public final LinkedHashMap b = new LinkedHashMap(0, 0.75f, true);
    public long c;

    public LruCache(long j) {
        this.a = j;
        if (j > 0) {
            return;
        }
        u7.r("maxSize <= 0");
        throw null;
    }

    public final long b() {
        long j = this.c;
        if (j != -1) {
            return j;
        }
        Iterator<T> it = this.b.entrySet().iterator();
        long jC = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            jC += c(entry.getKey(), entry.getValue());
        }
        this.c = jC;
        return jC;
    }

    public final long c(Object obj, Object obj2) throws Exception {
        try {
            long jD = d(obj, obj2);
            if (jD >= 0) {
                return jD;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + jD).toString());
        } catch (Exception e) {
            this.c = -1L;
            throw e;
        }
    }

    public long d(Object obj, Object obj2) {
        return 1L;
    }

    public final void e(long j) {
        while (b() > j) {
            LinkedHashMap linkedHashMap = this.b;
            if (linkedHashMap.isEmpty()) {
                if (b() == 0) {
                    return;
                }
                u7.p("sizeOf() is returning inconsistent values");
                return;
            } else {
                Map.Entry entry = (Map.Entry) kotlin.collections.c.q(linkedHashMap.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.remove(key);
                this.c = b() - c(key, value);
                a(key, value, null);
            }
        }
    }

    public void a(Object obj, Object obj2, Object obj3) {
    }
}
