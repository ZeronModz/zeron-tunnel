package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.provider.Settings;
import androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener;
import androidx.camera.camera2.internal.d0;
import androidx.camera.core.CameraControl;
import androidx.concurrent.futures.b;

 
 
public final   class i4 implements Runnable {
    public final   int a;
    public final   boolean b;
    public final   Object c;
    public final   Object d;

    public   i4(yf1 yf1Var, b bVar, boolean z) {
        this.a = 2;
        this.c = yf1Var;
        this.d = bVar;
        this.b = z;
    }

     
     
     
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.c;
                boolean z = this.b;
                ContentResolver contentResolver = (ContentResolver) this.d;
                if (ii2.m(context) != z && Settings.Global.putInt(contentResolver, "airplane_mode_on", z ? 1 : 0)) {
                    ii2.t(context, z);
                    break;
                }
                break;
            case 1:
                final d0 d0Var = (d0) this.c;
                boolean z2 = this.b;
                final b bVar = (b) this.d;
                d0Var.a.i(d0Var.w);
                d0Var.v = z2;
                if (d0Var.d) {
                    final long jK = d0Var.a.k();
                    Camera2CameraControlImpl$CaptureResultListener r3 = new Camera2CameraControlImpl$CaptureResultListener() { // from class: z70
                        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener
                        public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                            boolean z3 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
                            km0.a("FocusMeteringControl");
                            if (z3 != d0Var.v || !androidx.camera.camera2.internal.b.h(totalCaptureResult, jK)) {
                                return false;
                            }
                            km0.a("FocusMeteringControl");
                            b bVar2 = bVar;
                            if (bVar2 != null) {
                                bVar2.b(null);
                            }
                            return true;
                        }
                    };
                    d0Var.w = r3;
                    d0Var.a.a(r3);
                } else if (bVar != null) {
                    bVar.d(new CameraControl.OperationCanceledException("Camera is not active."));
                }
                break;
            default:
                ((yf1) this.c).a((b) this.d, this.b);
                break;
        }
    }

    public   i4(Object obj, int i, Object obj2, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }
}
