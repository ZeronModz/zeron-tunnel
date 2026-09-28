package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.processing.OpenGlRenderer;
import androidx.camera.core.processing.concurrent.DualOpenGlRenderer;
import androidx.core.util.Consumer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tk implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tk(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Surface) obj3).release();
                ((SurfaceTexture) obj2).release();
                break;
            case 1:
                tv tvVar = (tv) obj3;
                SurfaceOutput surfaceOutput = (SurfaceOutput) obj2;
                surfaceOutput.close();
                Surface surface = (Surface) tvVar.h.remove(surfaceOutput);
                if (surface != null) {
                    OpenGlRenderer openGlRenderer = tvVar.a;
                    hb0.d(openGlRenderer.a, true);
                    hb0.c(openGlRenderer.c);
                    openGlRenderer.i(surface, true);
                }
                break;
            default:
                d00 d00Var = (d00) obj3;
                SurfaceOutput surfaceOutput2 = (SurfaceOutput) obj2;
                surfaceOutput2.close();
                Surface surface2 = (Surface) d00Var.h.remove(surfaceOutput2);
                if (surface2 != null) {
                    DualOpenGlRenderer dualOpenGlRenderer = d00Var.a;
                    hb0.d(dualOpenGlRenderer.a, true);
                    hb0.c(dualOpenGlRenderer.c);
                    dualOpenGlRenderer.i(surface2, true);
                }
                break;
        }
    }
}
