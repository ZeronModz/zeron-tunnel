package defpackage;

import com.google.common.collect.ImmutableCollection;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class eg0 extends pk1 {
    public pk1 a;
    public pk1 b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b.hasNext()) {
            this.b = ((ImmutableCollection) this.a.next()).iterator();
        }
        return this.b.next();
    }
}
