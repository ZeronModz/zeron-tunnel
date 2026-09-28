package defpackage;

import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class cf0 extends ye0 {
    public final Executor t;
    public final Object u = new Object();
    public ImageProxy v;
    public bf0 w;

    public cf0(Executor executor) {
        this.t = executor;
    }

    @Override // defpackage.ye0
    public final ImageProxy a(ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.acquireLatestImage();
    }

    @Override // defpackage.ye0
    public final void c() {
        synchronized (this.u) {
            try {
                ImageProxy imageProxy = this.v;
                if (imageProxy != null) {
                    imageProxy.close();
                    this.v = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ye0
    public final void e(ImageProxy imageProxy) {
        synchronized (this.u) {
            try {
                if (!this.s) {
                    imageProxy.close();
                    return;
                }
                if (this.w == null) {
                    bf0 bf0Var = new bf0(imageProxy, this);
                    this.w = bf0Var;
                    xg0.a(b(bf0Var), new rb0(bf0Var, 9), fy.b());
                } else {
                    if (imageProxy.getImageInfo().getTimestamp() <= this.w.b.getImageInfo().getTimestamp()) {
                        imageProxy.close();
                    } else {
                        ImageProxy imageProxy2 = this.v;
                        if (imageProxy2 != null) {
                            imageProxy2.close();
                        }
                        this.v = imageProxy;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
