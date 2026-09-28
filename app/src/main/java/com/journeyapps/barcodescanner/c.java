package com.journeyapps.barcodescanner;

import com.journeyapps.barcodescanner.CameraPreview;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements CameraPreview.StateListener {
    public final /* synthetic */ CameraPreview a;

    public c(CameraPreview cameraPreview) {
        this.a = cameraPreview;
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
    public final void cameraClosed() {
        Iterator it = this.a.j.iterator();
        while (it.hasNext()) {
            ((CameraPreview.StateListener) it.next()).cameraClosed();
        }
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
    public final void cameraError(Exception exc) {
        Iterator it = this.a.j.iterator();
        while (it.hasNext()) {
            ((CameraPreview.StateListener) it.next()).cameraError(exc);
        }
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
    public final void previewSized() {
        Iterator it = this.a.j.iterator();
        while (it.hasNext()) {
            ((CameraPreview.StateListener) it.next()).previewSized();
        }
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
    public final void previewStarted() {
        Iterator it = this.a.j.iterator();
        while (it.hasNext()) {
            ((CameraPreview.StateListener) it.next()).previewStarted();
        }
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview.StateListener
    public final void previewStopped() {
        Iterator it = this.a.j.iterator();
        while (it.hasNext()) {
            ((CameraPreview.StateListener) it.next()).previewStopped();
        }
    }
}
