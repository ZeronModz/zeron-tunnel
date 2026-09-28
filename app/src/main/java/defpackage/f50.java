package defpackage;

import androidx.camera.core.impl.SurfaceConfig$ConfigType;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f50 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SurfaceConfig$ConfigType.values().length];
        a = iArr;
        try {
            iArr[SurfaceConfig$ConfigType.PRIV.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[SurfaceConfig$ConfigType.YUV.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[SurfaceConfig$ConfigType.JPEG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
