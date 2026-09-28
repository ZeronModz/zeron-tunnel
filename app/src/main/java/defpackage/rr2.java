package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzcdu;
import com.google.android.gms.internal.ads.zzeul;
import com.google.android.gms.internal.ads.zzfax;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.android.gms.internal.appset.zzr;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class rr2 implements zzfax {
    public final zzcdu a;
    public final zzr b;
    public final ScheduledExecutorService c;
    public final zzgzy d;
    public final Context e;

    public rr2(Context context, zzcdu zzcduVar, ScheduledExecutorService scheduledExecutorService, zzgzy zzgzyVar) {
        if (!((Boolean) zzbd.zzc().a(p32.O3)).booleanValue()) {
            this.b = new zzr(context);
        }
        this.e = context;
        this.a = zzcduVar;
        this.c = scheduledExecutorService;
        this.d = zzgzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        Task appSetIdInfo;
        if (((Boolean) zzbd.zzc().a(p32.K3)).booleanValue()) {
            if (!((Boolean) zzbd.zzc().a(p32.P3)).booleanValue()) {
                if (!((Boolean) zzbd.zzc().a(p32.L3)).booleanValue()) {
                    return z.b0(z.h(this.b.getAppSetIdInfo()), ox1.o, g3.g);
                }
                if (((Boolean) zzbd.zzc().a(p32.O3)).booleanValue()) {
                    ay2.D(this.e, false);
                    synchronized (ay2.e) {
                        appSetIdInfo = ay2.c;
                    }
                } else {
                    appSetIdInfo = this.b.getAppSetIdInfo();
                }
                if (appSetIdInfo == null) {
                    return z.j(new zzeul(null, -1));
                }
                ListenableFuture listenableFutureZ = z.Z(z.h(appSetIdInfo), ww1.k, g3.g);
                if (((Boolean) zzbd.zzc().a(p32.M3)).booleanValue()) {
                    listenableFutureZ = z.T(listenableFutureZ, ((Long) zzbd.zzc().a(p32.N3)).longValue(), TimeUnit.MILLISECONDS, this.c);
                }
                return z.N(listenableFutureZ, Exception.class, new ny1(this, 5), this.d);
            }
        }
        return z.j(new zzeul(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 11;
    }
}
