package defpackage;

import androidx.camera.camera2.internal.d0;
import androidx.concurrent.futures.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;
    public final /* synthetic */ b c;

    public /* synthetic */ y70(d0 d0Var, b bVar, int i) {
        this.a = i;
        this.b = d0Var;
        this.c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b bVar = this.c;
        d0 d0Var = this.b;
        switch (i) {
            case 0:
                d0Var.b(bVar);
                break;
            default:
                d0Var.g(bVar);
                break;
        }
    }
}
