package com.github.mikephil.charting.formatter;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class IndexAxisValueFormatter extends ValueFormatter {
    public final String[] a;
    public final int b;

    public IndexAxisValueFormatter(Collection<String> collection) {
        this.a = new String[0];
        this.b = 0;
        if (collection != null) {
            String[] strArr = (String[]) collection.toArray(new String[collection.size()]);
            strArr = strArr == null ? new String[0] : strArr;
            this.a = strArr;
            this.b = strArr.length;
        }
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String b(float f) {
        int iRound = Math.round(f);
        return (iRound < 0 || iRound >= this.b || iRound != ((int) f)) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : this.a[iRound];
    }

    public IndexAxisValueFormatter(String[] strArr) {
        this.a = new String[0];
        this.b = 0;
        if (strArr != null) {
            this.a = strArr;
            this.b = strArr.length;
        }
    }

    public IndexAxisValueFormatter() {
        this.a = new String[0];
        this.b = 0;
    }
}
