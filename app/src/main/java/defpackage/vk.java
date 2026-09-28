package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.CameraSelector$Builder;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vk {
    public static final qk a;

    static {
        CameraSelector$Builder cameraSelector$Builder = new CameraSelector$Builder();
        cameraSelector$Builder.a(2);
        a = new qk(cameraSelector$Builder.a);
    }

    public static void a(Context context, CameraRepository cameraRepository, qk qkVar) throws CameraValidator$CameraIdListIncorrectException {
        Integer numB;
        int i = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT >= 34 && w1.g(context) != 0) {
            LinkedHashSet linkedHashSetA = cameraRepository.a();
            if (linkedHashSetA.isEmpty()) {
                throw new CameraValidator$CameraIdListIncorrectException("No cameras available", 0, null);
            }
            w1.g(context);
            linkedHashSetA.size();
            km0.a("CameraValidator");
            return;
        }
        if (qkVar != null) {
            try {
                numB = qkVar.b();
                if (numB == null) {
                    km0.g("CameraValidator");
                    return;
                }
            } catch (IllegalStateException unused) {
                km0.c("CameraValidator");
                return;
            }
        } else {
            numB = null;
        }
        String str = Build.DEVICE;
        km0.a("CameraValidator");
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (qkVar == null || numB.intValue() == 1)) {
                qk.c.c(cameraRepository.a());
                i = 1;
            }
        } catch (IllegalArgumentException e) {
            illegalArgumentException = e;
            km0.h("CameraValidator");
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (qkVar == null || numB.intValue() == 0)) {
                qk.b.c(cameraRepository.a());
                i++;
            }
        } catch (IllegalArgumentException e2) {
            illegalArgumentException = e2;
            km0.h("CameraValidator");
        }
        try {
            a.c(cameraRepository.a());
            km0.a("CameraValidator");
            i++;
        } catch (IllegalArgumentException unused2) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        cameraRepository.a().toString();
        km0.b("CameraValidator");
        throw new CameraValidator$CameraIdListIncorrectException("Expected camera missing from device.", i, illegalArgumentException);
    }
}
