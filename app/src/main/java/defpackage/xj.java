package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.b;
import androidx.camera.camera2.internal.compat.params.InputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class xj extends b {
    @Override // androidx.camera.camera2.internal.compat.b, androidx.camera.camera2.internal.compat.CameraDeviceCompat$CameraDeviceCompatImpl
    public void createCaptureSession(SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessExceptionCompat {
        CameraDevice cameraDevice = (CameraDevice) this.b;
        b.a(cameraDevice, sessionConfigurationCompat);
        lj ljVar = new lj(sessionConfigurationCompat.a(), sessionConfigurationCompat.e());
        List listC = sessionConfigurationCompat.c();
        zj zjVar = (zj) this.a;
        zjVar.getClass();
        Handler handler = zjVar.a;
        InputConfigurationCompat inputConfigurationCompatB = sessionConfigurationCompat.b();
        try {
            if (inputConfigurationCompatB != null) {
                InputConfiguration inputConfiguration = inputConfigurationCompatB.a.a;
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, SessionConfigurationCompat.h(listC), ljVar, handler);
            } else if (sessionConfigurationCompat.d() == 1) {
                cameraDevice.createConstrainedHighSpeedCaptureSession(b.b(listC), ljVar, handler);
            } else {
                cameraDevice.createCaptureSessionByOutputConfigurations(SessionConfigurationCompat.h(listC), ljVar, handler);
            }
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }
}
