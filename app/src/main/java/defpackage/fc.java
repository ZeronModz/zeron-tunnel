package defpackage;

import androidx.camera.core.ImageProxy;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fc {
    public final gz0 a;
    public final ImageProxy b;

    public fc(gz0 gz0Var, ImageProxy imageProxy) {
        if (gz0Var == null) {
            io0.e("Null processingRequest");
            throw null;
        }
        this.a = gz0Var;
        this.b = imageProxy;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fc)) {
            return false;
        }
        fc fcVar = (fc) obj;
        return this.a.equals(fcVar.a) && this.b.equals(fcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.a + ", imageProxy=" + this.b + "}";
    }
}
