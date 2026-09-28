package defpackage;

import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.zzdxt;
import com.google.android.gms.internal.ads.zzdye;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzgje;
import com.google.android.gms.internal.ads.zzgky;
import com.google.android.gms.internal.ads.zzika;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bm2 implements zzikg {
    public final /* synthetic */ int a;
    public final se3 b;
    public final se3 c;
    public final zzikp d;

    public /* synthetic */ bm2(int i, Object obj, se3 se3Var, se3 se3Var2) {
        this.a = i;
        this.b = se3Var;
        this.c = se3Var2;
        this.d = (zzikp) obj;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        int i = this.a;
        se3 se3Var = this.b;
        se3 se3Var2 = this.c;
        zzikp zzikpVar = this.d;
        switch (i) {
            case 0:
                return new am2((zzdxt) se3Var.zzb(), (zzdye) zzikpVar.zzb(), ((Integer) se3Var2.zzb()).intValue());
            case 1:
                return new zzgje((File) se3Var.zzb(), (zzfvc) se3Var2.zzb(), (f6) zzikpVar.zzb());
            default:
                zzika zzikaVarB = se3.b(se3Var);
                zzika zzikaVarB2 = se3.b(se3Var2);
                if (true == ((k5) zzikpVar.zzb()).zzs()) {
                    zzikaVarB = zzikaVarB2;
                }
                zzgky zzgkyVar = (zzgky) zzikaVarB.zzb();
                k02.J(zzgkyVar);
                return zzgkyVar;
        }
    }

    public bm2(se3 se3Var, se3 se3Var2, se3 se3Var3) {
        this.a = 0;
        this.b = se3Var;
        this.d = se3Var2;
        this.c = se3Var3;
    }
}
