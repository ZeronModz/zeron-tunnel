package defpackage;

import java.util.Objects;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class mh0 extends pk1 {
    public int a = 0;
    public final /* synthetic */ Iterator[] b;

    public mh0(Iterator[] itArr) {
        this.b = itArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            p60.m();
            return null;
        }
        int i = this.a;
        Iterator[] itArr = this.b;
        Iterator it = itArr[i];
        Objects.requireNonNull(it);
        int i2 = this.a;
        itArr[i2] = null;
        this.a = i2 + 1;
        return it;
    }
}
