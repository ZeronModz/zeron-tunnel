package defpackage;

import androidx.concurrent.futures.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ rv(int i, b bVar) {
        this.a = i;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                bVar.d(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                break;
            default:
                bVar.b(null);
                break;
        }
    }
}
