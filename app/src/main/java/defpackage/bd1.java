package defpackage;

import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.a0;
import androidx.camera.camera2.internal.l0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bd1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;
    public final /* synthetic */ SynchronizedCaptureSession c;

    public /* synthetic */ bd1(l0 l0Var, SynchronizedCaptureSession synchronizedCaptureSession, int i) {
        this.a = i;
        this.b = l0Var;
        this.c = synchronizedCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                SynchronizedCaptureSession synchronizedCaptureSession = this.c;
                a0 a0Var = l0Var.b;
                synchronized (a0Var.b) {
                    a0Var.c.remove(l0Var);
                    a0Var.d.remove(l0Var);
                    break;
                }
                l0Var.g(synchronizedCaptureSession);
                if (l0Var.g != null) {
                    Objects.requireNonNull(l0Var.f);
                    l0Var.f.c(synchronizedCaptureSession);
                    return;
                } else {
                    l0Var.toString();
                    km0.g("SyncCaptureSessionBase");
                    return;
                }
            default:
                l0 l0Var2 = this.b;
                SynchronizedCaptureSession synchronizedCaptureSession2 = this.c;
                Objects.requireNonNull(l0Var2.f);
                l0Var2.f.g(synchronizedCaptureSession2);
                return;
        }
    }
}
