package io.ktor.util;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.dn0;
import defpackage.gw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003BG\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\b\u0006\u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\b\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/util/DelegatingMutableSet;", "From", "To", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "delegate", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "convertTo", "convert", "<init>", "(Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DelegatingMutableSet<From, To> implements Set<To>, KMutableSet {
    public final Set a;
    public final Function1 b;
    public final Function1 c;
    public final int d;

    public DelegatingMutableSet(Set<From> set, Function1<? super From, ? extends To> function1, Function1<? super To, ? extends From> function12) {
        set.getClass();
        function1.getClass();
        function12.getClass();
        this.a = set;
        this.b = function1;
        this.c = function12;
        this.d = set.size();
    }

    public final ArrayList a(Collection collection) {
        ArrayList arrayList = new ArrayList(kotlin.collections.c.l(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.c.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.a.add(this.c.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        return this.a.addAll(a(collection));
    }

    public final ArrayList b(Collection collection) {
        ArrayList arrayList = new ArrayList(kotlin.collections.c.l(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.b.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(this.c.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.a.containsAll(a(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Set)) {
            return false;
        }
        ArrayList arrayListB = b(this.a);
        return ((Set) obj).containsAll(arrayListB) && arrayListB.containsAll((Collection) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new gw(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.remove(this.c.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        return this.a.removeAll(kotlin.collections.c.U(a(collection)));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.a.retainAll(kotlin.collections.c.U(a(collection)));
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return dn0.I(this, objArr);
    }

    public final String toString() {
        return b(this.a).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return dn0.H(this);
    }
}
