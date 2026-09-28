package com.github.mikephil.charting.formatter;

import com.google.android.gms.ads.RequestConfiguration;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class LargeValueFormatter extends ValueFormatter {
    public final String[] a;
    public final int b;
    public final DecimalFormat c;
    public final String d;

    public LargeValueFormatter() {
        this.a = new String[]{RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "k", "m", "b", "t"};
        this.b = 5;
        this.d = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.c = new DecimalFormat("###E00");
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String b(float f) {
        StringBuilder sb = new StringBuilder();
        String str = this.c.format(f);
        int numericValue = Character.getNumericValue(str.charAt(str.length() - 1));
        String strReplaceAll = str.replaceAll("E[0-9][0-9]", this.a[Integer.valueOf(Character.getNumericValue(str.charAt(str.length() - 2)) + RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED + numericValue).intValue() / 3]);
        while (true) {
            if (strReplaceAll.length() <= this.b && !strReplaceAll.matches("[0-9]+\\.[a-z]")) {
                sb.append(strReplaceAll);
                sb.append(this.d);
                return sb.toString();
            }
            strReplaceAll = strReplaceAll.substring(0, strReplaceAll.length() - 2).concat(strReplaceAll.substring(strReplaceAll.length() - 1));
        }
    }

    public LargeValueFormatter(String str) {
        this();
        this.d = str;
    }
}
