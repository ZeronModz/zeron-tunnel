package defpackage;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u63 {
    public static final long[] a;
    public static final long[] b;
    public static final long[] c;
    public static final r63[][] d;
    public static final r63[] e;
    public static final BigInteger f;
    public static final BigInteger g;
    public static final BigInteger h;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        h = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        mo2 mo2Var = new mo2(12, false);
        BigInteger bigIntegerMod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        mo2Var.c = bigIntegerMod3;
        BigInteger bigIntegerMultiply = bigIntegerMod3.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerMod3.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        mo2Var.b = bigIntegerModPow2;
        a = n8.x0(b(bigIntegerMod));
        b = n8.x0(b(bigIntegerMod2));
        c = n8.x0(b(bigIntegerModPow));
        d = (r63[][]) Array.newInstance((Class<?>) r63.class, 32, 8);
        mo2 mo2VarA = mo2Var;
        for (int i = 0; i < 32; i++) {
            mo2 mo2VarA2 = mo2VarA;
            for (int i2 = 0; i2 < 8; i2++) {
                d[i][i2] = c(mo2VarA2);
                mo2VarA2 = a(mo2VarA2, mo2VarA);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                mo2VarA = a(mo2VarA, mo2VarA);
            }
        }
        mo2 mo2VarA3 = a(mo2Var, mo2Var);
        e = new r63[8];
        for (int i4 = 0; i4 < 8; i4++) {
            e[i4] = c(mo2Var);
            mo2Var = a(mo2Var, mo2VarA3);
        }
    }

    public static mo2 a(mo2 mo2Var, mo2 mo2Var2) {
        mo2 mo2Var3 = new mo2(12, false);
        BigInteger bigIntegerMultiply = g.multiply(((BigInteger) mo2Var.b).multiply((BigInteger) mo2Var2.b).multiply((BigInteger) mo2Var.c).multiply((BigInteger) mo2Var2.c));
        BigInteger bigInteger = f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = ((BigInteger) mo2Var.b).multiply((BigInteger) mo2Var2.c).add(((BigInteger) mo2Var2.b).multiply((BigInteger) mo2Var.c));
        BigInteger bigInteger2 = BigInteger.ONE;
        mo2Var3.b = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        mo2Var3.c = ((BigInteger) mo2Var.c).multiply((BigInteger) mo2Var2.c).add(((BigInteger) mo2Var.b).multiply((BigInteger) mo2Var2.b)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return mo2Var3;
    }

    public static byte[] b(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i = 0; i < 16; i++) {
            byte b2 = bArr[i];
            int i2 = 31 - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b2;
        }
        return bArr;
    }

    public static r63 c(mo2 mo2Var) {
        BigInteger bigIntegerAdd = ((BigInteger) mo2Var.c).add((BigInteger) mo2Var.b);
        BigInteger bigInteger = f;
        return new r63(n8.x0(b(bigIntegerAdd.mod(bigInteger))), n8.x0(b(((BigInteger) mo2Var.c).subtract((BigInteger) mo2Var.b).mod(bigInteger))), n8.x0(b(h.multiply((BigInteger) mo2Var.b).multiply((BigInteger) mo2Var.c).mod(bigInteger))));
    }
}
