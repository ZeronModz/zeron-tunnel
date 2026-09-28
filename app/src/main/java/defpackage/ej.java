package defpackage;

import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ej extends CameraCaptureCallback {
    public final ArrayList a = new ArrayList();

    public ej(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) it.next();
            if (!(cameraCaptureCallback instanceof fj)) {
                this.a.add(cameraCaptureCallback);
            }
        }
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public final void a(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureCallback) it.next()).a(i);
        }
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public final void b(int i, CameraCaptureResult cameraCaptureResult) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureCallback) it.next()).b(i, cameraCaptureResult);
        }
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public final void c(int i, CameraCaptureFailure cameraCaptureFailure) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureCallback) it.next()).c(i, cameraCaptureFailure);
        }
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public final void d(int i, int i2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureCallback) it.next()).d(i, i2);
        }
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public final void e(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureCallback) it.next()).e(i);
        }
    }
}
