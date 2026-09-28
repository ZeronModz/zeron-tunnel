package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class o12 {
    public final long a;
    public final String b;
    public final int c;

    public o12(long j, String str, int i) {
        this.a = j;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o12)) {
            return false;
        }
        o12 o12Var = (o12) obj;
        return o12Var.a == this.a && o12Var.c == this.c;
    }

    public final int hashCode() {
        return (int) this.a;
    }
}
