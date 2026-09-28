package com.journeyapps.barcodescanner;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.InvertedLuminanceSource;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.Reader;
import com.google.zxing.common.HybridBinarizer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class MixedDecoder extends Decoder {
    public boolean c;

    public MixedDecoder(Reader reader) {
        super(reader);
        this.c = true;
    }

    @Override // com.journeyapps.barcodescanner.Decoder
    public final BinaryBitmap a(PlanarYUVLuminanceSource planarYUVLuminanceSource) {
        if (this.c) {
            this.c = false;
            return new BinaryBitmap(new HybridBinarizer(new InvertedLuminanceSource(planarYUVLuminanceSource)));
        }
        this.c = true;
        return new BinaryBitmap(new HybridBinarizer(planarYUVLuminanceSource));
    }
}
