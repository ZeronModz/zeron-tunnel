package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.internal.e;
import androidx.concurrent.futures.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zh extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public zh(int i) {
        this.a = i;
        switch (i) {
            case 3:
                b bVar = new b();
                bVar.c = new n31();
                oh ohVar = new oh(bVar);
                bVar.b = ohVar;
                bVar.a = vh.class;
                try {
                    this.c = bVar;
                    bVar.a = "RequestCompleteListener[" + this + "]";
                } catch (Exception e) {
                    ohVar.a(e);
                }
                this.b = ohVar;
                break;
            default:
                this.c = null;
                this.b = new HashMap();
                break;
        }
    }

    public void a(CaptureRequest captureRequest, List list) {
        HashMap map = (HashMap) this.b;
        List list2 = (List) map.get(captureRequest);
        if (list2 == null) {
            map.put(captureRequest, list);
            return;
        }
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        map.put(captureRequest, arrayList);
    }

    public void b() {
        b bVar = (b) this.c;
        if (bVar != null) {
            bVar.b(null);
            this.c = null;
        }
    }

    public List c(CaptureRequest captureRequest) {
        List list = (List) ((HashMap) this.b).get(captureRequest);
        return list != null ? list : Collections.EMPTY_LIST;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j) {
        switch (this.a) {
            case 1:
                Iterator it = c(captureRequest).iterator();
                while (it.hasNext()) {
                    qf3.E((CameraCaptureSession.CaptureCallback) it.next(), cameraCaptureSession, captureRequest, surface, j);
                }
                break;
            case 2:
                ((Executor) this.c).execute(new Runnable() { // from class: jj
                    @Override // java.lang.Runnable
                    public final void run() {
                        qf3.E((CameraCaptureSession.CaptureCallback) this.a.b, cameraCaptureSession, captureRequest, surface, j);
                    }
                });
                break;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.a) {
            case 0:
                ((androidx.camera.core.impl.utils.executor.b) this.c).execute(new r4(4, this, totalCaptureResult));
                break;
            case 1:
                Iterator it = c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                break;
            case 2:
                ((Executor) this.c).execute(new hj(this, cameraCaptureSession, captureRequest, totalCaptureResult, 0));
                break;
            default:
                b();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.a) {
            case 1:
                Iterator it = c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                break;
            case 2:
                ((Executor) this.c).execute(new hj(this, cameraCaptureSession, captureRequest, captureFailure, 2));
                break;
            case 3:
                b();
                break;
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.a) {
            case 1:
                Iterator it = c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                break;
            case 2:
                ((Executor) this.c).execute(new hj(this, cameraCaptureSession, captureRequest, captureResult, 1));
                break;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        switch (this.a) {
            case 1:
                Iterator it = ((HashMap) this.b).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceAborted(cameraCaptureSession, i);
                    }
                }
                e eVar = (e) this.c;
                if (eVar != null) {
                    eVar.onCaptureSequenceCompletedOrAborted(cameraCaptureSession, i, true);
                }
                break;
            case 2:
                ((Executor) this.c).execute(new xh(this, cameraCaptureSession, i, 2));
                break;
            case 3:
                b();
                break;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i, final long j) {
        switch (this.a) {
            case 1:
                Iterator it = ((HashMap) this.b).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                    }
                }
                e eVar = (e) this.c;
                if (eVar != null) {
                    eVar.onCaptureSequenceCompletedOrAborted(cameraCaptureSession, i, false);
                }
                break;
            case 2:
                ((Executor) this.c).execute(new Runnable() { // from class: ij
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) this.a.b).onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                    }
                });
                break;
            case 3:
                b();
                break;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j, final long j2) {
        switch (this.a) {
            case 1:
                Iterator it = c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                }
                break;
            case 2:
                ((Executor) this.c).execute(new Runnable() { // from class: gj
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) this.a.b).onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                    }
                });
                break;
            case 3:
                b();
                break;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                break;
        }
    }

    public zh(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        this.a = 2;
        this.c = executor;
        this.b = captureCallback;
    }

    public zh(androidx.camera.core.impl.utils.executor.b bVar) {
        this.a = 0;
        this.b = new HashSet();
        this.c = bVar;
    }
}
