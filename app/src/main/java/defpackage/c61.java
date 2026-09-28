package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c61 implements Iterator, KMappedMarker {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ SerialDescriptor c;

    public c61(SerialDescriptor serialDescriptor, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = serialDescriptor;
                this.b = serialDescriptor.getElementsCount();
                break;
            default:
                this.c = serialDescriptor;
                this.b = serialDescriptor.getElementsCount();
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b > 0) {
                }
                break;
            default:
                if (this.b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        SerialDescriptor serialDescriptor = this.c;
        switch (i) {
            case 0:
                int elementsCount = serialDescriptor.getElementsCount();
                int i2 = this.b;
                this.b = i2 - 1;
                return serialDescriptor.getElementDescriptor(elementsCount - i2);
            default:
                int elementsCount2 = serialDescriptor.getElementsCount();
                int i3 = this.b;
                this.b = i3 - 1;
                return serialDescriptor.getElementName(elementsCount2 - i3);
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
}
