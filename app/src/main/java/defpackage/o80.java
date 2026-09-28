package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat$FontFamilyResult;
import androidx.core.provider.FontsContractCompat$FontInfo;
import androidx.core.provider.b;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o80 {
    public static final LruCache a = new LruCache(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final SimpleArrayMap d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new rc0(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new SimpleArrayMap();
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((FontRequest) list.get(i2)).f);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static n80 b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceB;
        LruCache lruCache = a;
        Trace.beginSection(k02.y("getFontSync"));
        try {
            Typeface typeface = (Typeface) lruCache.c(str);
            if (typeface != null) {
                return new n80(typeface);
            }
            FontsContractCompat$FontFamilyResult fontsContractCompat$FontFamilyResultA = b.a(context, list);
            List list2 = fontsContractCompat$FontFamilyResultA.b;
            int i3 = fontsContractCompat$FontFamilyResultA.a;
            if (i3 != 0) {
                i2 = i3 != 1 ? -3 : -2;
            } else {
                FontsContractCompat$FontInfo[] fontsContractCompat$FontInfoArr = (FontsContractCompat$FontInfo[]) list2.get(0);
                if (fontsContractCompat$FontInfoArr == null || fontsContractCompat$FontInfoArr.length == 0) {
                    i2 = 1;
                } else {
                    int length = fontsContractCompat$FontInfoArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            i2 = 0;
                            break;
                        }
                        int i5 = fontsContractCompat$FontInfoArr[i4].e;
                        if (i5 == 0) {
                            i4++;
                        } else if (i5 >= 0) {
                            i2 = i5;
                        }
                    }
                }
            }
            if (i2 != 0) {
                return new n80(i2);
            }
            if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                FontsContractCompat$FontInfo[] fontsContractCompat$FontInfoArr2 = (FontsContractCompat$FontInfo[]) list2.get(0);
                lj1 lj1Var = ij1.a;
                Trace.beginSection(k02.y("TypefaceCompat.createFromFontInfo"));
                typefaceB = ij1.a.b(context, fontsContractCompat$FontInfoArr2, i);
                Trace.endSection();
            } else {
                lj1 lj1Var2 = ij1.a;
                Trace.beginSection(k02.y("TypefaceCompat.createFromFontInfoWithFallback"));
                typefaceB = ij1.a.c(context, list2, i);
                Trace.endSection();
            }
            if (typefaceB == null) {
                return new n80(-3);
            }
            lruCache.d(str, typefaceB);
            return new n80(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new n80(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }
}
