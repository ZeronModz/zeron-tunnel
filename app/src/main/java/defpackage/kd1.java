package defpackage;

import androidx.work.NetworkType;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class kd1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NetworkType.values().length];
        a = iArr;
        try {
            iArr[NetworkType.NOT_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[NetworkType.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[NetworkType.UNMETERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[NetworkType.NOT_ROAMING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[NetworkType.METERED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
