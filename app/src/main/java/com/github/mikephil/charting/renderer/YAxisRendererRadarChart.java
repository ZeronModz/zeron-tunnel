package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class YAxisRendererRadarChart extends YAxisRenderer {
    public final RadarChart o;
    public final Path p;

    public YAxisRendererRadarChart(ViewPortHandler viewPortHandler, YAxis yAxis, RadarChart radarChart) {
        super(viewPortHandler, yAxis, null);
        this.p = new Path();
        this.o = radarChart;
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public final void b(float f, float f2) {
        int i;
        AxisBase axisBase = this.b;
        int i2 = axisBase.n;
        double dAbs = Math.abs(f2 - f);
        if (i2 == 0 || dAbs <= 0.0d || Double.isInfinite(dAbs)) {
            axisBase.k = new float[0];
            axisBase.l = 0;
            return;
        }
        double dH = Utils.h(dAbs / ((double) i2));
        double dH2 = Utils.h(Math.pow(10.0d, (int) Math.log10(dH)));
        if (((int) (dH / dH2)) > 5) {
            dH = Math.floor(dH2 * 10.0d);
        }
        double dCeil = dH == 0.0d ? 0.0d : Math.ceil(((double) f) / dH) * dH;
        double dG = dH == 0.0d ? 0.0d : Utils.g(Math.floor(((double) f2) / dH) * dH);
        if (dH != 0.0d) {
            i = 0;
            for (double d = dCeil; d <= dG; d += dH) {
                i++;
            }
        } else {
            i = 0;
        }
        int i3 = i + 1;
        axisBase.l = i3;
        if (axisBase.k.length < i3) {
            axisBase.k = new float[i3];
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (dCeil == 0.0d) {
                dCeil = 0.0d;
            }
            axisBase.k[i4] = (float) dCeil;
            dCeil += dH;
        }
        if (dH < 1.0d) {
            axisBase.m = (int) Math.ceil(-Math.log10(dH));
        } else {
            axisBase.m = 0;
        }
        float[] fArr = axisBase.k;
        float f3 = fArr[0];
        axisBase.x = f3;
        float f4 = fArr[i];
        axisBase.w = f4;
        axisBase.y = Math.abs(f4 - f3);
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public final void g(Canvas canvas) {
        YAxis yAxis = this.h;
        if (yAxis.a && yAxis.q) {
            Paint paint = this.e;
            paint.setTypeface(null);
            paint.setTextSize(yAxis.d);
            paint.setColor(yAxis.e);
            RadarChart radarChart = this.o;
            MPPointF centerOffsets = radarChart.getCenterOffsets();
            MPPointF mPPointFB = MPPointF.b(0.0f, 0.0f);
            float factor = radarChart.getFactor();
            boolean z = yAxis.A;
            int i = yAxis.l;
            if (!z) {
                i--;
            }
            for (int i2 = !yAxis.z ? 1 : 0; i2 < i; i2++) {
                Utils.e(centerOffsets, (yAxis.k[i2] - yAxis.x) * factor, radarChart.getRotationAngle(), mPPointFB);
                canvas.drawText(yAxis.b(i2), mPPointFB.b + 10.0f, mPPointFB.c, paint);
            }
            MPPointF.d(centerOffsets);
            MPPointF.d(mPPointFB);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public final void j(Canvas canvas) {
        ArrayList arrayList = this.h.r;
        if (arrayList == null) {
            return;
        }
        RadarChart radarChart = this.o;
        float sliceAngle = radarChart.getSliceAngle();
        float factor = radarChart.getFactor();
        MPPointF centerOffsets = radarChart.getCenterOffsets();
        MPPointF mPPointFB = MPPointF.b(0.0f, 0.0f);
        for (int i = 0; i < arrayList.size(); i++) {
            LimitLine limitLine = (LimitLine) arrayList.get(i);
            if (limitLine.a) {
                int i2 = limitLine.h;
                Paint paint = this.g;
                paint.setColor(i2);
                paint.setPathEffect(null);
                paint.setStrokeWidth(limitLine.g);
                float yChartMin = (limitLine.f - radarChart.getYChartMin()) * factor;
                Path path = this.p;
                path.reset();
                for (int i3 = 0; i3 < ((IRadarDataSet) ((RadarData) radarChart.getData()).f()).getEntryCount(); i3++) {
                    Utils.e(centerOffsets, yChartMin, radarChart.getRotationAngle() + (i3 * sliceAngle), mPPointFB);
                    float f = mPPointFB.b;
                    float f2 = mPPointFB.c;
                    if (i3 == 0) {
                        path.moveTo(f, f2);
                    } else {
                        path.lineTo(f, f2);
                    }
                }
                path.close();
                canvas.drawPath(path, paint);
            }
        }
        MPPointF.d(centerOffsets);
        MPPointF.d(mPPointFB);
    }
}
