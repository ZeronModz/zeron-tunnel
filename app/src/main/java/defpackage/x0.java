package defpackage;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x0 extends AbstractMap implements Map, KMutableMap {
    public abstract Set a();

    public abstract /* bridge */ Set b();

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set entrySet() {
        return a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set keySet() {
        return b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return m8.a.getIntVolatile((ConcurrentWeakMap) this, ConcurrentWeakMap.d);
    }
}
