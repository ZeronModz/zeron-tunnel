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
public final class an2 extends xw2 {
    public final SensorManager a;
    public final Sensor b;
    public float c = 0.0f;
    public Float d = Float.valueOf(0.0f);
    public long e = zzt.zzk().currentTimeMillis();
    public int f = 0;
    public boolean g = false;
    public boolean h = false;
    public gn2 i = null;
    public boolean j = false;

    public an2(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.a = sensorManager;
        if (sensorManager != null) {
            this.b = sensorManager.getDefaultSensor(4);
        } else {
            this.b = null;
        }
    }

    @Override // defpackage.xw2
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) zzbd.zzc().a(p32.za)).booleanValue()) {
            long jCurrentTimeMillis = zzt.zzk().currentTimeMillis();
            if (this.e + ((long) ((Integer) zzbd.zzc().a(p32.Ba)).intValue()) < jCurrentTimeMillis) {
                this.f = 0;
                this.e = jCurrentTimeMillis;
                this.g = false;
                this.h = false;
                this.c = this.d.floatValue();
            }
            float fFloatValue = this.d.floatValue() + (sensorEvent.values[1] * 4.0f);
            this.d = Float.valueOf(fFloatValue);
            float f = this.c;
            l32 l32Var = p32.Aa;
            float fFloatValue2 = ((Float) zzbd.zzc().a(l32Var)).floatValue() + f;
            Float f2 = this.d;
            if (fFloatValue > fFloatValue2) {
                this.c = f2.floatValue();
                this.h = true;
            } else if (f2.floatValue() < this.c - ((Float) zzbd.zzc().a(l32Var)).floatValue()) {
                this.c = this.d.floatValue();
                this.g = true;
            }
            if (this.d.isInfinite()) {
                this.d = Float.valueOf(0.0f);
                this.c = 0.0f;
            }
            if (this.g && this.h) {
                zze.zza("Flick detected.");
                this.e = jCurrentTimeMillis;
                int i = this.f + 1;
                this.f = i;
                this.g = false;
                this.h = false;
                gn2 gn2Var = this.i;
                if (gn2Var != null) {
                    if (i == ((Integer) zzbd.zzc().a(p32.Ca)).intValue()) {
                        gn2Var.f(new fn2(1), zzebe.GESTURE);
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
                if (((Boolean) zzbd.zzc().a(p32.za)).booleanValue()) {
                    if (!this.j && (sensorManager = this.a) != null && (sensor = this.b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.j = true;
                        zze.zza("Listening for flick gestures.");
                    }
                    if (this.a == null || this.b == null) {
                        zzo.zzi("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.j && (sensorManager = this.a) != null && (sensor = this.b) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.j = false;
                    zze.zza("Stopped listening for flick gestures.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
