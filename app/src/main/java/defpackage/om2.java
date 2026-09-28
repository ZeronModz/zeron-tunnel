package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.t3;
import com.google.android.gms.internal.ads.zzcbf;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class om2 extends zzcbf {
    public final /* synthetic */ t3 a;

    public om2(t3 t3Var) {
        this.a = t3Var;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zze() {
        t3 t3Var = this.a;
        ci2 ci2Var = t3Var.b;
        long j = t3Var.a;
        fq0 fq0Var = new fq0("rewarded");
        fq0Var.a = Long.valueOf(j);
        fq0Var.c = "onRewardedAdLoaded";
        ci2Var.e(fq0Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzf(int i) {
        t3 t3Var = this.a;
        ci2 ci2Var = t3Var.b;
        long j = t3Var.a;
        fq0 fq0Var = new fq0("rewarded");
        fq0Var.a = Long.valueOf(j);
        fq0Var.c = "onRewardedAdFailedToLoad";
        fq0Var.d = Integer.valueOf(i);
        ci2Var.e(fq0Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzg(zze zzeVar) {
        t3 t3Var = this.a;
        ci2 ci2Var = t3Var.b;
        long j = t3Var.a;
        int i = zzeVar.zza;
        fq0 fq0Var = new fq0("rewarded");
        fq0Var.a = Long.valueOf(j);
        fq0Var.c = "onRewardedAdFailedToLoad";
        fq0Var.d = Integer.valueOf(i);
        ci2Var.e(fq0Var);
    }
}
