package io.ktor.util;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.dn0;
import defpackage.gw;
import defpackage.yg0;
import io.ktor.utils.io.InternalAPI;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004B\u0017\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/util/CaseInsensitiveSet;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "initial", "(Ljava/lang/Iterable;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CaseInsensitiveSet implements Set<String>, KMutableSet {
    public final CaseInsensitiveMap a;

    public CaseInsensitiveSet() {
        this.a = new CaseInsensitiveMap();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        String str = (String) obj;
        str.getClass();
        CaseInsensitiveMap caseInsensitiveMap = this.a;
        if (caseInsensitiveMap.containsKey(str)) {
            return false;
        }
        caseInsensitiveMap.put(str, Boolean.TRUE);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            str.getClass();
            CaseInsensitiveMap caseInsensitiveMap = this.a;
            if (!caseInsensitiveMap.containsKey(str)) {
                caseInsensitiveMap.put(str, Boolean.TRUE);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.a.containsKey((String) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return ((DelegatingMutableSet) this.a.keySet()).containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new gw((DelegatingMutableSet) this.a.keySet());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return yg0.a(this.a.remove((String) obj), Boolean.TRUE);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        return ((DelegatingMutableSet) this.a.keySet()).removeAll(kotlin.collections.c.U(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return ((DelegatingMutableSet) this.a.keySet()).retainAll(kotlin.collections.c.U(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return dn0.I(this, objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return dn0.H(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaseInsensitiveSet(Iterable<String> iterable) {
        this();
        iterable.getClass();
        kotlin.collections.c.i(this, iterable);
    }
}
