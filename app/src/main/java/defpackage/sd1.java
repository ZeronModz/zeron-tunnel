package defpackage;

import androidx.camera.core.imagecapture.TakePictureManager;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sd1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TakePictureManager b;

    public /* synthetic */ sd1(TakePictureManager takePictureManager, int i) {
        this.a = i;
        this.b = takePictureManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        TakePictureManager takePictureManager = this.b;
        switch (i) {
            case 0:
                takePictureManager.d = null;
                takePictureManager.b();
                break;
            default:
                takePictureManager.b();
                break;
        }
    }
}
