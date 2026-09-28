package defpackage;

import com.google.common.collect.s1;
import com.google.common.collect.y2;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a1 extends pn0 implements NavigableMap {
    public abstract Iterator b();

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return y2.c(ceilingEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return new z0(this).navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new z0(this);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Iterator itA = a();
        return (Map.Entry) (itA.hasNext() ? itA.next() : null);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        Map.Entry entryFirstEntry = firstEntry();
        if (entryFirstEntry != null) {
            return entryFirstEntry.getKey();
        }
        p60.m();
        return null;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return y2.c(floorEntry(obj));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return y2.c(higherEntry(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final Set keySet() {
        return new qn0(this);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Iterator itB = b();
        return (Map.Entry) (itB.hasNext() ? itB.next() : null);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        Map.Entry entryLastEntry = lastEntry();
        if (entryLastEntry != null) {
            return entryLastEntry.getKey();
        }
        p60.m();
        return null;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return y2.c(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return new qn0(this);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return (Map.Entry) s1.l(a());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return (Map.Entry) s1.l(b());
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
