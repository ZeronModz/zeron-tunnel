package defpackage;

import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.android.gms.ads.nonagon.signalgeneration.zzo;
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzdye;
import com.google.android.gms.internal.ads.zzikg;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class v32 implements zzikg {
    public final se3 a;
    public final se3 b;
    public final se3 c;
    public final se3 d;

    public v32(se3 se3Var, se3 se3Var2, se3 se3Var3, se3 se3Var4) {
        this.a = se3Var;
        this.b = se3Var2;
        this.c = se3Var3;
        this.d = se3Var4;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzbij zzb() {
        return new zzbij((ScheduledExecutorService) this.a.zzb(), (zzo) this.b.zzb(), (zzf) this.c.zzb(), (zzdye) this.d.zzb());
    }
}
