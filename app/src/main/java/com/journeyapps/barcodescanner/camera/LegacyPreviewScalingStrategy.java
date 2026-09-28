package com.journeyapps.barcodescanner.camera;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.Size;
import defpackage.wj0;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class LegacyPreviewScalingStrategy extends PreviewScalingStrategy {
    public static Size d(Size size, Size size2) {
        Size sizeC;
        if (size2.b(size)) {
            while (true) {
                sizeC = size.c(2, 3);
                Size sizeC2 = size.c(1, 2);
                if (!size2.b(sizeC2)) {
                    break;
                }
                size = sizeC2;
            }
            return size2.b(sizeC) ? sizeC : size;
        }
        do {
            Size sizeC3 = size.c(3, 2);
            size = size.c(2, 1);
            if (size2.b(sizeC3)) {
                return sizeC3;
            }
        } while (!size2.b(size));
        return size;
    }

    @Override // com.journeyapps.barcodescanner.camera.PreviewScalingStrategy
    public final Size a(ArrayList arrayList, Size size) {
        if (size == null) {
            return (Size) arrayList.get(0);
        }
        Collections.sort(arrayList, new wj0(size, 0));
        size.toString();
        Objects.toString(arrayList);
        return (Size) arrayList.get(0);
    }

    @Override // com.journeyapps.barcodescanner.camera.PreviewScalingStrategy
    public final Rect c(Size size, Size size2) {
        Size sizeD = d(size, size2);
        size.toString();
        sizeD.toString();
        size2.toString();
        int i = sizeD.a;
        int i2 = (i - size2.a) / 2;
        int i3 = sizeD.b;
        int i4 = (i3 - size2.b) / 2;
        return new Rect(-i2, -i4, i - i2, i3 - i4);
    }
}
