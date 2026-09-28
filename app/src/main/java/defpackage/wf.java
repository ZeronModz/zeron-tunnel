package defpackage;

import android.view.View;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.video.internal.audio.BufferedAudioStream;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.f;
import androidx.camera.view.j;
import androidx.core.content.res.ResourcesCompat$FontCallback;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wf(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                BufferedAudioStream bufferedAudioStream = (BufferedAudioStream) obj;
                if (bufferedAudioStream.l != i2) {
                    int i3 = bufferedAudioStream.h;
                    bufferedAudioStream.l = (i2 / i3) * i3;
                    km0.a("BufferedAudioStream");
                    break;
                }
                break;
            case 1:
                ((CameraCaptureCallback) obj).a(i2);
                break;
            case 2:
                gz0 gz0Var = ((ml) ((kl) obj).b).a;
                if (gz0Var != null && gz0Var.j != i2) {
                    gz0Var.j = i2;
                    gz0Var.f.onCaptureProcessProgressed(i2);
                    break;
                }
                break;
            case 3:
                Iterator it = ((LinkedHashSet) obj).iterator();
                while (it.hasNext()) {
                    ((SynchronizedCaptureSession) it.next()).onCameraDeviceError(i2);
                }
                break;
            case 4:
                f fVar = (f) obj;
                boolean z = fVar.j;
                EncoderImpl encoderImpl = fVar.k;
                if (z) {
                    km0.g(encoderImpl.a);
                    break;
                } else {
                    switch (encoderImpl.t.ordinal()) {
                        case 0:
                        case 7:
                        case 8:
                            break;
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            encoderImpl.k.offer(Integer.valueOf(i2));
                            encoderImpl.c();
                            break;
                        default:
                            s31.e(encoderImpl.t, "Unknown state: ");
                            break;
                    }
                }
                break;
            case 5:
                ((ResourcesCompat$FontCallback) obj).b(i2);
                break;
            case 6:
                j jVar = (j) obj;
                if (jVar.c.get()) {
                    jVar.a.onRotationChanged(i2);
                }
                break;
            case 7:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.p.get();
                if (view != null) {
                    sideSheetBehavior.u(view, i2, false);
                }
                break;
            default:
                TakePictureRequest takePictureRequest = (TakePictureRequest) obj;
                if (takePictureRequest.f() != null) {
                    takePictureRequest.f().onCaptureProcessProgressed(i2);
                } else if (takePictureRequest.d() != null) {
                    takePictureRequest.d().a(i2);
                }
                break;
        }
    }
}
