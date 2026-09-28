package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzctl;
import com.google.android.gms.internal.ads.zzcvc;
import com.google.android.gms.internal.ads.zzdlu;
import com.google.android.gms.internal.ads.zzdue;
import com.google.android.gms.internal.ads.zzdwo;
import com.google.android.gms.internal.ads.zzelp;
import com.google.android.gms.internal.ads.zzemj;
import com.google.android.gms.internal.ads.zzeoh;
import com.google.android.gms.internal.ads.zzfgn;
import com.google.android.gms.internal.ads.zzikg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ia2 implements zzikg {
    public final /* synthetic */ int a;
    public final se3 b;
    public final te3 c;

    public ia2(te3 te3Var, se3 se3Var) {
        this.a = 0;
        this.c = te3Var;
        this.b = se3Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        te3 te3Var = this.c;
        se3 se3Var = this.b;
        switch (i) {
            case 0:
                return new i31(te3Var.a, 13, se3Var.zzb(), false);
            case 1:
                return new zzdwo((zzbgd) se3Var.zzb(), (zzfgn) te3Var.a);
            case 2:
                Context context = (Context) se3Var.zzb();
                zzctl zzctlVar = (zzctl) te3Var.a;
                ta2 ta2Var = g3.a;
                k02.J(ta2Var);
                return new np2(context, zzctlVar, ta2Var);
            case 3:
                return new pp2((Context) se3Var.zzb(), (zzctl) te3Var.a);
            case 4:
                return new zzelp((Context) se3Var.zzb(), (zzcvc) te3Var.a);
            case 5:
                return new zzemj((Context) se3Var.zzb(), (zzdlu) te3Var.a);
            default:
                return new zzeoh((Context) se3Var.zzb(), (zzdue) te3Var.a);
        }
    }

    public /* synthetic */ ia2(se3 se3Var, te3 te3Var, int i) {
        this.a = i;
        this.b = se3Var;
        this.c = te3Var;
    }
}
