package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.highlight.RadarHighlighter;
import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import com.github.mikephil.charting.renderer.RadarChartRenderer;
import com.github.mikephil.charting.renderer.XAxisRendererRadarChart;
import com.github.mikephil.charting.renderer.YAxisRendererRadarChart;
import com.github.mikephil.charting.utils.Utils;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class RadarChart extends PieRadarChartBase<RadarData> {
    public float K;
    public float L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public int Q;
    public YAxis R;
    public YAxisRendererRadarChart S;
    public XAxisRendererRadarChart T;

    public RadarChart(Context context) {
        super(context);
        this.K = 2.5f;
        this.L = 1.5f;
        this.M = Color.rgb(122, 122, 122);
        this.N = Color.rgb(122, 122, 122);
        this.O = 150;
        this.P = true;
        this.Q = 0;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public final void g() {
        super.g();
        this.R = new YAxis(YAxis.AxisDependency.LEFT);
        this.K = Utils.c(1.5f);
        this.L = Utils.c(0.75f);
        this.r = new RadarChartRenderer(this, this.u, this.t);
        this.S = new YAxisRendererRadarChart(this.t, this.R, this);
        this.T = new XAxisRendererRadarChart(this.t, this.i, this);
        this.s = new RadarHighlighter(this);
    }

    public float getFactor() {
        RectF rectF = this.t.b;
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) / this.R.y;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRadius() {
        RectF rectF = this.t.b;
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRequiredBaseOffset() {
        XAxis xAxis = this.i;
        return (xAxis.a && xAxis.q) ? xAxis.z : Utils.c(10.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRequiredLegendOffset() {
        return this.q.b.getTextSize() * 4.0f;
    }

    public int getSkipWebLineCount() {
        return this.Q;
    }

    public float getSliceAngle() {
        return 360.0f / ((IRadarDataSet) ((RadarData) this.b).f()).getEntryCount();
    }

    public int getWebAlpha() {
        return this.O;
    }

    public int getWebColor() {
        return this.M;
    }

    public int getWebColorInner() {
        return this.N;
    }

    public float getWebLineWidth() {
        return this.K;
    }

    public float getWebLineWidthInner() {
        return this.L;
    }

    public YAxis getYAxis() {
        return this.R;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMax() {
        return this.R.w;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMin() {
        return this.R.x;
    }

    public float getYRange() {
        return this.R.y;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public final void h() {
        if (this.b == null) {
            return;
        }
        k();
        YAxisRendererRadarChart yAxisRendererRadarChart = this.S;
        YAxis yAxis = this.R;
        yAxisRendererRadarChart.a(yAxis.x, yAxis.w);
        XAxisRendererRadarChart xAxisRendererRadarChart = this.T;
        XAxis xAxis = this.i;
        xAxisRendererRadarChart.a(xAxis.x, xAxis.w);
        if (this.l != null) {
            this.q.a(this.b);
        }
        a();
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public final void k() {
        YAxis yAxis = this.R;
        RadarData radarData = (RadarData) this.b;
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        yAxis.a(radarData.h(axisDependency), ((RadarData) this.b).g(axisDependency));
        this.i.a(0.0f, ((IRadarDataSet) ((RadarData) this.b).f()).getEntryCount());
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public final int n(float f) {
        float rotationAngle = f - getRotationAngle();
        DisplayMetrics displayMetrics = Utils.a;
        while (rotationAngle < 0.0f) {
            rotationAngle += 360.0f;
        }
        float f2 = rotationAngle % 360.0f;
        float sliceAngle = getSliceAngle();
        int entryCount = ((IRadarDataSet) ((RadarData) this.b).f()).getEntryCount();
        int i = 0;
        while (i < entryCount) {
            int i2 = i + 1;
            if ((i2 * sliceAngle) - (sliceAngle / 2.0f) > f2) {
                return i;
            }
            i = i2;
        }
        return 0;
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.b == null) {
            return;
        }
        XAxis xAxis = this.i;
        if (xAxis.a) {
            this.T.a(xAxis.x, xAxis.w);
        }
        this.T.h(canvas);
        if (this.P) {
            this.r.c(canvas);
        }
        boolean z = this.R.a;
        this.r.b(canvas);
        if (j()) {
            this.r.d(canvas, this.A);
        }
        if (this.R.a) {
            this.S.j(canvas);
        }
        this.S.g(canvas);
        this.r.e(canvas);
        this.q.c(canvas);
        b(canvas);
        c(canvas);
    }

    public void setDrawWeb(boolean z) {
        this.P = z;
    }

    public void setSkipWebLineCount(int i) {
        this.Q = Math.max(0, i);
    }

    public void setWebAlpha(int i) {
        this.O = i;
    }

    public void setWebColor(int i) {
        this.M = i;
    }

    public void setWebColorInner(int i) {
        this.N = i;
    }

    public void setWebLineWidth(float f) {
        this.K = Utils.c(f);
    }

    public void setWebLineWidthInner(float f) {
        this.L = Utils.c(f);
    }

    public RadarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = 2.5f;
        this.L = 1.5f;
        this.M = Color.rgb(122, 122, 122);
        this.N = Color.rgb(122, 122, 122);
        this.O = 150;
        this.P = true;
        this.Q = 0;
    }

    public RadarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.K = 2.5f;
        this.L = 1.5f;
        this.M = Color.rgb(122, 122, 122);
        this.N = Color.rgb(122, 122, 122);
        this.O = 150;
        this.P = true;
        this.Q = 0;
    }
}
