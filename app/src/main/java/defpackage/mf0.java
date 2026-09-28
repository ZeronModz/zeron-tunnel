package defpackage;

import androidx.camera.core.ForwardingImageProxy$OnImageCloseListener;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mf0 implements ForwardingImageProxy$OnImageCloseListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageProxy b;
    public final /* synthetic */ ImageProxy c;

    public /* synthetic */ mf0(ImageProxy imageProxy, ImageProxy imageProxy2, int i) {
        this.a = i;
        this.b = imageProxy;
        this.c = imageProxy2;
    }

    @Override // androidx.camera.core.ForwardingImageProxy$OnImageCloseListener
    public final void onImageClose(ImageProxy imageProxy) {
        int i = this.a;
        ImageProxy imageProxy2 = this.c;
        switch (i) {
            case 0:
                int i2 = ImageProcessingUtil.a;
                imageProxy2.close();
                break;
            default:
                int i3 = ImageProcessingUtil.a;
                imageProxy2.close();
                break;
        }
    }
}
