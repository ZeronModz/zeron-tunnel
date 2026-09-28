package defpackage;

import android.view.SurfaceHolder;
import com.journeyapps.barcodescanner.CameraPreview;
import com.journeyapps.barcodescanner.Size;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ok implements SurfaceHolder.Callback {
    public final /* synthetic */ CameraPreview a;

    public ok(CameraPreview cameraPreview) {
        this.a = cameraPreview;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder == null) {
            int i4 = CameraPreview.A;
            return;
        }
        Size size = new Size(i2, i3);
        CameraPreview cameraPreview = this.a;
        cameraPreview.p = size;
        cameraPreview.h();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.a.p = null;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}
