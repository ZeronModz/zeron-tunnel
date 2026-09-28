package defpackage;

import androidx.collection.ArrayMap;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class d8 implements Collection {
    public final /* synthetic */ ArrayMap a;

    public d8(ArrayMap arrayMap) {
        this.a = arrayMap;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a8(this.a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        ArrayMap arrayMap = this.a;
        int iA = arrayMap.a(obj);
        if (iA < 0) {
            return false;
        }
        arrayMap.g(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        ArrayMap arrayMap = this.a;
        int i = arrayMap.c;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(arrayMap.i(i2))) {
                arrayMap.g(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        ArrayMap arrayMap = this.a;
        int i = arrayMap.c;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(arrayMap.i(i2))) {
                arrayMap.g(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        ArrayMap arrayMap = this.a;
        int i = arrayMap.c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = arrayMap.i(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        ArrayMap arrayMap = this.a;
        int i = arrayMap.c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = arrayMap.i(i2);
        }
        return objArr;
    }
}
