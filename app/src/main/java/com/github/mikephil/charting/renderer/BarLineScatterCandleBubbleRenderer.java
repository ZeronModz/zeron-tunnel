package com.github.mikephil.charting.renderer;

import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.utils.ViewPortHandler;
import defpackage.od;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BarLineScatterCandleBubbleRenderer extends DataRenderer {
    public final od f;

    public BarLineScatterCandleBubbleRenderer(ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.f = new od(this);
    }

    public static boolean i(IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet) {
        if (iBarLineScatterCandleBubbleDataSet.isVisible()) {
            return iBarLineScatterCandleBubbleDataSet.isDrawValuesEnabled() || iBarLineScatterCandleBubbleDataSet.isDrawIconsEnabled();
        }
        return false;
    }

    public final boolean h(Entry entry, IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet) {
        if (entry == null) {
            return false;
        }
        float entryIndex = iBarLineScatterCandleBubbleDataSet.getEntryIndex(entry);
        float entryCount = iBarLineScatterCandleBubbleDataSet.getEntryCount();
        this.b.getClass();
        return entryIndex < entryCount * 1.0f;
    }
}
