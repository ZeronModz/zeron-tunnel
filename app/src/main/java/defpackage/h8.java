package defpackage;

import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h8 extends pn0 {
    public final ImmutableMap a;

    public h8(ImmutableMap immutableMap) {
        this.a = immutableMap;
    }

    @Override // defpackage.pn0
    public final Iterator a() {
        return new f8(this, this.a.size(), 1);
    }

    public abstract String b();

    public abstract Object c(int i);

    @Override // defpackage.pn0, java.util.AbstractMap, java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    public abstract Object d(int i, Object obj);

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Integer num = (Integer) this.a.get(obj);
        if (num == null) {
            return null;
        }
        return c(num.intValue());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.a.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        ImmutableMap immutableMap = this.a;
        Integer num = (Integer) immutableMap.get(obj);
        if (num != null) {
            return d(num.intValue(), obj2);
        }
        StringBuilder sb = new StringBuilder(b());
        sb.append(" ");
        sb.append(obj);
        zg1.o(sb, " not in ", immutableMap.keySet());
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }
}
