package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class z60 implements Comparable {
    public int a;
    public int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        z60 z60Var = (z60) obj;
        int i = this.b;
        int i2 = z60Var.b;
        return i != i2 ? i - i2 : this.a - z60Var.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Order{order=");
        sb.append(this.b);
        sb.append(", index=");
        return vh.o(sb, this.a, '}');
    }
}
