package defpackage;

import com.google.android.gms.internal.ads.zzdoc;
import com.google.android.gms.internal.ads.zzdso;
import com.google.android.gms.internal.ads.zzdsq;
import com.google.android.gms.internal.ads.zzike;
import com.google.android.gms.internal.ads.zzikg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class vk2 implements zzikg {
    public final /* synthetic */ int a;
    public final ng2 b;
    public final zzike c;
    public final pe2 d;

    public /* synthetic */ vk2(ng2 ng2Var, zzike zzikeVar, pe2 pe2Var, int i) {
        this.a = i;
        this.b = ng2Var;
        this.c = zzikeVar;
        this.d = pe2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        pe2 pe2Var = this.d;
        zzike zzikeVar = this.c;
        ng2 ng2Var = this.b;
        switch (i) {
            case 0:
                return new zzdso(ng2Var.b.c, (zzdoc) zzikeVar.zzb(), pe2Var.a());
            default:
                return new zzdsq(ng2Var.b.c, (zzdoc) zzikeVar.zzb(), pe2Var.a());
        }
    }
}
