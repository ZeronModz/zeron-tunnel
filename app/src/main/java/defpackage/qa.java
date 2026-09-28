package defpackage;

import android.util.Range;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qa extends b9 {
    public final Range c;
    public final int d;
    public final int e;
    public final Range f;
    public final int g;

    public qa(Range range, int i, int i2, Range range2, int i3) {
        this.c = range;
        this.d = i;
        this.e = i2;
        this.f = range2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b9) {
            qa qaVar = (qa) ((b9) obj);
            if (this.c.equals(qaVar.c) && this.d == qaVar.d && this.e == qaVar.e && this.f.equals(qaVar.f) && this.g == qaVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.g ^ ((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSpec{bitrate=");
        sb.append(this.c);
        sb.append(", sourceFormat=");
        sb.append(this.d);
        sb.append(", source=");
        sb.append(this.e);
        sb.append(", sampleRate=");
        sb.append(this.f);
        sb.append(", channelCount=");
        return hz.q(this.g, "}", sb);
    }
}
