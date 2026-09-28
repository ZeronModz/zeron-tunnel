package defpackage;

import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.concurrent.futures.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class si extends CameraCaptureCallback {
    public final /* synthetic */ b a;

    public si(b bVar) {
        this.a = bVar;
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public final void a(int i) {
        this.a.d(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public final void b(int i, CameraCaptureResult cameraCaptureResult) {
        this.a.b(null);
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public final void c(int i, CameraCaptureFailure cameraCaptureFailure) {
        this.a.d(new ImageCaptureException(2, "Capture request failed with reason " + cameraCaptureFailure.a, null));
    }
}
