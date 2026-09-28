package defpackage;

import androidx.constraintlayout.core.state.State;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class td {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[State.Direction.values().length];
        a = iArr;
        try {
            iArr[State.Direction.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[State.Direction.START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[State.Direction.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[State.Direction.END.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[State.Direction.TOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[State.Direction.BOTTOM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
