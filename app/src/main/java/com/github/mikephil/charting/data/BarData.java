package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class BarData extends BarLineScatterCandleBubbleData<IBarDataSet> {
    public final float j;

    public BarData() {
        this.j = 0.85f;
    }

    public BarData(IBarDataSet... iBarDataSetArr) {
        super(iBarDataSetArr);
        this.j = 0.85f;
    }

    public BarData(List<IBarDataSet> list) {
        super(list);
        this.j = 0.85f;
    }
}
