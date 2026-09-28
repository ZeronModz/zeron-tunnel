package defpackage;

import androidx.camera.camera2.internal.p0;
import androidx.concurrent.futures.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class as1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;
    public final /* synthetic */ b c;
    public final /* synthetic */ pb d;

    public /* synthetic */ as1(p0 p0Var, b bVar, pb pbVar, int i) {
        this.a = i;
        this.b = p0Var;
        this.c = bVar;
        this.d = pbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        pb pbVar = this.d;
        b bVar = this.c;
        p0 p0Var = this.b;
        switch (i) {
            case 0:
                p0Var.b(bVar, pbVar);
                break;
            default:
                p0Var.b(bVar, pbVar);
                break;
        }
    }
}
