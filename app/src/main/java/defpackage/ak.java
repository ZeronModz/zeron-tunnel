package defpackage;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ak extends CameraDevice.StateCallback {
    public final /* synthetic */ int a;
    public final Object b;

    public ak(ArrayList arrayList) {
        this.a = 0;
        this.b = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof bk)) {
                ((ArrayList) this.b).add(stateCallback);
            }
        }
    }

    public void a() {
        ArrayList arrayListD;
        synchronized (((a0) this.b).b) {
            arrayListD = ((a0) this.b).d();
            ((a0) this.b).e.clear();
            ((a0) this.b).c.clear();
            ((a0) this.b).d.clear();
        }
        Iterator it = arrayListD.iterator();
        while (it.hasNext()) {
            ((SynchronizedCaptureSession) it.next()).finishClose();
        }
    }

    public void b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (((a0) this.b).b) {
            linkedHashSet.addAll(((a0) this.b).e);
            linkedHashSet.addAll(((a0) this.b).c);
        }
        ((a0) this.b).a.execute(new w2(linkedHashSet, 15));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
                }
                break;
            default:
                b();
                a();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
                }
                break;
            default:
                b();
                a();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
                }
                return;
            default:
                b();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                synchronized (((a0) this.b).b) {
                    linkedHashSet.addAll(((a0) this.b).e);
                    linkedHashSet.addAll(((a0) this.b).c);
                    break;
                }
                ((a0) this.b).a.execute(new wf(linkedHashSet, i, 3));
                a();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
                }
                break;
        }
    }

    private final void c(CameraDevice cameraDevice) {
    }

    public ak(a0 a0Var) {
        this.a = 1;
        this.b = a0Var;
    }
}
