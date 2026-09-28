package defpackage;

import com.google.android.gms.internal.ads.f7;
import com.google.android.gms.internal.ads.g7;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class c33 implements Runnable {
    public final f7 a;
    public final ListenableFuture b;

    public c33(f7 f7Var, ListenableFuture listenableFuture) {
        this.a = f7Var;
        this.b = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        ListenableFuture listenableFuture = this.b;
        if (g7.g.S(this.a, this, f7.g(listenableFuture))) {
            f7.n(this.a, false);
        }
    }
}
