package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener;
import androidx.camera.camera2.internal.b;
import androidx.camera.core.CameraControl;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class yf1 {
    public final b a;
    public final MutableLiveData b = new MutableLiveData(0);
    public final boolean c;
    public final androidx.camera.core.impl.utils.executor.b d;
    public boolean e;
    public androidx.concurrent.futures.b f;
    public boolean g;

    public yf1(b bVar, rj rjVar, androidx.camera.core.impl.utils.executor.b bVar2) {
        this.a = bVar;
        this.d = bVar2;
        this.c = xg0.n(new ji(rjVar, 1));
        bVar.a(new Camera2CameraControlImpl$CaptureResultListener() { // from class: xf1
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                yf1 yf1Var = this.a;
                if (yf1Var.f != null) {
                    Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                    if ((num != null && num.intValue() == 2) == yf1Var.g) {
                        yf1Var.f.b(null);
                        yf1Var.f = null;
                    }
                }
                return false;
            }
        });
    }

    public static void b(MutableLiveData mutableLiveData, Integer num) {
        if (w91.v()) {
            mutableLiveData.k(num);
        } else {
            mutableLiveData.i(num);
        }
    }

    public final void a(androidx.concurrent.futures.b bVar, boolean z) {
        if (!this.c) {
            if (bVar != null) {
                bVar.d(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        boolean z2 = this.e;
        MutableLiveData mutableLiveData = this.b;
        if (!z2) {
            b(mutableLiveData, 0);
            if (bVar != null) {
                bVar.d(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        this.g = z;
        this.a.c(z);
        b(mutableLiveData, Integer.valueOf(z ? 1 : 0));
        androidx.concurrent.futures.b bVar2 = this.f;
        if (bVar2 != null) {
            bVar2.d(new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
        }
        this.f = bVar;
    }
}
