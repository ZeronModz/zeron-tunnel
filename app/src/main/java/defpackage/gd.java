package defpackage;

import android.util.Range;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gd extends um1 {
    public final d01 d;
    public final Range e;
    public final Range f;
    public final int g;

    public gd(d01 d01Var, Range range, Range range2, int i) {
        this.d = d01Var;
        this.e = range;
        this.f = range2;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof um1) {
            gd gdVar = (gd) ((um1) obj);
            if (this.d.equals(gdVar.d) && this.e.equals(gdVar.e) && this.f.equals(gdVar.f) && this.g == gdVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.g ^ ((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.d);
        sb.append(", frameRate=");
        sb.append(this.e);
        sb.append(", bitrate=");
        sb.append(this.f);
        sb.append(", aspectRatio=");
        return hz.q(this.g, "}", sb);
    }
}
