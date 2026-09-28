package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class r33 extends q33 {
    public final ListenableFuture h;

    public r33(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.h = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.f7, com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.h.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.f7, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.h.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.f7, java.util.concurrent.Future
    public final Object get() {
        return this.h.get();
    }

    @Override // com.google.android.gms.internal.ads.f7, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.h.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.f7, java.util.concurrent.Future
    public final boolean isDone() {
        return this.h.isDone();
    }

    @Override // com.google.android.gms.internal.ads.f7
    public final String toString() {
        return this.h.toString();
    }

    @Override // com.google.android.gms.internal.ads.f7, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.h.get(j, timeUnit);
    }
}
