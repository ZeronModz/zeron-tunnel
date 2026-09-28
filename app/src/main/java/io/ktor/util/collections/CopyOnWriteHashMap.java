package io.ktor.util.collections;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.m8;
import defpackage.z3;
import io.ktor.utils.io.InternalAPI;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.d;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/util/collections/CopyOnWriteHashMap;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "K", "V", "<init>", "()V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CopyOnWriteHashMap<K, V> {
    public static final /* synthetic */ long a = m8.a.objectFieldOffset(CopyOnWriteHashMap.class.getDeclaredField("current"));
    private volatile /* synthetic */ Object current = d.a();

    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(Object obj, z3 z3Var) {
        CopyOnWriteHashMap<K, V> copyOnWriteHashMap;
        while (true) {
            Map map = (Map) this.current;
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            HashMap map2 = new HashMap(map);
            Object objInvoke = z3Var.invoke(obj);
            map2.put(obj, objInvoke);
            while (true) {
                Unsafe unsafe = m8.a;
                long j = a;
                copyOnWriteHashMap = this;
                if (unsafe.compareAndSwapObject(copyOnWriteHashMap, j, map, map2)) {
                    return objInvoke;
                }
                if (unsafe.getObjectVolatile(copyOnWriteHashMap, j) != map) {
                    break;
                }
                this = copyOnWriteHashMap;
            }
            this = copyOnWriteHashMap;
        }
    }

    public final Object b(Object obj) {
        return ((Map) this.current).get(obj);
    }
}
