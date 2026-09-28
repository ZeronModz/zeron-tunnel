package com.github.mikephil.charting.data;

import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class RadarData extends ChartData<IRadarDataSet> {
    public RadarData() {
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.data.ChartData
    public final Entry e(Highlight highlight) {
        return ((IRadarDataSet) b(highlight.f)).getEntryForIndex((int) highlight.a);
    }

    public RadarData(List<IRadarDataSet> list) {
        super(list);
    }

    public RadarData(IRadarDataSet... iRadarDataSetArr) {
        super(iRadarDataSetArr);
    }
}
