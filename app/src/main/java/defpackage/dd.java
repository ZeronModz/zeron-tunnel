package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dd {
    public static final dd d = new dd(0, 0, 0);
    public static final dd e = new dd(1, 3, 2);
    public static final dd f = new dd(6, 7, 1);
    public static final dd g = new dd(6, 6, 1);
    public final int a;
    public final int b;
    public final int c;

    public dd(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dd)) {
            return false;
        }
        dd ddVar = (dd) obj;
        return this.a == ddVar.a && this.b == ddVar.b && this.c == ddVar.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb.append(this.a);
        sb.append(", transfer=");
        sb.append(this.b);
        sb.append(", range=");
        return hz.q(this.c, "}", sb);
    }
}
