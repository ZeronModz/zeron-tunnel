package defpackage;

import com.google.common.graph.ElementOrder$Type;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v00 {
    public final ElementOrder$Type a;

    public v00(ElementOrder$Type elementOrder$Type) {
        elementOrder$Type.getClass();
        this.a = elementOrder$Type;
        cn0.t(elementOrder$Type != ElementOrder$Type.SORTED);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof v00) && this.a == ((v00) obj).a && cn0.y(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null});
    }

    public final String toString() {
        tj1 tj1VarV = sb2.v(this);
        tj1VarV.c(this.a, "type");
        return tj1VarV.toString();
    }
}
