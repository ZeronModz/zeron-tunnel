package defpackage;

import androidx.camera.core.impl.CameraCaptureMetaData$FlashState;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class y30 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CameraCaptureMetaData$FlashState.values().length];
        a = iArr;
        try {
            iArr[CameraCaptureMetaData$FlashState.READY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[CameraCaptureMetaData$FlashState.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[CameraCaptureMetaData$FlashState.FIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
