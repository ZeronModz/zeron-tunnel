package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzebe;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class tn2 extends xw2 {
    public final Context a;
    public SensorManager b;
    public Sensor c;
    public long d;
    public int e;
    public gn2 f;
    public boolean g;

    public tn2(Context context) {
        this.a = context;
    }

    @Override // defpackage.xw2
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) zzbd.zzc().a(p32.ua)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            float f4 = f3 * f3;
            if (((float) Math.sqrt(f4 + (f2 * f2) + (f * f))) >= ((Float) zzbd.zzc().a(p32.va)).floatValue()) {
                long jCurrentTimeMillis = zzt.zzk().currentTimeMillis();
                if (this.d + ((long) ((Integer) zzbd.zzc().a(p32.wa)).intValue()) <= jCurrentTimeMillis) {
                    if (this.d + ((long) ((Integer) zzbd.zzc().a(p32.xa)).intValue()) < jCurrentTimeMillis) {
                        this.e = 0;
                    }
                    zze.zza("Shake detected.");
                    this.d = jCurrentTimeMillis;
                    int i = this.e + 1;
                    this.e = i;
                    gn2 gn2Var = this.f;
                    if (gn2Var != null) {
                        if (i == ((Integer) zzbd.zzc().a(p32.ya)).intValue()) {
                            gn2Var.f(new fn2(0), zzebe.GESTURE);
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) zzbd.zzc().a(p32.ua)).booleanValue()) {
                    if (this.b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.a.getSystemService("sensor");
                        this.b = sensorManager2;
                        if (sensorManager2 == null) {
                            zzo.zzi("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.g && (sensorManager = this.b) != null && (sensor = this.c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.d = zzt.zzk().currentTimeMillis() - ((long) ((Integer) zzbd.zzc().a(p32.wa)).intValue());
                        this.g = true;
                        zze.zza("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this) {
            try {
                if (this.g) {
                    SensorManager sensorManager = this.b;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.c);
                        zze.zza("Stopped listening for shake gestures.");
                    }
                    this.g = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
