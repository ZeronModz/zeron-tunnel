package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import defpackage.xm0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class ChartHighlighter<T extends BarLineScatterCandleBubbleDataProvider> implements IHighlighter {
    public final BarLineScatterCandleBubbleDataProvider a;
    public final ArrayList b = new ArrayList();

    public ChartHighlighter(T t) {
        this.a = t;
    }

    public static float f(List list, float f, YAxis.AxisDependency axisDependency) {
        float f2 = Float.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            Highlight highlight = (Highlight) list.get(i);
            if (highlight.h == axisDependency) {
                float fAbs = Math.abs(highlight.d - f);
                if (fAbs < f2) {
                    f2 = fAbs;
                }
            }
        }
        return f2;
    }

    public ArrayList a(IDataSet iDataSet, int i, float f, DataSet.Rounding rounding) {
        Entry entryForXValue;
        ArrayList arrayList = new ArrayList();
        List<Entry> entriesForXValue = iDataSet.getEntriesForXValue(f);
        if (entriesForXValue.size() == 0 && (entryForXValue = iDataSet.getEntryForXValue(f, Float.NaN, rounding)) != null) {
            entriesForXValue = iDataSet.getEntriesForXValue(entryForXValue.b());
        }
        if (entriesForXValue.size() != 0) {
            for (Entry entry : entriesForXValue) {
                xm0 xm0VarA = this.a.getTransformer(iDataSet.getAxisDependency()).a(entry.b(), entry.a());
                arrayList.add(new Highlight(entry.b(), entry.a(), (float) xm0VarA.b, (float) xm0VarA.c, i, iDataSet.getAxisDependency()));
            }
        }
        return arrayList;
    }

    public BarLineScatterCandleBubbleData b() {
        return this.a.getData();
    }

    public float c(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f - f3, f2 - f4);
    }

    public final Highlight d(float f, float f2, float f3) {
        ArrayList arrayListE = e(f, f2, f3);
        Highlight highlight = null;
        if (arrayListE.isEmpty()) {
            return null;
        }
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        float f4 = f(arrayListE, f3, axisDependency);
        YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
        if (f4 >= f(arrayListE, f3, axisDependency2)) {
            axisDependency = axisDependency2;
        }
        float maxHighlightDistance = this.a.getMaxHighlightDistance();
        for (int i = 0; i < arrayListE.size(); i++) {
            Highlight highlight2 = (Highlight) arrayListE.get(i);
            if (axisDependency == null || highlight2.h == axisDependency) {
                float fC = c(f2, f3, highlight2.c, highlight2.d);
                if (fC < maxHighlightDistance) {
                    highlight = highlight2;
                    maxHighlightDistance = fC;
                }
            }
        }
        return highlight;
    }

    public ArrayList e(float f, float f2, float f3) {
        ArrayList arrayList = this.b;
        arrayList.clear();
        BarLineScatterCandleBubbleData barLineScatterCandleBubbleDataB = b();
        if (barLineScatterCandleBubbleDataB != null) {
            int iC = barLineScatterCandleBubbleDataB.c();
            for (int i = 0; i < iC; i++) {
                IDataSet iDataSetB = barLineScatterCandleBubbleDataB.b(i);
                if (iDataSetB.isHighlightEnabled()) {
                    arrayList.addAll(a(iDataSetB, i, f, DataSet.Rounding.CLOSEST));
                }
            }
        }
        return arrayList;
    }

    @Override // com.github.mikephil.charting.highlight.IHighlighter
    public Highlight getHighlight(float f, float f2) {
        xm0 xm0VarC = this.a.getTransformer(YAxis.AxisDependency.LEFT).c(f, f2);
        float f3 = (float) xm0VarC.b;
        xm0.c(xm0VarC);
        return d(f3, f, f2);
    }
}
