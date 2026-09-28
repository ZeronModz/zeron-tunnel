package com.github.mikephil.charting.data;

import android.graphics.Color;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BarLineScatterCandleBubbleDataSet<T extends Entry> extends DataSet<T> implements IBarLineScatterCandleBubbleDataSet<T> {
    public int u;

    public BarLineScatterCandleBubbleDataSet(List<T> list, String str) {
        super(list, str);
        this.u = Color.rgb(255, 187, 115);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet
    public final int getHighLightColor() {
        return this.u;
    }
}
