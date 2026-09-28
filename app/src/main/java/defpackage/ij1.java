package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import androidx.collection.LruCache;
import androidx.core.graphics.TypefaceCompatApi26Impl;
import androidx.core.graphics.TypefaceCompatApi28Impl;
import androidx.core.graphics.TypefaceCompatApi29Impl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ij1 {
    public static final lj1 a;
    public static final LruCache b;

    static {
        Trace.beginSection(k02.y("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new TypefaceCompatApi29Impl();
        } else if (i >= 28) {
            a = new TypefaceCompatApi28Impl();
        } else if (i >= 26) {
            a = new TypefaceCompatApi26Impl();
        } else if (i < 24 || kj1.c == null) {
            a = new jj1();
        } else {
            a = new kj1();
        }
        b = new LruCache(16);
        Trace.endSection();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r16, androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, androidx.core.content.res.ResourcesCompat$FontCallback r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij1.a(android.content.Context, androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry, android.content.res.Resources, int, java.lang.String, int, int, androidx.core.content.res.ResourcesCompat$FontCallback, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
