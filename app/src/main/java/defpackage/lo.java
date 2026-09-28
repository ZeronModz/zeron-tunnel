package defpackage;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class lo implements Iterator, KMappedMarker {
    public final /* synthetic */ Enumeration a;

    public lo(Enumeration enumeration) {
        this.a = enumeration;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasMoreElements();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.nextElement();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
