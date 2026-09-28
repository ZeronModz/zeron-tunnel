package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.Preview$Builder;
import androidx.camera.core.Preview$Defaults;
import androidx.camera.core.Preview$SurfaceProvider;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureConfig$Builder;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.PreviewConfig;
import androidx.camera.core.impl.SessionConfig$Builder;
import androidx.camera.core.impl.SessionConfig$CloseableErrorListener;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.l;
import androidx.camera.core.k;
import androidx.camera.core.processing.SurfaceEdge;
import java.util.DesugarCollections;
import java.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ey0 extends k {
    public static final Preview$Defaults v = new Preview$Defaults();
    public static final ScheduledExecutorService w = dn0.r();
    public Preview$SurfaceProvider o;
    public Executor p;
    public SessionConfig$Builder q;
    public pc1 r;
    public SurfaceEdge s;
    public SurfaceRequest t;
    public SessionConfig$CloseableErrorListener u;

    @Override // androidx.camera.core.k
    public final void A(Rect rect) {
        this.i = rect;
        CameraInternal cameraInternalB = b();
        SurfaceEdge surfaceEdge = this.s;
        if (cameraInternalB == null || surfaceEdge == null) {
            return;
        }
        w91.A(new jc1(surfaceEdge, g(cameraInternalB, k(cameraInternalB)), ((ImageOutputConfig) this.f).getAppTargetRotation(-1)));
    }

    public final void D() {
        SessionConfig$CloseableErrorListener sessionConfig$CloseableErrorListener = this.u;
        if (sessionConfig$CloseableErrorListener != null) {
            sessionConfig$CloseableErrorListener.a();
            this.u = null;
        }
        pc1 pc1Var = this.r;
        if (pc1Var != null) {
            pc1Var.a();
            this.r = null;
        }
        SurfaceEdge surfaceEdge = this.s;
        if (surfaceEdge != null) {
            surfaceEdge.c();
            this.s = null;
        }
        this.t = null;
    }

    public final void E(Preview$SurfaceProvider preview$SurfaceProvider) {
        w91.i();
        if (preview$SurfaceProvider == null) {
            this.o = null;
            n();
            return;
        }
        this.o = preview$SurfaceProvider;
        this.p = w;
        StreamSpec streamSpec = this.g;
        if ((streamSpec != null ? streamSpec.d() : null) != null) {
            F((PreviewConfig) this.f, this.g);
            o();
        }
        m();
    }

    public final void F(PreviewConfig previewConfig, StreamSpec streamSpec) {
        Rect rect;
        w91.i();
        CameraInternal cameraInternalB = b();
        Objects.requireNonNull(cameraInternalB);
        D();
        jx0.g(null, this.s == null);
        Matrix matrix = this.j;
        boolean hasTransform = cameraInternalB.getHasTransform();
        Size sizeD = streamSpec.d();
        Rect rect2 = this.i;
        if (rect2 != null) {
            rect = rect2;
        } else {
            rect = sizeD != null ? new Rect(0, 0, sizeD.getWidth(), sizeD.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        SurfaceEdge surfaceEdge = new SurfaceEdge(1, 34, streamSpec, matrix, hasTransform, rect, g(cameraInternalB, k(cameraInternalB)), ((ImageOutputConfig) this.f).getAppTargetRotation(-1), cameraInternalB.getHasTransform() && k(cameraInternalB));
        this.s = surfaceEdge;
        surfaceEdge.a(new j60(this, 11));
        SurfaceRequest surfaceRequestD = this.s.d(cameraInternalB, true);
        this.t = surfaceRequestD;
        this.r = surfaceRequestD.l;
        if (this.o != null) {
            CameraInternal cameraInternalB2 = b();
            SurfaceEdge surfaceEdge2 = this.s;
            if (cameraInternalB2 != null && surfaceEdge2 != null) {
                w91.A(new jc1(surfaceEdge2, g(cameraInternalB2, k(cameraInternalB2)), ((ImageOutputConfig) this.f).getAppTargetRotation(-1)));
            }
            Preview$SurfaceProvider preview$SurfaceProvider = this.o;
            preview$SurfaceProvider.getClass();
            SurfaceRequest surfaceRequest = this.t;
            surfaceRequest.getClass();
            this.p.execute(new f20(25, preview$SurfaceProvider, surfaceRequest));
        }
        SessionConfig$Builder sessionConfig$BuilderE = SessionConfig$Builder.e(previewConfig, streamSpec.d());
        CaptureConfig$Builder captureConfig$Builder = sessionConfig$BuilderE.b;
        captureConfig$Builder.b.insertOption(el.k, streamSpec.b());
        int iJ = ec1.j(previewConfig);
        if (iJ != 0 && iJ != 0) {
            captureConfig$Builder.b.insertOption(UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, Integer.valueOf(iJ));
        }
        if (streamSpec.c() != null) {
            sessionConfig$BuilderE.b(streamSpec.c());
        }
        if (this.o != null) {
            sessionConfig$BuilderE.c(this.r, streamSpec.a(), ((ImageOutputConfig) this.f).getMirrorMode(-1));
        }
        SessionConfig$CloseableErrorListener sessionConfig$CloseableErrorListener = this.u;
        if (sessionConfig$CloseableErrorListener != null) {
            sessionConfig$CloseableErrorListener.a();
        }
        SessionConfig$CloseableErrorListener sessionConfig$CloseableErrorListener2 = new SessionConfig$CloseableErrorListener(new ve0(this, 3));
        this.u = sessionConfig$CloseableErrorListener2;
        sessionConfig$BuilderE.f = sessionConfig$CloseableErrorListener2;
        this.q = sessionConfig$BuilderE;
        Object[] objArr = {sessionConfig$BuilderE.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(DesugarCollections.unmodifiableList(arrayList));
    }

    @Override // androidx.camera.core.k
    public final UseCaseConfig e(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        v.getClass();
        PreviewConfig previewConfig = Preview$Defaults.a;
        previewConfig.getClass();
        Config config = useCaseConfigFactory.getConfig(ec1.e(previewConfig), 1);
        if (z) {
            config = vh.B(config, previewConfig);
        }
        if (config == null) {
            return null;
        }
        return new PreviewConfig(l.a(((Preview$Builder) j(config)).a));
    }

    @Override // androidx.camera.core.k
    public final Set i() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // androidx.camera.core.k
    public final UseCaseConfig.Builder j(Config config) {
        return new Preview$Builder(androidx.camera.core.impl.k.c(config));
    }

    @Override // androidx.camera.core.k
    public final UseCaseConfig s(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 34);
        return builder.getUseCaseConfig();
    }

    public final String toString() {
        return "Preview:".concat(f());
    }

    @Override // androidx.camera.core.k
    public final sc v(Config config) {
        this.q.b.c(config);
        Object[] objArr = {this.q.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(DesugarCollections.unmodifiableList(arrayList));
        rc rcVarF = this.g.f();
        rcVarF.d = config;
        return rcVarF.a();
    }

    @Override // androidx.camera.core.k
    public final StreamSpec w(StreamSpec streamSpec, StreamSpec streamSpec2) {
        F((PreviewConfig) this.f, streamSpec);
        return streamSpec;
    }

    @Override // androidx.camera.core.k
    public final void x() {
        D();
    }
}
