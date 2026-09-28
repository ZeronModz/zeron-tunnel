package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzcvc;
import com.google.android.gms.internal.ads.zzdlu;
import com.google.android.gms.internal.ads.zzdmq;
import com.google.android.gms.internal.ads.zzdue;
import com.google.android.gms.internal.ads.zzelk;
import com.google.android.gms.internal.ads.zzemg;
import com.google.android.gms.internal.ads.zzemu;
import com.google.android.gms.internal.ads.zzemx;
import com.google.android.gms.internal.ads.zzeoe;
import com.google.android.gms.internal.ads.zzeoz;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class sp2 implements zzikg {
    public final /* synthetic */ int a;
    public final se3 b;
    public final zzikp c;
    public final te3 d;

    public /* synthetic */ sp2(se3 se3Var, zzikp zzikpVar, te3 te3Var, int i) {
        this.a = i;
        this.b = se3Var;
        this.c = zzikpVar;
        this.d = te3Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        te3 te3Var = this.d;
        zzikp zzikpVar = this.c;
        se3 se3Var = this.b;
        switch (i) {
            case 0:
                return new zzelk((Context) se3Var.zzb(), (zzcvc) te3Var.a, (Executor) zzikpVar.zzb());
            case 1:
                Context context = (Context) se3Var.zzb();
                VersionInfoParcel versionInfoParcelA = ((yc2) zzikpVar).a();
                zzdlu zzdluVar = (zzdlu) te3Var.a;
                ta2 ta2Var = g3.a;
                k02.J(ta2Var);
                return new zzemg(context, versionInfoParcelA, zzdluVar, ta2Var);
            case 2:
                return new zzemu((Context) se3Var.zzb(), (zzdmq) te3Var.a, (Executor) zzikpVar.zzb());
            case 3:
                return new zzemx((Context) se3Var.zzb(), (zzdmq) te3Var.a, ((yc2) zzikpVar).a());
            case 4:
                return new zzeoe((Context) se3Var.zzb(), (Executor) zzikpVar.zzb(), (zzdue) te3Var.a);
            default:
                return new zzeoz((Context) se3Var.zzb(), (Executor) zzikpVar.zzb(), (zzdue) te3Var.a);
        }
    }

    public /* synthetic */ sp2(se3 se3Var, te3 te3Var, zzikp zzikpVar, int i) {
        this.a = i;
        this.b = se3Var;
        this.d = te3Var;
        this.c = zzikpVar;
    }
}
