package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzcdu;
import com.google.android.gms.internal.ads.zzfax;
import com.google.android.gms.internal.ads.zzfch;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.android.gms.tasks.b;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ir2 implements zzfax {
    public final /* synthetic */ int a = 1;
    public final ScheduledExecutorService b;
    public final Object c;
    public final zzgzy d;

    public ir2(zzcdu zzcduVar, ScheduledExecutorService scheduledExecutorService, zzgzy zzgzyVar) {
        this.c = zzcduVar;
        this.b = scheduledExecutorService;
        this.d = zzgzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        int i = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ScheduledExecutorService scheduledExecutorService = this.b;
        zzgzy zzgzyVar = this.d;
        switch (i) {
            case 0:
                ta2 ta2Var = (ta2) zzgzyVar;
                ListenableFuture listenableFutureZ = z.Z((ListenableFuture) this.c, ww1.j, ta2Var);
                if (((Integer) zzbd.zzc().a(p32.Vd)).intValue() > 0) {
                    listenableFutureZ = z.T(listenableFutureZ, ((Integer) zzbd.zzc().a(r0)).intValue(), timeUnit, scheduledExecutorService);
                }
                return z.R(listenableFutureZ, Throwable.class, ww1.i, ta2Var);
            default:
                if (((Boolean) zzbd.zzc().a(p32.K3)).booleanValue()) {
                    if (((Boolean) zzbd.zzc().a(p32.P3)).booleanValue()) {
                        ListenableFuture listenableFutureZ2 = z.Z(z.h(b.e(null)), ww1.m, zzgzyVar);
                        if (((Boolean) y32.a.g()).booleanValue()) {
                            listenableFutureZ2 = z.T(listenableFutureZ2, ((Long) y32.b.g()).longValue(), timeUnit, scheduledExecutorService);
                        }
                        return z.N(listenableFutureZ2, Exception.class, new ny1(this, 6), zzgzyVar);
                    }
                }
                return z.j(new zzfch(null, -1));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        switch (this.a) {
            case 0:
                return 6;
            default:
                return 43;
        }
    }

    public ir2(ListenableFuture listenableFuture, ta2 ta2Var, ScheduledExecutorService scheduledExecutorService) {
        this.c = listenableFuture;
        this.d = ta2Var;
        this.b = scheduledExecutorService;
    }
}
