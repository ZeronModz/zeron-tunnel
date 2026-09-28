package defpackage;

import com.google.common.collect.o3;
import com.google.common.collect.x0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class nn0 extends x0 implements NavigableMap {
    public transient o3 a;
    public transient ln0 b;
    public transient qn0 c;

    public abstract Iterator a();

    public abstract NavigableMap b();

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return ((a1) b()).floorEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((a1) b()).floorKey(obj);
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        o3 o3Var = this.a;
        if (o3Var != null) {
            return o3Var;
        }
        Comparator comparator = b().comparator();
        if (comparator == null) {
            comparator = o3.natural();
        }
        o3 o3VarReverse = o3.from(comparator).reverse();
        this.a = o3VarReverse;
        return o3VarReverse;
    }

    @Override // defpackage.e90
    public final Object delegate() {
        return b();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        a1 a1Var = (a1) b();
        a1Var.getClass();
        return new qn0(a1Var);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return b();
    }

    @Override // com.google.common.collect.x0, java.util.Map
    public final Set entrySet() {
        ln0 ln0Var = this.b;
        if (ln0Var != null) {
            return ln0Var;
        }
        ln0 ln0Var2 = new ln0(1, this);
        this.b = ln0Var2;
        return ln0Var2;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        return ((a1) b()).lastEntry();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return ((a1) b()).lastKey();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return ((a1) b()).ceilingEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((a1) b()).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return b().tailMap(obj, z).descendingMap();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return ((a1) b()).lowerEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((a1) b()).lowerKey(obj);
    }

    @Override // com.google.common.collect.x0, java.util.Map
    public final Set keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        return ((a1) b()).firstEntry();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return ((a1) b()).firstKey();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return ((a1) b()).higherEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((a1) b()).higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        qn0 qn0Var = this.c;
        if (qn0Var != null) {
            return qn0Var;
        }
        qn0 qn0Var2 = new qn0(this);
        this.c = qn0Var2;
        return qn0Var2;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return ((a1) b()).pollLastEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return ((a1) b()).pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return b().subMap(obj2, z2, obj, z).descendingMap();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return b().headMap(obj, z).descendingMap();
    }

    @Override // defpackage.e90
    public final String toString() {
        return standardToString();
    }

    @Override // com.google.common.collect.x0, java.util.Map, com.google.common.collect.BiMap
    public final Collection values() {
        return new q1(this);
    }

    @Override // com.google.common.collect.x0, defpackage.e90
    public final Map delegate() {
        return b();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
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
