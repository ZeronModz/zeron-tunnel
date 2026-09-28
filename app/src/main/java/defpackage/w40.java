package defpackage;

import androidx.camera.camera2.internal.b;
import androidx.camera.core.CameraControl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class w40 {
    public final b a;
    public final x40 b;
    public final androidx.camera.core.impl.utils.executor.b c;
    public boolean d = false;
    public androidx.concurrent.futures.b e;
    public v40 f;

    public w40(b bVar, rj rjVar, androidx.camera.core.impl.utils.executor.b bVar2) {
        this.a = bVar;
        this.b = new x40(rjVar);
        this.c = bVar2;
    }

    public final void a() {
        androidx.concurrent.futures.b bVar = this.e;
        if (bVar != null) {
            bVar.d(new CameraControl.OperationCanceledException("Cancelled by another setExposureCompensationIndex()"));
            this.e = null;
        }
        v40 v40Var = this.f;
        if (v40Var != null) {
            this.a.i(v40Var);
            this.f = null;
        }
    }
}
