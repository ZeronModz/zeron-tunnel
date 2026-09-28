package defpackage;

import com.google.android.gms.internal.ads.e6;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.x5;
import com.google.android.gms.internal.ads.zzcwi;
import com.google.android.gms.internal.ads.zzenr;
import com.google.android.gms.internal.ads.zzfqg;
import com.google.android.gms.internal.ads.zzgct;
import com.google.android.gms.internal.ads.zzika;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class cq2 implements zzikg {
    public final /* synthetic */ int a;
    public final se3 b;
    public final se3 c;
    public final se3 d;
    public final zzikp e;

    public /* synthetic */ cq2(se3 se3Var, se3 se3Var2, se3 se3Var3, Object obj, int i) {
        this.a = i;
        this.b = se3Var;
        this.c = se3Var2;
        this.d = se3Var3;
        this.e = (zzikp) obj;
    }

    public gj0 a() {
        ta2 ta2Var = g3.a;
        k02.J(ta2Var);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.e.zzb();
        zzcwi zzcwiVar = (zzcwi) this.b.zzb();
        zzenr zzenrVar = (zzenr) this.c.zzb();
        zzfqg zzfqgVar = (zzfqg) this.d.zzb();
        gj0 gj0Var = new gj0();
        gj0Var.f = new b43();
        gj0Var.g = new AtomicBoolean();
        gj0Var.a = ta2Var;
        gj0Var.b = scheduledExecutorService;
        gj0Var.c = zzcwiVar;
        gj0Var.d = zzenrVar;
        gj0Var.e = zzfqgVar;
        return gj0Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        int i = this.a;
        zzikp zzikpVar = this.e;
        se3 se3Var = this.d;
        se3 se3Var2 = this.c;
        se3 se3Var3 = this.b;
        switch (i) {
            case 0:
                return a();
            case 1:
                zzika zzikaVarB = se3.b(se3Var3);
                zzika zzikaVarB2 = se3.b(se3Var2);
                zzika zzikaVarB3 = se3.b(se3Var);
                k5 k5Var = (k5) zzikpVar.zzb();
                return new x5(zzikaVarB, zzikaVarB2, zzikaVarB3, k5Var.E().zza(), k5Var.E().w());
            default:
                return new e6((zzgct) se3Var3.zzb(), (zzgct) se3Var2.zzb(), se3.b(se3Var), (f6) zzikpVar.zzb());
        }
    }

    public cq2(zzikp zzikpVar, se3 se3Var, se3 se3Var2, se3 se3Var3) {
        this.a = 0;
        this.e = zzikpVar;
        this.b = se3Var;
        this.c = se3Var2;
        this.d = se3Var3;
    }
}
