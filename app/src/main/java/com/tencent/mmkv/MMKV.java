package com.tencent.mmkv;

import android.content.SharedPreferences;
import com.v2ray.ang.AngApplication;
import dalvik.annotation.optimization.FastNative;
import defpackage.s31;
import defpackage.u7;
import defpackage.vh;
import defpackage.wm0;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class MMKV implements SharedPreferences, SharedPreferences.Editor {
    public static final EnumMap a;
    public static final EnumMap b;
    public static final MMKVLogLevel[] c;
    public static final HashSet d;
    public static String e;
    public static boolean f;
    public static final boolean g;
    private final long nativeHandle;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface LibLoader {
        void loadLibrary(String str);
    }

    static {
        EnumMap enumMap = new EnumMap(MMKVRecoverStrategic.class);
        a = enumMap;
        enumMap.put(MMKVRecoverStrategic.OnErrorDiscard, 0);
        enumMap.put(MMKVRecoverStrategic.OnErrorRecover, 1);
        EnumMap enumMap2 = new EnumMap(MMKVLogLevel.class);
        b = enumMap2;
        MMKVLogLevel mMKVLogLevel = MMKVLogLevel.LevelDebug;
        enumMap2.put(mMKVLogLevel, 0);
        MMKVLogLevel mMKVLogLevel2 = MMKVLogLevel.LevelInfo;
        enumMap2.put(mMKVLogLevel2, 1);
        MMKVLogLevel mMKVLogLevel3 = MMKVLogLevel.LevelWarning;
        enumMap2.put(mMKVLogLevel3, 2);
        MMKVLogLevel mMKVLogLevel4 = MMKVLogLevel.LevelError;
        enumMap2.put(mMKVLogLevel4, 3);
        MMKVLogLevel mMKVLogLevel5 = MMKVLogLevel.LevelNone;
        enumMap2.put(mMKVLogLevel5, 4);
        c = new MMKVLogLevel[]{mMKVLogLevel, mMKVLogLevel2, mMKVLogLevel3, mMKVLogLevel4, mMKVLogLevel5};
        d = new HashSet();
        e = null;
        f = true;
        new HashMap();
        g = false;
    }

    public MMKV(long j) {
        this.nativeHandle = j;
    }

    private native long actualSize(long j);

    private native String[] allKeys(long j, boolean z);

    public static native long backupAllToDirectory(String str);

    public static native boolean backupOneToDirectory(String str, String str2, String str3);

    private static native boolean checkProcessMode(long j);

    private native boolean containsKey(long j, String str);

    private native long count(long j, boolean z);

    private static native long createNB(int i);

    private native boolean decodeBool(long j, String str, boolean z);

    private native byte[] decodeBytes(long j, String str);

    private native double decodeDouble(long j, String str, double d2);

    private native float decodeFloat(long j, String str, float f2);

    private native int decodeInt(long j, String str, int i);

    private native long decodeLong(long j, String str, long j2);

    private native String decodeString(long j, String str, String str2);

    private native String[] decodeStringSet(long j, String str);

    private static native void destroyNB(long j, int i);

    private native boolean encodeBool(long j, String str, boolean z);

    private native boolean encodeBool_2(long j, String str, boolean z, int i);

    private native boolean encodeBytes(long j, String str, byte[] bArr);

    private native boolean encodeBytes_2(long j, String str, byte[] bArr, int i);

    private native boolean encodeDouble(long j, String str, double d2);

    private native boolean encodeDouble_2(long j, String str, double d2, int i);

    private native boolean encodeFloat(long j, String str, float f2);

    private native boolean encodeFloat_2(long j, String str, float f2, int i);

    private native boolean encodeInt(long j, String str, int i);

    private native boolean encodeInt_2(long j, String str, int i, int i2);

    private native boolean encodeLong(long j, String str, long j2);

    private native boolean encodeLong_2(long j, String str, long j2, int i);

    private native boolean encodeSet(long j, String str, String[] strArr);

    private native boolean encodeSet_2(long j, String str, String[] strArr, int i);

    private native boolean encodeString(long j, String str, String str2);

    private native boolean encodeString_2(long j, String str, String str2, int i);

    public static void g() {
        synchronized (d) {
            f = true;
        }
    }

    private static native long getDefaultMMKV(int i, String str);

    private static native long getMMKVWithAshmemFD(String str, int i, int i2, String str2);

    private static native long getMMKVWithID(String str, int i, String str2, String str3, long j);

    private static native long getMMKVWithIDAndSize(String str, int i, int i2, String str2);

    private native boolean isCompareBeforeSetEnabled();

    @FastNative
    private native boolean isEncryptionEnabled();

    @FastNative
    private native boolean isExpirationEnabled();

    public static native boolean isFileValid(String str, String str2);

    private static native void jniInitialize(String str, String str2, int i, boolean z);

    public static void l(AngApplication angApplication) {
        String str = angApplication.getFilesDir().getAbsolutePath() + "/mmkv";
        MMKVLogLevel mMKVLogLevel = MMKVLogLevel.LevelInfo;
        int i = 2;
        if ((angApplication.getApplicationInfo().flags & 2) == 0) {
            synchronized (d) {
                f = false;
            }
        } else {
            g();
        }
        String absolutePath = angApplication.getCacheDir().getAbsolutePath();
        boolean z = g;
        System.loadLibrary("mmkv");
        int i2 = wm0.a[mMKVLogLevel.ordinal()];
        if (i2 == 1) {
            i = 0;
        } else if (i2 != 2) {
            i = 3;
            if (i2 != 3) {
                i = 4;
                if (i2 != 4) {
                    i = 1;
                }
            }
        }
        jniInitialize(str, absolutePath, i, z);
        e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mmkv.MMKV m(android.content.Context r9, java.lang.String r10, int r11, int r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mmkv.MMKV.m(android.content.Context, java.lang.String, int, int, java.lang.String):com.tencent.mmkv.MMKV");
    }

    private static void mmkvLogImp(int i, String str, int i2, String str2, String str3) {
        int i3 = wm0.a[c[i].ordinal()];
    }

    public static MMKV n(String str) {
        if (e == null) {
            u7.p("You should Call MMKV.initialize() first.");
            return null;
        }
        long mMKVWithID = getMMKVWithID(str, 2, null, null, 0L);
        if (mMKVWithID == 0) {
            s31.f(vh.m("Fail to create an MMKV instance [", str, "] in JNI"));
            return null;
        }
        if (!f) {
            return new MMKV(mMKVWithID);
        }
        HashSet hashSet = d;
        synchronized (hashSet) {
            try {
                if (!hashSet.contains(Long.valueOf(mMKVWithID))) {
                    if (!checkProcessMode(mMKVWithID)) {
                        throw new IllegalArgumentException(("Opening an MMKV instance [" + str + "] with MULTI_PROCESS_MODE, ").concat("while it's already been opened with SINGLE_PROCESS_MODE by someone somewhere else!"));
                    }
                    hashSet.add(Long.valueOf(mMKVWithID));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new MMKV(mMKVWithID);
    }

    @FastNative
    private native void nativeEnableCompareBeforeSet();

    public static native void onExit();

    private static int onMMKVCRCCheckFail(String str) {
        MMKVRecoverStrategic mMKVRecoverStrategic = MMKVRecoverStrategic.OnErrorDiscard;
        p(MMKVLogLevel.LevelInfo, "Recover strategic for " + str + " is " + mMKVRecoverStrategic);
        Integer num = (Integer) a.get(mMKVRecoverStrategic);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int onMMKVFileLengthError(String str) {
        MMKVRecoverStrategic mMKVRecoverStrategic = MMKVRecoverStrategic.OnErrorDiscard;
        p(MMKVLogLevel.LevelInfo, "Recover strategic for " + str + " is " + mMKVRecoverStrategic);
        Integer num = (Integer) a.get(mMKVRecoverStrategic);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static void p(MMKVLogLevel mMKVLogLevel, String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[r0.length - 1];
        Integer num = (Integer) b.get(mMKVLogLevel);
        mmkvLogImp(num == null ? 0 : num.intValue(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), str);
    }

    public static native int pageSize();

    public static native boolean removeStorage(String str, String str2);

    private native void removeValueForKey(long j, String str);

    public static native long restoreAllFromDirectory(String str);

    public static native boolean restoreOneMMKVFromDirectory(String str, String str2, String str3);

    private static native void setCallbackHandler(boolean z, boolean z2);

    private static native void setLogLevel(int i);

    private static native void setWantsContentChangeNotify(boolean z);

    private native void sync(boolean z);

    private native long totalSize(long j);

    private native int valueSize(long j, String str, boolean z);

    public static native String version();

    private native int writeValueToNB(long j, String str, long j2, int i);

    public final String[] a() {
        return allKeys(this.nativeHandle, false);
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        sync(false);
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public final boolean b(String str, boolean z) {
        return decodeBool(this.nativeHandle, str, z);
    }

    public final long c(long j, String str) {
        return decodeLong(this.nativeHandle, str, j);
    }

    public native void checkContentChangedByOuterProcess();

    public native void checkReSetCryptKey(String str);

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        clearAll();
        return this;
    }

    public native void clearAll();

    public native void clearAllWithKeepingSpace();

    public native void clearMemoryCache();

    public native void close();

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        sync(true);
        return true;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return containsKey(this.nativeHandle, str);
    }

    public native String cryptKey();

    public final String d(String str) {
        return decodeString(this.nativeHandle, str, null);
    }

    public native boolean disableAutoKeyExpire();

    public native void disableCompareBeforeSet();

    public final String e(String str, String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    public native boolean enableAutoKeyExpire(int i);

    public final Set f(String str, Set set) {
        String[] strArrDecodeStringSet = decodeStringSet(this.nativeHandle, str);
        if (strArrDecodeStringSet != null) {
            try {
                Set set2 = (Set) HashSet.class.newInstance();
                set2.addAll(Arrays.asList(strArrDecodeStringSet));
                return set2;
            } catch (IllegalAccessException | InstantiationException unused) {
            }
        }
        return set;
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        throw new UnsupportedOperationException("Intentionally Not Supported. Use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        return decodeBool(this.nativeHandle, str, z);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f2) {
        return decodeFloat(this.nativeHandle, str, f2);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        return decodeInt(this.nativeHandle, str, i);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        return decodeLong(this.nativeHandle, str, j);
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        return f(str, set);
    }

    public final void h(long j, String str) {
        encodeLong(this.nativeHandle, str, j);
    }

    public final boolean i(String str, String str2) {
        return encodeString(this.nativeHandle, str, str2);
    }

    public final boolean j(String str, Set set) {
        return encodeSet(this.nativeHandle, str, set == null ? null : (String[]) set.toArray(new String[0]));
    }

    public final boolean k(String str, boolean z) {
        return encodeBool(this.nativeHandle, str, z);
    }

    public native void lock();

    public native String mmapID();

    public final void o(String str) {
        removeValueForKey(this.nativeHandle, str);
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        encodeBool(this.nativeHandle, str, z);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f2) {
        encodeFloat(this.nativeHandle, str, f2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        encodeInt(this.nativeHandle, str, i);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        encodeLong(this.nativeHandle, str, j);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        encodeString(this.nativeHandle, str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        j(str, set);
        return this;
    }

    public native boolean reKey(String str);

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        o(str);
        return this;
    }

    public native void removeValuesForKeys(String[] strArr);

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }

    private static void onContentChangedByOuterProcess(String str) {
    }
}
