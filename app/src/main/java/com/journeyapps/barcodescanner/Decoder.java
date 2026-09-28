package com.journeyapps.barcodescanner;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.Reader;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.HybridBinarizer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class Decoder implements ResultPointCallback {
    public final Reader a;
    public final ArrayList b = new ArrayList();

    public Decoder(Reader reader) {
        this.a = reader;
    }

    public BinaryBitmap a(PlanarYUVLuminanceSource planarYUVLuminanceSource) {
        return new BinaryBitmap(new HybridBinarizer(planarYUVLuminanceSource));
    }

    @Override // com.google.zxing.ResultPointCallback
    public final void foundPossibleResultPoint(ResultPoint resultPoint) {
        this.b.add(resultPoint);
    }
}
