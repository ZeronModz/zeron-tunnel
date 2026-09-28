package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class w73 {
    public final Class a;
    public final hc3 b;

    public /* synthetic */ w73(Class cls, hc3 hc3Var) {
        this.a = cls;
        this.b = hc3Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w73)) {
            return false;
        }
        w73 w73Var = (w73) obj;
        return w73Var.a.equals(this.a) && w73Var.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        String simpleName = this.a.getSimpleName();
        String strValueOf = String.valueOf(this.b);
        return vh.t(new StringBuilder(simpleName.length() + 21 + strValueOf.length()), simpleName, ", object identifier: ", strValueOf);
    }
}
