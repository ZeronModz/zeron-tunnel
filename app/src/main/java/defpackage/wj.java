package defpackage;

import android.hardware.camera2.CameraDevice;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi b;
    public final /* synthetic */ CameraDevice c;

    public /* synthetic */ wj(fi fiVar, CameraDevice cameraDevice, int i) {
        this.a = i;
        this.b = fiVar;
        this.c = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CameraDevice cameraDevice = this.c;
        fi fiVar = this.b;
        switch (i) {
            case 0:
                ((CameraDevice.StateCallback) fiVar.b).onClosed(cameraDevice);
                break;
            case 1:
                ((CameraDevice.StateCallback) fiVar.b).onDisconnected(cameraDevice);
                break;
            default:
                ((CameraDevice.StateCallback) fiVar.b).onOpened(cameraDevice);
                break;
        }
    }
}
