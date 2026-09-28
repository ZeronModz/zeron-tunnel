package defpackage;

import io.ktor.util.StringValuesSingleImpl;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class gb1 implements Map.Entry, KMappedMarker {
    public final String a;
    public final List b;

    public gb1(StringValuesSingleImpl stringValuesSingleImpl) {
        this.a = stringValuesSingleImpl.b;
        this.b = stringValuesSingleImpl.c;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return yg0.a(entry.getKey(), this.a) && yg0.a(entry.getValue(), this.b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return this.a + '=' + this.b;
    }
}
