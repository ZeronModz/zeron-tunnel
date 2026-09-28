package defpackage;

import io.ktor.util.DelegatingMutableSet;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class gw implements Iterator, KMutableIterator {
    public final Iterator a;
    public final /* synthetic */ DelegatingMutableSet b;

    public gw(DelegatingMutableSet delegatingMutableSet) {
        this.b = delegatingMutableSet;
        this.a = delegatingMutableSet.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.b.b.invoke(this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
