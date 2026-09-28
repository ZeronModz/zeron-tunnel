package defpackage;

import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.Observable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pm1 implements Observable.Observer {
    public CameraControlInternal a;
    public boolean b;

    public final void a() {
        jx0.g("SourceStreamRequirementObserver can be closed from main thread only", w91.v());
        km0.a("VideoCapture");
        CameraControlInternal cameraControlInternal = this.a;
        if (cameraControlInternal == null) {
            km0.a("VideoCapture");
            return;
        }
        if (this.b) {
            this.b = false;
            if (cameraControlInternal != null) {
                cameraControlInternal.decrementVideoUsage();
            } else {
                km0.a("VideoCapture");
            }
        }
        this.a = null;
    }

    @Override // androidx.camera.core.impl.Observable.Observer
    public final void onError(Throwable th) {
        km0.h("VideoCapture");
    }

    @Override // androidx.camera.core.impl.Observable.Observer
    public final void onNewData(Object obj) {
        jx0.g("SourceStreamRequirementObserver can be updated from main thread only", w91.v());
        boolean zEquals = Boolean.TRUE.equals((Boolean) obj);
        if (this.b == zEquals) {
            return;
        }
        this.b = zEquals;
        CameraControlInternal cameraControlInternal = this.a;
        if (cameraControlInternal == null) {
            km0.a("VideoCapture");
        } else if (zEquals) {
            cameraControlInternal.incrementVideoUsage();
        } else {
            cameraControlInternal.decrementVideoUsage();
        }
    }
}
