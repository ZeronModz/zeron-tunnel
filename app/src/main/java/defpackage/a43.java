package defpackage;

import com.google.android.gms.internal.ads.l7;
import com.google.android.gms.internal.ads.zzgzx;
import com.google.android.gms.internal.ads.zzgzz;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class a43 extends ta2 implements zzgzz {
    public final ScheduledExecutorService c;

    public a43(ScheduledExecutorService scheduledExecutorService) {
        super((ExecutorService) scheduledExecutorService);
        this.c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgyk, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        n0.i(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgzz, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzgzx schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        l7 l7Var = new l7(Executors.callable(runnable, null));
        return new y33(l7Var, this.c.schedule(l7Var, j, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgzz, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzgzx schedule(Callable callable, long j, TimeUnit timeUnit) {
        l7 l7Var = new l7(callable);
        return new y33(l7Var, this.c.schedule(l7Var, j, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgzz, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzgzx scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        z33 z33Var = new z33(runnable);
        return new y33(z33Var, this.c.scheduleAtFixedRate(z33Var, j, j2, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgzz, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzgzx scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        z33 z33Var = new z33(runnable);
        return new y33(z33Var, this.c.scheduleWithFixedDelay(z33Var, j, j2, timeUnit));
    }
}
