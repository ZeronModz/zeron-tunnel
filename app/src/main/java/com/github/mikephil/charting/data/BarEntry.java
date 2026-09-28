package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.highlight.Range;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class BarEntry extends Entry {
    public final float[] e;
    public Range[] f;
    public float g;
    public float h;

    public BarEntry(float f, float[] fArr) {
        super(f, e(fArr));
        this.e = fArr;
        c();
        d();
    }

    public static float e(float[] fArr) {
        float f = 0.0f;
        if (fArr == null) {
            return 0.0f;
        }
        for (float f2 : fArr) {
            f += f2;
        }
        return f;
    }

    @Override // com.github.mikephil.charting.data.BaseEntry
    public final float a() {
        return this.a;
    }

    public final void c() {
        float[] fArr = this.e;
        if (fArr == null) {
            this.g = 0.0f;
            this.h = 0.0f;
            return;
        }
        float fAbs = 0.0f;
        float f = 0.0f;
        for (float f2 : fArr) {
            if (f2 <= 0.0f) {
                fAbs += Math.abs(f2);
            } else {
                f += f2;
            }
        }
        this.g = fAbs;
        this.h = f;
    }

    public final void d() {
        float[] fArr = this.e;
        if (fArr == null || fArr.length == 0) {
            return;
        }
        this.f = new Range[fArr.length];
        float f = -this.g;
        int i = 0;
        float f2 = 0.0f;
        while (true) {
            Range[] rangeArr = this.f;
            if (i >= rangeArr.length) {
                return;
            }
            float f3 = fArr[i];
            if (f3 < 0.0f) {
                float f4 = f - f3;
                rangeArr[i] = new Range(f, f4);
                f = f4;
            } else {
                float f5 = f3 + f2;
                rangeArr[i] = new Range(f2, f5);
                f2 = f5;
            }
            i++;
        }
    }

    public BarEntry(float f, float f2, Object obj) {
        super(f, f2, obj);
    }

    public BarEntry(float f, float f2, Drawable drawable) {
        super(f, f2, drawable);
    }

    public BarEntry(float f, float f2, Drawable drawable, Object obj) {
        super(f, f2, drawable, obj);
    }

    public BarEntry(float f, float f2) {
        super(f, f2);
    }

    public BarEntry(float f, float[] fArr, Object obj) {
        super(f, e(fArr), obj);
        this.e = fArr;
        c();
        d();
    }

    public BarEntry(float f, float[] fArr, Drawable drawable) {
        super(f, e(fArr), drawable);
        this.e = fArr;
        c();
        d();
    }

    public BarEntry(float f, float[] fArr, Drawable drawable, Object obj) {
        super(f, e(fArr), drawable, obj);
        this.e = fArr;
        c();
        d();
    }
}
