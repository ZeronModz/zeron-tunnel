package defpackage;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzdeg;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzikg;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qf2 implements zzikg {
    public final se3 a;
    public final se3 b;
    public final se3 c;

    public qf2(se3 se3Var, se3 se3Var2, se3 se3Var3) {
        this.a = se3Var;
        this.b = se3Var2;
        this.c = se3Var3;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzdeg zzb() {
        return new zzdeg((ScheduledExecutorService) this.a.zzb(), (Clock) this.b.zzb(), (zzdxz) this.c.zzb());
    }
}
