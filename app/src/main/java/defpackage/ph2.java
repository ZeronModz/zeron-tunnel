package defpackage;

import com.google.android.gms.internal.ads.zzikg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ph2 implements zzikg {
    public final /* synthetic */ int a;
    public final oh2 b;

    public /* synthetic */ ph2(oh2 oh2Var, int i) {
        this.a = i;
        this.b = oh2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        oh2 oh2Var = this.b;
        switch (i) {
            case 0:
                return oh2Var.c;
            case 1:
                return Integer.valueOf(oh2Var.g);
            case 2:
                return oh2Var.d;
            default:
                return oh2Var.a();
        }
    }
}
