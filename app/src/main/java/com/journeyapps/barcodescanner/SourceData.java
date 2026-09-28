package com.journeyapps.barcodescanner;

import android.graphics.Rect;
import defpackage.vh;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class SourceData {
    public final RawImageData a;
    public final int b;
    public final int c;
    public Rect d;
    public boolean e;

    public SourceData(byte[] bArr, int i, int i2, int i3, int i4) {
        this.a = new RawImageData(bArr, i, i2);
        this.c = i4;
        this.b = i3;
        if (i * i2 <= bArr.length) {
            return;
        }
        StringBuilder sbU = vh.u(i, "Image data does not match the resolution. ", i2, "x", " > ");
        sbU.append(bArr.length);
        throw new IllegalArgumentException(sbU.toString());
    }
}
