package defpackage;

import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.concurrent.futures.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class e80 extends CameraCaptureCallback {
    public final /* synthetic */ b a;

    public e80(b bVar) {
        this.a = bVar;
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public final void a(int i) {
        b bVar = this.a;
        if (bVar != null) {
            bVar.d(new CameraControl.OperationCanceledException("Camera is closed"));
        }
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public final void b(int i, CameraCaptureResult cameraCaptureResult) {
        b bVar = this.a;
        if (bVar != null) {
            km0.a("FocusMeteringControl");
            bVar.b(null);
        }
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public final void c(int i, CameraCaptureFailure cameraCaptureFailure) {
        b bVar = this.a;
        if (bVar != null) {
            bVar.d(new CameraControlInternal.CameraControlException(cameraCaptureFailure));
        }
    }
}
