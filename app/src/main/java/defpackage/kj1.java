package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry;
import androidx.core.provider.FontsContractCompat$FontInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class kj1 extends lj1 {
    public static final Class a;
    public static final Constructor b;
    public static final Method c;
    public static final Method d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    public static boolean f(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface g(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) d.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.lj1
    public final Typeface a(Context context, FontResourcesParserCompat$FontFamilyFilesResourceEntry fontResourcesParserCompat$FontFamilyFilesResourceEntry, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        FileInputStream fileInputStream;
        try {
            objNewInstance = b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (FontResourcesParserCompat$FontFileResourceEntry fontResourcesParserCompat$FontFileResourceEntry : fontResourcesParserCompat$FontFamilyFilesResourceEntry.a) {
                int i2 = fontResourcesParserCompat$FontFileResourceEntry.f;
                File fileC = mj1.c(context);
                if (fileC != null) {
                    try {
                        if (mj1.a(fileC, resources, i2)) {
                            try {
                                fileInputStream = new FileInputStream(fileC);
                            } catch (IOException unused2) {
                                map = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (map != null && f(objNewInstance, map, fontResourcesParserCompat$FontFileResourceEntry.e, fontResourcesParserCompat$FontFileResourceEntry.b, fontResourcesParserCompat$FontFileResourceEntry.c)) {
                                }
                            } finally {
                            }
                        }
                    } finally {
                        fileC.delete();
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return g(objNewInstance);
        }
        return null;
    }

    @Override // defpackage.lj1
    public final Typeface b(Context context, FontsContractCompat$FontInfo[] fontsContractCompat$FontInfoArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
            int length = fontsContractCompat$FontInfoArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    FontsContractCompat$FontInfo fontsContractCompat$FontInfo = fontsContractCompat$FontInfoArr[i2];
                    Uri uri = fontsContractCompat$FontInfo.a;
                    ByteBuffer byteBufferD = (ByteBuffer) simpleArrayMap.get(uri);
                    if (byteBufferD == null) {
                        byteBufferD = mj1.d(context, uri);
                        simpleArrayMap.put(uri, byteBufferD);
                    }
                    if (byteBufferD == null || !f(objNewInstance, byteBufferD, fontsContractCompat$FontInfo.b, fontsContractCompat$FontInfo.c, fontsContractCompat$FontInfo.d)) {
                        break;
                    }
                    i2++;
                } else {
                    Typeface typefaceG = g(objNewInstance);
                    if (typefaceG != null) {
                        return Typeface.create(typefaceG, i);
                    }
                }
            }
        }
        return null;
    }
}
