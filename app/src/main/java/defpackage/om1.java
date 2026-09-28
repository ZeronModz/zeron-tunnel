package defpackage;

import androidx.camera.core.CameraInfo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.h;
import androidx.camera.video.VideoCapabilities;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.e;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class om1 implements VideoOutput {
    @Override // androidx.camera.video.VideoOutput
    public final VideoCapabilities getMediaCapabilities(CameraInfo cameraInfo) {
        return VideoCapabilities.EMPTY;
    }

    @Override // androidx.camera.video.VideoOutput
    public final Observable getMediaSpec() {
        return h.b;
    }

    @Override // androidx.camera.video.VideoOutput
    public final Observable getStreamInfo() {
        return e.c;
    }

    @Override // androidx.camera.video.VideoOutput
    public final Observable isSourceStreamRequired() {
        return new h(Boolean.FALSE);
    }

    @Override // androidx.camera.video.VideoOutput
    public final void onSurfaceRequested(SurfaceRequest surfaceRequest) {
        surfaceRequest.d();
    }

    @Override // androidx.camera.video.VideoOutput
    public final void onSurfaceRequested(SurfaceRequest surfaceRequest, Timebase timebase) {
        surfaceRequest.d();
    }

    @Override // androidx.camera.video.VideoOutput
    public final void onSourceStateChanged(VideoOutput.SourceState sourceState) {
    }
}
