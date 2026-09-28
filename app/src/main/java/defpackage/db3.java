package defpackage;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class db3 {
    public static final BigInteger e;
    public static final BigInteger f;
    public Integer a = null;
    public BigInteger b = gb3.e;
    public eb3 c = null;
    public fb3 d = fb3.e;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        e = bigIntegerValueOf;
        f = bigIntegerValueOf.pow(256);
    }

    public final void a(int i) {
        this.a = Integer.valueOf(i);
    }

    public final gb3 b() {
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
            zg1.m("hash type is not set");
            return null;
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.a));
        }
        BigInteger bigInteger = this.b;
        int iCompareTo = bigInteger.compareTo(gb3.e);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                zu0.p("Public exponent must be at least 65537.");
                return null;
            }
            if (bigInteger.mod(e).equals(BigInteger.ZERO)) {
                zu0.p("Invalid public exponent");
                return null;
            }
            if (bigInteger.compareTo(f) > 0) {
                zu0.p("Public exponent cannot be larger than 2^256.");
                return null;
            }
        }
        return new gb3(this.a.intValue(), this.b, this.d, this.c);
    }
}
