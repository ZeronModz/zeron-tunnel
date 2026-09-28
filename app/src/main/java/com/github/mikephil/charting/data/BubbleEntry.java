package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class BubbleEntry extends Entry {
    public final float e;

    public BubbleEntry(float f, float f2, float f3) {
        super(f, f2);
        this.e = f3;
    }

    public BubbleEntry(float f, float f2, float f3, Object obj) {
        super(f, f2, obj);
        this.e = f3;
    }

    public BubbleEntry(float f, float f2, float f3, Drawable drawable) {
        super(f, f2, drawable);
        this.e = f3;
    }

    public BubbleEntry(float f, float f2, float f3, Drawable drawable, Object obj) {
        super(f, f2, drawable, obj);
        this.e = f3;
    }
}
