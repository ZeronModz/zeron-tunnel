package defpackage;

import com.github.mikephil.charting.components.Legend;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class xj0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[Legend.LegendForm.values().length];
        d = iArr;
        try {
            iArr[Legend.LegendForm.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            d[Legend.LegendForm.EMPTY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            d[Legend.LegendForm.DEFAULT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            d[Legend.LegendForm.CIRCLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            d[Legend.LegendForm.SQUARE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            d[Legend.LegendForm.LINE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[Legend.LegendOrientation.values().length];
        c = iArr2;
        try {
            iArr2[Legend.LegendOrientation.HORIZONTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            c[Legend.LegendOrientation.VERTICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        int[] iArr3 = new int[Legend.LegendVerticalAlignment.values().length];
        b = iArr3;
        try {
            iArr3[Legend.LegendVerticalAlignment.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            b[Legend.LegendVerticalAlignment.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            b[Legend.LegendVerticalAlignment.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        int[] iArr4 = new int[Legend.LegendHorizontalAlignment.values().length];
        a = iArr4;
        try {
            iArr4[Legend.LegendHorizontalAlignment.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            a[Legend.LegendHorizontalAlignment.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            a[Legend.LegendHorizontalAlignment.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
    }
}
