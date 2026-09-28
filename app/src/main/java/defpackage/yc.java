package defpackage;

import android.util.Size;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class yc {
    public final Size a;
    public final HashMap b;
    public final Size c;
    public final HashMap d;
    public final Size e;
    public final HashMap f;
    public final HashMap g;

    public yc(Size size, HashMap map, Size size2, HashMap map2, Size size3, HashMap map3, HashMap map4) {
        if (size == null) {
            io0.e("Null analysisSize");
            throw null;
        }
        this.a = size;
        this.b = map;
        if (size2 == null) {
            io0.e("Null previewSize");
            throw null;
        }
        this.c = size2;
        this.d = map2;
        if (size3 == null) {
            io0.e("Null recordSize");
            throw null;
        }
        this.e = size3;
        this.f = map3;
        this.g = map4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yc)) {
            return false;
        }
        yc ycVar = (yc) obj;
        return this.a.equals(ycVar.a) && this.b.equals(ycVar.b) && this.c.equals(ycVar.c) && this.d.equals(ycVar.d) && this.e.equals(ycVar.e) && this.f.equals(ycVar.f) && this.g.equals(ycVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() ^ ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.a + ", s720pSizeMap=" + this.b + ", previewSize=" + this.c + ", s1440pSizeMap=" + this.d + ", recordSize=" + this.e + ", maximumSizeMap=" + this.f + ", ultraMaximumSizeMap=" + this.g + "}";
    }
}
