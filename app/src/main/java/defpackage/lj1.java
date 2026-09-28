package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry;
import androidx.core.provider.FontsContractCompat$FontInfo;
import java.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lj1 {
    public lj1() {
        new ConcurrentHashMap();
    }

    public static FontsContractCompat$FontInfo e(int i, FontsContractCompat$FontInfo[] fontsContractCompat$FontInfoArr) {
        int i2 = (i & 1) == 0 ? 400 : TypedValues.TransitionType.TYPE_DURATION;
        boolean z = (i & 2) != 0;
        FontsContractCompat$FontInfo fontsContractCompat$FontInfo = null;
        int i3 = Integer.MAX_VALUE;
        for (FontsContractCompat$FontInfo fontsContractCompat$FontInfo2 : fontsContractCompat$FontInfoArr) {
            int iAbs = (Math.abs(fontsContractCompat$FontInfo2.c - i2) * 2) + (fontsContractCompat$FontInfo2.d == z ? 0 : 1);
            if (fontsContractCompat$FontInfo == null || i3 > iAbs) {
                fontsContractCompat$FontInfo = fontsContractCompat$FontInfo2;
                i3 = iAbs;
            }
        }
        return fontsContractCompat$FontInfo;
    }

    public abstract Typeface a(Context context, FontResourcesParserCompat$FontFamilyFilesResourceEntry fontResourcesParserCompat$FontFamilyFilesResourceEntry, Resources resources, int i);

    public abstract Typeface b(Context context, FontsContractCompat$FontInfo[] fontsContractCompat$FontInfoArr, int i);

    public Typeface c(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File fileC = mj1.c(context);
        if (fileC == null) {
            return null;
        }
        try {
            if (mj1.a(fileC, resources, i)) {
                return Typeface.createFromFile(fileC.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileC.delete();
        }
    }
}
