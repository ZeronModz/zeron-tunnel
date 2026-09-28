package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class RadarChartRenderer extends LineRadarRenderer {
    public final RadarChart h;
    public final Paint i;
    public final Paint j;
    public final Path k;
    public final Path l;

    public RadarChartRenderer(RadarChart radarChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.k = new Path();
        this.l = new Path();
        this.h = radarChart;
        Paint paint = new Paint(1);
        this.d = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.d.setStrokeWidth(2.0f);
        this.d.setColor(Color.rgb(255, 187, 115));
        Paint paint2 = new Paint(1);
        this.i = paint2;
        paint2.setStyle(style);
        this.j = new Paint(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void b(Canvas canvas) {
        Paint paint;
        RadarChart radarChart = this.h;
        RadarData radarData = (RadarData) radarChart.getData();
        int entryCount = ((IRadarDataSet) radarData.f()).getEntryCount();
        for (IRadarDataSet iRadarDataSet : radarData.i) {
            if (iRadarDataSet.isVisible()) {
                this.b.getClass();
                float sliceAngle = radarChart.getSliceAngle();
                float factor = radarChart.getFactor();
                MPPointF centerOffsets = radarChart.getCenterOffsets();
                MPPointF mPPointFB = MPPointF.b(0.0f, 0.0f);
                Path path = this.k;
                path.reset();
                int i = 0;
                boolean z = false;
                while (true) {
                    int entryCount2 = iRadarDataSet.getEntryCount();
                    paint = this.c;
                    if (i >= entryCount2) {
                        break;
                    }
                    paint.setColor(iRadarDataSet.getColor(i));
                    Utils.e(centerOffsets, (((RadarEntry) iRadarDataSet.getEntryForIndex(i)).a - radarChart.getYChartMin()) * factor * 1.0f, radarChart.getRotationAngle() + (i * sliceAngle * 1.0f), mPPointFB);
                    if (!Float.isNaN(mPPointFB.b)) {
                        float f = mPPointFB.b;
                        float f2 = mPPointFB.c;
                        if (z) {
                            path.lineTo(f, f2);
                        } else {
                            path.moveTo(f, f2);
                            z = true;
                        }
                    }
                    i++;
                }
                if (iRadarDataSet.getEntryCount() > entryCount) {
                    path.lineTo(centerOffsets.b, centerOffsets.c);
                }
                path.close();
                if (iRadarDataSet.isDrawFilledEnabled()) {
                    Drawable fillDrawable = iRadarDataSet.getFillDrawable();
                    if (fillDrawable != null) {
                        l(canvas, path, fillDrawable);
                    } else {
                        LineRadarRenderer.k(canvas, path, iRadarDataSet.getFillColor(), iRadarDataSet.getFillAlpha());
                    }
                }
                paint.setStrokeWidth(iRadarDataSet.getLineWidth());
                paint.setStyle(Paint.Style.STROKE);
                if (!iRadarDataSet.isDrawFilledEnabled() || iRadarDataSet.getFillAlpha() < 255) {
                    canvas.drawPath(path, paint);
                }
                MPPointF.d(centerOffsets);
                MPPointF.d(mPPointFB);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void c(Canvas canvas) {
        RadarChart radarChart = this.h;
        float sliceAngle = radarChart.getSliceAngle();
        float factor = radarChart.getFactor();
        float rotationAngle = radarChart.getRotationAngle();
        MPPointF centerOffsets = radarChart.getCenterOffsets();
        float webLineWidth = radarChart.getWebLineWidth();
        Paint paint = this.i;
        paint.setStrokeWidth(webLineWidth);
        paint.setColor(radarChart.getWebColor());
        paint.setAlpha(radarChart.getWebAlpha());
        int skipWebLineCount = radarChart.getSkipWebLineCount() + 1;
        int entryCount = ((IRadarDataSet) ((RadarData) radarChart.getData()).f()).getEntryCount();
        MPPointF mPPointFB = MPPointF.b(0.0f, 0.0f);
        for (int i = 0; i < entryCount; i += skipWebLineCount) {
            Utils.e(centerOffsets, radarChart.getYRange() * factor, (i * sliceAngle) + rotationAngle, mPPointFB);
            canvas.drawLine(centerOffsets.b, centerOffsets.c, mPPointFB.b, mPPointFB.c, paint);
        }
        MPPointF.d(mPPointFB);
        paint.setStrokeWidth(radarChart.getWebLineWidthInner());
        paint.setColor(radarChart.getWebColorInner());
        paint.setAlpha(radarChart.getWebAlpha());
        int i2 = radarChart.getYAxis().l;
        MPPointF mPPointFB2 = MPPointF.b(0.0f, 0.0f);
        MPPointF mPPointFB3 = MPPointF.b(0.0f, 0.0f);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = 0;
            while (i4 < ((RadarData) radarChart.getData()).d()) {
                float yChartMin = (radarChart.getYAxis().k[i3] - radarChart.getYChartMin()) * factor;
                Utils.e(centerOffsets, yChartMin, (i4 * sliceAngle) + rotationAngle, mPPointFB2);
                int i5 = i4 + 1;
                Utils.e(centerOffsets, yChartMin, (i5 * sliceAngle) + rotationAngle, mPPointFB3);
                canvas.drawLine(mPPointFB2.b, mPPointFB2.c, mPPointFB3.b, mPPointFB3.c, paint);
                i4 = i5;
            }
        }
        MPPointF.d(mPPointFB2);
        MPPointF.d(mPPointFB3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.graphics.Canvas r23, com.github.mikephil.charting.highlight.Highlight[] r24) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.renderer.RadarChartRenderer.d(android.graphics.Canvas, com.github.mikephil.charting.highlight.Highlight[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void e(Canvas canvas) {
        RadarChart radarChart;
        float f;
        float f2;
        MPPointF mPPointF;
        float f3;
        float f4;
        MPPointF mPPointF2;
        Canvas canvas2;
        this.b.getClass();
        RadarChart radarChart2 = this.h;
        float sliceAngle = radarChart2.getSliceAngle();
        float factor = radarChart2.getFactor();
        MPPointF centerOffsets = radarChart2.getCenterOffsets();
        MPPointF mPPointFB = MPPointF.b(0.0f, 0.0f);
        MPPointF mPPointFB2 = MPPointF.b(0.0f, 0.0f);
        float fC = Utils.c(5.0f);
        int i = 0;
        while (i < ((RadarData) radarChart2.getData()).c()) {
            IRadarDataSet iRadarDataSet = (IRadarDataSet) ((RadarData) radarChart2.getData()).b(i);
            if (BarLineScatterCandleBubbleRenderer.i(iRadarDataSet)) {
                a(iRadarDataSet);
                ValueFormatter valueFormatter = iRadarDataSet.getValueFormatter();
                MPPointF mPPointFC = MPPointF.c(iRadarDataSet.getIconsOffset());
                mPPointFC.b = Utils.c(mPPointFC.b);
                mPPointFC.c = Utils.c(mPPointFC.c);
                int i2 = 0;
                while (i2 < iRadarDataSet.getEntryCount()) {
                    RadarEntry radarEntry = (RadarEntry) iRadarDataSet.getEntryForIndex(i2);
                    float f5 = radarEntry.a;
                    Drawable drawable = radarEntry.c;
                    float yChartMin = (f5 - radarChart2.getYChartMin()) * factor * 1.0f;
                    RadarChart radarChart3 = radarChart2;
                    float f6 = i2 * sliceAngle * 1.0f;
                    Utils.e(centerOffsets, yChartMin, radarChart3.getRotationAngle() + f6, mPPointFB);
                    if (iRadarDataSet.isDrawValuesEnabled()) {
                        valueFormatter.getClass();
                        String strB = valueFormatter.b(radarEntry.a);
                        float f7 = mPPointFB.b;
                        f3 = sliceAngle;
                        float f8 = mPPointFB.c - fC;
                        f4 = factor;
                        int valueTextColor = iRadarDataSet.getValueTextColor(i2);
                        mPPointF2 = mPPointFB;
                        Paint paint = this.e;
                        paint.setColor(valueTextColor);
                        canvas2 = canvas;
                        canvas2.drawText(strB, f7, f8, paint);
                    } else {
                        f3 = sliceAngle;
                        f4 = factor;
                        mPPointF2 = mPPointFB;
                        canvas2 = canvas;
                    }
                    if (drawable != null && iRadarDataSet.isDrawIconsEnabled()) {
                        Utils.e(centerOffsets, (radarEntry.a * f4 * 1.0f) + mPPointFC.c, radarChart3.getRotationAngle() + f6, mPPointFB2);
                        float f9 = mPPointFB2.c + mPPointFC.b;
                        mPPointFB2.c = f9;
                        Utils.d(canvas2, drawable, (int) mPPointFB2.b, (int) f9, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    }
                    i2++;
                    radarChart2 = radarChart3;
                    sliceAngle = f3;
                    factor = f4;
                    mPPointFB = mPPointF2;
                }
                radarChart = radarChart2;
                f = sliceAngle;
                f2 = factor;
                mPPointF = mPPointFB;
                MPPointF.d(mPPointFC);
            } else {
                radarChart = radarChart2;
                f = sliceAngle;
                f2 = factor;
                mPPointF = mPPointFB;
            }
            i++;
            radarChart2 = radarChart;
            sliceAngle = f;
            factor = f2;
            mPPointFB = mPPointF;
        }
        MPPointF.d(centerOffsets);
        MPPointF.d(mPPointFB);
        MPPointF.d(mPPointFB2);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void f() {
    }
}
