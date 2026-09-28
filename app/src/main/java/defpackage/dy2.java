package defpackage;

import com.google.android.gms.internal.ads.zzgcl;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dy2 implements zzgcl {
    public final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();

    @Override // com.google.android.gms.internal.ads.zzgcl
    public final void zza(Runnable runnable, long j) {
        this.a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzgcl
    public final void zzb() {
    }
}
