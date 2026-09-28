package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class w81 implements Iterator {
    public int a;
    public Iterator b;
    public final /* synthetic */ v81 c;

    public w81(v81 v81Var) {
        this.c = v81Var;
        this.a = v81Var.a.size();
    }

    public final Iterator a() {
        Iterator it = this.b;
        if (it != null) {
            return it;
        }
        Iterator it2 = this.c.e.entrySet().iterator();
        this.b = it2;
        return it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        return (i > 0 && i <= this.c.a.size()) || a().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (a().hasNext()) {
            return (Map.Entry) a().next();
        }
        List list = this.c.a;
        int i = this.a - 1;
        this.a = i;
        return (Map.Entry) list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
