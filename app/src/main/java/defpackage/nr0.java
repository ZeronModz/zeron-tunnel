package defpackage;

import androidx.constraintlayout.motion.widget.MotionInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nr0 extends MotionInterpolator {
    public float a = 0.0f;
    public float b = 0.0f;
    public float c;
    public final /* synthetic */ MotionLayout d;

    public nr0(MotionLayout motionLayout) {
        this.d = motionLayout;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
    public final float a() {
        return this.d.u;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = this.a;
        float f3 = this.c;
        MotionLayout motionLayout = this.d;
        if (f2 > 0.0f) {
            float f4 = f2 / f3;
            if (f4 < f) {
                f = f4;
            }
            float f5 = f3 * f;
            motionLayout.u = f2 - f5;
            return ((f2 * f) - ((f5 * f) / 2.0f)) + this.b;
        }
        float f6 = (-f2) / f3;
        if (f6 < f) {
            f = f6;
        }
        float f7 = f3 * f;
        motionLayout.u = f7 + f2;
        return ((f7 * f) / 2.0f) + (f2 * f) + this.b;
    }
}
