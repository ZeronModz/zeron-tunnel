package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.o0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final List a(String str) {
        int i;
        Pair pair;
        Pair pair2;
        if (str == null) {
            return EmptyList.INSTANCE;
        }
        Lazy lazyA = kotlin.c.a(LazyThreadSafetyMode.NONE, new o0(15));
        for (int i2 = 0; i2 <= str.length() - 1; i2 = i) {
            Lazy lazyA2 = kotlin.c.a(LazyThreadSafetyMode.NONE, new o0(16));
            Integer numValueOf = null;
            i = i2;
            while (true) {
                if (i <= str.length() - 1) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == ',') {
                        ((ArrayList) lazyA.getValue()).add(new HeaderValue(g.c0(str.substring(i2, numValueOf != null ? numValueOf.intValue() : i)).toString(), lazyA2.isInitialized() ? (List) lazyA2.getValue() : EmptyList.INSTANCE));
                        i++;
                    } else if (cCharAt != ';') {
                        i++;
                    } else {
                        if (numValueOf == null) {
                            numValueOf = Integer.valueOf(i);
                        }
                        int i3 = i + 1;
                        int i4 = i3;
                        while (i4 <= g.x(str)) {
                            char cCharAt2 = str.charAt(i4);
                            if (cCharAt2 == ',' || cCharAt2 == ';') {
                                b(lazyA2, str, i3, i4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                break;
                            }
                            if (cCharAt2 != '=') {
                                i4++;
                            } else {
                                int i5 = i4 + 1;
                                if (str.length() == i5) {
                                    pair2 = new Pair(Integer.valueOf(i5), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                } else {
                                    if (str.charAt(i5) == '\"') {
                                        int i6 = i4 + 2;
                                        StringBuilder sb = new StringBuilder();
                                        while (i6 <= str.length() - 1) {
                                            char cCharAt3 = str.charAt(i6);
                                            if (cCharAt3 == '\"') {
                                                int i7 = i6 + 1;
                                                int i8 = i7;
                                                while (i8 < str.length() && str.charAt(i8) == ' ') {
                                                    i8++;
                                                }
                                                if (i8 == str.length() || str.charAt(i8) == ';') {
                                                    pair = new Pair(Integer.valueOf(i7), sb.toString());
                                                    break;
                                                }
                                            }
                                            if (cCharAt3 != '\\' || i6 >= str.length() - 3) {
                                                sb.append(cCharAt3);
                                                i6++;
                                            } else {
                                                sb.append(str.charAt(i6 + 1));
                                                i6 += 2;
                                            }
                                        }
                                        pair = new Pair(Integer.valueOf(i6), "\"".concat(sb.toString()));
                                    } else {
                                        int i9 = i5;
                                        while (i9 <= str.length() - 1) {
                                            char cCharAt4 = str.charAt(i9);
                                            if (cCharAt4 == ',' || cCharAt4 == ';') {
                                                pair = new Pair(Integer.valueOf(i9), g.c0(str.substring(i5, i9)).toString());
                                                break;
                                            }
                                            i9++;
                                        }
                                        pair = new Pair(Integer.valueOf(i9), g.c0(str.substring(i5, i9)).toString());
                                    }
                                    pair2 = pair;
                                }
                                int iIntValue = ((Number) pair2.component1()).intValue();
                                b(lazyA2, str, i3, i4, (String) pair2.component2());
                                i = iIntValue;
                            }
                        }
                        b(lazyA2, str, i3, i4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        i = i4;
                    }
                } else {
                    ((ArrayList) lazyA.getValue()).add(new HeaderValue(g.c0(str.substring(i2, numValueOf != null ? numValueOf.intValue() : i)).toString(), lazyA2.isInitialized() ? (List) lazyA2.getValue() : EmptyList.INSTANCE));
                }
            }
        }
        return lazyA.isInitialized() ? (List) lazyA.getValue() : EmptyList.INSTANCE;
    }

    public static final void b(Lazy lazy, String str, int i, int i2, String str2) {
        String string = g.c0(str.substring(i, i2)).toString();
        if (string.length() == 0) {
            return;
        }
        ((ArrayList) lazy.getValue()).add(new HeaderValueParam(string, str2));
    }
}
