package defpackage;

import androidx.camera.core.ForwardingImageProxy$OnImageCloseListener;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.imagecapture.TakePictureManager;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class af0 implements ForwardingImageProxy$OnImageCloseListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ af0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.camera.core.ForwardingImageProxy$OnImageCloseListener
    public final void onImageClose(ImageProxy imageProxy) {
        TakePictureManager takePictureManager;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                cf0 cf0Var = (cf0) ((WeakReference) ((bf0) obj).e).get();
                if (cf0Var != null) {
                    cf0Var.t.execute(new j60(cf0Var, 5));
                    return;
                }
                return;
            default:
                SafeCloseImageReaderProxy safeCloseImageReaderProxy = (SafeCloseImageReaderProxy) obj;
                synchronized (safeCloseImageReaderProxy.a) {
                    try {
                        int i2 = safeCloseImageReaderProxy.b - 1;
                        safeCloseImageReaderProxy.b = i2;
                        if (safeCloseImageReaderProxy.c && i2 == 0) {
                            safeCloseImageReaderProxy.close();
                        }
                        takePictureManager = safeCloseImageReaderProxy.f;
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (takePictureManager != null) {
                    takePictureManager.onImageClose(imageProxy);
                    return;
                }
                return;
        }
    }
}
