package defpackage;

import android.util.Range;
import androidx.camera.core.SurfaceRequest;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SurfaceRequest b;

    public /* synthetic */ qv(SurfaceRequest surfaceRequest, int i) {
        this.a = i;
        this.b = surfaceRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SurfaceRequest surfaceRequest = this.b;
        switch (i) {
            case 0:
                surfaceRequest.d();
                break;
            default:
                Range range = SurfaceRequest.p;
                surfaceRequest.g.cancel(true);
                break;
        }
    }
}
