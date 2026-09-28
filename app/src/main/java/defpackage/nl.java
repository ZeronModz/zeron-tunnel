package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.core.impl.Config;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nl {
    public static final void a(Camera2ImplConfig.Builder builder, Config.OptionPriority optionPriority) {
        optionPriority.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            builder.c(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1, optionPriority);
        }
    }
}
