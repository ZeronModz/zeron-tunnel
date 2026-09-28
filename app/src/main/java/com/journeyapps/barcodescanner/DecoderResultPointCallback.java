package com.journeyapps.barcodescanner;

import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class DecoderResultPointCallback implements ResultPointCallback {
    public Decoder a;

    public DecoderResultPointCallback(Decoder decoder) {
        this.a = decoder;
    }

    @Override // com.google.zxing.ResultPointCallback
    public final void foundPossibleResultPoint(ResultPoint resultPoint) {
        Decoder decoder = this.a;
        if (decoder != null) {
            decoder.foundPossibleResultPoint(resultPoint);
        }
    }

    public DecoderResultPointCallback() {
    }
}
