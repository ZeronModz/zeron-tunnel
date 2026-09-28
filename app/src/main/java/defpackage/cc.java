package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.processing.Packet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class cc extends Packet {
    public final Object a;
    public final w30 b;
    public final int c;
    public final Size d;
    public final Rect e;
    public final int f;
    public final Matrix g;
    public final CameraCaptureResult h;

    public cc(Object obj, w30 w30Var, int i, Size size, Rect rect, int i2, Matrix matrix, CameraCaptureResult cameraCaptureResult) {
        if (obj == null) {
            io0.e("Null data");
            throw null;
        }
        this.a = obj;
        this.b = w30Var;
        this.c = i;
        if (size == null) {
            io0.e("Null size");
            throw null;
        }
        this.d = size;
        if (rect == null) {
            io0.e("Null cropRect");
            throw null;
        }
        this.e = rect;
        this.f = i2;
        if (matrix == null) {
            io0.e("Null sensorToBufferTransform");
            throw null;
        }
        this.g = matrix;
        if (cameraCaptureResult != null) {
            this.h = cameraCaptureResult;
        } else {
            io0.e("Null cameraCaptureResult");
            throw null;
        }
    }

    @Override // androidx.camera.core.processing.Packet
    public final CameraCaptureResult a() {
        return this.h;
    }

    @Override // androidx.camera.core.processing.Packet
    public final Rect b() {
        return this.e;
    }

    @Override // androidx.camera.core.processing.Packet
    public final Object c() {
        return this.a;
    }

    @Override // androidx.camera.core.processing.Packet
    public final w30 d() {
        return this.b;
    }

    @Override // androidx.camera.core.processing.Packet
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Packet) {
            Packet packet = (Packet) obj;
            if (this.a.equals(packet.c())) {
                w30 w30Var = this.b;
                if (w30Var == null) {
                    if (packet.d() == null) {
                    }
                } else if (w30Var != packet.d()) {
                    return false;
                }
                if (this.c == packet.e() && this.d.equals(packet.h()) && this.e.equals(packet.b()) && this.f == packet.f() && this.g.equals(packet.g()) && this.h.equals(packet.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.Packet
    public final int f() {
        return this.f;
    }

    @Override // androidx.camera.core.processing.Packet
    public final Matrix g() {
        return this.g;
    }

    @Override // androidx.camera.core.processing.Packet
    public final Size h() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        w30 w30Var = this.b;
        return this.h.hashCode() ^ ((((((((((((iHashCode ^ (w30Var == null ? 0 : w30Var.hashCode())) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Packet{data=" + this.a + ", exif=" + this.b + ", format=" + this.c + ", size=" + this.d + ", cropRect=" + this.e + ", rotationDegrees=" + this.f + ", sensorToBufferTransform=" + this.g + ", cameraCaptureResult=" + this.h + "}";
    }
}
