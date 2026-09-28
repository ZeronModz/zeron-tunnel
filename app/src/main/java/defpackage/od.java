package defpackage;

import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class od {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ BarLineScatterCandleBubbleRenderer d;

    public od(BarLineScatterCandleBubbleRenderer barLineScatterCandleBubbleRenderer) {
        this.d = barLineScatterCandleBubbleRenderer;
    }

    public final void a(BarLineScatterCandleBubbleDataProvider barLineScatterCandleBubbleDataProvider, IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet) {
        this.d.b.getClass();
        float fMax = Math.max(0.0f, Math.min(1.0f, 1.0f));
        float lowestVisibleX = barLineScatterCandleBubbleDataProvider.getLowestVisibleX();
        float highestVisibleX = barLineScatterCandleBubbleDataProvider.getHighestVisibleX();
        T entryForXValue = iBarLineScatterCandleBubbleDataSet.getEntryForXValue(lowestVisibleX, Float.NaN, DataSet.Rounding.DOWN);
        T entryForXValue2 = iBarLineScatterCandleBubbleDataSet.getEntryForXValue(highestVisibleX, Float.NaN, DataSet.Rounding.UP);
        this.a = entryForXValue == 0 ? 0 : iBarLineScatterCandleBubbleDataSet.getEntryIndex(entryForXValue);
        this.b = entryForXValue2 != 0 ? iBarLineScatterCandleBubbleDataSet.getEntryIndex(entryForXValue2) : 0;
        this.c = (int) ((r2 - this.a) * fMax);
    }
}
