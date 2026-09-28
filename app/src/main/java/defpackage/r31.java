package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry;
import androidx.core.content.res.ResourcesCompat$FontCallback;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r31 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static void a(q31 q31Var, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (c) {
            try {
                WeakHashMap weakHashMap = b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(q31Var);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(q31Var, sparseArray);
                }
                sparseArray.append(i, new p31(colorStateList, q31Var.a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface b(Context context, int i, TypedValue typedValue, int i2, ResourcesCompat$FontCallback resourcesCompat$FontCallback, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            LruCache lruCache = ij1.b;
            Typeface typeface = (Typeface) lruCache.c(ij1.b(resources, i, string, i3, i2));
            int i4 = 7;
            if (typeface != null) {
                if (resourcesCompat$FontCallback != null) {
                    new Handler(Looper.getMainLooper()).post(new ez0(i4, resourcesCompat$FontCallback, typeface));
                }
                typefaceA = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        FontResourcesParserCompat$FamilyResourceEntry fontResourcesParserCompat$FamilyResourceEntryA = p80.a(resources.getXml(i), resources);
                        if (fontResourcesParserCompat$FamilyResourceEntryA != null) {
                            typefaceA = ij1.a(context, fontResourcesParserCompat$FamilyResourceEntryA, resources, i, string, typedValue.assetCookie, i2, resourcesCompat$FontCallback, z);
                        } else if (resourcesCompat$FontCallback != null) {
                            resourcesCompat$FontCallback.a(-3);
                        }
                    } else {
                        int i5 = typedValue.assetCookie;
                        Typeface typefaceD = ij1.a.d(context, resources, i, string, i2);
                        if (typefaceD != null) {
                            lruCache.d(ij1.b(resources, i, string, i5, i2), typefaceD);
                        }
                        if (resourcesCompat$FontCallback != null) {
                            if (typefaceD != null) {
                                new Handler(Looper.getMainLooper()).post(new ez0(i4, resourcesCompat$FontCallback, typefaceD));
                            } else {
                                resourcesCompat$FontCallback.a(-3);
                            }
                        }
                        typefaceA = typefaceD;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (resourcesCompat$FontCallback != null) {
                        resourcesCompat$FontCallback.a(-3);
                    }
                }
            }
        } else if (resourcesCompat$FontCallback != null) {
            resourcesCompat$FontCallback.a(-3);
        }
        if (typefaceA != null || resourcesCompat$FontCallback != null || z2) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
