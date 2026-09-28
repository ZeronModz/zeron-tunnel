package defpackage;

import java.util.Comparator;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class tn0 extends sn0 implements SortedMap {
    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return ((SortedMap) this.a).comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return ((SortedMap) this.a).firstKey();
    }

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return new tn0(((SortedMap) this.a).headMap(obj), this.b);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return ((SortedMap) this.a).lastKey();
    }

    @Override // java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return new tn0(((SortedMap) this.a).subMap(obj, obj2), this.b);
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return new tn0(((SortedMap) this.a).tailMap(obj), this.b);
    }
}
