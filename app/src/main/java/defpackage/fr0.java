package defpackage;

import com.google.android.gms.internal.ads.k7;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.p;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fr0 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ ListenableFuture c;

    public /* synthetic */ fr0(Executor executor, ListenableFuture listenableFuture, int i) {
        this.a = i;
        this.b = executor;
        this.c = listenableFuture;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        ListenableFuture listenableFuture = this.c;
        Executor executor = this.b;
        switch (i) {
            case 0:
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e) {
                    ((p) listenableFuture).k(e);
                    return;
                }
                break;
            default:
                k7 k7Var = (k7) listenableFuture;
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e2) {
                    k7Var.d(e2);
                }
                break;
        }
    }
}
