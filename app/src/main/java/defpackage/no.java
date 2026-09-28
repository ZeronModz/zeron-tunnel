package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class no {
    public static final double[][] a = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[][] b = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};
    public static final double[] c = {95.047d, 100.0d, 108.883d};

    public static int a(int i, int i2, int i3) {
        return ((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255);
    }

    public static int b(double d) {
        double d2 = d / 100.0d;
        int iRound = (int) Math.round((d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (iRound < 0) {
            return 0;
        }
        if (iRound > 255) {
            return 255;
        }
        return iRound;
    }

    public static double c(double d) {
        return d > 0.008856451679035631d ? Math.pow(d, 0.3333333333333333d) : ((d * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static double[] d(int i) {
        double dF = f((i >> 16) & 255);
        double dF2 = f((i >> 8) & 255);
        double dF3 = f(i & 255);
        double[][] dArr = a;
        double[] dArr2 = dArr[0];
        double d = (dArr2[2] * dF3) + (dArr2[1] * dF2) + (dArr2[0] * dF);
        double[] dArr3 = dArr[1];
        double d2 = (dArr3[2] * dF3) + (dArr3[1] * dF2) + (dArr3[0] * dF);
        double[] dArr4 = dArr[2];
        double d3 = (dArr4[2] * dF3) + (dArr4[1] * dF2) + (dArr4[0] * dF);
        double[] dArr5 = c;
        double d4 = d / dArr5[0];
        double d5 = d2 / dArr5[1];
        double d6 = d3 / dArr5[2];
        double dC = c(d4);
        double dC2 = c(d5);
        return new double[]{(116.0d * dC2) - 16.0d, (dC - dC2) * 500.0d, (dC2 - c(d6)) * 200.0d};
    }

    public static double e(double d) {
        double d2 = d * d * d;
        return d2 > 0.008856451679035631d ? d2 : ((d * 116.0d) - 16.0d) / 903.2962962962963d;
    }

    public static double f(int i) {
        double d = ((double) i) / 255.0d;
        return (d <= 0.040449936d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    public static double g(double d) {
        return e((d + 16.0d) / 116.0d) * 100.0d;
    }
}
