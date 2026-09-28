package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.data.BarEntry;
import com.google.android.gms.ads.RequestConfiguration;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class StackedValueFormatter extends ValueFormatter {
    public final boolean a;
    public final String b;
    public final DecimalFormat c;

    public StackedValueFormatter(boolean z, String str, int i) {
        this.a = z;
        this.b = str;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.c = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String a(float f, BarEntry barEntry) {
        float[] fArr;
        boolean z = this.a;
        String str = this.b;
        DecimalFormat decimalFormat = this.c;
        if (z || (fArr = barEntry.e) == null) {
            return decimalFormat.format(f) + str;
        }
        if (fArr[fArr.length - 1] != f) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return decimalFormat.format(barEntry.a) + str;
    }
}
