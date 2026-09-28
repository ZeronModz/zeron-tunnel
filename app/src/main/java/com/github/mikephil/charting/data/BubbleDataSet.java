package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class BubbleDataSet extends BarLineScatterCandleBubbleDataSet<BubbleEntry> implements IBubbleDataSet {
    public float v;
    public final boolean w;
    public float x;

    public BubbleDataSet(List<BubbleEntry> list, String str) {
        super(list, str);
        this.w = true;
        this.x = 2.5f;
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public final void a(Entry entry) {
        BubbleEntry bubbleEntry = (BubbleEntry) entry;
        super.a(bubbleEntry);
        float f = bubbleEntry.e;
        if (f > this.v) {
            this.v = f;
        }
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet
    public final float getHighlightCircleWidth() {
        return this.x;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet
    public final float getMaxSize() {
        return this.v;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet
    public final boolean isNormalizeSizeEnabled() {
        return this.w;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet
    public final void setHighlightCircleWidth(float f) {
        this.x = Utils.c(f);
    }
}
