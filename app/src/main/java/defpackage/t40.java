package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t40 {
    public final ArrayList a;
    public final int b;

    public t40(ArrayList arrayList, int i) {
        this.a = new ArrayList(arrayList);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t40) {
            return this.a.equals(((t40) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "{ " + this.a + " }";
    }
}
