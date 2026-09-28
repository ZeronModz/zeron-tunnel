package defpackage;

import androidx.camera.core.impl.Identifier;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class mb extends Identifier {
    public final Object a;

    public mb(Object obj) {
        this.a = obj;
    }

    @Override // androidx.camera.core.impl.Identifier
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Identifier) {
            return this.a.equals(((Identifier) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return vh.k(this.a, "}", new StringBuilder("Identifier{value="));
    }
}
