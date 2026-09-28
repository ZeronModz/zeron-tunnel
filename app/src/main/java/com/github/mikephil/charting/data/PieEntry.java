package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class PieEntry extends Entry {
    public final String e;

    public PieEntry(float f, String str) {
        super(0.0f, f);
        this.e = str;
    }

    @Override // com.github.mikephil.charting.data.Entry
    public final float b() {
        return this.d;
    }

    public PieEntry(float f, Object obj) {
        super(0.0f, f, obj);
    }

    public PieEntry(float f, Drawable drawable) {
        super(0.0f, f, drawable);
    }

    public PieEntry(float f, Drawable drawable, Object obj) {
        super(0.0f, f, drawable, obj);
    }

    public PieEntry(float f) {
        super(0.0f, f);
    }

    public PieEntry(float f, String str, Object obj) {
        super(0.0f, f, obj);
        this.e = str;
    }

    public PieEntry(float f, String str, Drawable drawable) {
        super(0.0f, f, drawable);
        this.e = str;
    }

    public PieEntry(float f, String str, Drawable drawable, Object obj) {
        super(0.0f, f, drawable, obj);
        this.e = str;
    }
}
