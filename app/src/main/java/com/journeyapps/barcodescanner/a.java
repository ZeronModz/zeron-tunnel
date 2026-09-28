package com.journeyapps.barcodescanner;

import android.os.Handler;
import android.os.Message;
import dev.zeron.tunnel.R;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Handler.Callback {
    public final /* synthetic */ BarcodeView a;

    public a(BarcodeView barcodeView) {
        this.a = barcodeView;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        BarcodeCallback barcodeCallback;
        int i = message.what;
        BarcodeView barcodeView = this.a;
        if (i == R.id.zxing_decode_succeeded) {
            BarcodeResult barcodeResult = (BarcodeResult) message.obj;
            if (barcodeResult != null && (barcodeCallback = barcodeView.C) != null) {
                BarcodeView.DecodeMode decodeMode = barcodeView.B;
                BarcodeView.DecodeMode decodeMode2 = BarcodeView.DecodeMode.NONE;
                if (decodeMode != decodeMode2) {
                    ((DecoratedBarcodeView.WrappedCallback) barcodeCallback).barcodeResult(barcodeResult);
                    if (barcodeView.B == BarcodeView.DecodeMode.SINGLE) {
                        barcodeView.B = decodeMode2;
                        barcodeView.C = null;
                        barcodeView.l();
                        return true;
                    }
                }
            }
        } else if (i != R.id.zxing_decode_failed) {
            if (i != R.id.zxing_possible_result_points) {
                return false;
            }
            List list = (List) message.obj;
            BarcodeCallback barcodeCallback2 = barcodeView.C;
            if (barcodeCallback2 != null && barcodeView.B != BarcodeView.DecodeMode.NONE) {
                ((DecoratedBarcodeView.WrappedCallback) barcodeCallback2).possibleResultPoints(list);
            }
        }
        return true;
    }
}
