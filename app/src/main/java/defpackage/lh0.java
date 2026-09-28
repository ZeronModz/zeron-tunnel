package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class lh0 extends pk1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Iterator b;

    public /* synthetic */ lh0(Iterator it, int i) {
        this.a = i;
        this.b = it;
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
                return it.next();
            default:
                Map.Entry entry = (Map.Entry) it.next();
                entry.getClass();
                return new kn0(entry);
        }
    }
}
