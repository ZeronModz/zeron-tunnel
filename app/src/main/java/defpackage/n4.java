package defpackage;

import android.os.Handler;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.core.CameraControl;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.concurrent.futures.b;
import com.google.zxing.client.android.AmbientLightManager;
import com.google.zxing.client.android.InactivityTimer;
import com.journeyapps.barcodescanner.camera.CameraInstance;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n4(int i, Object obj, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((AmbientLightManager) obj).a.c(z);
                break;
            case 1:
                ((AudioStream.AudioStreamCallback) obj).onSilenceStateChanged(z);
                break;
            case 2:
                Camera2CameraControl camera2CameraControl = (Camera2CameraControl) obj;
                if (camera2CameraControl.a != z) {
                    camera2CameraControl.a = z;
                    if (!z) {
                        CameraControl.OperationCanceledException operationCanceledException = new CameraControl.OperationCanceledException("The camera control has became inactive.");
                        b bVar = camera2CameraControl.g;
                        if (bVar != null) {
                            bVar.d(operationCanceledException);
                            camera2CameraControl.g = null;
                        }
                    } else if (camera2CameraControl.b) {
                        androidx.camera.camera2.internal.b bVar2 = camera2CameraControl.c;
                        bVar2.getClass();
                        b bVar3 = new b();
                        bVar3.c = new n31();
                        oh ohVar = new oh(bVar3);
                        bVar3.b = ohVar;
                        bVar3.a = vh.class;
                        try {
                            bVar2.b.execute(new r4(3, bVar2, bVar3));
                            bVar3.a = "updateSessionConfigAsync";
                        } catch (Exception e) {
                            ohVar.a(e);
                        }
                        xg0.p(ohVar).addListener(new w2(camera2CameraControl, 4), camera2CameraControl.d);
                        camera2CameraControl.b = false;
                    }
                    break;
                }
                break;
            case 3:
                ((CameraInstance) obj).c.c(z);
                break;
            default:
                InactivityTimer inactivityTimer = (InactivityTimer) ((r6) obj).b;
                inactivityTimer.f = z;
                if (inactivityTimer.c) {
                    Handler handler = inactivityTimer.d;
                    handler.removeCallbacksAndMessages(null);
                    if (inactivityTimer.f) {
                        handler.postDelayed(inactivityTimer.e, 300000L);
                    }
                }
                break;
        }
    }
}
