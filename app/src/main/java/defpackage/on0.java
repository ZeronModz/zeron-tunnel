package defpackage;

import com.google.common.collect.Multiset;
import com.google.common.collect.s1;
import com.google.common.collect.y2;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class on0 extends f71 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ on0(int i) {
        super(0);
        this.b = i;
    }

    public abstract Map a();

    public abstract Multiset b();

    @Override // defpackage.f71, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.b) {
            case 0:
                a().clear();
                break;
            default:
                b().clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object objE = y2.e(key, a());
                    if (cn0.y(objE, entry.getValue()) && (objE != null || a().containsKey(key))) {
                        return true;
                    }
                }
                return false;
            default:
                return b().contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.b) {
            case 1:
                return b().containsAll(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.b) {
            case 0:
                return a().isEmpty();
            default:
                return b().isEmpty();
        }
    }

    @Override // defpackage.f71, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.b) {
            case 0:
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    return a().keySet().remove(((Map.Entry) obj).getKey());
                }
                return false;
            default:
                return b().remove(obj, Integer.MAX_VALUE) > 0;
        }
    }

    @Override // defpackage.f71, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.b) {
            case 0:
                try {
                    collection.getClass();
                    return s1.n(this, collection);
                } catch (UnsupportedOperationException unused) {
                    return s1.o(this, collection.iterator());
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // defpackage.f71, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.b) {
            case 0:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet(y2.a(collection.size()));
                    for (Object obj : collection) {
                        if (this.contains(obj) && (obj instanceof Map.Entry)) {
                            hashSet.add(((Map.Entry) obj).getKey());
                        }
                    }
                    return this.a().keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.b) {
            case 0:
                return a().size();
            default:
                return b().entrySet().size();
        }
    }
}
