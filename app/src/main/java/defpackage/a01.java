package defpackage;

import android.view.ScaleGestureDetector;
import androidx.camera.core.ZoomState;
import androidx.camera.core.internal.CameraUseCaseAdapter;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class a01 extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ ak0 a;

    public a01(ak0 ak0Var) {
        this.a = ak0Var;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        scaleGestureDetector.getClass();
        CameraUseCaseAdapter cameraUseCaseAdapter = this.a.c;
        ZoomState zoomState = (ZoomState) cameraUseCaseAdapter.r.getZoomState().d();
        cameraUseCaseAdapter.q.setZoomRatio((zoomState != null ? zoomState.getZoomRatio() : 1.0f) * scaleGestureDetector.getScaleFactor());
        return true;
    }
}
