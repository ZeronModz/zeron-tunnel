package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class kh0 extends v70 {
    public final /* synthetic */ Collection b;
    public final /* synthetic */ int c;

    public kh0(Collection collection, int i) {
        this.b = collection;
        this.c = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Collection collection = this.b;
        boolean z = collection instanceof List;
        int i = this.c;
        if (z) {
            List list = (List) collection;
            return list.subList(Math.min(list.size(), i), list.size()).iterator();
        }
        Iterator it = collection.iterator();
        it.getClass();
        cn0.f(i >= 0, "numberToAdvance must be nonnegative");
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            it.next();
        }
        return new jh0(it);
    }
}
