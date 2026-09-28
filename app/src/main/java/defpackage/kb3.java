package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class kb3 {
    public static final BigInteger g;
    public static final BigInteger h;
    public Integer a = null;
    public BigInteger b = nb3.g;
    public lb3 c = null;
    public lb3 d = null;
    public Integer e = null;
    public mb3 f = mb3.e;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        g = bigIntegerValueOf;
        h = bigIntegerValueOf.pow(256);
    }

    public final void a(int i) {
        this.a = Integer.valueOf(i);
    }

    public final void b(int i) {
        if (i < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i)));
        }
        this.e = Integer.valueOf(i);
    }

    public final nb3 c() {
        Integer num = this.a;
        if (num == null) {
            zg1.m("key size is not set");
            return null;
        }
        if (this.b == null) {
            zg1.m("publicExponent is not set");
            return null;
        }
        if (this.c == null) {
            zg1.m("signature hash type is not set");
            return null;
        }
        if (this.d == null) {
            zg1.m("mgf1 hash type is not set");
            return null;
        }
        if (this.e == null) {
            zg1.m("salt length is not set");
            return null;
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.a, 2048));
        }
        if (this.c != this.d) {
            zg1.m("MGF1 hash is different from signature hash");
            return null;
        }
        BigInteger bigInteger = this.b;
        int iCompareTo = bigInteger.compareTo(nb3.g);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                zu0.p("Public exponent must be at least 65537.");
                return null;
            }
            if (bigInteger.mod(g).equals(BigInteger.ZERO)) {
                zu0.p("Invalid public exponent");
                return null;
            }
            if (bigInteger.compareTo(h) > 0) {
                zu0.p("Public exponent cannot be larger than 2^256.");
                return null;
            }
        }
        return new nb3(this.a.intValue(), this.b, this.f, this.c, this.d, this.e.intValue());
    }
}
