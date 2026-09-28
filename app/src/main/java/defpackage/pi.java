package defpackage;

import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.utils.executor.b;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pi implements CameraCapturePipeline {
    public final b a;
    public final ti b;
    public final int c;

    public pi(ti tiVar, b bVar, int i) {
        this.b = tiVar;
        this.a = bVar;
        this.c = i;
    }

    @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
    public final ListenableFuture invokePostCapture() {
        androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
        bVar.c = new n31();
        oh ohVar = new oh(bVar);
        bVar.b = ohVar;
        bVar.a = vh.class;
        try {
            this.b.i.postCapture();
            bVar.b(null);
            bVar.a = "invokePostCaptureFuture";
        } catch (Exception e) {
            ohVar.a(e);
        }
        return ohVar;
    }

    @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
    public final ListenableFuture invokePreCapture() {
        km0.a("Camera2CapturePipeline");
        return xg0.z(xa0.a(this.b.a(this.c)), new nx2(new oi(1), 7), this.a);
    }
}
