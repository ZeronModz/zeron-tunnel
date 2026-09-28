package com.github.mikephil.charting.data;

import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class CombinedData extends BarLineScatterCandleBubbleData<IBarLineScatterCandleBubbleDataSet<? extends Entry>> {
    @Override // com.github.mikephil.charting.data.ChartData
    public final void a() {
        List arrayList = this.i;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.i = arrayList;
        }
        arrayList.clear();
        this.a = -3.4028235E38f;
        this.b = Float.MAX_VALUE;
        this.c = -3.4028235E38f;
        this.d = Float.MAX_VALUE;
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        for (ChartData chartData : new ArrayList()) {
            chartData.a();
            this.i.addAll(chartData.i);
            float f = chartData.a;
            if (f > this.a) {
                this.a = f;
            }
            float f2 = chartData.b;
            if (f2 < this.b) {
                this.b = f2;
            }
            float f3 = chartData.c;
            if (f3 > this.c) {
                this.c = f3;
            }
            float f4 = chartData.d;
            if (f4 < this.d) {
                this.d = f4;
            }
            float f5 = chartData.e;
            if (f5 > this.e) {
                this.e = f5;
            }
            float f6 = chartData.f;
            if (f6 < this.f) {
                this.f = f6;
            }
            float f7 = chartData.g;
            if (f7 > this.g) {
                this.g = f7;
            }
            float f8 = chartData.h;
            if (f8 < this.h) {
                this.h = f8;
            }
        }
    }

    @Override // com.github.mikephil.charting.data.ChartData
    public final Entry e(Highlight highlight) {
        int i = highlight.e;
        int i2 = highlight.f;
        if (i >= new ArrayList().size()) {
            return null;
        }
        BarLineScatterCandleBubbleData barLineScatterCandleBubbleData = (BarLineScatterCandleBubbleData) new ArrayList().get(highlight.e);
        if (i2 >= barLineScatterCandleBubbleData.c()) {
            return null;
        }
        for (Entry entry : barLineScatterCandleBubbleData.b(i2).getEntriesForXValue(highlight.a)) {
            float fA = entry.a();
            float f = highlight.b;
            if (fA == f || Float.isNaN(f)) {
                return entry;
            }
        }
        return null;
    }

    @Override // com.github.mikephil.charting.data.ChartData
    public final void i() {
        a();
    }
}
