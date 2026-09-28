package com.github.mikephil.charting.data;

import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class PieData extends ChartData<IPieDataSet> {
    public PieData(IPieDataSet iPieDataSet) {
        super(iPieDataSet);
    }

    @Override // com.github.mikephil.charting.data.ChartData
    public final IDataSet b(int i) {
        if (i == 0) {
            return j();
        }
        return null;
    }

    @Override // com.github.mikephil.charting.data.ChartData
    public final Entry e(Highlight highlight) {
        return j().getEntryForIndex((int) highlight.a);
    }

    public final IPieDataSet j() {
        return (IPieDataSet) this.i.get(0);
    }

    public final float k() {
        float f = 0.0f;
        for (int i = 0; i < j().getEntryCount(); i++) {
            f += j().getEntryForIndex(i).a;
        }
        return f;
    }

    public PieData() {
    }
}
