package defpackage;

import android.hardware.camera2.CameraManager;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class hk extends CameraManager.AvailabilityCallback {
    public final Executor a;
    public final CameraManager.AvailabilityCallback b;
    public final Object c = new Object();
    public boolean d = false;

    public hk(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.a = executor;
        this.b = availabilityCallback;
    }

    public final void a() {
        synchronized (this.c) {
            this.d = true;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        synchronized (this.c) {
            try {
                if (!this.d) {
                    this.a.execute(new w2(this, 9));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        synchronized (this.c) {
            try {
                if (!this.d) {
                    this.a.execute(new gk(this, str, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        synchronized (this.c) {
            try {
                if (!this.d) {
                    this.a.execute(new gk(this, str, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
