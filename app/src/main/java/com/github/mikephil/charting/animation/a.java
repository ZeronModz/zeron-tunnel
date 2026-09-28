package com.github.mikephil.charting.animation;

import com.github.mikephil.charting.animation.Easing;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Easing.EasingFunction {
    @Override // com.github.mikephil.charting.animation.Easing.EasingFunction, android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2;
        float f3;
        float f4;
        float f5 = 1.0f - f;
        if (f5 < 0.36363637f) {
            f4 = 7.5625f * f5 * f5;
        } else {
            if (f5 < 0.72727275f) {
                float f6 = f5 - 0.54545456f;
                f2 = 7.5625f * f6 * f6;
                f3 = 0.75f;
            } else if (f5 < 0.90909094f) {
                float f7 = f5 - 0.8181818f;
                f2 = 7.5625f * f7 * f7;
                f3 = 0.9375f;
            } else {
                float f8 = f5 - 0.95454544f;
                f2 = 7.5625f * f8 * f8;
                f3 = 0.984375f;
            }
            f4 = f2 + f3;
        }
        return 1.0f - f4;
    }
}
