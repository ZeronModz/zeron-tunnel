package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class rj {
    public final jx2 b;
    public final String c;
    public final HashMap a = new HashMap();
    public t61 d = null;

    public rj(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.b = new qj(cameraCharacteristics, 3);
        } else {
            this.b = new jx2(cameraCharacteristics, 3);
        }
        this.c = str;
    }

    public final Object a(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return ((CameraCharacteristics) this.b.b).get(key);
        }
        synchronized (this) {
            try {
                Object obj = this.a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object obj2 = ((CameraCharacteristics) this.b.b).get(key);
                if (obj2 != null) {
                    this.a.put(key, obj2);
                }
                return obj2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final t61 b() {
        t61 t61Var = this.d;
        if (t61Var == null) {
            t61Var = null;
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    u7.r("StreamConfigurationMap is null!");
                    return null;
                }
                t61 t61Var2 = new t61(streamConfigurationMap, new OutputSizesCorrector(this.c));
                this.d = t61Var2;
                return t61Var2;
            } catch (AssertionError | NullPointerException e) {
                u7.r(e.getMessage());
            }
        }
        return t61Var;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 34) {
            int[] iArr = (int[]) ((CameraCharacteristics) this.b.b).get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
