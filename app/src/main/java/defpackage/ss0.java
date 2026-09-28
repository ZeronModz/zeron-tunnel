package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ss0 {
    public boolean a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ss0.class == obj.getClass()) {
            ss0 ss0Var = (ss0) obj;
            if (this.a == ss0Var.a && this.b == ss0Var.b && this.c == ss0Var.c && this.d == ss0Var.d && this.e == ss0Var.e && this.f == ss0Var.f && this.g == ss0Var.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a ? 1 : 0) * 31) + this.b) * 31) + (this.c ? 1 : 0)) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g;
    }
}
