package defpackage;

import com.google.common.base.Function;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class sn0 extends pn0 {
    public final Map a;
    public final rb0 b;

    public sn0(Map map, rb0 rb0Var) {
        map.getClass();
        this.a = map;
        this.b = rb0Var;
    }

    @Override // defpackage.pn0
    public final Iterator a() {
        return new nh0(this.a.entrySet().iterator(), new nx2(this.b, 9));
    }

    @Override // defpackage.pn0, java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map map = this.a;
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return ((Function) this.b.b).apply(obj2);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.a.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map map = this.a;
        if (!map.containsKey(obj)) {
            return null;
        }
        return ((Function) this.b.b).apply(map.remove(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new q1(this);
    }
}
