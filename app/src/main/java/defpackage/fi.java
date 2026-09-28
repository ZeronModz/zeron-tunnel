package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import androidx.camera.camera2.internal.j0;
import androidx.camera.camera2.internal.o;
import androidx.camera.camera2.internal.z;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SessionConfig$Builder;
import androidx.camera.core.impl.SessionConfig$OutputConfig;
import androidx.camera.core.impl.f;
import androidx.concurrent.futures.b;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fi extends CameraDevice.StateCallback {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public fi(Executor executor, CameraDevice.StateCallback stateCallback) {
        this.c = executor;
        this.b = stateCallback;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((o) obj).f("openCameraConfigAndClose camera closed");
                ((b) this.b).b(null);
                break;
            default:
                ((Executor) obj).execute(new wj(this, cameraDevice, 0));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((o) obj).f("openCameraConfigAndClose camera disconnected");
                ((b) this.b).b(null);
                break;
            default:
                ((Executor) obj).execute(new wj(this, cameraDevice, 1));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        int i2 = this.a;
        Object obj = this.c;
        switch (i2) {
            case 0:
                ((o) obj).f("openCameraConfigAndClose camera error " + i);
                ((b) this.b).b(null);
                break;
            default:
                ((Executor) obj).execute(new xh(this, cameraDevice, i, 3));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                o oVar = (o) obj;
                androidx.camera.core.impl.utils.executor.b bVar = oVar.c;
                oVar.f("openCameraConfigAndClose camera opened");
                int i2 = 0;
                z zVar = new z(oVar.J, false);
                SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(640, 480);
                Surface surface = new Surface(surfaceTexture);
                ImmediateSurface immediateSurface = new ImmediateSurface(surface);
                xg0.p(immediateSurface.e).addListener(new r4(5, surface, surfaceTexture), fy.b());
                SessionConfig$Builder sessionConfig$Builder = new SessionConfig$Builder();
                DynamicRange dynamicRange = DynamicRange.d;
                f fVarA = SessionConfig$OutputConfig.a(immediateSurface);
                if (dynamicRange == null) {
                    io0.e("Null dynamicRange");
                } else {
                    fVarA.e = dynamicRange;
                    sessionConfig$Builder.a.add(fVarA.a());
                    sessionConfig$Builder.b.c = 1;
                    oVar.f("Start configAndClose.");
                    v61 v61VarD = sessionConfig$Builder.d();
                    j0 j0Var = oVar.C;
                    Quirks quirks = j0Var.e;
                    Quirks quirks2 = j0Var.f;
                    am amVarZ = xg0.z(xa0.a(yg0.x(new bb0(0, zVar.open(v61VarD, cameraDevice, new dd1(j0Var.b, j0Var.c, j0Var.d, quirks, quirks2, j0Var.a))))), new di(i2, zVar, immediateSurface), bVar);
                    Objects.requireNonNull(cameraDevice);
                    amVarZ.addListener(new w2(cameraDevice, 5), bVar);
                }
                break;
            default:
                ((Executor) obj).execute(new wj(this, cameraDevice, 2));
                break;
        }
    }

    public fi(o oVar, b bVar) {
        this.c = oVar;
        this.b = bVar;
    }
}
