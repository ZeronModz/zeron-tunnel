package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jc {
    public final Size a;
    public final Rect b;
    public final int c;

    public jc(Size size, Rect rect, int i) {
        this.a = size;
        this.b = rect;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jc)) {
            return false;
        }
        jc jcVar = (jc) obj;
        return this.a.equals(jcVar.a) && this.b.equals(jcVar.b) && this.c == jcVar.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResolutionInfoInternal{resolution=");
        sb.append(this.a);
        sb.append(", cropRect=");
        sb.append(this.b);
        sb.append(", rotationDegrees=");
        return hz.q(this.c, "}", sb);
    }
}
