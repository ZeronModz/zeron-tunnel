package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ml0 {
    public final Object a;

    public ml0(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ml0) && this.a == ((ml0) obj).a;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + 2078391585;
    }
}
