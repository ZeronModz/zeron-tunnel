package com.github.mikephil.charting.formatter;

import java.text.DecimalFormat;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class DefaultAxisValueFormatter extends ValueFormatter {
    public final DecimalFormat a;
    public final int b;

    public DefaultAxisValueFormatter(int i) {
        this.b = i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String b(float f) {
        return this.a.format(f);
    }
}
