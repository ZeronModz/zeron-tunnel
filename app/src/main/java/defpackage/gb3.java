package defpackage;

import com.google.android.gms.internal.ads.zzhuu;
import java.util.Objects;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gb3 extends zzhuu {
    public static final BigInteger e = BigInteger.valueOf(65537);
    public final int a;
    public final BigInteger b;
    public final fb3 c;
    public final eb3 d;

    public /* synthetic */ gb3(int i, BigInteger bigInteger, fb3 fb3Var, eb3 eb3Var) {
        this.a = i;
        this.b = bigInteger;
        this.c = fb3Var;
        this.d = eb3Var;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean a() {
        return this.c != fb3.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gb3)) {
            return false;
        }
        gb3 gb3Var = (gb3) obj;
        return gb3Var.a == this.a && Objects.equals(gb3Var.b, this.b) && gb3Var.c == this.c && gb3Var.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(gb3.class, Integer.valueOf(this.a), this.b, this.c, this.d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String strValueOf3 = String.valueOf(this.b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i = this.a;
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i).length() + 13);
        hz.H(sb, "RSA SSA PKCS1 Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        sb.append(", publicExponent: ");
        sb.append(strValueOf3);
        sb.append(", and ");
        sb.append(i);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
