package defpackage;

import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ze0 extends ye0 {
    @Override // defpackage.ye0
    public final ImageProxy a(ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.acquireNextImage();
    }

    @Override // defpackage.ye0
    public final void e(ImageProxy imageProxy) {
        xg0.a(b(imageProxy), new nx2(imageProxy, 8), fy.b());
    }

    @Override // defpackage.ye0
    public final void c() {
    }
}
