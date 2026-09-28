package defpackage;

import androidx.camera.camera2.internal.o;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ bi(o oVar, int i) {
        this.a = i;
        this.b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        o oVar = this.b;
        switch (i) {
            case 0:
                oVar.o();
                break;
            case 1:
                oVar.y = false;
                oVar.x = false;
                oVar.f("OpenCameraConfigAndClose is done, state: " + oVar.e);
                int iOrdinal = oVar.e.ordinal();
                if (iOrdinal == 1 || iOrdinal == 4) {
                    jx0.g(null, oVar.q.isEmpty());
                    oVar.g();
                } else if (iOrdinal == 6) {
                    int i2 = oVar.l;
                    if (i2 == 0) {
                        oVar.w(false);
                    } else {
                        oVar.f("OpenCameraConfigAndClose in error: ".concat(o.h(i2)));
                        oVar.i.b();
                    }
                } else {
                    oVar.f("OpenCameraConfigAndClose finished while in state: " + oVar.e);
                }
                break;
            default:
                oVar.c();
                break;
        }
    }
}
