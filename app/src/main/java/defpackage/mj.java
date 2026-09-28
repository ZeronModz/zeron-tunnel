package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.b;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class mj extends b {
    @Override // androidx.camera.camera2.internal.compat.b, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CameraCaptureSessionCompatImpl
    public final int captureBurstRequests(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.b).captureBurstRequests(list, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.b, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CameraCaptureSessionCompatImpl
    public final int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.b).captureSingleRequest(captureRequest, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.b, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CameraCaptureSessionCompatImpl
    public final int setRepeatingBurstRequests(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.b).setRepeatingBurstRequests(list, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.b, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CameraCaptureSessionCompatImpl
    public final int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.b).setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}
