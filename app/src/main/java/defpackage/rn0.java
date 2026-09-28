package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class rn0 extends qk0 implements SortedSet {
    @Override // defpackage.qk0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SortedMap a() {
        return (SortedMap) ((Map) this.c);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new rn0(a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new rn0(a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new rn0(a().tailMap(obj));
    }
}
