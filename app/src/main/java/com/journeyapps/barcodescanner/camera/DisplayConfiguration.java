package com.journeyapps.barcodescanner.camera;

import com.journeyapps.barcodescanner.Size;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class DisplayConfiguration {
    public final Size a;
    public final int b;
    public PreviewScalingStrategy c = new FitCenterStrategy();

    public DisplayConfiguration(int i, Size size) {
        this.b = i;
        this.a = size;
    }

    public DisplayConfiguration(int i) {
        this.b = i;
    }
}
