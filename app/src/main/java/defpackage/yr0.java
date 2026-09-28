package defpackage;

import com.google.common.collect.y;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class yr0 extends wn0 {
    public final y d;

    public yr0(y yVar) {
        this.d = yVar;
    }

    @Override // defpackage.wn0
    public final Set a() {
        return new ln0(3, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        y yVar = this.d;
        if (yVar.containsKey(obj)) {
            return yVar.get(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // defpackage.wn0, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.d.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        y yVar = this.d;
        if (yVar.containsKey(obj)) {
            return yVar.removeAll(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d.keySet().size();
    }
}
