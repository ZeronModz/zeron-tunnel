package defpackage;

import com.google.android.gms.internal.ads.zzdnp;
import com.google.android.gms.internal.ads.zzdtu;
import com.google.android.gms.internal.ads.zzikg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nj2 implements zzikg {
    public final /* synthetic */ int a;
    public final pe2 b;

    public /* synthetic */ nj2(pe2 pe2Var, int i) {
        this.a = i;
        this.b = pe2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        pe2 pe2Var = this.b;
        switch (i) {
            case 0:
                return new zzdnp(pe2Var.a());
            default:
                return new zzdtu(pe2Var.a());
        }
    }
}
