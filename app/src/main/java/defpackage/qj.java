package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qj extends jx2 {
    @Override // defpackage.jx2, androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat$CameraCharacteristicsCompatImpl
    public final Set getPhysicalCameraIds() {
        try {
            return ((CameraCharacteristics) this.b).getPhysicalCameraIds();
        } catch (Exception unused) {
            km0.c("CameraCharacteristicsImpl");
            return Collections.EMPTY_SET;
        }
    }
}
