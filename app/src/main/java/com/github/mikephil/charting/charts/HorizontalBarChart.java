package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.highlight.HorizontalBarHighlighter;
import com.github.mikephil.charting.renderer.HorizontalBarChartRenderer;
import com.github.mikephil.charting.renderer.XAxisRendererHorizontalBarChart;
import com.github.mikephil.charting.renderer.YAxisRendererHorizontalBarChart;
import com.github.mikephil.charting.utils.HorizontalViewPortHandler;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.TransformerHorizontalBarChart;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import defpackage.xm0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class HorizontalBarChart extends BarChart {
    public final RectF q0;

    public HorizontalBarChart(Context context) {
        super(context);
        this.q0 = new RectF();
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public final void a() {
        RectF rectF = this.q0;
        l(rectF);
        float f = rectF.left + 0.0f;
        float fA = rectF.top + 0.0f;
        float f2 = rectF.right + 0.0f;
        float fA2 = rectF.bottom + 0.0f;
        if (this.a0.f()) {
            YAxis yAxis = this.a0;
            this.c0.e.setTextSize(yAxis.d);
            fA += (yAxis.c * 2.0f) + Utils.a(r6, yAxis.c());
        }
        if (this.b0.f()) {
            YAxis yAxis2 = this.b0;
            this.d0.e.setTextSize(yAxis2.d);
            fA2 += (yAxis2.c * 2.0f) + Utils.a(r6, yAxis2.c());
        }
        XAxis xAxis = this.i;
        float f3 = xAxis.z;
        if (xAxis.a) {
            XAxis.XAxisPosition xAxisPosition = xAxis.C;
            if (xAxisPosition == XAxis.XAxisPosition.BOTTOM) {
                f += f3;
            } else if (xAxisPosition == XAxis.XAxisPosition.TOP) {
                f2 += f3;
            } else if (xAxisPosition == XAxis.XAxisPosition.BOTH_SIDED) {
                f += f3;
                f2 += f3;
            }
        }
        float extraTopOffset = getExtraTopOffset() + fA;
        float extraRightOffset = getExtraRightOffset() + f2;
        float extraBottomOffset = getExtraBottomOffset() + fA2;
        float extraLeftOffset = getExtraLeftOffset() + f;
        float fC = Utils.c(this.U);
        this.t.m(Math.max(fC, extraLeftOffset), Math.max(fC, extraTopOffset), Math.max(fC, extraRightOffset), Math.max(fC, extraBottomOffset));
        if (this.a) {
            this.t.b.toString();
        }
        Transformer transformer = this.f0;
        this.b0.getClass();
        transformer.h();
        Transformer transformer2 = this.e0;
        this.a0.getClass();
        transformer2.h();
        m();
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.Chart
    public final Highlight d(float f, float f2) {
        if (this.b == null) {
            return null;
        }
        return getHighlighter().getHighlight(f2, f);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public final float[] e(Highlight highlight) {
        return new float[]{highlight.j, highlight.i};
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public final void g() {
        this.t = new HorizontalViewPortHandler();
        super.g();
        this.e0 = new TransformerHorizontalBarChart(this.t);
        this.f0 = new TransformerHorizontalBarChart(this.t);
        this.r = new HorizontalBarChartRenderer(this, this.u, this.t);
        setHighlighter(new HorizontalBarHighlighter(this));
        this.c0 = new YAxisRendererHorizontalBarChart(this.t, this.a0, this.e0);
        this.d0 = new YAxisRendererHorizontalBarChart(this.t, this.b0, this.f0);
        this.g0 = new XAxisRendererHorizontalBarChart(this.t, this.i, this.e0, this);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public float getHighestVisibleX() {
        Transformer transformer = getTransformer(YAxis.AxisDependency.LEFT);
        RectF rectF = this.t.b;
        float f = rectF.left;
        float f2 = rectF.top;
        xm0 xm0Var = this.k0;
        transformer.d(f, f2, xm0Var);
        return (float) Math.min(this.i.w, xm0Var.c);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public float getLowestVisibleX() {
        Transformer transformer = getTransformer(YAxis.AxisDependency.LEFT);
        RectF rectF = this.t.b;
        float f = rectF.left;
        float f2 = rectF.bottom;
        xm0 xm0Var = this.j0;
        transformer.d(f, f2, xm0Var);
        return (float) Math.max(this.i.x, xm0Var.c);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public final void m() {
        Transformer transformer = this.f0;
        YAxis yAxis = this.b0;
        float f = yAxis.x;
        float f2 = yAxis.y;
        XAxis xAxis = this.i;
        transformer.i(f, f2, xAxis.y, xAxis.x);
        Transformer transformer2 = this.e0;
        YAxis yAxis2 = this.a0;
        float f3 = yAxis2.x;
        float f4 = yAxis2.y;
        XAxis xAxis2 = this.i;
        transformer2.i(f3, f4, xAxis2.y, xAxis2.x);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRangeMaximum(float f) {
        float f2 = this.i.y / f;
        ViewPortHandler viewPortHandler = this.t;
        viewPortHandler.getClass();
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        viewPortHandler.e = f2;
        viewPortHandler.j(viewPortHandler.a, viewPortHandler.b);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRangeMinimum(float f) {
        float f2 = this.i.y / f;
        ViewPortHandler viewPortHandler = this.t;
        viewPortHandler.getClass();
        if (f2 == 0.0f) {
            f2 = Float.MAX_VALUE;
        }
        viewPortHandler.f = f2;
        viewPortHandler.j(viewPortHandler.a, viewPortHandler.b);
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q0 = new RectF();
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q0 = new RectF();
    }
}
