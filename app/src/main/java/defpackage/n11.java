package defpackage;

import com.google.common.collect.BoundType;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class n11 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BoundType.values().length];
        a = iArr;
        try {
            iArr[BoundType.OPEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[BoundType.CLOSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
