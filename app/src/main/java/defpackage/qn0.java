package defpackage;

import com.google.common.collect.y2;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class qn0 extends rn0 implements NavigableSet {
    @Override // defpackage.rn0, defpackage.qk0
    public final Map a() {
        return (NavigableMap) ((Map) this.c);
    }

    @Override // defpackage.rn0
    /* JADX INFO: renamed from: b */
    public final SortedMap a() {
        return (NavigableMap) ((Map) this.c);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((Map) this.c)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return ((NavigableMap) ((Map) this.c)).descendingKeySet();
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((Map) this.c)).floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return ((NavigableMap) ((Map) this.c)).headMap(obj, z).navigableKeySet();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((Map) this.c)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((Map) this.c)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return y2.c(((NavigableMap) ((Map) this.c)).pollFirstEntry());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return y2.c(((NavigableMap) ((Map) this.c)).pollLastEntry());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return ((NavigableMap) ((Map) this.c)).subMap(obj, z, obj2, z2).navigableKeySet();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return ((NavigableMap) ((Map) this.c)).tailMap(obj, z).navigableKeySet();
    }

    @Override // defpackage.rn0, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // defpackage.rn0, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // defpackage.rn0, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
