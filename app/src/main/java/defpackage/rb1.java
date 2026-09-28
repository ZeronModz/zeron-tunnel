package defpackage;

import java.util.Iterator;
import kotlin.collections.c;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;
import kotlin.sequences.SubSequence;
import kotlin.sequences.TransformingIndexedSequence;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class rb1 implements Iterator, KMappedMarker {
    public final /* synthetic */ int a = 0;
    public final Iterator b;
    public int c;
    public final /* synthetic */ Sequence d;

    public rb1(TransformingIndexedSequence transformingIndexedSequence) {
        this.d = transformingIndexedSequence;
        this.b = transformingIndexedSequence.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                SubSequence subSequence = (SubSequence) this.d;
                while (this.c < subSequence.b && it.hasNext()) {
                    it.next();
                    this.c++;
                }
                return this.c < subSequence.c && it.hasNext();
            default:
                return it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterator it = this.b;
        Sequence sequence = this.d;
        switch (i) {
            case 0:
                SubSequence subSequence = (SubSequence) sequence;
                while (this.c < subSequence.b && it.hasNext()) {
                    it.next();
                    this.c++;
                }
                int i2 = this.c;
                if (i2 < subSequence.c) {
                    this.c = i2 + 1;
                    return it.next();
                }
                p60.m();
                return null;
            default:
                Function2 function2 = ((TransformingIndexedSequence) sequence).b;
                int i3 = this.c;
                this.c = i3 + 1;
                if (i3 >= 0) {
                    return function2.invoke(Integer.valueOf(i3), it.next());
                }
                c.O();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public rb1(SubSequence subSequence) {
        this.d = subSequence;
        this.b = subSequence.a.iterator();
    }
}
