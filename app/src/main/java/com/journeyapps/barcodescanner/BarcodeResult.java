package com.journeyapps.barcodescanner;

import com.google.zxing.Result;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class BarcodeResult {
    public final Result a;
    public final SourceData b;

    public BarcodeResult(Result result, SourceData sourceData) {
        this.a = result;
        this.b = sourceData;
    }

    public final String toString() {
        return this.a.a;
    }
}
