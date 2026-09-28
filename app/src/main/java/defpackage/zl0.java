package defpackage;

import com.google.common.cache.v;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zl0 extends AbstractSet {
    public final /* synthetic */ v a;
    public final /* synthetic */ int b;
    public final /* synthetic */ v c;

    public zl0(v vVar, int i) {
        this.b = i;
        this.c = vVar;
        this.a = vVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        int i = this.b;
        v vVar = this.c;
        switch (i) {
            case 0:
                return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = vVar.get(key)) != null && vVar.f.equivalent(entry.getValue(), obj2);
            default:
                return vVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.b;
        v vVar = this.c;
        switch (i) {
            case 0:
                return new yl0(vVar, 0);
            default:
                return new yl0(vVar, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        int i = this.b;
        v vVar = this.c;
        switch (i) {
            case 0:
                if ((obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && vVar.remove(key, entry.getValue())) {
                }
                break;
            default:
                if (vVar.remove(obj) != null) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return v.g(this).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return v.g(this).toArray(objArr);
    }
}
