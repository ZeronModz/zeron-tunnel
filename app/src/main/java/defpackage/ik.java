package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ik {
    public final y6 a;
    public final ArrayMap b = new ArrayMap(4);

    public ik(y6 y6Var) {
        this.a = y6Var;
    }

    public static ik a(Handler handler, Context context) {
        int i = Build.VERSION.SDK_INT;
        return new ik(i >= 30 ? new lk(context, null) : i >= 29 ? new kk(context, null) : i >= 28 ? new jk(context, null) : new y6(context, new mk(handler)));
    }

    public final rj b(String str) {
        rj rjVar;
        synchronized (this.b) {
            rjVar = (rj) this.b.get(str);
            if (rjVar == null) {
                try {
                    rj rjVar2 = new rj(this.a.getCameraCharacteristics(str), str);
                    this.b.put(str, rjVar2);
                    rjVar = rjVar2;
                } catch (AssertionError e) {
                    throw new CameraAccessExceptionCompat(CameraAccessExceptionCompat.CAMERA_CHARACTERISTICS_CREATION_ERROR, e.getMessage(), e);
                }
            }
        }
        return rjVar;
    }
}
