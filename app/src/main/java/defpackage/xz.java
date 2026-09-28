package defpackage;

import java.util.Iterator;
import kotlin.collections.IndexedValue;
import kotlin.collections.c;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.DropSequence;
import kotlin.sequences.IndexingSequence;
import kotlin.sequences.TakeSequence;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class xz implements Iterator, KMappedMarker {
    public final /* synthetic */ int a = 0;
    public final Iterator b;
    public int c;

    public xz(TakeSequence takeSequence) {
        this.c = takeSequence.b;
        this.b = takeSequence.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                return it.hasNext();
            default:
                return this.c > 0 && it.hasNext();
        }
        while (this.c > 0 && it.hasNext()) {
            it.next();
            this.c--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                int i2 = this.c;
                this.c = i2 + 1;
                if (i2 >= 0) {
                    return new IndexedValue(i2, it.next());
                }
                c.O();
                throw null;
            default:
                int i3 = this.c;
                if (i3 != 0) {
                    this.c = i3 - 1;
                    return it.next();
                }
                p60.m();
                return null;
        }
        while (this.c > 0 && it.hasNext()) {
            it.next();
            this.c--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public xz(IndexingSequence indexingSequence) {
        this.b = indexingSequence.a.iterator();
    }

    public xz(DropSequence dropSequence) {
        this.b = dropSequence.a.iterator();
        this.c = dropSequence.b;
    }
}
