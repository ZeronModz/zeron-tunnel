package defpackage;

import com.google.android.gms.internal.ads.l6;
import com.google.common.cache.v;
import com.google.common.collect.f0;
import java.util.Objects;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class q1 extends AbstractCollection {
    public final /* synthetic */ int a;
    public final Object b;

    public q1(Map map) {
        this.a = 2;
        map.getClass();
        this.b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((f0) obj).clear();
                break;
            case 1:
                ((v) obj).clear();
                break;
            case 2:
                ((Map) obj).clear();
                break;
            case 3:
                ((s13) obj).zzf();
                break;
            default:
                ((l6) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((f0) obj2).containsValue(obj);
            case 1:
                return ((v) obj2).containsValue(obj);
            case 2:
                return ((Map) obj2).containsValue(obj);
            case 3:
                return ((s13) obj2).zzr(obj);
            default:
                return ((l6) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                return ((v) obj).isEmpty();
            case 2:
                return ((Map) obj).isEmpty();
            case 3:
            default:
                return super.isEmpty();
            case 4:
                return ((l6) obj).isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((f0) obj).valuesIterator();
            case 1:
                return new yl0((v) obj, 2);
            case 2:
                return new jn0(((Map) obj).entrySet().iterator(), 0);
            case 3:
                return ((s13) obj).zzk();
            default:
                return new e23(((l6) obj).entrySet().iterator(), 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 2:
                Map map = (Map) obj2;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (cn0.y(obj, entry.getValue())) {
                            map.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 3:
            default:
                return super.remove(obj);
            case 4:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    l6 l6Var = (l6) obj2;
                    for (Map.Entry entry2 : l6Var.entrySet()) {
                        if (Objects.equals(obj, entry2.getValue())) {
                            l6Var.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                Map map = (Map) obj;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : map.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return map.keySet().removeAll(hashSet);
                }
            case 3:
            default:
                return super.removeAll(collection);
            case 4:
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    l6 l6Var = (l6) obj;
                    for (Map.Entry entry2 : l6Var.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return l6Var.keySet().removeAll(hashSet2);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                Map map = (Map) obj;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : map.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return map.keySet().retainAll(hashSet);
                }
            case 3:
            default:
                return super.retainAll(collection);
            case 4:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    l6 l6Var = (l6) obj;
                    for (Map.Entry entry2 : l6Var.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return l6Var.keySet().retainAll(hashSet2);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((f0) obj).size();
            case 1:
                return ((v) obj).size();
            case 2:
                return ((Map) obj).size();
            case 3:
                return ((s13) obj).zzd();
            default:
                return ((l6) obj).c.size();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        switch (this.a) {
            case 1:
                return v.g(this).toArray();
            default:
                return super.toArray();
        }
    }

    public q1(l6 l6Var) {
        this.a = 4;
        this.b = l6Var;
    }

    public /* synthetic */ q1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        switch (this.a) {
            case 1:
                return v.g(this).toArray(objArr);
            default:
                return super.toArray(objArr);
        }
    }
}
