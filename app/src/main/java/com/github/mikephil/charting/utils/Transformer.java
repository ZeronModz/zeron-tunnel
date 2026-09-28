package com.github.mikephil.charting.utils;

import android.graphics.Matrix;
import android.graphics.Path;
import defpackage.xm0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class Transformer {
    public final ViewPortHandler c;
    public final Matrix a = new Matrix();
    public final Matrix b = new Matrix();
    public float[] d = new float[1];
    public float[] e = new float[1];
    public float[] f = new float[1];
    public float[] g = new float[1];
    public final Matrix h = new Matrix();
    public final float[] i = new float[2];
    public final Matrix j = new Matrix();

    public Transformer(ViewPortHandler viewPortHandler) {
        new Matrix();
        this.c = viewPortHandler;
    }

    public final xm0 a(float f, float f2) {
        float[] fArr = this.i;
        fArr[0] = f;
        fArr[1] = f2;
        g(fArr);
        return xm0.b(fArr[0], fArr[1]);
    }

    public final Matrix b() {
        Matrix matrix = this.a;
        Matrix matrix2 = this.j;
        matrix2.set(matrix);
        matrix2.postConcat(this.c.a);
        matrix2.postConcat(this.b);
        return matrix2;
    }

    public final xm0 c(float f, float f2) {
        xm0 xm0VarB = xm0.b(0.0d, 0.0d);
        d(f, f2, xm0VarB);
        return xm0VarB;
    }

    public final void d(float f, float f2, xm0 xm0Var) {
        float[] fArr = this.i;
        fArr[0] = f;
        fArr[1] = f2;
        f(fArr);
        xm0Var.b = fArr[0];
        xm0Var.c = fArr[1];
    }

    public final void e(Path path) {
        path.transform(this.a);
        path.transform(this.c.a);
        path.transform(this.b);
    }

    public final void f(float[] fArr) {
        Matrix matrix = this.h;
        matrix.reset();
        this.b.invert(matrix);
        matrix.mapPoints(fArr);
        this.c.a.invert(matrix);
        matrix.mapPoints(fArr);
        this.a.invert(matrix);
        matrix.mapPoints(fArr);
    }

    public final void g(float[] fArr) {
        this.a.mapPoints(fArr);
        this.c.a.mapPoints(fArr);
        this.b.mapPoints(fArr);
    }

    public void h() {
        Matrix matrix = this.b;
        matrix.reset();
        ViewPortHandler viewPortHandler = this.c;
        matrix.postTranslate(viewPortHandler.b.left, viewPortHandler.d - viewPortHandler.k());
    }

    public final void i(float f, float f2, float f3, float f4) {
        ViewPortHandler viewPortHandler = this.c;
        float fWidth = viewPortHandler.b.width() / f2;
        float fHeight = viewPortHandler.b.height() / f3;
        if (Float.isInfinite(fWidth)) {
            fWidth = 0.0f;
        }
        if (Float.isInfinite(fHeight)) {
            fHeight = 0.0f;
        }
        Matrix matrix = this.a;
        matrix.reset();
        matrix.postTranslate(-f, -f4);
        matrix.postScale(fWidth, -fHeight);
    }
}
