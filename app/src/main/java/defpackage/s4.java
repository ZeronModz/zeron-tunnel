package defpackage;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.b;
import androidx.camera.core.impl.ImageReaderProxy;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class s4 implements ImageReaderProxy {
    public final ImageReader a;
    public final Object b = new Object();
    public boolean c = true;

    public s4(ImageReader imageReader) {
        this.a = imageReader;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final ImageProxy acquireLatestImage() {
        Image imageAcquireLatestImage;
        synchronized (this.b) {
            try {
                imageAcquireLatestImage = this.a.acquireLatestImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new b(imageAcquireLatestImage);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final ImageProxy acquireNextImage() {
        Image imageAcquireNextImage;
        synchronized (this.b) {
            try {
                imageAcquireNextImage = this.a.acquireNextImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new b(imageAcquireNextImage);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void clearOnImageAvailableListener() {
        synchronized (this.b) {
            this.c = true;
            this.a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void close() {
        synchronized (this.b) {
            this.a.close();
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getHeight() {
        int height;
        synchronized (this.b) {
            height = this.a.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getImageFormat() {
        int imageFormat;
        synchronized (this.b) {
            imageFormat = this.a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getMaxImages() {
        int maxImages;
        synchronized (this.b) {
            maxImages = this.a.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.b) {
            surface = this.a.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getWidth() {
        int width;
        synchronized (this.b) {
            width = this.a.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void setOnImageAvailableListener(final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, final Executor executor) {
        synchronized (this.b) {
            this.c = false;
            this.a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: q4
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    s4 s4Var = this.a;
                    Executor executor2 = executor;
                    ImageReaderProxy.OnImageAvailableListener onImageAvailableListener2 = onImageAvailableListener;
                    synchronized (s4Var.b) {
                        try {
                            if (!s4Var.c) {
                                executor2.execute(new r4(0, s4Var, onImageAvailableListener2));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, cn0.D());
        }
    }
}
