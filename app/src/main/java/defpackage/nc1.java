package defpackage;

import android.view.Surface;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.util.OutConfig;
import androidx.camera.video.j;
import androidx.concurrent.futures.b;
import androidx.core.util.Consumer;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nc1 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nc1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                qc1 qc1Var = (qc1) obj;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    int iC = ((xc) qc1Var).b - ((OutConfig) entry.getKey()).c();
                    if (((OutConfig) entry.getKey()).g()) {
                        iC = -iC;
                    }
                    int iG = cg1.g(iC);
                    SurfaceEdge surfaceEdge = (SurfaceEdge) entry.getValue();
                    surfaceEdge.getClass();
                    w91.A(new jc1(surfaceEdge, iG, -1));
                }
                break;
            case 1:
                ((b) obj2).b((wc) obj);
                break;
            default:
                j jVar = (j) obj2;
                wc wcVar = (wc) obj;
                wcVar.b.hashCode();
                km0.a("VideoEncoderSession");
                Surface surface = wcVar.b;
                if (surface == jVar.e) {
                    jVar.e = null;
                    jVar.m.b(jVar.d);
                    jVar.a();
                } else {
                    surface.release();
                }
                break;
        }
    }
}
