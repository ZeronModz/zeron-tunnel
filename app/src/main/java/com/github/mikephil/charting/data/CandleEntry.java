package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class CandleEntry extends Entry {
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public CandleEntry(float f, float f2, float f3, float f4, float f5) {
        super(f, (f2 + f3) / 2.0f);
        this.e = f2;
        this.f = f3;
        this.h = f4;
        this.g = f5;
    }

    @Override // com.github.mikephil.charting.data.BaseEntry
    public final float a() {
        return this.a;
    }

    public CandleEntry(float f, float f2, float f3, float f4, float f5, Object obj) {
        super(f, (f2 + f3) / 2.0f, obj);
        this.e = f2;
        this.f = f3;
        this.h = f4;
        this.g = f5;
    }

    public CandleEntry(float f, float f2, float f3, float f4, float f5, Drawable drawable) {
        super(f, (f2 + f3) / 2.0f, drawable);
        this.e = f2;
        this.f = f3;
        this.h = f4;
        this.g = f5;
    }

    public CandleEntry(float f, float f2, float f3, float f4, float f5, Drawable drawable, Object obj) {
        super(f, (f2 + f3) / 2.0f, drawable, obj);
        this.e = f2;
        this.f = f3;
        this.h = f4;
        this.g = f5;
    }
}
