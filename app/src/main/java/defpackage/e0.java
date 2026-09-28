package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements Runnable {
    public final c a;
    public final ListenableFuture b;

    public e0(c cVar, ListenableFuture listenableFuture) {
        this.a = cVar;
        this.b = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        if (c.f.f(this.a, this, c.g(this.b))) {
            c.d(this.a, false);
        }
    }
}
