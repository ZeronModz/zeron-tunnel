package defpackage;

import androidx.camera.camera2.internal.e;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.impl.ImageAnalysisConfig;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.PreviewConfig;
import androidx.camera.core.impl.SessionConfig$Builder;
import androidx.camera.core.impl.SessionConfig$CloseableErrorListener;
import androidx.camera.core.impl.SessionConfig$ErrorListener;
import androidx.camera.core.impl.SessionConfig$SessionError;
import androidx.camera.core.impl.SessionConfig$ValidatingBuilder;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.video.h;
import java.util.DesugarCollections;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ve0 implements SessionConfig$ErrorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ve0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.camera.core.impl.SessionConfig$ErrorListener
    public final void onError(v61 v61Var, SessionConfig$SessionError sessionConfig$SessionError) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                we0 we0Var = (we0) obj;
                if (we0Var.b() != null) {
                    w91.i();
                    SessionConfig$CloseableErrorListener sessionConfig$CloseableErrorListener = we0Var.t;
                    if (sessionConfig$CloseableErrorListener != null) {
                        sessionConfig$CloseableErrorListener.a();
                        we0Var.t = null;
                    }
                    ImmediateSurface immediateSurface = we0Var.s;
                    if (immediateSurface != null) {
                        immediateSurface.a();
                        we0Var.s = null;
                    }
                    we0Var.o.c();
                    we0Var.d();
                    ImageAnalysisConfig imageAnalysisConfig = (ImageAnalysisConfig) we0Var.f;
                    StreamSpec streamSpec = we0Var.g;
                    streamSpec.getClass();
                    SessionConfig$Builder sessionConfig$BuilderD = we0Var.D(imageAnalysisConfig, streamSpec);
                    we0Var.r = sessionConfig$BuilderD;
                    Object[] objArr = {sessionConfig$BuilderD.d()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    we0Var.C(DesugarCollections.unmodifiableList(arrayList));
                    we0Var.o();
                    break;
                }
                break;
            case 1:
                ef0 ef0Var = (ef0) obj;
                if (ef0Var.b() != null) {
                    ef0Var.w.c();
                    ef0Var.D(true);
                    String strD = ef0Var.d();
                    ImageCaptureConfig imageCaptureConfig = (ImageCaptureConfig) ef0Var.f;
                    StreamSpec streamSpec2 = ef0Var.g;
                    streamSpec2.getClass();
                    SessionConfig$Builder sessionConfig$BuilderE = ef0Var.E(strD, imageCaptureConfig, streamSpec2);
                    ef0Var.u = sessionConfig$BuilderE;
                    Object[] objArr2 = {sessionConfig$BuilderE.d()};
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj3 = objArr2[0];
                    Objects.requireNonNull(obj3);
                    arrayList2.add(obj3);
                    ef0Var.C(DesugarCollections.unmodifiableList(arrayList2));
                    ef0Var.o();
                    TakePictureManager takePictureManager = ef0Var.w;
                    takePictureManager.getClass();
                    w91.i();
                    takePictureManager.f = false;
                    takePictureManager.b();
                    break;
                }
                break;
            case 2:
                fq0 fq0Var = (fq0) obj;
                fq0Var.b = fq0Var.a();
                e eVar = (e) fq0Var.e;
                if (eVar != null) {
                    eVar.onSurfaceReset();
                }
                break;
            case 3:
                ey0 ey0Var = (ey0) obj;
                if (ey0Var.b() != null) {
                    ey0Var.F((PreviewConfig) ey0Var.f, ey0Var.g);
                    ey0Var.o();
                    break;
                }
                break;
            case 4:
                Iterator it = ((SessionConfig$ValidatingBuilder) obj).l.iterator();
                while (it.hasNext()) {
                    ((SessionConfig$ErrorListener) it.next()).onError(v61Var, sessionConfig$SessionError);
                }
                break;
            default:
                ((h) obj).L();
                break;
        }
    }
}
