package defpackage;

import android.os.SystemClock;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.SessionConfig$Builder;
import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nm1 extends CameraCaptureCallback {
    public boolean a = true;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ b c;
    public final /* synthetic */ SessionConfig$Builder d;

    public nm1(AtomicBoolean atomicBoolean, b bVar, SessionConfig$Builder sessionConfig$Builder) {
        this.b = atomicBoolean;
        this.c = bVar;
        this.d = sessionConfig$Builder;
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public final void b(int i, CameraCaptureResult cameraCaptureResult) {
        Object obj;
        if (this.a) {
            this.a = false;
            cameraCaptureResult.getTimestamp();
            SystemClock.uptimeMillis();
            SystemClock.elapsedRealtime();
            km0.a("VideoCapture");
        }
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.get() || (obj = cameraCaptureResult.getTagBundle().a.get("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        b bVar = this.c;
        if (iIntValue == bVar.hashCode() && bVar.b(null) && !atomicBoolean.getAndSet(true)) {
            ((jc0) dn0.r()).execute(new ez0(24, this, this.d));
        }
    }
}
