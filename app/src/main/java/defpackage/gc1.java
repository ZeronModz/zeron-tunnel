package defpackage;

import androidx.camera.core.processing.SurfaceEdge;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gc1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SurfaceEdge b;

    public /* synthetic */ gc1(SurfaceEdge surfaceEdge, int i) {
        this.a = i;
        this.b = surfaceEdge;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SurfaceEdge surfaceEdge = this.b;
        switch (i) {
            case 0:
                ((jc0) dn0.r()).execute(new gc1(surfaceEdge, 1));
                break;
            default:
                if (!surfaceEdge.n) {
                    surfaceEdge.e();
                }
                break;
        }
    }
}
