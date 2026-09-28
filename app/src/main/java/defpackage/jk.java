package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class jk extends y6 {
    public static boolean A(RuntimeException runtimeException) {
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT == 28) {
            if ((!runtimeException.getClass().equals(RuntimeException.class) || (stackTrace = runtimeException.getStackTrace()) == null || stackTrace.length < 0) ? false : "_enableShutterSound".equals(stackTrace[0].getMethodName())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.y6, androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public CameraCharacteristics getCameraCharacteristics(String str) throws CameraAccessExceptionCompat {
        try {
            return super.getCameraCharacteristics(str);
        } catch (RuntimeException e) {
            if (A(e)) {
                throw new CameraAccessExceptionCompat(CameraAccessExceptionCompat.CAMERA_UNAVAILABLE_DO_NOT_DISTURB, e);
            }
            throw e;
        }
    }

    @Override // defpackage.y6, androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            try {
                ((CameraManager) this.b).openCamera(str, executor, stateCallback);
            } catch (SecurityException e) {
                throw e;
            }
        } catch (CameraAccessException e2) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e2);
        } catch (IllegalArgumentException | SecurityException e3) {
        } catch (RuntimeException e4) {
            if (!A(e4)) {
                throw e4;
            }
            throw new CameraAccessExceptionCompat(CameraAccessExceptionCompat.CAMERA_UNAVAILABLE_DO_NOT_DISTURB, e4);
        }
    }

    @Override // defpackage.y6, androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public final void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManager) this.b).registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // defpackage.y6, androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public final void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManager) this.b).unregisterAvailabilityCallback(availabilityCallback);
    }
}
