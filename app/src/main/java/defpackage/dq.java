package defpackage;

import com.google.common.collect.MutableClassToInstanceMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class dq extends f90 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.common.collect.w0, java.util.Collection, java.util.Queue
    public boolean add(Object obj) {
        switch (this.a) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                return super.add(obj);
        }
    }

    @Override // com.google.common.collect.w0, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.a) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // com.google.common.collect.w0, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                return obj != null && mu.q((Set) this.b, obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // com.google.common.collect.w0, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                return standardContainsAll(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // defpackage.f90, com.google.common.collect.w0, defpackage.e90
    public final Set delegate() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (Set) obj;
            case 1:
                return (Set) obj;
            case 2:
                return (Set) obj;
            default:
                return ((MutableClassToInstanceMap) obj).delegate().entrySet();
        }
    }

    @Override // com.google.common.collect.w0, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public Iterator iterator() {
        switch (this.a) {
            case 2:
                return new nh0(super.iterator(), new io0(8));
            case 3:
                return new jn0(delegate().iterator(), 1);
            default:
                return super.iterator();
        }
    }

    @Override // com.google.common.collect.w0, java.util.Collection, com.google.common.collect.Multiset
    public boolean remove(Object obj) {
        boolean zRemove;
        switch (this.a) {
            case 0:
                if (obj == null) {
                    return false;
                }
                Set set = (Set) this.b;
                set.getClass();
                try {
                    zRemove = set.remove(obj);
                    break;
                } catch (ClassCastException | NullPointerException unused) {
                    zRemove = false;
                }
                return zRemove;
            default:
                return super.remove(obj);
        }
    }

    @Override // com.google.common.collect.w0, java.util.Collection, com.google.common.collect.Multiset
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                return standardRemoveAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // com.google.common.collect.w0, java.util.Collection
    public Object[] toArray() {
        switch (this.a) {
            case 2:
                return standardToArray();
            case 3:
                return standardToArray();
            default:
                return super.toArray();
        }
    }

    @Override // com.google.common.collect.w0, java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        switch (this.a) {
            case 2:
                return standardToArray(objArr);
            case 3:
                return standardToArray(objArr);
            default:
                return super.toArray(objArr);
        }
    }

    @Override // defpackage.f90, defpackage.e90
    public Object delegate() {
        switch (this.a) {
            case 0:
                return (Set) this.b;
            case 1:
                return (Set) this.b;
            case 2:
                return (Set) this.b;
            default:
                return super.delegate();
        }
    }

    @Override // defpackage.f90, com.google.common.collect.w0, defpackage.e90
    public Collection delegate() {
        switch (this.a) {
            case 0:
                return (Set) this.b;
            case 1:
                return (Set) this.b;
            case 2:
                return (Set) this.b;
            default:
                return super.delegate();
        }
    }
}
