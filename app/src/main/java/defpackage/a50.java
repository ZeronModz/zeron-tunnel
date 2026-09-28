package defpackage;

import androidx.datastore.preferences.protobuf.MessageLite;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class a50 {
    public final Object a;
    public final int b;

    public a50(int i, MessageLite messageLite) {
        this.a = messageLite;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a50)) {
            return false;
        }
        a50 a50Var = (a50) obj;
        return this.a == a50Var.a && this.b == a50Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
