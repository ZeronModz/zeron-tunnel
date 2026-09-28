package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ValueFormatter implements IAxisValueFormatter, IValueFormatter {
    public String a(float f, BarEntry barEntry) {
        return b(f);
    }

    public String b(float f) {
        return String.valueOf(f);
    }

    public String c(float f) {
        return b(f);
    }

    @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
    public final String getFormattedValue(float f, AxisBase axisBase) {
        return b(f);
    }

    @Override // com.github.mikephil.charting.formatter.IValueFormatter
    public final String getFormattedValue(float f, Entry entry, int i, ViewPortHandler viewPortHandler) {
        return b(f);
    }
}
