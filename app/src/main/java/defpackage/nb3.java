package defpackage;

import com.google.android.gms.internal.ads.zzhuu;
import java.util.Objects;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nb3 extends zzhuu {
    public static final BigInteger g = BigInteger.valueOf(65537);
    public final int a;
    public final BigInteger b;
    public final mb3 c;
    public final lb3 d;
    public final lb3 e;
    public final int f;

    public /* synthetic */ nb3(int i, BigInteger bigInteger, mb3 mb3Var, lb3 lb3Var, lb3 lb3Var2, int i2) {
        this.a = i;
        this.b = bigInteger;
        this.c = mb3Var;
        this.d = lb3Var;
        this.e = lb3Var2;
        this.f = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean a() {
        return this.c != mb3.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nb3)) {
            return false;
        }
        nb3 nb3Var = (nb3) obj;
        return nb3Var.a == this.a && Objects.equals(nb3Var.b, this.b) && nb3Var.c == this.c && nb3Var.d == this.d && nb3Var.e == this.e && nb3Var.f == this.f;
    }

    public final int hashCode() {
        return Objects.hash(nb3.class, Integer.valueOf(this.a), this.b, this.c, this.d, this.e, Integer.valueOf(this.f));
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String strValueOf3 = String.valueOf(this.e);
        String strValueOf4 = String.valueOf(this.b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i = this.f;
        int length4 = String.valueOf(i).length();
        int length5 = strValueOf4.length();
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i2).length() + 13);
        hz.H(sb, "RSA SSA PSS Parameters (variant: ", strValueOf, ", signature hashType: ", strValueOf2);
        sb.append(", mgf1 hashType: ");
        sb.append(strValueOf3);
        sb.append(", saltLengthBytes: ");
        sb.append(i);
        sb.append(", publicExponent: ");
        sb.append(strValueOf4);
        sb.append(", and ");
        sb.append(i2);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
