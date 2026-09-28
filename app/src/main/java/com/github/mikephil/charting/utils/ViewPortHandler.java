package com.github.mikephil.charting.utils;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class ViewPortHandler {
    public final Matrix a = new Matrix();
    public final RectF b = new RectF();
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public float f = Float.MAX_VALUE;
    public float g = 1.0f;
    public float h = Float.MAX_VALUE;
    public float i = 1.0f;
    public float j = 1.0f;
    public float k = 0.0f;
    public float l = 0.0f;
    public float m = 0.0f;
    public final Matrix n = new Matrix();
    public final float[] o = new float[9];

    public final void a(View view, float[] fArr) {
        Matrix matrix = this.n;
        matrix.reset();
        matrix.set(this.a);
        float f = fArr[0];
        RectF rectF = this.b;
        matrix.postTranslate(-(f - rectF.left), -(fArr[1] - rectF.top));
        l(matrix, view, true);
    }

    public final boolean b() {
        float f = this.i;
        float f2 = this.g;
        return f <= f2 && f2 <= 1.0f;
    }

    public final boolean c() {
        float f = this.j;
        float f2 = this.e;
        return f <= f2 && f2 <= 1.0f;
    }

    public final boolean d(float f) {
        return this.b.bottom >= ((float) ((int) (f * 100.0f))) / 100.0f;
    }

    public final boolean e(float f) {
        return this.b.left <= f + 1.0f;
    }

    public final boolean f(float f) {
        return this.b.right >= (((float) ((int) (f * 100.0f))) / 100.0f) - 1.0f;
    }

    public final boolean g(float f) {
        return this.b.top <= f;
    }

    public final boolean h(float f) {
        return e(f) && f(f);
    }

    public final boolean i(float f) {
        return g(f) && d(f);
    }

    public final void j(Matrix matrix, RectF rectF) {
        float fWidth;
        float fHeight;
        float[] fArr = this.o;
        matrix.getValues(fArr);
        float f = fArr[2];
        float f2 = fArr[0];
        float f3 = fArr[5];
        float f4 = fArr[4];
        this.i = Math.min(Math.max(this.g, f2), this.h);
        this.j = Math.min(Math.max(this.e, f4), this.f);
        if (rectF != null) {
            fWidth = rectF.width();
            fHeight = rectF.height();
        } else {
            fWidth = 0.0f;
            fHeight = 0.0f;
        }
        this.k = Math.min(Math.max(f, ((this.i - 1.0f) * (-fWidth)) - this.l), this.l);
        float fMax = Math.max(Math.min(f3, ((this.j - 1.0f) * fHeight) + this.m), -this.m);
        fArr[2] = this.k;
        fArr[0] = this.i;
        fArr[5] = fMax;
        fArr[4] = this.j;
        matrix.setValues(fArr);
    }

    public final float k() {
        return this.d - this.b.bottom;
    }

    public final void l(Matrix matrix, View view, boolean z) {
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        j(matrix2, this.b);
        if (z) {
            view.invalidate();
        }
        matrix.set(matrix2);
    }

    public final void m(float f, float f2, float f3, float f4) {
        this.b.set(f, f2, this.c - f3, this.d - f4);
    }

    public final void n(float[] fArr, Matrix matrix) {
        matrix.reset();
        matrix.set(this.a);
        float f = fArr[0];
        RectF rectF = this.b;
        matrix.postTranslate(-(f - rectF.left), -(fArr[1] - rectF.top));
    }
}
