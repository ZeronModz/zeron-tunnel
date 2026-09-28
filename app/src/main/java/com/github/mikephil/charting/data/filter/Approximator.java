package com.github.mikephil.charting.data.filter;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class Approximator {

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public class Line {
        public Line(Approximator approximator, float f, float f2, float f3, float f4) {
            float f5 = f - f3;
            float f6 = f2 - f4;
            Math.sqrt((f6 * f6) + (f5 * f5));
        }
    }
}
