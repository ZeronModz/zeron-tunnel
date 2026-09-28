package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import defpackage.qo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class CombinedChartRenderer extends DataRenderer {
    public final ArrayList f;
    public final WeakReference g;
    public final ArrayList h;

    public CombinedChartRenderer(CombinedChart combinedChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.f = new ArrayList(5);
        this.h = new ArrayList();
        this.g = new WeakReference(combinedChart);
        h();
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void b(Canvas canvas) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((DataRenderer) it.next()).b(canvas);
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void c(Canvas canvas) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((DataRenderer) it.next()).c(canvas);
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void d(Canvas canvas, Highlight[] highlightArr) {
        int iIndexOf;
        Chart chart = (Chart) this.g.get();
        if (chart == null) {
            return;
        }
        for (DataRenderer dataRenderer : this.f) {
            Object barData = dataRenderer instanceof BarChartRenderer ? ((BarChartRenderer) dataRenderer).g.getBarData() : dataRenderer instanceof LineChartRenderer ? ((LineChartRenderer) dataRenderer).h.getLineData() : dataRenderer instanceof CandleStickChartRenderer ? ((CandleStickChartRenderer) dataRenderer).h.getCandleData() : dataRenderer instanceof ScatterChartRenderer ? ((ScatterChartRenderer) dataRenderer).h.getScatterData() : dataRenderer instanceof BubbleChartRenderer ? ((BubbleChartRenderer) dataRenderer).g.getBubbleData() : null;
            if (barData == null) {
                iIndexOf = -1;
            } else {
                ((CombinedData) chart.getData()).getClass();
                iIndexOf = new ArrayList().indexOf(barData);
            }
            ArrayList arrayList = this.h;
            arrayList.clear();
            for (Highlight highlight : highlightArr) {
                int i = highlight.e;
                if (i == iIndexOf || i == -1) {
                    arrayList.add(highlight);
                }
            }
            dataRenderer.d(canvas, (Highlight[]) arrayList.toArray(new Highlight[arrayList.size()]));
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void e(Canvas canvas) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((DataRenderer) it.next()).e(canvas);
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public final void f() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((DataRenderer) it.next()).f();
        }
    }

    public final void h() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        CombinedChart combinedChart = (CombinedChart) this.g.get();
        if (combinedChart == null) {
            return;
        }
        for (CombinedChart.DrawOrder drawOrder : combinedChart.getDrawOrder()) {
            int i = qo.a[drawOrder.ordinal()];
            ViewPortHandler viewPortHandler = this.a;
            ChartAnimator chartAnimator = this.b;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5 && combinedChart.getScatterData() != null) {
                                arrayList.add(new ScatterChartRenderer(combinedChart, chartAnimator, viewPortHandler));
                            }
                        } else if (combinedChart.getCandleData() != null) {
                            arrayList.add(new CandleStickChartRenderer(combinedChart, chartAnimator, viewPortHandler));
                        }
                    } else if (combinedChart.getLineData() != null) {
                        arrayList.add(new LineChartRenderer(combinedChart, chartAnimator, viewPortHandler));
                    }
                } else if (combinedChart.getBubbleData() != null) {
                    arrayList.add(new BubbleChartRenderer(combinedChart, chartAnimator, viewPortHandler));
                }
            } else if (combinedChart.getBarData() != null) {
                arrayList.add(new BarChartRenderer(combinedChart, chartAnimator, viewPortHandler));
            }
        }
    }
}
