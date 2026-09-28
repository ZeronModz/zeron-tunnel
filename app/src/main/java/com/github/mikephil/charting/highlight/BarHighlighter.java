package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import defpackage.xm0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class BarHighlighter extends ChartHighlighter<BarDataProvider> {
    public BarHighlighter(BarDataProvider barDataProvider) {
        super(barDataProvider);
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    public final BarLineScatterCandleBubbleData b() {
        return ((BarDataProvider) this.a).getBarData();
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    public float c(float f, float f2, float f3, float f4) {
        return Math.abs(f - f3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Highlight g(Highlight highlight, IBarDataSet iBarDataSet, float f, float f2) {
        int i;
        BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForXValue(f, f2);
        if (barEntry == null) {
            return null;
        }
        if (barEntry.e == null) {
            return highlight;
        }
        Range[] rangeArr = barEntry.f;
        if (rangeArr.length <= 0) {
            return null;
        }
        if (rangeArr.length == 0) {
            i = 0;
        } else {
            int length = rangeArr.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 < length) {
                    Range range = rangeArr[i2];
                    if (f2 > range.a && f2 <= range.b) {
                        i = i3;
                        break;
                    }
                    i3++;
                    i2++;
                } else {
                    int iMax = Math.max(rangeArr.length - 1, 0);
                    if (f2 > rangeArr[iMax].b) {
                        i = iMax;
                    }
                }
            }
        }
        xm0 xm0VarA = ((BarDataProvider) this.a).getTransformer(iBarDataSet.getAxisDependency()).a(highlight.a, rangeArr[i].b);
        Highlight highlight2 = new Highlight(barEntry.d, barEntry.a, (float) xm0VarA.b, (float) xm0VarA.c, highlight.f, i, highlight.h);
        xm0.c(xm0VarA);
        return highlight2;
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter, com.github.mikephil.charting.highlight.IHighlighter
    public Highlight getHighlight(float f, float f2) {
        Highlight highlight = super.getHighlight(f, f2);
        if (highlight == null) {
            return null;
        }
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        BarLineScatterCandleBubbleDataProvider barLineScatterCandleBubbleDataProvider = this.a;
        xm0 xm0VarC = barLineScatterCandleBubbleDataProvider.getTransformer(axisDependency).c(f, f2);
        IBarDataSet iBarDataSet = (IBarDataSet) ((BarDataProvider) barLineScatterCandleBubbleDataProvider).getBarData().b(highlight.f);
        if (iBarDataSet.isStacked()) {
            return g(highlight, iBarDataSet, (float) xm0VarC.b, (float) xm0VarC.c);
        }
        xm0.c(xm0VarC);
        return highlight;
    }
}
