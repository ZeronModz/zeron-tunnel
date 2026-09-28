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
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class YAxisRenderer extends AxisRenderer {
    public final YAxis h;
    public final Path i;
    public final RectF j;
    public float[] k;
    public final Path l;
    public final float[] m;
    public final RectF n;

    public YAxisRenderer(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
        super(viewPortHandler, transformer, yAxis);
        this.i = new Path();
        this.j = new RectF();
        this.k = new float[2];
        new Path();
        new RectF();
        this.l = new Path();
        this.m = new float[2];
        this.n = new RectF();
        this.h = yAxis;
        if (this.a != null) {
            this.e.setColor(-16777216);
            this.e.setTextSize(Utils.c(10.0f));
            Paint paint = new Paint(1);
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            paint.setStyle(Paint.Style.STROKE);
        }
    }

    public void c(Canvas canvas, float f, float[] fArr, float f2) {
        YAxis yAxis = this.h;
        boolean z = yAxis.A;
        int i = yAxis.l;
        if (!z) {
            i--;
        }
        for (int i2 = !yAxis.z ? 1 : 0; i2 < i; i2++) {
            canvas.drawText(yAxis.b(i2), f, fArr[(i2 * 2) + 1] + f2, this.e);
        }
    }

    public RectF d() {
        RectF rectF = this.a.b;
        RectF rectF2 = this.j;
        rectF2.set(rectF);
        rectF2.inset(0.0f, -this.b.h);
        return rectF2;
    }

    public float[] e() {
        float[] fArr = this.k;
        int length = fArr.length;
        YAxis yAxis = this.h;
        int i = yAxis.l;
        if (length != i * 2) {
            fArr = new float[i * 2];
            this.k = fArr;
        }
        for (int i2 = 0; i2 < fArr.length; i2 += 2) {
            fArr[i2 + 1] = yAxis.k[i2 / 2];
        }
        this.c.g(fArr);
        return fArr;
    }

    public Path f(Path path, int i, float[] fArr) {
        ViewPortHandler viewPortHandler = this.a;
        int i2 = i + 1;
        path.moveTo(viewPortHandler.b.left, fArr[i2]);
        path.lineTo(viewPortHandler.b.right, fArr[i2]);
        return path;
    }

    public void g(Canvas canvas) {
        float f;
        float f2;
        float f3;
        YAxis yAxis = this.h;
        if (yAxis.a && yAxis.q) {
            float[] fArrE = e();
            Paint paint = this.e;
            paint.setTypeface(null);
            paint.setTextSize(yAxis.d);
            paint.setColor(yAxis.e);
            float f4 = yAxis.b;
            float fA = (Utils.a(paint, "A") / 2.5f) + yAxis.c;
            YAxis.AxisDependency axisDependency = yAxis.E;
            YAxis.YAxisLabelPosition yAxisLabelPosition = yAxis.D;
            YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.LEFT;
            ViewPortHandler viewPortHandler = this.a;
            if (axisDependency == axisDependency2) {
                if (yAxisLabelPosition == YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
                    paint.setTextAlign(Paint.Align.RIGHT);
                    f = viewPortHandler.b.left;
                    f3 = f - f4;
                } else {
                    paint.setTextAlign(Paint.Align.LEFT);
                    f2 = viewPortHandler.b.left;
                    f3 = f2 + f4;
                }
            } else if (yAxisLabelPosition == YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
                paint.setTextAlign(Paint.Align.LEFT);
                f2 = viewPortHandler.b.right;
                f3 = f2 + f4;
            } else {
                paint.setTextAlign(Paint.Align.RIGHT);
                f = viewPortHandler.b.right;
                f3 = f - f4;
            }
            c(canvas, f3, fArrE, fA);
        }
    }

    public void h(Canvas canvas) {
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
                canvas.drawLine(f, rectF.top, f, rectF.bottom, paint);
            } else {
                RectF rectF2 = viewPortHandler.b;
                float f2 = rectF2.right;
                canvas.drawLine(f2, rectF2.top, f2, rectF2.bottom, paint);
            }
        }
    }

    public final void i(Canvas canvas) {
        YAxis yAxis = this.h;
        if (yAxis.a && yAxis.o) {
            int iSave = canvas.save();
            canvas.clipRect(d());
            float[] fArrE = e();
            int i = yAxis.g;
            Paint paint = this.d;
            paint.setColor(i);
            paint.setStrokeWidth(yAxis.h);
            paint.setPathEffect(null);
            Path path = this.i;
            path.reset();
            for (int i2 = 0; i2 < fArrE.length; i2 += 2) {
                canvas.drawPath(f(path, i2, fArrE), paint);
                path.reset();
            }
            canvas.restoreToCount(iSave);
        }
    }

    public void j(Canvas canvas) {
        ArrayList arrayList = this.h.r;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        float[] fArr = this.m;
        int i = 0;
        float f = 0.0f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Path path = this.l;
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
                RectF rectF3 = this.n;
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
                    paint.setTypeface(null);
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
