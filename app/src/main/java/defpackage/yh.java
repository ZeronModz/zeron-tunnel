package defpackage;

import android.util.ArrayMap;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.concurrent.futures.b;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class yh extends CameraCaptureCallback {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public yh() {
        this.a = 0;
        this.b = new HashSet();
        this.c = new ArrayMap();
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public void a(int i) {
        switch (this.a) {
            case 0:
                for (CameraCaptureCallback cameraCaptureCallback : (HashSet) this.b) {
                    try {
                        ((Executor) ((ArrayMap) this.c).get(cameraCaptureCallback)).execute(new wf(cameraCaptureCallback, i, 1));
                    } catch (RejectedExecutionException unused) {
                        km0.c("Camera2CameraControlImp");
                    }
                }
                break;
        }
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public final void b(int i, CameraCaptureResult cameraCaptureResult) {
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                for (CameraCaptureCallback cameraCaptureCallback : (HashSet) obj2) {
                    try {
                        ((Executor) ((ArrayMap) obj).get(cameraCaptureCallback)).execute(new xh(cameraCaptureCallback, i, cameraCaptureResult, 1));
                    } catch (RejectedExecutionException unused) {
                        km0.c("Camera2CameraControlImp");
                    }
                }
                break;
            default:
                ((b) obj2).b(null);
                ((CameraInfoInternal) ((CameraInfo) obj)).removeSessionCaptureCallback(this);
                break;
        }
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public void c(int i, CameraCaptureFailure cameraCaptureFailure) {
        switch (this.a) {
            case 0:
                for (CameraCaptureCallback cameraCaptureCallback : (HashSet) this.b) {
                    try {
                        ((Executor) ((ArrayMap) this.c).get(cameraCaptureCallback)).execute(new xh(cameraCaptureCallback, i, cameraCaptureFailure, 0));
                    } catch (RejectedExecutionException unused) {
                        km0.c("Camera2CameraControlImp");
                    }
                }
                break;
        }
    }

    public yh(b bVar, CameraInfo cameraInfo) {
        this.a = 1;
        this.b = bVar;
        this.c = cameraInfo;
    }
}
