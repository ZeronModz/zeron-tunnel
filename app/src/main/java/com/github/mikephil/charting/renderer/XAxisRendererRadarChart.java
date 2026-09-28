package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class XAxisRendererRadarChart extends XAxisRenderer {
    public final RadarChart p;

    public XAxisRendererRadarChart(ViewPortHandler viewPortHandler, XAxis xAxis, RadarChart radarChart) {
        super(viewPortHandler, xAxis, null);
        this.p = radarChart;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void h(Canvas canvas) {
        XAxis xAxis = this.h;
        if (xAxis.a && xAxis.q) {
            float f = xAxis.B;
            MPPointF mPPointFB = MPPointF.b(0.5f, 0.25f);
            Paint paint = this.e;
            paint.setTypeface(null);
            paint.setTextSize(xAxis.d);
            paint.setColor(xAxis.e);
            RadarChart radarChart = this.p;
            float sliceAngle = radarChart.getSliceAngle();
            float factor = radarChart.getFactor();
            MPPointF centerOffsets = radarChart.getCenterOffsets();
            MPPointF mPPointFB2 = MPPointF.b(0.0f, 0.0f);
            for (int i = 0; i < ((IRadarDataSet) ((RadarData) radarChart.getData()).f()).getEntryCount(); i++) {
                float f2 = i;
                String strB = xAxis.d().b(f2);
                Utils.e(centerOffsets, (xAxis.z / 2.0f) + (radarChart.getYRange() * factor), (radarChart.getRotationAngle() + (f2 * sliceAngle)) % 360.0f, mPPointFB2);
                e(canvas, strB, mPPointFB2.b, mPPointFB2.c - (xAxis.A / 2.0f), mPPointFB, f);
            }
            MPPointF.d(centerOffsets);
            MPPointF.d(mPPointFB2);
            MPPointF.d(mPPointFB);
        }
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void k(Canvas canvas) {
    }
}
