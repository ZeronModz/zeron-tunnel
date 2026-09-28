package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xm0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class YAxisRendererHorizontalBarChart extends YAxisRenderer {
    public final Path o;
    public final float[] p;

    public YAxisRendererHorizontalBarChart(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
        super(viewPortHandler, yAxis, transformer);
        new Path();
        this.o = new Path();
        this.p = new float[4];
        this.g.setTextAlign(Paint.Align.LEFT);
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public final void a(float f, float f2) {
        ViewPortHandler viewPortHandler = this.a;
        RectF rectF = viewPortHandler.b;
        RectF rectF2 = viewPortHandler.b;
        if (rectF.height() > 10.0f && !viewPortHandler.b()) {
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

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public final void c(Canvas canvas, float f, float[] fArr, float f2) {
        YAxis yAxis = this.h;
        yAxis.getClass();
        Paint paint = this.e;
        paint.setTypeface(null);
        paint.setTextSize(yAxis.d);
        paint.setColor(yAxis.e);
        boolean z = yAxis.A;
        int i = yAxis.l;
        if (!z) {
            i--;
        }
        for (int i2 = !yAxis.z ? 1 : 0; i2 < i; i2++) {
            canvas.drawText(yAxis.b(i2), fArr[i2 * 2], f - f2, paint);
        }
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public final RectF d() {
        RectF rectF = this.a.b;
        RectF rectF2 = this.j;
        rectF2.set(rectF);
        rectF2.inset(-this.b.h, 0.0f);
        return rectF2;
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public final float[] e() {
        float[] fArr = this.k;
        int length = fArr.length;
        YAxis yAxis = this.h;
        int i = yAxis.l;
        if (length != i * 2) {
            fArr = new float[i * 2];
            this.k = fArr;
        }
        for (int i2 = 0; i2 < fArr.length; i2 += 2) {
            fArr[i2] = yAxis.k[i2 / 2];
        }
        this.c.g(fArr);
        return fArr;
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public final Path f(Path path, int i, float[] fArr) {
        float f = fArr[i];
        ViewPortHandler viewPortHandler = this.a;
        path.moveTo(f, viewPortHandler.b.top);
        path.lineTo(fArr[i], viewPortHandler.b.bottom);
        return path;
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public final void g(Canvas canvas) {
        float f;
        YAxis yAxis = this.h;
        if (yAxis.a && yAxis.q) {
            float[] fArrE = e();
            Paint paint = this.e;
            paint.setTypeface(null);
            paint.setTextSize(yAxis.d);
            paint.setColor(yAxis.e);
            paint.setTextAlign(Paint.Align.CENTER);
            float fC = Utils.c(2.5f);
            float fA = Utils.a(paint, "Q");
            YAxis.AxisDependency axisDependency = yAxis.E;
            YAxis.YAxisLabelPosition yAxisLabelPosition = yAxis.D;
            YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.LEFT;
            ViewPortHandler viewPortHandler = this.a;
            if (axisDependency == axisDependency2) {
                f = (yAxisLabelPosition == YAxis.YAxisLabelPosition.OUTSIDE_CHART ? viewPortHandler.b.top : viewPortHandler.b.top) - fC;
            } else {
                f = (yAxisLabelPosition == YAxis.YAxisLabelPosition.OUTSIDE_CHART ? viewPortHandler.b.bottom : viewPortHandler.b.bottom) + fA + fC;
            }
            c(canvas, f, fArrE, yAxis.c);
        }
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public final void h(Canvas canvas) {
        YAxis yAxis = this.h;
        if (yAxis.a && yAxis.p) {
            int i = yAxis.i;
            Paint paint = this.f;
            paint.setColor(i);
            paint.setStrokeWidth(yAxis.j);
            YAxis.AxisDependency axisDependency = yAxis.E;
            YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.LEFT;
            ViewPortHandler viewPortHandler = this.a;
            if (axisDependency == axisDependency2) {
                RectF rectF = viewPortHandler.b;
                float f = rectF.left;
                float f2 = rectF.top;
                canvas.drawLine(f, f2, rectF.right, f2, paint);
                return;
            }
            RectF rectF2 = viewPortHandler.b;
            float f3 = rectF2.left;
            float f4 = rectF2.bottom;
            canvas.drawLine(f3, f4, rectF2.right, f4, paint);
        }
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public final void j(Canvas canvas) {
        char c;
        ArrayList arrayList = this.h.r;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        float[] fArr = this.p;
        char c2 = 0;
        float f = 0.0f;
        fArr[0] = 0.0f;
        char c3 = 1;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        Path path = this.o;
        path.reset();
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
                c = c2;
                RectF rectF3 = this.n;
                rectF3.set(rectF);
                rectF3.inset(-f2, f);
                canvas.clipRect(rectF3);
                float f3 = limitLine.f;
                fArr[c] = f3;
                fArr[2] = f3;
                this.c.g(fArr);
                float f4 = rectF2.top;
                fArr[c3] = f4;
                fArr[3] = rectF2.bottom;
                path.moveTo(fArr[c], f4);
                path.lineTo(fArr[2], fArr[3]);
                Paint.Style style = Paint.Style.STROKE;
                Paint paint = this.g;
                paint.setStyle(style);
                paint.setColor(limitLine.h);
                paint.setPathEffect(null);
                paint.setStrokeWidth(f2);
                canvas.drawPath(path, paint);
                path.reset();
                String str = limitLine.j;
                if (str != null && !str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
                    paint.setStyle(limitLine.i);
                    paint.setPathEffect(null);
                    paint.setColor(limitLine.e);
                    paint.setTypeface(null);
                    paint.setStrokeWidth(0.5f);
                    paint.setTextSize(limitLine.d);
                    float f5 = f2 + limitLine.b;
                    float fC = Utils.c(2.0f) + limitLine.c;
                    LimitLine.LimitLabelPosition limitLabelPosition = limitLine.k;
                    if (limitLabelPosition == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                        float fA = Utils.a(paint, str);
                        paint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(str, fArr[c] + f5, rectF2.top + fC + fA, paint);
                    } else if (limitLabelPosition == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                        paint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(str, fArr[c] + f5, rectF2.bottom - fC, paint);
                    } else if (limitLabelPosition == LimitLine.LimitLabelPosition.LEFT_TOP) {
                        paint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(str, fArr[c] - f5, rectF2.top + fC + Utils.a(paint, str), paint);
                    } else {
                        paint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(str, fArr[c] - f5, rectF2.bottom - fC, paint);
                    }
                }
                canvas.restoreToCount(iSave);
            } else {
                c = c2;
            }
            i++;
            c2 = c;
            f = 0.0f;
            c3 = 1;
        }
    }
}
