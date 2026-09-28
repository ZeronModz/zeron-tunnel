package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.charts.PieChart;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class PercentFormatter extends ValueFormatter {
    public final DecimalFormat a;
    public final PieChart b;

    public PercentFormatter() {
        this.a = new DecimalFormat("###,###,##0.0");
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String b(float f) {
        return this.a.format(f) + " %";
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String c(float f) {
        PieChart pieChart = this.b;
        return (pieChart == null || !pieChart.Q) ? this.a.format(f) : b(f);
    }

    public PercentFormatter(PieChart pieChart) {
        this();
        this.b = pieChart;
    }
}
