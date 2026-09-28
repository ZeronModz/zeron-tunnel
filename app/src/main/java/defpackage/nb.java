package defpackage;

import androidx.camera.core.processing.Packet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nb {
    public final Packet a;
    public final int b;

    public nb(Packet packet, int i) {
        if (packet == null) {
            io0.e("Null packet");
            throw null;
        }
        this.a = packet;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nb) {
            nb nbVar = (nb) obj;
            if (this.a.equals(nbVar.a) && this.b == nbVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.a);
        sb.append(", jpegQuality=");
        return hz.q(this.b, "}", sb);
    }
}
