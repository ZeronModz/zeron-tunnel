package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdjg;
import com.google.android.gms.internal.ads.zzdjq;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ye2 implements zzikg {
    public final /* synthetic */ int a;
    public final ng2 b;
    public final zzikp c;

    public ye2(se3 se3Var, ng2 ng2Var) {
        this.a = 2;
        this.c = se3Var;
        this.b = ng2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        int i = this.a;
        ng2 ng2Var = this.b;
        zzikp zzikpVar = this.c;
        switch (i) {
            case 0:
                return new xe2(ng2Var.b(), ((zc2) zzikpVar).zzb());
            case 1:
                return new zzdjq(ng2Var.b(), (mv2) zzikpVar.zzb());
            default:
                return new zzdjg((Context) zzikpVar.zzb(), new HashSet(), ng2Var.b());
        }
    }

    public /* synthetic */ ye2(ng2 ng2Var, zzikp zzikpVar, int i) {
        this.a = i;
        this.b = ng2Var;
        this.c = zzikpVar;
    }
}
