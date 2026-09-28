package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t23 {
    public static final /* synthetic */ int a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d) {
        if (d > 0.0d && l02.Y(d)) {
            long jP = l02.P(d);
            if ((jP & ((-1) + jP)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(double r6) {
        /*
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            r1 = 0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L12
            boolean r1 = defpackage.l02.Y(r6)
            if (r1 == 0) goto L12
            r1 = r3
            goto L13
        L12:
            r1 = r2
        L13:
            java.lang.String r4 = "x must be positive and finite"
            defpackage.n8.b0(r4, r1)
            int r1 = java.lang.Math.getExponent(r6)
            int r4 = java.lang.Math.getExponent(r6)
            r5 = -1022(0xfffffffffffffc02, float:NaN)
            if (r4 < r5) goto L72
            int[] r4 = defpackage.s23.a
            int r0 = r0.ordinal()
            r0 = r4[r0]
            switch(r0) {
                case 1: goto L6a;
                case 2: goto L69;
                case 3: goto L60;
                case 4: goto L58;
                case 5: goto L4e;
                case 6: goto L34;
                case 7: goto L34;
                case 8: goto L34;
                default: goto L2f;
            }
        L2f:
            defpackage.zu0.a()
            r6 = 0
            return r6
        L34:
            long r6 = java.lang.Double.doubleToRawLongBits(r6)
            r4 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r6 = r6 & r4
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r6 = r6 | r4
            double r6 = java.lang.Double.longBitsToDouble(r6)
            double r6 = r6 * r6
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 <= 0) goto L66
            r2 = r3
            goto L66
        L4e:
            if (r1 < 0) goto L51
            r2 = r3
        L51:
            boolean r6 = a(r6)
        L55:
            r6 = r6 ^ r3
            r2 = r2 & r6
            goto L66
        L58:
            if (r1 >= 0) goto L5b
            r2 = r3
        L5b:
            boolean r6 = a(r6)
            goto L55
        L60:
            boolean r6 = a(r6)
            r2 = r6 ^ 1
        L66:
            if (r2 == 0) goto L69
            int r1 = r1 + r3
        L69:
            return r1
        L6a:
            boolean r6 = a(r6)
            defpackage.kf2.I(r6)
            return r1
        L72:
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r6 = r6 * r0
            int r6 = b(r6)
            int r6 = r6 + (-52)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t23.b(double):int");
    }

    public static boolean c(double d) {
        if (l02.Y(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(l02.P(d)) <= Math.getExponent(d);
        }
        return false;
    }
}
