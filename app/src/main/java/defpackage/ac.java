package defpackage;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.OutputSurface;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ac extends OutputSurface {
    public final Surface a;
    public final Size b;
    public final int c;

    public ac(Surface surface, Size size, int i) {
        if (surface == null) {
            io0.e("Null surface");
            throw null;
        }
        this.a = surface;
        if (size == null) {
            io0.e("Null size");
            throw null;
        }
        this.b = size;
        this.c = i;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public final int a() {
        return this.c;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public final Size b() {
        return this.b;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public final Surface c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OutputSurface)) {
            return false;
        }
        OutputSurface outputSurface = (OutputSurface) obj;
        return this.a.equals(outputSurface.c()) && this.b.equals(outputSurface.b()) && this.c == outputSurface.a();
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{surface=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", imageFormat=");
        return hz.q(this.c, "}", sb);
    }
}
