package defpackage;

import androidx.camera.core.ImageCapture$ScreenFlashListener;
import androidx.camera.core.internal.ScreenFlashWrapper;
import androidx.concurrent.futures.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vi implements ImageCapture$ScreenFlashListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vi(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.camera.core.ImageCapture$ScreenFlashListener
    public final void onCompleted() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                km0.a("Camera2CapturePipeline");
                ((b) obj).b(null);
                return;
            default:
                ScreenFlashWrapper screenFlashWrapper = (ScreenFlashWrapper) obj;
                ScreenFlashWrapper.Companion companion = ScreenFlashWrapper.e;
                synchronized (screenFlashWrapper.b) {
                    try {
                        if (screenFlashWrapper.d == null) {
                            km0.g("ScreenFlashWrapper");
                        }
                        screenFlashWrapper.b();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
