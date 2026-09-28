package defpackage;

import androidx.camera.core.processing.SurfaceEdge;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jc1 implements Runnable {
    public final /* synthetic */ SurfaceEdge a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ jc1(SurfaceEdge surfaceEdge, int i, int i2) {
        this.a = surfaceEdge;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        SurfaceEdge surfaceEdge = this.a;
        int i = surfaceEdge.i;
        int i2 = this.b;
        boolean z2 = true;
        if (i != i2) {
            surfaceEdge.i = i2;
            z = true;
        } else {
            z = false;
        }
        int i3 = surfaceEdge.h;
        int i4 = this.c;
        if (i3 != i4) {
            surfaceEdge.h = i4;
        } else {
            z2 = z;
        }
        if (z2) {
            surfaceEdge.f();
        }
    }
}
