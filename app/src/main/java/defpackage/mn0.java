package defpackage;

import com.google.common.base.Function;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class mn0 extends wn0 {
    public final Set d;
    public final Function e;

    public mn0(Set set, Function function) {
        set.getClass();
        this.d = set;
        this.e = function;
    }

    @Override // defpackage.wn0
    public final Set a() {
        return new ln0(0, this);
    }

    @Override // defpackage.wn0
    public final Set b() {
        return new dq(this.d, 1);
    }

    @Override // defpackage.wn0
    public final Collection c() {
        return new ko(this.d, this.e);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.d.contains(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (mu.q(this.d, obj)) {
            return this.e.apply(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (this.d.remove(obj)) {
            return this.e.apply(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d.size();
    }
}
