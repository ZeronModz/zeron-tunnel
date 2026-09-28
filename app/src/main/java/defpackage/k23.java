package defpackage;

import com.google.android.gms.internal.ads.zzgwy;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class k23 {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean[] h;
    public final boolean i;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067 A[LOOP:0: B:19:0x0063->B:21:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k23(java.lang.String r5, char[] r6, byte[] r7, boolean r8) {
        /*
            r4 = this;
            r4.<init>()
            r4.a = r5
            r6.getClass()
            r4.b = r6
            int r5 = r6.length     // Catch: java.lang.ArithmeticException -> L7b
            java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.ArithmeticException -> L7b
            if (r5 <= 0) goto L7d
            int[] r1 = defpackage.u23.a     // Catch: java.lang.ArithmeticException -> L7b
            int r0 = r0.ordinal()     // Catch: java.lang.ArithmeticException -> L7b
            r0 = r1[r0]     // Catch: java.lang.ArithmeticException -> L7b
            r1 = 0
            r2 = 1
            switch(r0) {
                case 1: goto L3a;
                case 2: goto L45;
                case 3: goto L45;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L22;
                case 7: goto L22;
                case 8: goto L22;
                default: goto L1c;
            }     // Catch: java.lang.ArithmeticException -> L7b
        L1c:
            java.lang.AssertionError r4 = new java.lang.AssertionError     // Catch: java.lang.ArithmeticException -> L7b
            r4.<init>()     // Catch: java.lang.ArithmeticException -> L7b
            throw r4     // Catch: java.lang.ArithmeticException -> L7b
        L22:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r5)     // Catch: java.lang.ArithmeticException -> L7b
            r3 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r3 = r3 >>> r0
            int r0 = 31 - r0
            int r3 = r3 - r5
            int r3 = r3 >>> 31
            int r0 = r0 + r3
            goto L4b
        L31:
            int r0 = r5 + (-1)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch: java.lang.ArithmeticException -> L7b
            int r0 = 32 - r0
            goto L4b
        L3a:
            int r0 = r5 + (-1)
            r0 = r0 & r5
            if (r0 != 0) goto L41
            r0 = r2
            goto L42
        L41:
            r0 = r1
        L42:
            defpackage.kf2.I(r0)     // Catch: java.lang.ArithmeticException -> L7b
        L45:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r5)     // Catch: java.lang.ArithmeticException -> L7b
            int r0 = 31 - r0
        L4b:
            r4.d = r0     // Catch: java.lang.ArithmeticException -> L7b
            int r6 = java.lang.Integer.numberOfTrailingZeros(r0)
            int r3 = 3 - r6
            int r3 = r2 << r3
            r4.e = r3
            int r6 = r0 >> r6
            r4.f = r6
            int r5 = r5 + (-1)
            r4.c = r5
            r4.g = r7
            boolean[] r5 = new boolean[r3]
        L63:
            int r6 = r4.f
            if (r1 >= r6) goto L76
            int r6 = r1 * 8
            int r7 = r4.d
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            int r6 = defpackage.sb2.F(r6, r7)
            r5[r6] = r2
            int r1 = r1 + 1
            goto L63
        L76:
            r4.h = r5
            r4.i = r8
            return
        L7b:
            r4 = move-exception
            goto L85
        L7d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.ArithmeticException -> L7b
            java.lang.String r5 = "x (0) must be > 0"
            r4.<init>(r5)     // Catch: java.lang.ArithmeticException -> L7b
            throw r4     // Catch: java.lang.ArithmeticException -> L7b
        L85:
            int r5 = r6.length
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = java.lang.String.valueOf(r5)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 24
            r8.<init>(r7)
            java.lang.String r7 = "Illegal alphabet length "
            java.lang.String r5 = defpackage.vh.i(r5, r7, r8)
            r6.<init>(r5, r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k23.<init>(java.lang.String, char[], byte[], boolean):void");
    }

    public final int a(char c) throws zzgwy {
        if (c > 127) {
            throw new zzgwy("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        byte b = this.g[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new zzgwy("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        throw new zzgwy(vh.q(new StringBuilder(String.valueOf(c).length() + 24), "Unrecognized character: ", c));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k23)) {
            return false;
        }
        k23 k23Var = (k23) obj;
        return this.i == k23Var.i && Arrays.equals(this.b, k23Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (true != this.i ? 1237 : 1231);
    }

    public final String toString() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k23(char[] cArr, String str) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (!(c < 128)) {
                u7.r(mu.F("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
            if (!(bArr[c] == -1)) {
                u7.r(mu.F("Duplicate character: %s", Character.valueOf(c)));
                throw null;
            }
            bArr[c] = (byte) i;
        }
        this(str, cArr, bArr, false);
    }
}
