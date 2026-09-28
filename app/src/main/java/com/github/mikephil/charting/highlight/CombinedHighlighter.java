package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.dataprovider.CombinedDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class CombinedHighlighter extends ChartHighlighter<CombinedDataProvider> implements IHighlighter {
    public final BarHighlighter c;

    public CombinedHighlighter(CombinedDataProvider combinedDataProvider, BarDataProvider barDataProvider) {
        super(combinedDataProvider);
        this.c = barDataProvider.getBarData() == null ? null : new BarHighlighter(barDataProvider);
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    public final ArrayList e(float f, float f2, float f3) {
        ArrayList arrayList = this.b;
        arrayList.clear();
        ((CombinedDataProvider) this.a).getCombinedData().getClass();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList2.size(); i++) {
            ChartData chartData = (ChartData) arrayList2.get(i);
            BarHighlighter barHighlighter = this.c;
            if (barHighlighter == null || !(chartData instanceof BarData)) {
                int iC = chartData.c();
                for (int i2 = 0; i2 < iC; i2++) {
                    IDataSet iDataSetB = ((BarLineScatterCandleBubbleData) arrayList2.get(i)).b(i2);
                    if (iDataSetB.isHighlightEnabled()) {
                        for (Highlight highlight : a(iDataSetB, i2, f, DataSet.Rounding.CLOSEST)) {
                            highlight.e = i;
                            arrayList.add(highlight);
                        }
                    }
                }
            } else {
                Highlight highlight2 = barHighlighter.getHighlight(f2, f3);
                if (highlight2 != null) {
                    highlight2.e = i;
                    arrayList.add(highlight2);
                }
            }
        }
        return arrayList;
    }
}
