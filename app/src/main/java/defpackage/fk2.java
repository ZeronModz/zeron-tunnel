package defpackage;

import com.google.android.gms.internal.ads.zzdje;
import com.google.android.gms.internal.ads.zzdtu;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fk2 implements zzikg {
    public final nj2 a;
    public final zzikp b;

    public fk2(nj2 nj2Var, se3 se3Var) {
        this.a = nj2Var;
        this.b = se3Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        return new zzdje(new zzdtu(this.a.b.a()), (Executor) this.b.zzb());
    }
}
