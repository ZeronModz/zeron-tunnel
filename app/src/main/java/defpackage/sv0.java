package defpackage;

import com.google.zxing.pdf417.encoder.Compaction;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class sv0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Compaction.values().length];
        a = iArr;
        try {
            iArr[Compaction.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[Compaction.BYTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[Compaction.NUMERIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
