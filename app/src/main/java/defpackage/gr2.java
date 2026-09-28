package defpackage;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzesv;
import com.google.android.gms.internal.ads.zzfax;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gr2 implements zzfax {
    public final Clock a;
    public final cu2 b;
    public final long c;

    public gr2(Clock clock, cu2 cu2Var, long j) {
        this.a = clock;
        this.b = cu2Var;
        this.c = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return z.j(new zzesv(this.b, this.a.currentTimeMillis(), this.c));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 4;
    }
}
