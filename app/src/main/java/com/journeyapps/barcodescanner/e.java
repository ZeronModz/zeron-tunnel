package com.journeyapps.barcodescanner;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.CameraPreview;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements CameraPreview.StateListener {
    public final /* synthetic */ ViewfinderView a;

    public e(ViewfinderView viewfinderView) {
        this.a = viewfinderView;
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
    public final void previewSized() {
        ViewfinderView viewfinderView = this.a;
        CameraPreview cameraPreview = viewfinderView.i;
        if (cameraPreview != null) {
            Rect framingRect = cameraPreview.getFramingRect();
            Size previewSize = viewfinderView.i.getPreviewSize();
            if (framingRect != null && previewSize != null) {
                viewfinderView.j = framingRect;
                viewfinderView.k = previewSize;
            }
        }
        viewfinderView.invalidate();
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
    public final void cameraClosed() {
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
    public final void previewStarted() {
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
    public final void previewStopped() {
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
    public final void cameraError(Exception exc) {
    }
}
