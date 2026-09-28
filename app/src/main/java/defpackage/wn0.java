package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class wn0 extends AbstractMap {
    public transient Set a;
    public transient Set b;
    public transient Collection c;

    public abstract Set a();

    public Set b() {
        return new qk0(this);
    }

    public Collection c() {
        return new q1(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.a = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set setB = b();
        this.b = setB;
        return setB;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.c;
        if (collection != null) {
            return collection;
        }
        Collection collectionC = c();
        this.c = collectionC;
        return collectionC;
    }
}
