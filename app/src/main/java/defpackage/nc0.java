package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class nc0 {
    public double a;
    public double b;
    public double c;
    public int d;

    public static nc0 a(double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        int iA;
        double[] dArr;
        int i;
        int i2;
        int iCeil;
        double dFloor;
        double[] dArr2;
        double d7;
        double d8;
        double d9;
        double d10;
        double[] dArr3;
        double[] dArrA;
        if (d2 < 1.0E-4d || d3 < 1.0E-4d || d3 > 99.9999d) {
            d4 = 3.8d;
            d5 = 0.25d;
            d6 = 3846.153846153846d;
            int iB = no.b(no.g(d3));
            iA = no.a(iB, iB, iB);
        } else {
            double dB = (xo0.b(d) / 180.0d) * 3.141592653589793d;
            double dG = no.g(d3);
            double dSqrt = Math.sqrt(dG) * 11.0d;
            ep1 ep1Var = ep1.k;
            d6 = 3846.153846153846d;
            double dPow = 1.0d / Math.pow(1.64d - Math.pow(0.29d, ep1Var.f), 0.73d);
            d4 = 3.8d;
            double dCos = (Math.cos(dB + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * ep1Var.e * ep1Var.c;
            double dSin = Math.sin(dB);
            double dCos2 = Math.cos(dB);
            d5 = 0.25d;
            int i3 = 0;
            while (true) {
                dArr = oc0.c;
                if (i3 >= 5) {
                    i = 2;
                    i2 = 1;
                    break;
                }
                double d11 = dSqrt / 100.0d;
                double d12 = dPow;
                i = 2;
                i2 = 1;
                double dPow2 = Math.pow(((d2 == 0.0d || dSqrt == 0.0d) ? 0.0d : d2 / Math.sqrt(d11)) * d12, 1.1111111111111112d);
                double d13 = dSin;
                int i4 = i3;
                double dPow3 = (Math.pow(d11, (1.0d / ep1Var.d) / ep1Var.j) * ep1Var.a) / ep1Var.b;
                double d14 = (((dPow3 + 0.305d) * 23.0d) * dPow2) / (((dPow2 * 108.0d) * d13) + (((dPow2 * 11.0d) * dCos2) + (23.0d * dCos)));
                double d15 = d14 * dCos2;
                double d16 = d14 * d13;
                double d17 = dPow3 * 460.0d;
                dArrA = xo0.a(new double[]{oc0.d(((288.0d * d16) + ((451.0d * d15) + d17)) / 1403.0d), oc0.d(((d17 - (891.0d * d15)) - (261.0d * d16)) / 1403.0d), oc0.d(((d17 - (d15 * 220.0d)) - (d16 * 6300.0d)) / 1403.0d)}, oc0.b);
                double d18 = dArrA[0];
                if (d18 < 0.0d) {
                    break;
                }
                double d19 = dArrA[1];
                if (d19 < 0.0d) {
                    break;
                }
                double d20 = dArrA[2];
                if (d20 < 0.0d) {
                    break;
                }
                double d21 = (dArr[2] * d20) + (dArr[1] * d19) + (dArr[0] * d18);
                if (d21 <= 0.0d) {
                    break;
                }
                if (i4 == 4) {
                    break;
                }
                double d22 = d21 - dG;
                if (Math.abs(d22) < 0.002d) {
                    break;
                }
                dSqrt -= (d22 * dSqrt) / (d21 * 2.0d);
                i3 = i4 + 1;
                dPow = d12;
                dSin = d13;
            }
            double d23 = dArrA[0];
            iA = (d23 > 100.01d || dArrA[1] > 100.01d || dArrA[2] > 100.01d) ? 0 : no.a(no.b(d23), no.b(dArrA[1]), no.b(dArrA[2]));
            if (iA == 0) {
                double[] dArr4 = new double[3];
                dArr4[0] = -1.0d;
                dArr4[i2] = -1.0d;
                dArr4[i] = -1.0d;
                double[] dArr5 = dArr4;
                boolean z = false;
                int i5 = 0;
                double d24 = 0.0d;
                double d25 = 0.0d;
                int i6 = i2;
                while (i5 < 12) {
                    double d26 = dArr[0];
                    double d27 = dArr[i2];
                    double d28 = dArr[i];
                    double d29 = i5 % 4 <= i2 ? 0.0d : 100.0d;
                    double d30 = i5 % 2 == 0 ? 0.0d : 100.0d;
                    if (i5 < 4) {
                        double d31 = ((dG - (d27 * d29)) - (d28 * d30)) / d26;
                        if (oc0.e(d31)) {
                            dArr3 = new double[3];
                            dArr3[0] = d31;
                            dArr3[1] = d29;
                            dArr3[i] = d30;
                        } else {
                            dArr3 = new double[]{-1.0d, -1.0d, -1.0d};
                        }
                        dArr2 = dArr3;
                    } else if (i5 < 8) {
                        double d32 = ((dG - (d26 * d30)) - (d28 * d29)) / d27;
                        if (oc0.e(d32)) {
                            dArr2 = new double[3];
                            dArr2[0] = d30;
                            dArr2[1] = d32;
                            dArr2[i] = d29;
                        } else {
                            dArr2 = new double[]{-1.0d, -1.0d, -1.0d};
                        }
                    } else {
                        double d33 = ((dG - (d26 * d29)) - (d27 * d30)) / d28;
                        if (oc0.e(d33)) {
                            dArr2 = new double[3];
                            dArr2[0] = d29;
                            dArr2[1] = d30;
                            dArr2[i] = d33;
                        } else {
                            dArr2 = new double[]{-1.0d, -1.0d, -1.0d};
                        }
                    }
                    if (dArr2[0] < 0.0d) {
                        d8 = d25;
                        d10 = d24;
                    } else {
                        double dC = oc0.c(dArr2);
                        if (z) {
                            if (i6 == 0) {
                                double d34 = d24;
                                double d35 = d25;
                                boolean zA = oc0.a(d34, dC, d35);
                                d10 = d34;
                                d7 = dC;
                                d8 = d35;
                                if (zA) {
                                    d9 = d10;
                                }
                            } else {
                                d7 = dC;
                                d8 = d25;
                                d9 = d24;
                            }
                            double d36 = dB;
                            double d37 = d7;
                            double d38 = d9;
                            dB = d36;
                            if (oc0.a(d9, d36, d37)) {
                                d24 = d38;
                                dArr5 = dArr2;
                                i6 = 0;
                                d25 = d37;
                            } else {
                                dArr4 = dArr2;
                                i6 = 0;
                                d25 = d8;
                                d24 = d37;
                            }
                        } else {
                            dArr4 = dArr2;
                            dArr5 = dArr4;
                            d24 = dC;
                            d25 = d24;
                            z = true;
                        }
                        i5++;
                        i2 = 1;
                    }
                    d24 = d10;
                    d25 = d8;
                    i5++;
                    i2 = 1;
                }
                double[][] dArr6 = new double[i][];
                dArr6[0] = dArr4;
                dArr6[1] = dArr5;
                double[] dArr7 = dArr6[0];
                double dC2 = oc0.c(dArr7);
                double[] dArr8 = dArr6[1];
                for (int i7 = 0; i7 < 3; i7++) {
                    double d39 = dArr7[i7];
                    double d40 = dArr8[i7];
                    if (d39 != d40) {
                        if (d39 < d40) {
                            iCeil = (int) Math.floor(oc0.f(d39) - 0.5d);
                            dFloor = Math.ceil(oc0.f(dArr8[i7]) - 0.5d);
                        } else {
                            iCeil = (int) Math.ceil(oc0.f(d39) - 0.5d);
                            dFloor = Math.floor(oc0.f(dArr8[i7]) - 0.5d);
                        }
                        int i8 = (int) dFloor;
                        for (int i9 = 0; i9 < 8 && Math.abs(i8 - iCeil) > 1; i9++) {
                            int iFloor = (int) Math.floor(((double) (iCeil + i8)) / 2.0d);
                            double d41 = oc0.d[iFloor];
                            double d42 = dArr7[i7];
                            double d43 = (d41 - d42) / (dArr8[i7] - d42);
                            double d44 = dArr7[0];
                            double d45 = ((dArr8[0] - d44) * d43) + d44;
                            double d46 = dArr7[1];
                            double d47 = ((dArr8[1] - d46) * d43) + d46;
                            double d48 = dArr7[2];
                            double[] dArr9 = {d45, d47, ((dArr8[2] - d48) * d43) + d48};
                            double dC3 = oc0.c(dArr9);
                            double d49 = dC2;
                            if (oc0.a(d49, dB, dC3)) {
                                i8 = iFloor;
                                dArr8 = dArr9;
                                dC2 = d49;
                            } else {
                                iCeil = iFloor;
                                dArr7 = dArr9;
                                dC2 = dC3;
                            }
                        }
                        dC2 = dC2;
                    }
                }
                double[] dArr10 = {(dArr7[0] + dArr8[0]) / 2.0d, (dArr7[1] + dArr8[1]) / 2.0d, (dArr7[2] + dArr8[2]) / 2.0d};
                iA = no.a(no.b(dArr10[0]), no.b(dArr10[1]), no.b(dArr10[2]));
            }
        }
        nc0 nc0Var = new nc0();
        nc0Var.d = iA;
        ep1 ep1Var2 = ep1.k;
        int i10 = iA & 255;
        double dF = no.f((16711680 & iA) >> 16);
        double dF2 = no.f((65280 & iA) >> 8);
        double dF3 = no.f(i10);
        double d50 = (0.18051042d * dF3) + (0.35762064d * dF2) + (0.41233895d * dF);
        double d51 = (0.0722d * dF3) + (0.7152d * dF2) + (0.2126d * dF);
        double d52 = (dF3 * 0.95034478d) + (dF2 * 0.11916382d) + (dF * 0.01932141d);
        double[][] dArr11 = qh.a;
        double[] dArr12 = dArr11[0];
        double d53 = (dArr12[2] * d52) + (dArr12[1] * d51) + (dArr12[0] * d50);
        double[] dArr13 = dArr11[1];
        double d54 = (dArr13[2] * d52) + (dArr13[1] * d51) + (dArr13[0] * d50);
        double[] dArr14 = dArr11[2];
        double d55 = (d52 * dArr14[2]) + (d51 * dArr14[1]) + (d50 * dArr14[0]);
        double[] dArr15 = ep1Var2.g;
        double d56 = ep1Var2.i;
        double d57 = ep1Var2.d;
        double d58 = ep1Var2.a;
        double d59 = dArr15[0] * d53;
        double d60 = dArr15[1] * d54;
        double d61 = dArr15[2] * d55;
        double d62 = ep1Var2.h;
        double dPow4 = Math.pow((Math.abs(d59) * d62) / 100.0d, 0.42d);
        double dPow5 = Math.pow((Math.abs(d60) * d62) / 100.0d, 0.42d);
        double dPow6 = Math.pow((Math.abs(d61) * d62) / 100.0d, 0.42d);
        double dSignum = ((Math.signum(d59) * 400.0d) * dPow4) / (dPow4 + 27.13d);
        double dSignum2 = ((Math.signum(d60) * 400.0d) * dPow5) / (dPow5 + 27.13d);
        double dSignum3 = ((Math.signum(d61) * 400.0d) * dPow6) / (dPow6 + 27.13d);
        double d63 = ((((-12.0d) * dSignum2) + (dSignum * 11.0d)) + dSignum3) / 11.0d;
        double d64 = ((dSignum + dSignum2) - (dSignum3 * 2.0d)) / 9.0d;
        double d65 = dSignum2 * 20.0d;
        double d66 = ((21.0d * dSignum3) + ((dSignum * 20.0d) + d65)) / 20.0d;
        double d67 = (((dSignum * 40.0d) + d65) + dSignum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d64, d63));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d68 = degrees;
        double radians = Math.toRadians(d68);
        double dPow7 = (Math.pow((d67 * ep1Var2.b) / d58, ep1Var2.j * d57) * 100.0d) / 100.0d;
        Math.sqrt(dPow7);
        double d69 = d58 + 4.0d;
        double dPow8 = Math.pow((Math.hypot(d63, d64) * (((((Math.cos(Math.toRadians(d68 < 20.14d ? d68 + 360.0d : d68) + 2.0d) + d4) * d5) * d6) * ep1Var2.e) * ep1Var2.c)) / (d66 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, ep1Var2.f), 0.73d);
        double dSqrt2 = Math.sqrt(dPow7) * dPow8;
        Math.sqrt((dPow8 * d57) / d69);
        Math.log1p(dSqrt2 * d56 * 0.0228d);
        Math.cos(radians);
        Math.sin(radians);
        nc0Var.a = d68;
        nc0Var.b = dSqrt2;
        nc0Var.c = (no.c(xo0.a(new double[]{no.f((iA >> 16) & 255), no.f((iA >> 8) & 255), no.f(i10)}, no.a)[1] / 100.0d) * 116.0d) - 16.0d;
        return nc0Var;
    }
}
