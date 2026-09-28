package defpackage;

import androidx.camera.video.internal.encoder.EncoderCallback;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EncoderCallback b;

    public /* synthetic */ j20(EncoderCallback encoderCallback, int i) {
        this.a = i;
        this.b = encoderCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        EncoderCallback encoderCallback = this.b;
        switch (i) {
            case 0:
                encoderCallback.onEncodeStop();
                break;
            case 1:
                encoderCallback.onEncodeStart();
                break;
            default:
                encoderCallback.onEncodePaused();
                break;
        }
    }
}
