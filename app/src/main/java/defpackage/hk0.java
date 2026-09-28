package defpackage;

import com.github.mikephil.charting.data.LineDataSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class hk0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LineDataSet.Mode.values().length];
        a = iArr;
        try {
            iArr[LineDataSet.Mode.LINEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[LineDataSet.Mode.STEPPED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[LineDataSet.Mode.CUBIC_BEZIER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[LineDataSet.Mode.HORIZONTAL_BEZIER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
