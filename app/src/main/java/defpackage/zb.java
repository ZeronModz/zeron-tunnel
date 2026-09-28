package defpackage;

import android.opengl.EGLSurface;
import androidx.camera.core.processing.util.OutputSurface;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zb extends OutputSurface {
    public final EGLSurface a;
    public final int b;
    public final int c;

    public zb(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            io0.e("Null eglSurface");
            throw null;
        }
        this.a = eGLSurface;
        this.b = i;
        this.c = i2;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    public final EGLSurface a() {
        return this.a;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    public final int b() {
        return this.c;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OutputSurface)) {
            return false;
        }
        OutputSurface outputSurface = (OutputSurface) obj;
        return this.a.equals(outputSurface.a()) && this.b == outputSurface.c() && this.c == outputSurface.b();
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return hz.q(this.c, "}", sb);
    }
}
