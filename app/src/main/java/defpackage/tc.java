package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class tc {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public tc(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tc) {
            tc tcVar = (tc) obj;
            if (this.a == tcVar.a && this.b == tcVar.b && this.c == tcVar.c && this.d == tcVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "FeatureSettings{cameraMode=" + this.a + ", requiredMaxBitDepth=" + this.b + ", previewStabilizationOn=" + this.c + ", ultraHdrOn=" + this.d + "}";
    }
}
