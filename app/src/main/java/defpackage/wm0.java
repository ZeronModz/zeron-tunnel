package defpackage;

import com.tencent.mmkv.MMKVLogLevel;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class wm0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MMKVLogLevel.values().length];
        a = iArr;
        try {
            iArr[MMKVLogLevel.LevelDebug.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[MMKVLogLevel.LevelWarning.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[MMKVLogLevel.LevelError.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[MMKVLogLevel.LevelNone.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[MMKVLogLevel.LevelInfo.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
