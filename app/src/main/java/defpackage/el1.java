package defpackage;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class el1 {
    public static final long[] a = new long[37];
    public static final int[] b = new int[37];
    public static final int[] c = new int[37];

    static {
        BigInteger bigInteger = new BigInteger("10000000000000000", 16);
        for (int i = 2; i <= 36; i++) {
            long j = i;
            a[i] = if3.s(-1L, j);
            b[i] = (int) if3.J(-1L, j);
            c[i] = bigInteger.toString(i).length() - 1;
        }
    }
}
