package defpackage;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbdy;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class vu2 implements zzbdy {
    public final ScheduledExecutorService a;
    public final ta2 b;
    public final HashMap c = new HashMap();
    public boolean d = false;

    public vu2(ScheduledExecutorService scheduledExecutorService, ta2 ta2Var) {
        this.a = scheduledExecutorService;
        this.b = ta2Var;
    }

    public final synchronized void a(long j, Runnable runnable) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (!this.d) {
                    zzt.zzg().b(this);
                    this.d = true;
                }
                uu2 uu2Var = new uu2(this, runnable, zzt.zzk().currentTimeMillis() + j);
                ScheduledFuture<?> scheduledFutureSchedule = this.a.schedule(new pt2(uu2Var, 4), j, timeUnit);
                uu2Var.c = scheduledFutureSchedule;
                this.c.put(scheduledFutureSchedule, uu2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdy
    public final void zza(boolean z) {
        if (z) {
            this.b.execute(new pt2(this, 5));
        }
    }
}
