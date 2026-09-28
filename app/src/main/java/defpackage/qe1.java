package defpackage;

import kotlinx.coroutines.channels.TickerMode;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class qe1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TickerMode.values().length];
        try {
            iArr[TickerMode.FIXED_PERIOD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TickerMode.FIXED_DELAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
