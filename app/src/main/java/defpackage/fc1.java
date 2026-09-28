package defpackage;

import android.util.Size;
import androidx.camera.core.impl.SurfaceConfig$ConfigSize;
import androidx.camera.core.impl.SurfaceConfig$ConfigType;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fc1 {
    public static uc a(SurfaceConfig$ConfigType surfaceConfig$ConfigType, SurfaceConfig$ConfigSize surfaceConfig$ConfigSize) {
        return new uc(surfaceConfig$ConfigType, surfaceConfig$ConfigSize, 0L);
    }

    public static SurfaceConfig$ConfigType b(int i) {
        return i == 35 ? SurfaceConfig$ConfigType.YUV : i == 256 ? SurfaceConfig$ConfigType.JPEG : i == 4101 ? SurfaceConfig$ConfigType.JPEG_R : i == 32 ? SurfaceConfig$ConfigType.RAW : SurfaceConfig$ConfigType.PRIV;
    }

    public static uc c(int i, int i2, Size size, yc ycVar) {
        SurfaceConfig$ConfigType surfaceConfig$ConfigTypeB = b(i2);
        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize = SurfaceConfig$ConfigSize.NOT_SUPPORT;
        int iA = p81.a(size);
        if (i != 1) {
            Size size2 = ycVar.a;
            if (iA <= size2.getHeight() * size2.getWidth()) {
                surfaceConfig$ConfigSize = SurfaceConfig$ConfigSize.VGA;
            } else if (iA <= p81.a(ycVar.c)) {
                surfaceConfig$ConfigSize = SurfaceConfig$ConfigSize.PREVIEW;
            } else if (iA <= p81.a(ycVar.e)) {
                surfaceConfig$ConfigSize = SurfaceConfig$ConfigSize.RECORD;
            } else if (iA <= p81.a((Size) ycVar.f.get(Integer.valueOf(i2)))) {
                surfaceConfig$ConfigSize = SurfaceConfig$ConfigSize.MAXIMUM;
            } else {
                Size size3 = (Size) ycVar.g.get(Integer.valueOf(i2));
                if (size3 != null) {
                    if (iA <= size3.getHeight() * size3.getWidth()) {
                        surfaceConfig$ConfigSize = SurfaceConfig$ConfigSize.ULTRA_MAXIMUM;
                    }
                }
            }
        } else if (iA <= p81.a((Size) ycVar.b.get(Integer.valueOf(i2)))) {
            surfaceConfig$ConfigSize = SurfaceConfig$ConfigSize.s720p;
        } else if (iA <= p81.a((Size) ycVar.d.get(Integer.valueOf(i2)))) {
            surfaceConfig$ConfigSize = SurfaceConfig$ConfigSize.s1440p;
        }
        return a(surfaceConfig$ConfigTypeB, surfaceConfig$ConfigSize);
    }
}
