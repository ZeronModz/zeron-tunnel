package defpackage;

import androidx.camera.video.Quality$ConstantQuality;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ic extends Quality$ConstantQuality {
    public final int j;
    public final String k;
    public final List l;

    public ic(String str, int i, List list) {
        this.j = i;
        this.k = str;
        if (list != null) {
            this.l = list;
        } else {
            io0.e("Null typicalSizes");
            throw null;
        }
    }

    @Override // androidx.camera.video.Quality$ConstantQuality
    public final String a() {
        return this.k;
    }

    @Override // androidx.camera.video.Quality$ConstantQuality
    public final List b() {
        return this.l;
    }

    @Override // androidx.camera.video.Quality$ConstantQuality
    public final int c() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Quality$ConstantQuality)) {
            return false;
        }
        Quality$ConstantQuality quality$ConstantQuality = (Quality$ConstantQuality) obj;
        return this.j == quality$ConstantQuality.c() && this.k.equals(quality$ConstantQuality.a()) && this.l.equals(quality$ConstantQuality.b());
    }

    public final int hashCode() {
        return this.l.hashCode() ^ ((((this.j ^ 1000003) * 1000003) ^ this.k.hashCode()) * 1000003);
    }

    public final String toString() {
        return "ConstantQuality{value=" + this.j + ", name=" + this.k + ", typicalSizes=" + this.l + "}";
    }
}
