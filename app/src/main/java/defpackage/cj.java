package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.internal.Camera2CameraCaptureFailure;
import androidx.camera.camera2.internal.Camera2CameraCaptureResult;
import androidx.camera.camera2.internal.Camera2RequestProcessor;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.RequestProcessor;
import androidx.camera.core.impl.SessionProcessorSurface;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class cj extends CameraCaptureSession.CaptureCallback {
    public final RequestProcessor.Callback a;
    public final RequestProcessor.Request b;
    public final boolean c;
    public final /* synthetic */ Camera2RequestProcessor d;

    public cj(Camera2RequestProcessor camera2RequestProcessor, RequestProcessor.Request request, RequestProcessor.Callback callback, boolean z) {
        this.d = camera2RequestProcessor;
        this.a = callback;
        this.b = request;
        this.c = z;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        int i;
        RequestProcessor.Callback callback = this.a;
        RequestProcessor.Request request = this.b;
        Camera2RequestProcessor camera2RequestProcessor = this.d;
        synchronized (camera2RequestProcessor.a) {
            try {
                List list = camera2RequestProcessor.c;
                i = -1;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        SessionProcessorSurface sessionProcessorSurface = (SessionProcessorSurface) it.next();
                        try {
                            if (sessionProcessorSurface.c().get() == surface) {
                                i = sessionProcessorSurface.p;
                                break;
                            }
                            continue;
                        } catch (InterruptedException | ExecutionException unused) {
                        }
                    }
                }
            } finally {
            }
        }
        callback.onCaptureBufferLost(request, j, i);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        this.a.onCaptureCompleted(this.b, new Camera2CameraCaptureResult(totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        this.a.onCaptureFailed(this.b, new Camera2CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR, captureFailure));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        this.a.onCaptureProgressed(this.b, new Camera2CameraCaptureResult(captureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        if (this.c) {
            this.a.onCaptureSequenceAborted(i);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        if (this.c) {
            this.a.onCaptureSequenceCompleted(i, j);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        this.a.onCaptureStarted(this.b, j2, j);
    }
}
