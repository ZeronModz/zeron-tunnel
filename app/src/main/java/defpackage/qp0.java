package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.MergingSequence;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class qp0 implements Iterator, KMappedMarker {
    public final Iterator a;
    public final Iterator b;
    public final /* synthetic */ MergingSequence c;

    public qp0(MergingSequence mergingSequence) {
        this.c = mergingSequence;
        this.a = mergingSequence.a.iterator();
        this.b = mergingSequence.b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() && this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.c.c.invoke(this.a.next(), this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
