package defpackage;

import com.github.mikephil.charting.charts.CombinedChart;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class qo {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CombinedChart.DrawOrder.values().length];
        a = iArr;
        try {
            iArr[CombinedChart.DrawOrder.BAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[CombinedChart.DrawOrder.BUBBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[CombinedChart.DrawOrder.LINE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[CombinedChart.DrawOrder.CANDLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[CombinedChart.DrawOrder.SCATTER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
