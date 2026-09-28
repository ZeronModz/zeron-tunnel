package com.github.mikephil.charting.data;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class LineScatterCandleRadarDataSet<T extends Entry> extends BarLineScatterCandleBubbleDataSet<T> implements ILineScatterCandleRadarDataSet<T> {
    public final boolean v;
    public final boolean w;
    public final float x;

    public LineScatterCandleRadarDataSet(List<T> list, String str) {
        super(list, str);
        this.v = true;
        this.w = true;
        this.x = 0.5f;
        this.x = Utils.c(0.5f);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet
    public final DashPathEffect getDashPathEffectHighlight() {
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet
    public final float getHighlightLineWidth() {
        return this.x;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet
    public final boolean isHorizontalHighlightIndicatorEnabled() {
        return this.w;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet
    public final boolean isVerticalHighlightIndicatorEnabled() {
        return this.v;
    }
}
