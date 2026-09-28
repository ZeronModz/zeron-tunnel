package defpackage;

import androidx.camera.core.processing.Edge;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ec {
    public final Edge a;
    public final Edge b;
    public final int c;
    public final int d;

    public ec(Edge edge, Edge edge2, int i, int i2) {
        this.a = edge;
        this.b = edge2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ec)) {
            return false;
        }
        ec ecVar = (ec) obj;
        return this.a.equals(ecVar.a) && this.b.equals(ecVar.b) && this.c == ecVar.c && this.d == ecVar.d;
    }

    public final int hashCode() {
        return this.d ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{edge=");
        sb.append(this.a);
        sb.append(", postviewEdge=");
        sb.append(this.b);
        sb.append(", inputFormat=");
        sb.append(this.c);
        sb.append(", outputFormat=");
        return hz.q(this.d, "}", sb);
    }
}
