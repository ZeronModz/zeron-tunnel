package defpackage;

import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.SessionProcessor;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zy0 implements SessionProcessor.CaptureCallback {
    public final List a;
    public final int b;
    public CameraCaptureResult c = null;

    public zy0(int i, List list) {
        this.b = i;
        this.a = list;
    }

    @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
    public final void onCaptureCompleted(long j, int i, CameraCaptureResult cameraCaptureResult) {
        this.c = cameraCaptureResult;
    }

    @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
    public final void onCaptureFailed(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureCallback) it.next()).c(this.b, new CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR));
        }
    }

    @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
    public final void onCaptureProcessProgressed(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureCallback) it.next()).d(this.b, i);
        }
    }

    @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
    public final void onCaptureSequenceCompleted(int i) {
        CameraCaptureResult emptyCameraCaptureResult = this.c;
        if (emptyCameraCaptureResult == null) {
            emptyCameraCaptureResult = new CameraCaptureResult.EmptyCameraCaptureResult();
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureCallback) it.next()).b(this.b, emptyCameraCaptureResult);
        }
    }

    @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
    public final void onCaptureStarted(int i, long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureCallback) it.next()).e(this.b);
        }
    }

    @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
    public final void onCaptureProcessStarted(int i) {
    }

    @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
    public final void onCaptureSequenceAborted(int i) {
    }
}
