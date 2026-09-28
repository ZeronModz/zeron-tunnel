package defpackage;

import com.google.common.collect.o0;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class w80 extends e90 implements Iterator {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return ((o0) this).b.hasNext();
    }

    public Object next() {
        return ((o0) this).b.next();
    }
}
