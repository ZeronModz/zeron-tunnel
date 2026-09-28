package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.BubbleData;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.highlight.CombinedHighlighter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.CombinedDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.renderer.CombinedChartRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class CombinedChart extends BarLineChartBase<CombinedData> implements CombinedDataProvider {
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public DrawOrder[] p0;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public enum DrawOrder {
        BAR,
        BUBBLE,
        LINE,
        CANDLE,
        SCATTER
    }

    public CombinedChart(Context context) {
        super(context);
        this.m0 = true;
        this.n0 = false;
        this.o0 = false;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public final void c(Canvas canvas) {
        if (this.D == null || !this.C || !j()) {
            return;
        }
        int i = 0;
        while (true) {
            Highlight[] highlightArr = this.A;
            if (i >= highlightArr.length) {
                return;
            }
            Highlight highlight = highlightArr[i];
            ((CombinedData) this.b).getClass();
            int i2 = highlight.e;
            int i3 = highlight.f;
            IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet = null;
            if (i2 < new ArrayList().size()) {
                BarLineScatterCandleBubbleData barLineScatterCandleBubbleData = (BarLineScatterCandleBubbleData) new ArrayList().get(highlight.e);
                if (i3 < barLineScatterCandleBubbleData.c()) {
                    iBarLineScatterCandleBubbleDataSet = (IBarLineScatterCandleBubbleDataSet) barLineScatterCandleBubbleData.i.get(i3);
                }
            }
            Entry entryE = ((CombinedData) this.b).e(highlight);
            if (entryE != null) {
                float entryIndex = iBarLineScatterCandleBubbleDataSet.getEntryIndex(entryE);
                float entryCount = iBarLineScatterCandleBubbleDataSet.getEntryCount();
                this.u.getClass();
                if (entryIndex <= entryCount * 1.0f) {
                    float[] fArr = {highlight.i, highlight.j};
                    ViewPortHandler viewPortHandler = this.t;
                    float f = fArr[0];
                    float f2 = fArr[1];
                    if (viewPortHandler.h(f) && viewPortHandler.i(f2)) {
                        this.D.refreshContent(entryE, highlight);
                        this.D.draw(canvas, fArr[0], fArr[1]);
                    }
                }
            }
            i++;
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public final Highlight d(float f, float f2) {
        if (this.b == null) {
            return null;
        }
        Highlight highlight = getHighlighter().getHighlight(f, f2);
        return (highlight == null || !this.n0) ? highlight : new Highlight(highlight.a, highlight.b, highlight.c, highlight.d, highlight.f, -1, highlight.h);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public final void g() {
        super.g();
        this.p0 = new DrawOrder[]{DrawOrder.BAR, DrawOrder.BUBBLE, DrawOrder.LINE, DrawOrder.CANDLE, DrawOrder.SCATTER};
        setHighlighter(new CombinedHighlighter(this, this));
        setHighlightFullBarEnabled(true);
        this.r = new CombinedChartRenderer(this, this.u, this.t);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public BarData getBarData() {
        ChartData chartData = this.b;
        if (chartData == null) {
            return null;
        }
        ((CombinedData) chartData).getClass();
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider
    public BubbleData getBubbleData() {
        ChartData chartData = this.b;
        if (chartData == null) {
            return null;
        }
        ((CombinedData) chartData).getClass();
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider
    public CandleData getCandleData() {
        ChartData chartData = this.b;
        if (chartData == null) {
            return null;
        }
        ((CombinedData) chartData).getClass();
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.CombinedDataProvider
    public CombinedData getCombinedData() {
        return (CombinedData) this.b;
    }

    public DrawOrder[] getDrawOrder() {
        return this.p0;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider
    public LineData getLineData() {
        ChartData chartData = this.b;
        if (chartData == null) {
            return null;
        }
        ((CombinedData) chartData).getClass();
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider
    public ScatterData getScatterData() {
        ChartData chartData = this.b;
        if (chartData == null) {
            return null;
        }
        ((CombinedData) chartData).getClass();
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public final boolean isDrawBarShadowEnabled() {
        return this.o0;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public final boolean isDrawValueAboveBarEnabled() {
        return this.m0;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public final boolean isHighlightFullBarEnabled() {
        return this.n0;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void setData(CombinedData combinedData) {
        super.setData(combinedData);
        setHighlighter(new CombinedHighlighter(this, this));
        ((CombinedChartRenderer) this.r).h();
        this.r.f();
    }

    public void setDrawBarShadow(boolean z) {
        this.o0 = z;
    }

    public void setDrawOrder(DrawOrder[] drawOrderArr) {
        if (drawOrderArr == null || drawOrderArr.length <= 0) {
            return;
        }
        this.p0 = drawOrderArr;
    }

    public void setDrawValueAboveBar(boolean z) {
        this.m0 = z;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.n0 = z;
    }

    public CombinedChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m0 = true;
        this.n0 = false;
        this.o0 = false;
    }

    public CombinedChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m0 = true;
        this.n0 = false;
        this.o0 = false;
    }
}
