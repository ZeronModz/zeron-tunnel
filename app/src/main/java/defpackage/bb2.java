package defpackage;

import android.content.Context;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzcgc;
import com.google.android.gms.internal.ads.zzfyn;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bb2 extends xw2 {
    public final SensorManager a;
    public final Display c;
    public float[] f;
    public zzfyn g;
    public zzcgc h;
    public final float[] d = new float[9];
    public final float[] e = new float[9];
    public final Object b = new Object();

    public bb2(Context context) {
        this.a = (SensorManager) context.getSystemService("sensor");
        this.c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // defpackage.xw2
    public final void a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.b) {
            try {
                if (this.f == null) {
                    this.f = new float[9];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        float[] fArr2 = this.d;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.c.getRotation();
        if (rotation != 1) {
            float[] fArr3 = this.e;
            if (rotation == 2) {
                SensorManager.remapCoordinateSystem(fArr2, 129, 130, fArr3);
            } else if (rotation != 3) {
                System.arraycopy(fArr2, 0, fArr3, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(fArr2, 130, 1, fArr3);
            }
        } else {
            SensorManager.remapCoordinateSystem(fArr2, 2, 129, this.e);
        }
        float[] fArr4 = this.e;
        float f = fArr4[1];
        fArr4[1] = fArr4[3];
        fArr4[3] = f;
        float f2 = fArr4[2];
        fArr4[2] = fArr4[6];
        fArr4[6] = f2;
        float f3 = fArr4[5];
        fArr4[5] = fArr4[7];
        fArr4[7] = f3;
        synchronized (this.b) {
            System.arraycopy(fArr4, 0, this.f, 0, 9);
        }
        zzcgc zzcgcVar = this.h;
        if (zzcgcVar != null) {
            zzcgcVar.zza();
        }
    }

    public final void b() {
        if (this.g == null) {
            return;
        }
        this.a.unregisterListener(this);
        this.g.post(new g10(6));
        this.g = null;
    }

    public final boolean c(float[] fArr) {
        synchronized (this.b) {
            try {
                float[] fArr2 = this.f;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
