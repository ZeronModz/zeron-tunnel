package com.journeyapps.barcodescanner.camera;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.Size;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class FitXYStrategy extends PreviewScalingStrategy {
    @Override // com.journeyapps.barcodescanner.camera.PreviewScalingStrategy
    public final float b(Size size, Size size2) {
        int i = size.a;
        int i2 = size.b;
        if (i <= 0 || i2 <= 0) {
            return 0.0f;
        }
        int i3 = size2.a;
        int i4 = size2.b;
        float f = (i * 1.0f) / i3;
        if (f < 1.0f) {
            f = 1.0f / f;
        }
        float f2 = i2;
        float f3 = i4;
        float f4 = (f2 * 1.0f) / f3;
        if (f4 < 1.0f) {
            f4 = 1.0f / f4;
        }
        float f5 = (1.0f / f) / f4;
        float f6 = ((i * 1.0f) / f2) / ((i3 * 1.0f) / f3);
        if (f6 < 1.0f) {
            f6 = 1.0f / f6;
        }
        return (((1.0f / f6) / f6) / f6) * f5;
    }

    @Override // com.journeyapps.barcodescanner.camera.PreviewScalingStrategy
    public final Rect c(Size size, Size size2) {
        return new Rect(0, 0, size2.a, size2.b);
    }
}
