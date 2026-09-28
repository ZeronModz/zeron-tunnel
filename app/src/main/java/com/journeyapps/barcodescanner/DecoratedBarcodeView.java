package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import dev.zeron.tunnel.R;
import com.google.zxing.ResultPoint;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import defpackage.a11;
import defpackage.u7;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class DecoratedBarcodeView extends FrameLayout {
    public BarcodeView a;
    public ViewfinderView b;
    public TextView c;
    public TorchListener d;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface TorchListener {
        void onTorchOff();

        void onTorchOn();
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public class WrappedCallback implements BarcodeCallback {
        public final BarcodeCallback a;

        public WrappedCallback(BarcodeCallback barcodeCallback) {
            this.a = barcodeCallback;
        }

        @Override // com.journeyapps.barcodescanner.BarcodeCallback
        public final void barcodeResult(BarcodeResult barcodeResult) {
            this.a.barcodeResult(barcodeResult);
        }

        @Override // com.journeyapps.barcodescanner.BarcodeCallback
        public final void possibleResultPoints(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ResultPoint resultPoint = (ResultPoint) it.next();
                ViewfinderView viewfinderView = DecoratedBarcodeView.this.b;
                if (viewfinderView.g.size() < 20) {
                    viewfinderView.g.add(resultPoint);
                }
            }
            this.a.possibleResultPoints(list);
        }
    }

    public DecoratedBarcodeView(Context context) {
        super(context);
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a11.c);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.layout.zxing_barcode_scanner);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(R.id.zxing_barcode_surface);
        this.a = barcodeView;
        if (barcodeView == null) {
            u7.r("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
            return;
        }
        barcodeView.b(attributeSet);
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(R.id.zxing_viewfinder_view);
        this.b = viewfinderView;
        if (viewfinderView == null) {
            u7.r("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        } else {
            viewfinderView.setCameraPreview(this.a);
            this.c = (TextView) findViewById(R.id.zxing_status_view);
        }
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(R.id.zxing_barcode_surface);
    }

    public CameraSettings getCameraSettings() {
        return this.a.getCameraSettings();
    }

    public DecoderFactory getDecoderFactory() {
        return this.a.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.c;
    }

    public ViewfinderView getViewFinder() {
        return this.b;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24) {
            this.a.setTorch(true);
            TorchListener torchListener = this.d;
            if (torchListener != null) {
                torchListener.onTorchOn();
            }
        } else if (i == 25) {
            this.a.setTorch(false);
            TorchListener torchListener2 = this.d;
            if (torchListener2 != null) {
                torchListener2.onTorchOff();
                return true;
            }
        } else if (i != 27 && i != 80) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public void setCameraSettings(CameraSettings cameraSettings) {
        this.a.setCameraSettings(cameraSettings);
    }

    public void setDecoderFactory(DecoderFactory decoderFactory) {
        this.a.setDecoderFactory(decoderFactory);
    }

    public void setStatusText(String str) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(TorchListener torchListener) {
        this.d = torchListener;
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
    }
}
