package defpackage;

import androidx.camera.core.impl.Timebase;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class vm1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Timebase.values().length];
        a = iArr;
        try {
            iArr[Timebase.REALTIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[Timebase.UPTIME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
