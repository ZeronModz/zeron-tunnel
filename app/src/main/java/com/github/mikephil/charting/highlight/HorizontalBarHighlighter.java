package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import defpackage.xm0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class HorizontalBarHighlighter extends BarHighlighter {
    public HorizontalBarHighlighter(BarDataProvider barDataProvider) {
        super(barDataProvider);
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    public final ArrayList a(IDataSet iDataSet, int i, float f, DataSet.Rounding rounding) {
        Entry entryForXValue;
        ArrayList arrayList = new ArrayList();
        List<Entry> entriesForXValue = iDataSet.getEntriesForXValue(f);
        if (entriesForXValue.size() == 0 && (entryForXValue = iDataSet.getEntryForXValue(f, Float.NaN, rounding)) != null) {
            entriesForXValue = iDataSet.getEntriesForXValue(entryForXValue.b());
        }
        if (entriesForXValue.size() != 0) {
            for (Entry entry : entriesForXValue) {
                xm0 xm0VarA = ((BarDataProvider) this.a).getTransformer(iDataSet.getAxisDependency()).a(entry.a(), entry.b());
                arrayList.add(new Highlight(entry.b(), entry.a(), (float) xm0VarA.b, (float) xm0VarA.c, i, iDataSet.getAxisDependency()));
            }
        }
        return arrayList;
    }

    @Override // com.github.mikephil.charting.highlight.BarHighlighter, com.github.mikephil.charting.highlight.ChartHighlighter
    public final float c(float f, float f2, float f3, float f4) {
        return Math.abs(f2 - f4);
    }

    @Override // com.github.mikephil.charting.highlight.BarHighlighter, com.github.mikephil.charting.highlight.ChartHighlighter, com.github.mikephil.charting.highlight.IHighlighter
    public final Highlight getHighlight(float f, float f2) {
        BarLineScatterCandleBubbleDataProvider barLineScatterCandleBubbleDataProvider = this.a;
        BarData barData = ((BarDataProvider) barLineScatterCandleBubbleDataProvider).getBarData();
        xm0 xm0VarC = barLineScatterCandleBubbleDataProvider.getTransformer(YAxis.AxisDependency.LEFT).c(f2, f);
        Highlight highlightD = d((float) xm0VarC.c, f2, f);
        if (highlightD == null) {
            return null;
        }
        IBarDataSet iBarDataSet = (IBarDataSet) barData.b(highlightD.f);
        if (iBarDataSet.isStacked()) {
            return g(highlightD, iBarDataSet, (float) xm0VarC.c, (float) xm0VarC.b);
        }
        xm0.c(xm0VarC);
        return highlightD;
    }
}
