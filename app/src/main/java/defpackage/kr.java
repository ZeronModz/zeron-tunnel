package defpackage;

import com.google.common.collect.g4;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class kr implements Iterator {
    public final /* synthetic */ int a = 1;
    public final Iterator b;
    public final /* synthetic */ Object c;

    public kr(lr lrVar) {
        this.c = lrVar;
        this.b = lrVar.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                return ((lr) this.c).b.convert(it.next());
            default:
                return new as0((Map.Entry) it.next(), 2);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                it.remove();
                break;
            default:
                it.remove();
                ((g4) this.c).c();
                break;
        }
    }

    public kr(g4 g4Var, Iterator it) {
        this.c = g4Var;
        this.b = it;
    }
}
