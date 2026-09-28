package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.ImageAnalysis$Builder;
import androidx.camera.core.ImageAnalysis$Defaults;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageAnalysisConfig;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.SessionConfig$Builder;
import androidx.camera.core.impl.SessionConfig$CloseableErrorListener;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.l;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import androidx.camera.core.k;
import io.github.g00fy2.quickie.QRCodeAnalyzer;
import java.util.DesugarCollections;
import java.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class we0 extends k {
    public static final ImageAnalysis$Defaults u = new ImageAnalysis$Defaults();
    public final ye0 o;
    public final Object p;
    public QRCodeAnalyzer q;
    public SessionConfig$Builder r;
    public ImmediateSurface s;
    public SessionConfig$CloseableErrorListener t;

    public we0(ImageAnalysisConfig imageAnalysisConfig) {
        ye0 ze0Var;
        super(imageAnalysisConfig);
        this.p = new Object();
        ImageAnalysisConfig imageAnalysisConfig2 = (ImageAnalysisConfig) this.f;
        if (((Integer) ((l) imageAnalysisConfig2.getConfig()).retrieveOption(ImageAnalysisConfig.b, 0)).intValue() == 1) {
            ze0Var = new ze0();
            this.o = ze0Var;
        } else {
            cf0 cf0Var = new cf0(ec1.b(imageAnalysisConfig, sc0.a()));
            this.o = cf0Var;
            ze0Var = cf0Var;
        }
        ze0Var.d = E();
        ImageAnalysisConfig imageAnalysisConfig3 = (ImageAnalysisConfig) this.f;
        Boolean bool = Boolean.FALSE;
        imageAnalysisConfig3.getClass();
        ze0Var.e = ((Boolean) ((l) imageAnalysisConfig3.getConfig()).retrieveOption(ImageAnalysisConfig.g, bool)).booleanValue();
    }

    @Override // androidx.camera.core.k
    public final void A(Rect rect) {
        this.i = rect;
        ye0 ye0Var = this.o;
        synchronized (ye0Var.r) {
            ye0Var.j = rect;
            ye0Var.k = new Rect(ye0Var.j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.camera.core.impl.SessionConfig$Builder D(androidx.camera.core.impl.ImageAnalysisConfig r17, androidx.camera.core.impl.StreamSpec r18) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.we0.D(androidx.camera.core.impl.ImageAnalysisConfig, androidx.camera.core.impl.StreamSpec):androidx.camera.core.impl.SessionConfig$Builder");
    }

    public final int E() {
        ImageAnalysisConfig imageAnalysisConfig = (ImageAnalysisConfig) this.f;
        imageAnalysisConfig.getClass();
        return ((Integer) ((l) imageAnalysisConfig.getConfig()).retrieveOption(ImageAnalysisConfig.e, 1)).intValue();
    }

    @Override // androidx.camera.core.k
    public final UseCaseConfig e(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        u.getClass();
        ImageAnalysisConfig imageAnalysisConfig = ImageAnalysis$Defaults.a;
        imageAnalysisConfig.getClass();
        Config config = useCaseConfigFactory.getConfig(ec1.e(imageAnalysisConfig), 1);
        if (z) {
            config = vh.B(config, imageAnalysisConfig);
        }
        if (config == null) {
            return null;
        }
        return new ImageAnalysisConfig(l.a(((ImageAnalysis$Builder) j(config)).a));
    }

    @Override // androidx.camera.core.k
    public final UseCaseConfig.Builder j(Config config) {
        return new ImageAnalysis$Builder(androidx.camera.core.impl.k.c(config));
    }

    @Override // androidx.camera.core.k
    public final void q() {
        this.o.s = true;
    }

    @Override // androidx.camera.core.k
    public final UseCaseConfig s(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        ImageAnalysisConfig imageAnalysisConfig = (ImageAnalysisConfig) this.f;
        imageAnalysisConfig.getClass();
        Boolean bool = (Boolean) ((l) imageAnalysisConfig.getConfig()).retrieveOption(ImageAnalysisConfig.f, null);
        boolean zA = cameraInfoInternal.getCameraQuirks().a(OnePixelShiftQuirk.class);
        ye0 ye0Var = this.o;
        if (bool != null) {
            zA = bool.booleanValue();
        }
        ye0Var.f = zA;
        synchronized (this.p) {
        }
        return builder.getUseCaseConfig();
    }

    public final String toString() {
        return "ImageAnalysis:".concat(f());
    }

    @Override // androidx.camera.core.k
    public final sc v(Config config) {
        this.r.b.c(config);
        Object[] objArr = {this.r.d()};
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
        ImageAnalysisConfig imageAnalysisConfig = (ImageAnalysisConfig) this.f;
        d();
        SessionConfig$Builder sessionConfig$BuilderD = D(imageAnalysisConfig, streamSpec);
        this.r = sessionConfig$BuilderD;
        Object[] objArr = {sessionConfig$BuilderD.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(DesugarCollections.unmodifiableList(arrayList));
        return streamSpec;
    }

    @Override // androidx.camera.core.k
    public final void x() {
        w91.i();
        SessionConfig$CloseableErrorListener sessionConfig$CloseableErrorListener = this.t;
        if (sessionConfig$CloseableErrorListener != null) {
            sessionConfig$CloseableErrorListener.a();
            this.t = null;
        }
        ImmediateSurface immediateSurface = this.s;
        if (immediateSurface != null) {
            immediateSurface.a();
            this.s = null;
        }
        ye0 ye0Var = this.o;
        ye0Var.s = false;
        ye0Var.c();
    }

    @Override // androidx.camera.core.k
    public final void y(Matrix matrix) {
        super.y(matrix);
        ye0 ye0Var = this.o;
        synchronized (ye0Var.r) {
            ye0Var.l = matrix;
            ye0Var.m = new Matrix(ye0Var.l);
        }
    }
}
