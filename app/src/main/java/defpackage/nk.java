package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.journeyapps.barcodescanner.CameraPreview;
import com.journeyapps.barcodescanner.Size;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class nk implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ CameraPreview a;

    public nk(CameraPreview cameraPreview) {
        this.a = cameraPreview;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Size size = new Size(i, i2);
        CameraPreview cameraPreview = this.a;
        cameraPreview.p = size;
        cameraPreview.h();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
