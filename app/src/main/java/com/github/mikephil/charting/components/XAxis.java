package com.github.mikephil.charting.components;

import com.github.mikephil.charting.utils.Utils;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class XAxis extends AxisBase {
    public int z = 1;
    public int A = 1;
    public float B = 0.0f;
    public XAxisPosition C = XAxisPosition.TOP;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public enum XAxisPosition {
        TOP,
        BOTTOM,
        BOTH_SIDED,
        TOP_INSIDE,
        BOTTOM_INSIDE
    }

    public XAxis() {
        this.c = Utils.c(4.0f);
    }
}
