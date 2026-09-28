package defpackage;

import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lj b;
    public final /* synthetic */ CameraCaptureSession c;

    public /* synthetic */ kj(lj ljVar, CameraCaptureSession cameraCaptureSession, int i) {
        this.a = i;
        this.b = ljVar;
        this.c = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CameraCaptureSession cameraCaptureSession = this.c;
        lj ljVar = this.b;
        switch (i) {
            case 0:
                ljVar.a.onActive(cameraCaptureSession);
                break;
            case 1:
                ljVar.a.onClosed(cameraCaptureSession);
                break;
            case 2:
                i5.m(ljVar.a, cameraCaptureSession);
                break;
            case 3:
                ljVar.a.onConfigured(cameraCaptureSession);
                break;
            case 4:
                ljVar.a.onReady(cameraCaptureSession);
                break;
            default:
                ljVar.a.onConfigureFailed(cameraCaptureSession);
                break;
        }
    }
}
