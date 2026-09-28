package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzcdu;
import com.google.android.gms.internal.ads.zzfax;
import com.google.android.gms.internal.ads.zzfdo;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ft2 implements zzfax {
    public final zzcdu a;
    public final boolean b;
    public final ScheduledExecutorService c;
    public final zzgzy d;
    public final int e;
    public final int f;

    public ft2(zzcdu zzcduVar, boolean z, zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, int i, int i2) {
        this.a = zzcduVar;
        this.b = z;
        this.d = zzgzyVar;
        this.c = scheduledExecutorService;
        this.e = i;
        this.f = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        if (((Boolean) zzbd.zzc().a(p32.V7)).booleanValue() && this.b) {
            return z.j(new zzfdo(null));
        }
        if (this.f == 2) {
            return z.j(new zzfdo(null));
        }
        if (!Arrays.asList(((String) zzbd.zzc().a(p32.X7)).split(",")).contains(String.valueOf(this.e))) {
            return z.j(new zzfdo(null));
        }
        u33 u33Var = u33.b;
        ox1 ox1Var = ox1.r;
        zzgzy zzgzyVar = this.d;
        return z.N(z.T(z.b0(u33Var, ox1Var, zzgzyVar), ((Long) x42.b.g()).longValue(), TimeUnit.MILLISECONDS, this.c), Exception.class, new ny1(this, 7), zzgzyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 50;
    }
}
