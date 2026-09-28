package com.journeyapps.barcodescanner.camera;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.Size;
import defpackage.gy0;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class PreviewScalingStrategy {
    public Size a(ArrayList arrayList, Size size) {
        if (size != null) {
            Collections.sort(arrayList, new gy0(this, size));
        }
        Objects.toString(size);
        Objects.toString(arrayList);
        return (Size) arrayList.get(0);
    }

    public float b(Size size, Size size2) {
        return 0.5f;
    }

    public abstract Rect c(Size size, Size size2);
}
