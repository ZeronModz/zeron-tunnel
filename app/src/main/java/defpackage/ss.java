package defpackage;

import androidx.constraintlayout.core.motion.utils.CurveFit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ss extends CurveFit {
    public double a;
    public double[] b;

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final double b(double d) {
        return this.b[0];
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final void c(double d, double[] dArr) {
        double[] dArr2 = this.b;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final void d(double d, float[] fArr) {
        int i = 0;
        while (true) {
            double[] dArr = this.b;
            if (i >= dArr.length) {
                return;
            }
            fArr[i] = (float) dArr[i];
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final double e(double d) {
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final void f(double d, double[] dArr) {
        for (int i = 0; i < this.b.length; i++) {
            dArr[i] = 0.0d;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public final double[] g() {
        return new double[]{this.a};
    }
}
