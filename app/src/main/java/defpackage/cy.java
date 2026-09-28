package defpackage;

import coil3.size.Dimension;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class cy implements Dimension {
    public final int a;

    public /* synthetic */ cy(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cy) {
            return this.a == ((cy) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Pixels(px=" + this.a + ')';
    }
}
