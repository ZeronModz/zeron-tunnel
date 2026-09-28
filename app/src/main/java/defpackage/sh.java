package defpackage;

import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.core.CameraControl;
import androidx.concurrent.futures.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Camera2CameraControl b;
    public final /* synthetic */ b c;

    public /* synthetic */ sh(Camera2CameraControl camera2CameraControl, b bVar, int i) {
        this.a = i;
        this.b = camera2CameraControl;
        this.c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b bVar = this.c;
        Camera2CameraControl camera2CameraControl = this.b;
        switch (i) {
            case 0:
                camera2CameraControl.b = true;
                CameraControl.OperationCanceledException operationCanceledException = new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options.");
                b bVar2 = camera2CameraControl.g;
                if (bVar2 != null) {
                    bVar2.d(operationCanceledException);
                    camera2CameraControl.g = null;
                }
                camera2CameraControl.g = bVar;
                if (camera2CameraControl.a) {
                    androidx.camera.camera2.internal.b bVar3 = camera2CameraControl.c;
                    bVar3.getClass();
                    b bVar4 = new b();
                    bVar4.c = new n31();
                    oh ohVar = new oh(bVar4);
                    bVar4.b = ohVar;
                    bVar4.a = vh.class;
                    try {
                        bVar3.b.execute(new r4(3, bVar3, bVar4));
                        bVar4.a = "updateSessionConfigAsync";
                    } catch (Exception e) {
                        ohVar.a(e);
                    }
                    xg0.p(ohVar).addListener(new w2(camera2CameraControl, 4), camera2CameraControl.d);
                    camera2CameraControl.b = false;
                }
                break;
            default:
                camera2CameraControl.b = true;
                CameraControl.OperationCanceledException operationCanceledException2 = new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options.");
                b bVar5 = camera2CameraControl.g;
                if (bVar5 != null) {
                    bVar5.d(operationCanceledException2);
                    camera2CameraControl.g = null;
                }
                camera2CameraControl.g = bVar;
                if (camera2CameraControl.a) {
                    androidx.camera.camera2.internal.b bVar6 = camera2CameraControl.c;
                    bVar6.getClass();
                    b bVar7 = new b();
                    bVar7.c = new n31();
                    oh ohVar2 = new oh(bVar7);
                    bVar7.b = ohVar2;
                    bVar7.a = vh.class;
                    try {
                        bVar6.b.execute(new r4(3, bVar6, bVar7));
                        bVar7.a = "updateSessionConfigAsync";
                    } catch (Exception e2) {
                        ohVar2.a(e2);
                    }
                    xg0.p(ohVar2).addListener(new w2(camera2CameraControl, 4), camera2CameraControl.d);
                    camera2CameraControl.b = false;
                }
                break;
        }
    }
}
