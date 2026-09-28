package defpackage;

import android.view.Surface;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.e;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.processing.SurfaceEdge;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ic1 implements AsyncFunction {
    public final /* synthetic */ SurfaceEdge a;
    public final /* synthetic */ kc1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ e d;
    public final /* synthetic */ SurfaceOutput.CameraInputInfo e;

    public /* synthetic */ ic1(SurfaceEdge surfaceEdge, kc1 kc1Var, int i, e eVar, SurfaceOutput.CameraInputInfo cameraInputInfo) {
        this.a = surfaceEdge;
        this.b = kc1Var;
        this.c = i;
        this.d = eVar;
        this.e = cameraInputInfo;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public final ListenableFuture apply(Object obj) {
        kc1 kc1Var = this.b;
        Surface surface = (Surface) obj;
        SurfaceEdge surfaceEdge = this.a;
        surfaceEdge.getClass();
        surface.getClass();
        try {
            kc1Var.d();
            mc1 mc1Var = new mc1(surface, surfaceEdge.f, this.c, surfaceEdge.g.d(), this.d, this.e, surfaceEdge.b);
            mc1Var.l.b.addListener(new hc1(kc1Var, 1), fy.b());
            jx0.g("Consumer can only be linked once.", kc1Var.r == null);
            kc1Var.r = mc1Var;
            return xg0.m(mc1Var);
        } catch (DeferrableSurface.SurfaceClosedException e) {
            return new rf0(e, 1);
        }
    }
}
