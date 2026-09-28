package defpackage;

import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.MonotonicCurveFit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ja1 extends Easing {
    public MonotonicCurveFit d;

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public final double a(double d) {
        return this.d.b(d);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public final double b(double d) {
        return this.d.e(d);
    }
}
