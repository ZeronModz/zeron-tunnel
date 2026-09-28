package com.journeyapps.barcodescanner;

import dev.zeron.tunnel.R;
import com.journeyapps.barcodescanner.CameraPreview;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements CameraPreview.StateListener {
    public final /* synthetic */ CaptureManager a;

    public d(CaptureManager captureManager) {
        this.a = captureManager;
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
    public final void cameraClosed() {
        CaptureManager captureManager = this.a;
        if (captureManager.k) {
            captureManager.a.finish();
        }
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
    public final void cameraError(Exception exc) {
        CaptureManager captureManager = this.a;
        captureManager.b(captureManager.a.getString(R.string.zxing_msg_camera_framework_bug));
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
    public final void previewSized() {
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
    public final void previewStarted() {
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
    public final void previewStopped() {
    }
}
