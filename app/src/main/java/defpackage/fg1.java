package defpackage;

import com.google.android.gms.internal.ads.zzifa;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.TransformingSequence;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class fg1 implements Iterator, KMappedMarker {
    public final /* synthetic */ int a = 1;
    public final Iterator b;
    public final /* synthetic */ Object c;

    public fg1(TransformingSequence transformingSequence) {
        this.c = transformingSequence;
        this.b = transformingSequence.a.iterator();
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
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((TransformingSequence) obj).b.invoke(this.b.next());
            default:
                return new zzifa((Map.Entry) ((Iterator) obj).next());
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

    public fg1(Iterator it) {
        this.c = it;
        this.b = it;
    }
}
