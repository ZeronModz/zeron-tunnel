package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.FSize;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xm0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class XAxisRendererHorizontalBarChart extends XAxisRenderer {
    public final Path p;

    public XAxisRendererHorizontalBarChart(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, BarChart barChart) {
        super(viewPortHandler, xAxis, transformer);
        this.p = new Path();
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public final void a(float f, float f2) {
        ViewPortHandler viewPortHandler = this.a;
        RectF rectF = viewPortHandler.b;
        RectF rectF2 = viewPortHandler.b;
        if (rectF.width() > 10.0f && !viewPortHandler.c()) {
            float f3 = rectF2.left;
            float f4 = rectF2.bottom;
            Transformer transformer = this.c;
            xm0 xm0VarC = transformer.c(f3, f4);
            xm0 xm0VarC2 = transformer.c(rectF2.left, rectF2.top);
            float f5 = (float) xm0VarC.c;
            float f6 = (float) xm0VarC2.c;
            xm0.c(xm0VarC);
            xm0.c(xm0VarC2);
            f = f5;
            f2 = f6;
        }
        b(f, f2);
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void c() {
        XAxis xAxis = this.h;
        xAxis.getClass();
        Paint paint = this.e;
        paint.setTypeface(null);
        paint.setTextSize(xAxis.d);
        FSize fSizeB = Utils.b(paint, xAxis.c());
        float f = fSizeB.b;
        float f2 = (int) ((xAxis.b * 3.5f) + f);
        float f3 = fSizeB.c;
        FSize fSizeF = Utils.f(f, f3, xAxis.B);
        Math.round(f2);
        Math.round(f3);
        xAxis.z = (int) ((xAxis.b * 3.5f) + fSizeF.b);
        xAxis.A = Math.round(fSizeF.c);
        FSize.d.c(fSizeF);
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void d(Canvas canvas, float f, float f2, Path path) {
        ViewPortHandler viewPortHandler = this.a;
        path.moveTo(viewPortHandler.b.right, f2);
        path.lineTo(viewPortHandler.b.left, f2);
        canvas.drawPath(path, this.d);
        path.reset();
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void f(Canvas canvas, float f, MPPointF mPPointF) {
        XAxisRendererHorizontalBarChart xAxisRendererHorizontalBarChart;
        Canvas canvas2;
        float f2;
        MPPointF mPPointF2;
        XAxis xAxis = this.h;
        float f3 = xAxis.B;
        int i = xAxis.l * 2;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2 += 2) {
            fArr[i2 + 1] = xAxis.k[i2 / 2];
        }
        this.c.g(fArr);
        int i3 = 0;
        while (i3 < i) {
            float f4 = fArr[i3 + 1];
            if (this.a.i(f4)) {
                xAxisRendererHorizontalBarChart = this;
                canvas2 = canvas;
                f2 = f;
                mPPointF2 = mPPointF;
                xAxisRendererHorizontalBarChart.e(canvas2, xAxis.d().b(xAxis.k[i3 / 2]), f2, f4, mPPointF2, f3);
            } else {
                xAxisRendererHorizontalBarChart = this;
                canvas2 = canvas;
                f2 = f;
                mPPointF2 = mPPointF;
            }
            i3 += 2;
            this = xAxisRendererHorizontalBarChart;
            canvas = canvas2;
            f = f2;
            mPPointF = mPPointF2;
        }
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final RectF g() {
        RectF rectF = this.a.b;
        RectF rectF2 = this.k;
        rectF2.set(rectF);
        rectF2.inset(0.0f, -this.b.h);
        return rectF2;
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void h(Canvas canvas) {
        XAxis xAxis = this.h;
        if (xAxis.a && xAxis.q) {
            float f = xAxis.b;
            Paint paint = this.e;
            paint.setTypeface(null);
            paint.setTextSize(xAxis.d);
            paint.setColor(xAxis.e);
            MPPointF mPPointFB = MPPointF.b(0.0f, 0.0f);
            XAxis.XAxisPosition xAxisPosition = xAxis.C;
            XAxis.XAxisPosition xAxisPosition2 = XAxis.XAxisPosition.TOP;
            ViewPortHandler viewPortHandler = this.a;
            if (xAxisPosition == xAxisPosition2) {
                mPPointFB.b = 0.0f;
                mPPointFB.c = 0.5f;
                f(canvas, viewPortHandler.b.right + f, mPPointFB);
            } else if (xAxisPosition == XAxis.XAxisPosition.TOP_INSIDE) {
                mPPointFB.b = 1.0f;
                mPPointFB.c = 0.5f;
                f(canvas, viewPortHandler.b.right - f, mPPointFB);
            } else if (xAxisPosition == XAxis.XAxisPosition.BOTTOM) {
                mPPointFB.b = 1.0f;
                mPPointFB.c = 0.5f;
                f(canvas, viewPortHandler.b.left - f, mPPointFB);
            } else if (xAxisPosition == XAxis.XAxisPosition.BOTTOM_INSIDE) {
                mPPointFB.b = 1.0f;
                mPPointFB.c = 0.5f;
                f(canvas, viewPortHandler.b.left + f, mPPointFB);
            } else {
                mPPointFB.b = 0.0f;
                mPPointFB.c = 0.5f;
                f(canvas, viewPortHandler.b.right + f, mPPointFB);
                mPPointFB.b = 1.0f;
                mPPointFB.c = 0.5f;
                f(canvas, viewPortHandler.b.left - f, mPPointFB);
            }
            MPPointF.d(mPPointFB);
        }
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void i(Canvas canvas) {
        Canvas canvas2;
        XAxis xAxis = this.h;
        if (xAxis.p && xAxis.a) {
            int i = xAxis.i;
            Paint paint = this.f;
            paint.setColor(i);
            paint.setStrokeWidth(xAxis.j);
            XAxis.XAxisPosition xAxisPosition = xAxis.C;
            XAxis.XAxisPosition xAxisPosition2 = XAxis.XAxisPosition.TOP;
            ViewPortHandler viewPortHandler = this.a;
            if (xAxisPosition == xAxisPosition2 || xAxisPosition == XAxis.XAxisPosition.TOP_INSIDE || xAxisPosition == XAxis.XAxisPosition.BOTH_SIDED) {
                RectF rectF = viewPortHandler.b;
                float f = rectF.right;
                canvas2 = canvas;
                canvas2.drawLine(f, rectF.top, f, rectF.bottom, paint);
            } else {
                canvas2 = canvas;
            }
            XAxis.XAxisPosition xAxisPosition3 = xAxis.C;
            if (xAxisPosition3 == XAxis.XAxisPosition.BOTTOM || xAxisPosition3 == XAxis.XAxisPosition.BOTTOM_INSIDE || xAxisPosition3 == XAxis.XAxisPosition.BOTH_SIDED) {
                RectF rectF2 = viewPortHandler.b;
                float f2 = rectF2.left;
                canvas2.drawLine(f2, rectF2.top, f2, rectF2.bottom, paint);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void k(Canvas canvas) {
        ArrayList arrayList = this.h.r;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        float[] fArr = this.l;
        int i = 0;
        float f = 0.0f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Path path = this.p;
        path.reset();
        while (i < arrayList.size()) {
            LimitLine limitLine = (LimitLine) arrayList.get(i);
            boolean z = limitLine.a;
            float f2 = limitLine.g;
            if (z) {
                int iSave = canvas.save();
                ViewPortHandler viewPortHandler = this.a;
                RectF rectF = viewPortHandler.b;
                RectF rectF2 = viewPortHandler.b;
                RectF rectF3 = this.m;
                rectF3.set(rectF);
                rectF3.inset(f, -f2);
                canvas.clipRect(rectF3);
                Paint.Style style = Paint.Style.STROKE;
                Paint paint = this.g;
                paint.setStyle(style);
                paint.setColor(limitLine.h);
                paint.setStrokeWidth(f2);
                paint.setPathEffect(null);
                fArr[1] = limitLine.f;
                this.c.g(fArr);
                path.moveTo(rectF2.left, fArr[1]);
                path.lineTo(rectF2.right, fArr[1]);
                canvas.drawPath(path, paint);
                path.reset();
                String str = limitLine.j;
                if (str != null && !str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
                    paint.setStyle(limitLine.i);
                    paint.setPathEffect(null);
                    paint.setColor(limitLine.e);
                    paint.setStrokeWidth(0.5f);
                    paint.setTextSize(limitLine.d);
                    float fA = Utils.a(paint, str);
                    float fC = Utils.c(4.0f) + limitLine.b;
                    float f3 = f2 + fA + limitLine.c;
                    LimitLine.LimitLabelPosition limitLabelPosition = limitLine.k;
                    if (limitLabelPosition == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                        paint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(str, rectF2.right - fC, (fArr[1] - f3) + fA, paint);
                    } else if (limitLabelPosition == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                        paint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(str, rectF2.right - fC, fArr[1] + f3, paint);
                    } else if (limitLabelPosition == LimitLine.LimitLabelPosition.LEFT_TOP) {
                        paint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(str, rectF2.left + fC, (fArr[1] - f3) + fA, paint);
                    } else {
                        paint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(str, rectF2.left + fC, fArr[1] + f3, paint);
                    }
                }
                canvas.restoreToCount(iSave);
            }
            i++;
            f = 0.0f;
        }
    }
}
