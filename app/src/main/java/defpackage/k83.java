package defpackage;

import com.google.android.gms.internal.ads.zzhmn;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class k83 extends zzhmn {
    public final int a;
    public final int b;
    public final j83 c;
    public final i83 d;

    public /* synthetic */ k83(int i, int i2, j83 j83Var, i83 i83Var) {
        this.a = i;
        this.b = i2;
        this.c = j83Var;
        this.d = i83Var;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean a() {
        return this.c != j83.e;
    }

    public final int b() {
        j83 j83Var = j83.e;
        int i = this.b;
        j83 j83Var2 = this.c;
        if (j83Var2 == j83Var) {
            return i;
        }
        if (j83Var2 == j83.b || j83Var2 == j83.c || j83Var2 == j83.d) {
            return i + 5;
        }
        u7.p("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k83)) {
            return false;
        }
        k83 k83Var = (k83) obj;
        return k83Var.a == this.a && k83Var.b() == b() && k83Var.c == this.c && k83Var.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(k83.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i = this.b;
        int length3 = String.valueOf(i).length();
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i2).length() + 10);
        hz.H(sb, "HMAC Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        hz.C(i, i2, ", ", "-byte tags, and ", sb);
        sb.append("-byte key)");
        return sb.toString();
    }
}
