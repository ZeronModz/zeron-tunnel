package defpackage;

import com.github.mikephil.charting.components.Legend;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class pw0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[Legend.LegendOrientation.values().length];
        c = iArr;
        try {
            iArr[Legend.LegendOrientation.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            c[Legend.LegendOrientation.HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[Legend.LegendHorizontalAlignment.values().length];
        b = iArr2;
        try {
            iArr2[Legend.LegendHorizontalAlignment.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[Legend.LegendHorizontalAlignment.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            b[Legend.LegendHorizontalAlignment.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr3 = new int[Legend.LegendVerticalAlignment.values().length];
        a = iArr3;
        try {
            iArr3[Legend.LegendVerticalAlignment.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[Legend.LegendVerticalAlignment.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
