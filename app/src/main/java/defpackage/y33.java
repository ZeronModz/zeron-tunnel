package defpackage;

import com.google.android.gms.internal.ads.f7;
import com.google.android.gms.internal.ads.zzgzx;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class y33 extends cn0 implements zzgzx, ListenableFuture, Future {
    public final ScheduledFuture A;
    public final f7 z;

    public y33(f7 f7Var, ScheduledFuture scheduledFuture) {
        this.z = f7Var;
        this.A = scheduledFuture;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.z.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = this.z.cancel(z);
        if (zCancel) {
            this.A.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.A.compareTo(delayed);
    }

    @Override // defpackage.cn0
    public final /* synthetic */ Object f0() {
        return this.z;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.z.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.A.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.z.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.z.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.z.get(j, timeUnit);
    }
}
