package defpackage;

import androidx.camera.core.imagecapture.CameraCapturePipeline;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class uj implements CameraCapturePipeline {
    @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
    public final ListenableFuture invokePostCapture() {
        return rf0.c;
    }

    @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
    public final ListenableFuture invokePreCapture() {
        return rf0.c;
    }
}
