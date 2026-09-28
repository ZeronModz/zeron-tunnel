package com.journeyapps.barcodescanner.camera;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.Size;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class FitCenterStrategy extends PreviewScalingStrategy {
    @Override // com.journeyapps.barcodescanner.camera.PreviewScalingStrategy
    public final float b(Size size, Size size2) {
        if (size.a <= 0 || size.b <= 0) {
            return 0.0f;
        }
        int i = size.e(size2).a;
        float fPow = (i * 1.0f) / size.a;
        if (fPow > 1.0f) {
            fPow = (float) Math.pow(1.0f / fPow, 1.1d);
        }
        float f = ((size2.b * 1.0f) / r7.b) * ((size2.a * 1.0f) / i);
        return (((1.0f / f) / f) / f) * fPow;
    }

    @Override // com.journeyapps.barcodescanner.camera.PreviewScalingStrategy
    public final Rect c(Size size, Size size2) {
        Size sizeE = size.e(size2);
        size.toString();
        sizeE.toString();
        size2.toString();
        int i = sizeE.a;
        int i2 = (i - size2.a) / 2;
        int i3 = sizeE.b;
        int i4 = (i3 - size2.b) / 2;
        return new Rect(-i2, -i4, i - i2, i3 - i4);
    }
}
