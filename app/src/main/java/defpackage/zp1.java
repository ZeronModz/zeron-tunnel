package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class zp1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ConstraintAnchor.Type.values().length];
        a = iArr;
        try {
            iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
