package com.github.mikephil.charting.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.github.mikephil.charting.formatter.DefaultValueFormatter;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Utils {
    public static DisplayMetrics a = null;
    public static int b = 50;
    public static int c = 8000;
    public static final float d;
    public static final Rect e;
    public static final Paint.FontMetrics f;
    public static final Rect g;
    public static final DefaultValueFormatter h;
    public static final Rect i;
    public static final Rect j;
    public static final Paint.FontMetrics k;

    static {
        Double.longBitsToDouble(1L);
        d = Float.intBitsToFloat(1);
        e = new Rect();
        f = new Paint.FontMetrics();
        g = new Rect();
        h = new DefaultValueFormatter(1);
        i = new Rect();
        j = new Rect();
        k = new Paint.FontMetrics();
    }

    public static int a(Paint paint, String str) {
        Rect rect = e;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static FSize b(Paint paint, String str) {
        FSize fSize = (FSize) FSize.d.b();
        fSize.b = 0.0f;
        fSize.c = 0.0f;
        Rect rect = g;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        fSize.b = rect.width();
        fSize.c = rect.height();
        return fSize;
    }

    public static float c(float f2) {
        DisplayMetrics displayMetrics = a;
        return displayMetrics == null ? f2 : f2 * displayMetrics.density;
    }

    public static void d(Canvas canvas, Drawable drawable, int i2, int i3, int i4, int i5) {
        MPPointF mPPointF = (MPPointF) MPPointF.d.b();
        mPPointF.b = i2 - (i4 / 2);
        mPPointF.c = i3 - (i5 / 2);
        Rect rect = i;
        drawable.copyBounds(rect);
        int i6 = rect.left;
        int i7 = rect.top;
        drawable.setBounds(i6, i7, i6 + i4, i4 + i7);
        int iSave = canvas.save();
        canvas.translate(mPPointF.b, mPPointF.c);
        drawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public static void e(MPPointF mPPointF, float f2, float f3, MPPointF mPPointF2) {
        double d2 = f2;
        double d3 = f3;
        mPPointF2.b = (float) ((Math.cos(Math.toRadians(d3)) * d2) + ((double) mPPointF.b));
        mPPointF2.c = (float) ((Math.sin(Math.toRadians(d3)) * d2) + ((double) mPPointF.c));
    }

    public static FSize f(float f2, float f3, float f4) {
        double d2 = f4 * 0.017453292f;
        float fAbs = Math.abs(((float) Math.sin(d2)) * f3) + Math.abs(((float) Math.cos(d2)) * f2);
        float fAbs2 = Math.abs(f3 * ((float) Math.cos(d2))) + Math.abs(f2 * ((float) Math.sin(d2)));
        FSize fSize = (FSize) FSize.d.b();
        fSize.b = fAbs;
        fSize.c = fAbs2;
        return fSize;
    }

    public static double g(double d2) {
        if (d2 == Double.POSITIVE_INFINITY) {
            return d2;
        }
        double d3 = d2 + 0.0d;
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d3) + (d3 >= 0.0d ? 1L : -1L));
    }

    public static float h(double d2) {
        if (Double.isInfinite(d2) || Double.isNaN(d2) || d2 == 0.0d) {
            return 0.0f;
        }
        return Math.round(d2 * ((double) r0)) / ((float) Math.pow(10.0d, 1 - ((int) Math.ceil((float) Math.log10(d2 < 0.0d ? -d2 : d2)))));
    }
}
