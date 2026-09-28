package defpackage;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class og0 {
    public static final og0 e = new og0(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public og0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static og0 a(og0 og0Var, og0 og0Var2) {
        return c(Math.max(og0Var.a, og0Var2.a), Math.max(og0Var.b, og0Var2.b), Math.max(og0Var.c, og0Var2.c), Math.max(og0Var.d, og0Var2.d));
    }

    public static og0 b(og0 og0Var, og0 og0Var2) {
        return c(Math.min(og0Var.a, og0Var2.a), Math.min(og0Var.b, og0Var2.b), Math.min(og0Var.c, og0Var2.c), Math.min(og0Var.d, og0Var2.d));
    }

    public static og0 c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new og0(i, i2, i3, i4);
    }

    public static og0 d(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return k5.w(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || og0.class != obj.getClass()) {
            return false;
        }
        og0 og0Var = (og0) obj;
        return this.d == og0Var.d && this.a == og0Var.a && this.c == og0Var.c && this.b == og0Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return vh.o(sb, this.d, '}');
    }
}
