package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.highlight.BarHighlighter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.renderer.BarChartRenderer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class BarChart extends BarLineChartBase<BarData> implements BarDataProvider {
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;

    public BarChart(Context context) {
        super(context);
        this.m0 = false;
        this.n0 = true;
        this.o0 = false;
        this.p0 = false;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public Highlight d(float f, float f2) {
        if (this.b == null) {
            return null;
        }
        Highlight highlight = getHighlighter().getHighlight(f, f2);
        return (highlight == null || !this.m0) ? highlight : new Highlight(highlight.a, highlight.b, highlight.c, highlight.d, highlight.f, -1, highlight.h);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void g() {
        super.g();
        this.r = new BarChartRenderer(this, this.u, this.t);
        setHighlighter(new BarHighlighter(this));
        getXAxis().t = 0.5f;
        getXAxis().u = 0.5f;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public BarData getBarData() {
        return (BarData) this.b;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public final boolean isDrawBarShadowEnabled() {
        return this.o0;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public final boolean isDrawValueAboveBarEnabled() {
        return this.n0;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public final boolean isHighlightFullBarEnabled() {
        return this.m0;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public final void k() {
        boolean z = this.p0;
        XAxis xAxis = this.i;
        if (z) {
            ChartData chartData = this.b;
            xAxis.a(((BarData) chartData).d - (((BarData) chartData).j / 2.0f), (((BarData) chartData).j / 2.0f) + ((BarData) chartData).c);
        } else {
            ChartData chartData2 = this.b;
            xAxis.a(((BarData) chartData2).d, ((BarData) chartData2).c);
        }
        YAxis yAxis = this.a0;
        BarData barData = (BarData) this.b;
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        yAxis.a(barData.h(axisDependency), ((BarData) this.b).g(axisDependency));
        YAxis yAxis2 = this.b0;
        BarData barData2 = (BarData) this.b;
        YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
        yAxis2.a(barData2.h(axisDependency2), ((BarData) this.b).g(axisDependency2));
    }

    public void setDrawBarShadow(boolean z) {
        this.o0 = z;
    }

    public void setDrawValueAboveBar(boolean z) {
        this.n0 = z;
    }

    public void setFitBars(boolean z) {
        this.p0 = z;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.m0 = z;
    }

    public BarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m0 = false;
        this.n0 = true;
        this.o0 = false;
        this.p0 = false;
    }

    public BarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m0 = false;
        this.n0 = true;
        this.o0 = false;
        this.p0 = false;
    }
}
