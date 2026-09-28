package defpackage;

import android.util.ArrayMap;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.SettableImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import androidx.camera.core.streamsharing.VirtualCameraCaptureResult;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class mt0 implements ImageReaderProxy {
    public final ImageReaderProxy a;
    public gz0 b;

    public mt0(ImageReaderProxy imageReaderProxy) {
        this.a = imageReaderProxy;
    }

    public final SettableImageProxy a(ImageProxy imageProxy) {
        rd1 rd1Var;
        if (imageProxy == null) {
            return null;
        }
        if (this.b == null) {
            rd1Var = rd1.b;
        } else {
            gz0 gz0Var = this.b;
            Pair pair = new Pair(gz0Var.g, gz0Var.h.get(0));
            rd1 rd1Var2 = rd1.b;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            rd1Var = new rd1(arrayMap);
        }
        this.b = null;
        return new SettableImageProxy(imageProxy, new Size(imageProxy.getWidth(), imageProxy.getHeight()), new CameraCaptureResultImageInfo(new VirtualCameraCaptureResult(rd1Var, imageProxy.getImageInfo().getTimestamp())));
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final ImageProxy acquireLatestImage() {
        return a(this.a.acquireLatestImage());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final ImageProxy acquireNextImage() {
        return a(this.a.acquireNextImage());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void clearOnImageAvailableListener() {
        this.a.clearOnImageAvailableListener();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void close() {
        this.a.close();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getImageFormat() {
        return this.a.getImageFormat();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getMaxImages() {
        return this.a.getMaxImages();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final Surface getSurface() {
        return this.a.getSurface();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final int getWidth() {
        return this.a.getWidth();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public final void setOnImageAvailableListener(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, Executor executor) {
        this.a.setOnImageAvailableListener(new di(8, this, onImageAvailableListener), executor);
    }
}
