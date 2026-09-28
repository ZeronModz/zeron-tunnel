package com.trilead.ssh2.util;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class Tokenizer {
    public static String[] parseTokens(String str, char c) {
        int i = 1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == c) {
                i++;
            }
        }
        String[] strArr = new String[i];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            if (i3 >= str.length()) {
                strArr[i4] = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            } else {
                int iIndexOf = str.indexOf(c, i3);
                if (iIndexOf == -1) {
                    iIndexOf = str.length();
                }
                strArr[i4] = str.substring(i3, iIndexOf);
                i3 = iIndexOf + 1;
            }
        }
        return strArr;
    }
}
