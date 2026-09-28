package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class PieRadarHighlighter<T extends PieRadarChartBase> implements IHighlighter {
    public final PieRadarChartBase a;
    public final ArrayList b = new ArrayList();

    public PieRadarHighlighter(T t) {
        this.a = t;
    }

    public abstract Highlight a(float f, float f2, int i);

    /* JADX WARN: Type inference failed for: r0v1, types: [com.github.mikephil.charting.data.ChartData] */
    @Override // com.github.mikephil.charting.highlight.IHighlighter
    public final Highlight getHighlight(float f, float f2) {
        PieRadarChartBase pieRadarChartBase = this.a;
        if (pieRadarChartBase.l(f, f2) > pieRadarChartBase.getRadius()) {
            return null;
        }
        float fM = pieRadarChartBase.m(f, f2);
        if (pieRadarChartBase instanceof PieChart) {
            pieRadarChartBase.getAnimator().getClass();
            fM /= 1.0f;
        }
        int iN = pieRadarChartBase.n(fM);
        if (iN < 0 || iN >= pieRadarChartBase.getData().f().getEntryCount()) {
            return null;
        }
        return a(f, f2, iN);
    }
}
