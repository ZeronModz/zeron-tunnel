package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.f3;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.ads.zzbdb;
import com.google.android.gms.internal.ads.zzcce;
import com.google.android.gms.internal.ads.zzcso;
import com.google.android.gms.internal.ads.zzcxv;
import com.google.android.gms.internal.ads.zzdfw;
import com.google.android.gms.internal.ads.zzdje;
import com.google.android.gms.internal.ads.zzeqf;
import com.google.android.gms.internal.ads.zzfvh;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gf2 implements zzikg {
    public final /* synthetic */ int a;
    public final zzikp b;
    public final se3 c;

    public /* synthetic */ gf2(zzikp zzikpVar, se3 se3Var, int i) {
        this.a = i;
        this.b = zzikpVar;
        this.c = se3Var;
    }

    public oq2 a() {
        return new oq2((zzeqf) this.c.zzb(), (ql2) this.b.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        se3 se3Var = this.c;
        zzikp zzikpVar = this.b;
        switch (i) {
            case 0:
                return new zzcso(((sc2) zzikpVar).a(), (zzbdb) se3Var.zzb());
            case 1:
                return new zzcxv((Clock) zzikpVar.zzb(), (f3) se3Var.zzb());
            case 2:
                return new zzb((Context) zzikpVar.zzb(), (zzcce) se3Var.zzb(), null);
            case 3:
                return new zzdje((zzdfw) se3Var.zzb(), (Executor) zzikpVar.zzb());
            case 4:
                return new zzdje((zzdfw) se3Var.zzb(), (Executor) zzikpVar.zzb());
            case 5:
                return new zzdje((zzdfw) se3Var.zzb(), (Executor) zzikpVar.zzb());
            case 6:
                return new zzdje((zzdfw) se3Var.zzb(), (Executor) zzikpVar.zzb());
            case 7:
                return new zzdje((zzdfw) se3Var.zzb(), (Executor) zzikpVar.zzb());
            case 8:
                return new zzdje((zzdfw) se3Var.zzb(), (Executor) zzikpVar.zzb());
            case 9:
                return new zzdje((zzdfw) se3Var.zzb(), (Executor) zzikpVar.zzb());
            case 10:
                return new zzdje((zzdfw) se3Var.zzb(), (Executor) zzikpVar.zzb());
            case 11:
                return a();
            case 12:
                ListenableFuture listenableFuture = (ListenableFuture) se3Var.zzb();
                ta2 ta2Var = g3.a;
                k02.J(ta2Var);
                return new ir2(listenableFuture, ta2Var, (ScheduledExecutorService) zzikpVar.zzb());
            default:
                zzbch zzbchVarV = l02.V((Context) zzikpVar.zzb(), (zzfvh) se3Var.zzb());
                k02.J(zzbchVarV);
                return zzbchVarV;
        }
    }

    public /* synthetic */ gf2(se3 se3Var, zzikp zzikpVar, int i) {
        this.a = i;
        this.c = se3Var;
        this.b = zzikpVar;
    }
}
