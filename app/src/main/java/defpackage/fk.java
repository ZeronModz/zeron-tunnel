package defpackage;

import android.hardware.Camera;
import android.os.Handler;
import android.view.SurfaceHolder;
import dev.zeron.tunnel.R;
import com.journeyapps.barcodescanner.Size;
import com.journeyapps.barcodescanner.camera.CameraInstance;
import com.journeyapps.barcodescanner.camera.CameraManager;
import com.journeyapps.barcodescanner.camera.CameraSurface;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class fk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraInstance b;

    public /* synthetic */ fk(CameraInstance cameraInstance, int i) {
        this.a = i;
        this.b = cameraInstance;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Camera cameraOpen = null;
        Object size = null;
        CameraInstance cameraInstance = this.b;
        switch (i) {
            case 0:
                try {
                    CameraManager cameraManager = cameraInstance.c;
                    int iJ = k02.j(cameraManager.g.a);
                    if (iJ != -1) {
                        cameraOpen = Camera.open(iJ);
                    }
                    cameraManager.a = cameraOpen;
                    if (cameraOpen == null) {
                        s31.f("Failed to open camera");
                        return;
                    }
                    int iJ2 = k02.j(cameraManager.g.a);
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    cameraManager.b = cameraInfo;
                    Camera.getCameraInfo(iJ2, cameraInfo);
                    return;
                } catch (Exception e) {
                    Handler handler = cameraInstance.d;
                    if (handler != null) {
                        handler.obtainMessage(R.id.zxing_camera_error, e).sendToTarget();
                        return;
                    }
                    return;
                }
            case 1:
                CameraManager cameraManager2 = cameraInstance.c;
                try {
                    cameraManager2.a();
                    Handler handler2 = cameraInstance.d;
                    if (handler2 != null) {
                        Size size2 = cameraManager2.j;
                        if (size2 != null) {
                            int i2 = cameraManager2.k;
                            if (i2 == -1) {
                                throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
                            }
                            size = i2 % 180 != 0 ? new Size(size2.b, size2.a) : size2;
                        }
                        handler2.obtainMessage(R.id.zxing_prewiew_size_ready, size).sendToTarget();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    Handler handler3 = cameraInstance.d;
                    if (handler3 != null) {
                        handler3.obtainMessage(R.id.zxing_camera_error, e2).sendToTarget();
                        return;
                    }
                    return;
                }
            default:
                CameraManager cameraManager3 = cameraInstance.c;
                try {
                    CameraSurface cameraSurface = cameraInstance.b;
                    Camera camera = cameraManager3.a;
                    SurfaceHolder surfaceHolder = cameraSurface.a;
                    if (surfaceHolder != null) {
                        camera.setPreviewDisplay(surfaceHolder);
                    } else {
                        camera.setPreviewTexture(cameraSurface.b);
                    }
                    cameraManager3.d();
                    return;
                } catch (Exception e3) {
                    Handler handler4 = cameraInstance.d;
                    if (handler4 != null) {
                        handler4.obtainMessage(R.id.zxing_camera_error, e3).sendToTarget();
                        return;
                    }
                    return;
                }
        }
    }
}
