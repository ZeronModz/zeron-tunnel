package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.FSize;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.ou0;
import defpackage.xm0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class XAxisRenderer extends AxisRenderer {
    public final XAxis h;
    public final Path i;
    public float[] j;
    public final RectF k;
    public final float[] l;
    public final RectF m;
    public final float[] n;
    public final Path o;

    public XAxisRenderer(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer) {
        super(viewPortHandler, transformer, xAxis);
        this.i = new Path();
        this.j = new float[2];
        this.k = new RectF();
        this.l = new float[2];
        this.m = new RectF();
        this.n = new float[4];
        this.o = new Path();
        this.h = xAxis;
        this.e.setColor(-16777216);
        this.e.setTextAlign(Paint.Align.CENTER);
        this.e.setTextSize(Utils.c(10.0f));
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void a(float f, float f2) {
        ViewPortHandler viewPortHandler = this.a;
        RectF rectF = viewPortHandler.b;
        RectF rectF2 = viewPortHandler.b;
        if (rectF.width() > 10.0f && !viewPortHandler.b()) {
            float f3 = rectF2.left;
            float f4 = rectF2.top;
            Transformer transformer = this.c;
            xm0 xm0VarC = transformer.c(f3, f4);
            xm0 xm0VarC2 = transformer.c(rectF2.right, rectF2.top);
            float f5 = (float) xm0VarC.b;
            float f6 = (float) xm0VarC2.b;
            xm0.c(xm0VarC);
            xm0.c(xm0VarC2);
            f = f5;
            f2 = f6;
        }
        b(f, f2);
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public final void b(float f, float f2) {
        super.b(f, f2);
        c();
    }

    public void c() {
        XAxis xAxis = this.h;
        String strC = xAxis.c();
        Paint paint = this.e;
        paint.setTypeface(null);
        paint.setTextSize(xAxis.d);
        FSize fSizeB = Utils.b(paint, strC);
        float f = fSizeB.b;
        float fA = Utils.a(paint, "Q");
        FSize fSizeF = Utils.f(f, fA, xAxis.B);
        Math.round(f);
        Math.round(fA);
        xAxis.z = Math.round(fSizeF.b);
        xAxis.A = Math.round(fSizeF.c);
        ou0 ou0Var = FSize.d;
        ou0Var.c(fSizeF);
        ou0Var.c(fSizeB);
    }

    public void d(Canvas canvas, float f, float f2, Path path) {
        ViewPortHandler viewPortHandler = this.a;
        path.moveTo(f, viewPortHandler.b.bottom);
        path.lineTo(f, viewPortHandler.b.top);
        canvas.drawPath(path, this.d);
        path.reset();
    }

    public final void e(Canvas canvas, String str, float f, float f2, MPPointF mPPointF, float f3) {
        Paint.FontMetrics fontMetrics = Utils.k;
        Paint paint = this.e;
        float fontMetrics2 = paint.getFontMetrics(fontMetrics);
        paint.getTextBounds(str, 0, str.length(), Utils.j);
        float fWidth = 0.0f - r3.left;
        float f4 = (-fontMetrics.ascent) + 0.0f;
        Paint.Align textAlign = paint.getTextAlign();
        paint.setTextAlign(Paint.Align.LEFT);
        if (f3 != 0.0f) {
            float fWidth2 = fWidth - (r3.width() * 0.5f);
            float f5 = f4 - (fontMetrics2 * 0.5f);
            if (mPPointF.b != 0.5f || mPPointF.c != 0.5f) {
                FSize fSizeF = Utils.f(r3.width(), fontMetrics2, f3);
                f -= (mPPointF.b - 0.5f) * fSizeF.b;
                f2 -= (mPPointF.c - 0.5f) * fSizeF.c;
                FSize.d.c(fSizeF);
            }
            canvas.save();
            canvas.translate(f, f2);
            canvas.rotate(f3);
            canvas.drawText(str, fWidth2, f5, paint);
            canvas.restore();
        } else {
            if (mPPointF.b != 0.0f || mPPointF.c != 0.0f) {
                fWidth -= r3.width() * mPPointF.b;
                f4 -= fontMetrics2 * mPPointF.c;
            }
            canvas.drawText(str, fWidth + f, f4 + f2, paint);
        }
        paint.setTextAlign(textAlign);
    }

    public void f(Canvas canvas, float f, MPPointF mPPointF) {
        XAxisRenderer xAxisRenderer;
        Canvas canvas2;
        float f2;
        MPPointF mPPointF2;
        XAxis xAxis = this.h;
        float f3 = xAxis.B;
        int i = xAxis.l * 2;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2 += 2) {
            fArr[i2] = xAxis.k[i2 / 2];
        }
        this.c.g(fArr);
        int i3 = 0;
        while (i3 < i) {
            float f4 = fArr[i3];
            if (this.a.h(f4)) {
                xAxisRenderer = this;
                canvas2 = canvas;
                f2 = f;
                mPPointF2 = mPPointF;
                xAxisRenderer.e(canvas2, xAxis.d().b(xAxis.k[i3 / 2]), f4, f2, mPPointF2, f3);
            } else {
                xAxisRenderer = this;
                canvas2 = canvas;
                f2 = f;
                mPPointF2 = mPPointF;
            }
            i3 += 2;
            this = xAxisRenderer;
            canvas = canvas2;
            f = f2;
            mPPointF = mPPointF2;
        }
    }

    public RectF g() {
        RectF rectF = this.a.b;
        RectF rectF2 = this.k;
        rectF2.set(rectF);
        rectF2.inset(-this.b.h, 0.0f);
        return rectF2;
    }

    public void h(Canvas canvas) {
        XAxis xAxis = this.h;
        if (xAxis.a && xAxis.q) {
            float f = xAxis.c;
            Paint paint = this.e;
            paint.setTypeface(null);
            paint.setTextSize(xAxis.d);
            paint.setColor(xAxis.e);
            MPPointF mPPointFB = MPPointF.b(0.0f, 0.0f);
            XAxis.XAxisPosition xAxisPosition = xAxis.C;
            XAxis.XAxisPosition xAxisPosition2 = XAxis.XAxisPosition.TOP;
            ViewPortHandler viewPortHandler = this.a;
            if (xAxisPosition == xAxisPosition2) {
                mPPointFB.b = 0.5f;
                mPPointFB.c = 1.0f;
                f(canvas, viewPortHandler.b.top - f, mPPointFB);
            } else if (xAxisPosition == XAxis.XAxisPosition.TOP_INSIDE) {
                mPPointFB.b = 0.5f;
                mPPointFB.c = 1.0f;
                f(canvas, viewPortHandler.b.top + f + xAxis.A, mPPointFB);
            } else if (xAxisPosition == XAxis.XAxisPosition.BOTTOM) {
                mPPointFB.b = 0.5f;
                mPPointFB.c = 0.0f;
                f(canvas, viewPortHandler.b.bottom + f, mPPointFB);
            } else if (xAxisPosition == XAxis.XAxisPosition.BOTTOM_INSIDE) {
                mPPointFB.b = 0.5f;
                mPPointFB.c = 0.0f;
                f(canvas, (viewPortHandler.b.bottom - f) - xAxis.A, mPPointFB);
            } else {
                mPPointFB.b = 0.5f;
                mPPointFB.c = 1.0f;
                f(canvas, viewPortHandler.b.top - f, mPPointFB);
                mPPointFB.b = 0.5f;
                mPPointFB.c = 0.0f;
                f(canvas, viewPortHandler.b.bottom + f, mPPointFB);
            }
            MPPointF.d(mPPointFB);
        }
    }

    public void i(Canvas canvas) {
        Canvas canvas2;
        XAxis xAxis = this.h;
        if (xAxis.p && xAxis.a) {
            int i = xAxis.i;
            Paint paint = this.f;
            paint.setColor(i);
            paint.setStrokeWidth(xAxis.j);
            paint.setPathEffect(null);
            XAxis.XAxisPosition xAxisPosition = xAxis.C;
            XAxis.XAxisPosition xAxisPosition2 = XAxis.XAxisPosition.TOP;
            ViewPortHandler viewPortHandler = this.a;
            if (xAxisPosition == xAxisPosition2 || xAxisPosition == XAxis.XAxisPosition.TOP_INSIDE || xAxisPosition == XAxis.XAxisPosition.BOTH_SIDED) {
                RectF rectF = viewPortHandler.b;
                float f = rectF.left;
                float f2 = rectF.top;
                canvas2 = canvas;
                canvas2.drawLine(f, f2, rectF.right, f2, paint);
            } else {
                canvas2 = canvas;
            }
            XAxis.XAxisPosition xAxisPosition3 = xAxis.C;
            if (xAxisPosition3 == XAxis.XAxisPosition.BOTTOM || xAxisPosition3 == XAxis.XAxisPosition.BOTTOM_INSIDE || xAxisPosition3 == XAxis.XAxisPosition.BOTH_SIDED) {
                RectF rectF2 = viewPortHandler.b;
                float f3 = rectF2.left;
                float f4 = rectF2.bottom;
                canvas2.drawLine(f3, f4, rectF2.right, f4, paint);
            }
        }
    }

    public final void j(Canvas canvas) {
        XAxis xAxis = this.h;
        if (xAxis.o && xAxis.a) {
            int iSave = canvas.save();
            canvas.clipRect(g());
            float[] fArr = this.j;
            if (fArr.length != this.b.l * 2) {
                fArr = new float[xAxis.l * 2];
                this.j = fArr;
            }
            for (int i = 0; i < fArr.length; i += 2) {
                float[] fArr2 = xAxis.k;
                int i2 = i / 2;
                fArr[i] = fArr2[i2];
                fArr[i + 1] = fArr2[i2];
            }
            this.c.g(fArr);
            int i3 = xAxis.g;
            Paint paint = this.d;
            paint.setColor(i3);
            paint.setStrokeWidth(xAxis.h);
            paint.setPathEffect(null);
            Path path = this.i;
            path.reset();
            for (int i4 = 0; i4 < fArr.length; i4 += 2) {
                d(canvas, fArr[i4], fArr[i4 + 1], path);
            }
            canvas.restoreToCount(iSave);
        }
    }

    public void k(Canvas canvas) {
        char c;
        ArrayList arrayList = this.h.r;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        float[] fArr = this.l;
        char c2 = 0;
        float f = 0.0f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        int i = 0;
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
                rectF3.inset(-f2, f);
                canvas.clipRect(rectF3);
                fArr[c2] = limitLine.f;
                fArr[1] = f;
                this.c.g(fArr);
                float f3 = fArr[c2];
                float[] fArr2 = this.n;
                fArr2[c2] = f3;
                fArr2[1] = rectF2.top;
                fArr2[2] = fArr[c2];
                fArr2[3] = rectF2.bottom;
                Path path = this.o;
                path.reset();
                c = c2;
                path.moveTo(fArr2[c], fArr2[1]);
                path.lineTo(fArr2[2], fArr2[3]);
                Paint.Style style = Paint.Style.STROKE;
                Paint paint = this.g;
                paint.setStyle(style);
                paint.setColor(limitLine.h);
                paint.setStrokeWidth(f2);
                paint.setPathEffect(null);
                canvas.drawPath(path, paint);
                float f4 = limitLine.c + 2.0f;
                String str = limitLine.j;
                if (str != null && !str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
                    paint.setStyle(limitLine.i);
                    paint.setPathEffect(null);
                    paint.setColor(limitLine.e);
                    paint.setStrokeWidth(0.5f);
                    paint.setTextSize(limitLine.d);
                    float f5 = f2 + limitLine.b;
                    LimitLine.LimitLabelPosition limitLabelPosition = limitLine.k;
                    if (limitLabelPosition == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                        float fA = Utils.a(paint, str);
                        paint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(str, fArr[c] + f5, rectF2.top + f4 + fA, paint);
                    } else if (limitLabelPosition == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                        paint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(str, fArr[c] + f5, rectF2.bottom - f4, paint);
                    } else if (limitLabelPosition == LimitLine.LimitLabelPosition.LEFT_TOP) {
                        paint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(str, fArr[c] - f5, rectF2.top + f4 + Utils.a(paint, str), paint);
                    } else {
                        paint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(str, fArr[c] - f5, rectF2.bottom - f4, paint);
                    }
                }
                canvas.restoreToCount(iSave);
            } else {
                c = c2;
            }
            i++;
            c2 = c;
            f = 0.0f;
        }
    }
}
