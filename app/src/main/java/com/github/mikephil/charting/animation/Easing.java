package com.github.mikephil.charting.animation;

import android.animation.TimeInterpolator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class Easing {

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface EasingFunction extends TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        float getInterpolation(float f);
    }
}
