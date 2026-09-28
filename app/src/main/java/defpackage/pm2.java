package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.t3;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcbb;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pm2 extends zzcbb {
    public final /* synthetic */ t3 a;

    public pm2(t3 t3Var) {
        this.a = t3Var;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zze() {
        t3 t3Var = this.a;
        ci2 ci2Var = t3Var.b;
        long j = t3Var.a;
        fq0 fq0Var = new fq0("rewarded");
        fq0Var.a = Long.valueOf(j);
        fq0Var.c = "onRewardedAdOpened";
        ci2Var.e(fq0Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzf() {
        t3 t3Var = this.a;
        ci2 ci2Var = t3Var.b;
        long j = t3Var.a;
        fq0 fq0Var = new fq0("rewarded");
        fq0Var.a = Long.valueOf(j);
        fq0Var.c = "onRewardedAdClosed";
        ci2Var.e(fq0Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzg(zzcaw zzcawVar) {
        t3 t3Var = this.a;
        ci2 ci2Var = t3Var.b;
        long j = t3Var.a;
        fq0 fq0Var = new fq0("rewarded");
        fq0Var.a = Long.valueOf(j);
        fq0Var.c = "onUserEarnedReward";
        fq0Var.e = zzcawVar.zze();
        fq0Var.f = Integer.valueOf(zzcawVar.zzf());
        ci2Var.e(fq0Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzh(int i) {
        t3 t3Var = this.a;
        ci2 ci2Var = t3Var.b;
        long j = t3Var.a;
        fq0 fq0Var = new fq0("rewarded");
        fq0Var.a = Long.valueOf(j);
        fq0Var.c = "onRewardedAdFailedToShow";
        fq0Var.d = Integer.valueOf(i);
        ci2Var.e(fq0Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzi(zze zzeVar) {
        t3 t3Var = this.a;
        ci2 ci2Var = t3Var.b;
        long j = t3Var.a;
        int i = zzeVar.zza;
        fq0 fq0Var = new fq0("rewarded");
        fq0Var.a = Long.valueOf(j);
        fq0Var.c = "onRewardedAdFailedToShow";
        fq0Var.d = Integer.valueOf(i);
        ci2Var.e(fq0Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzj() {
        t3 t3Var = this.a;
        ci2 ci2Var = t3Var.b;
        long j = t3Var.a;
        fq0 fq0Var = new fq0("rewarded");
        fq0Var.a = Long.valueOf(j);
        fq0Var.c = "onAdImpression";
        ci2Var.e(fq0Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzk() {
        t3 t3Var = this.a;
        ci2 ci2Var = t3Var.b;
        long j = t3Var.a;
        fq0 fq0Var = new fq0("rewarded");
        fq0Var.a = Long.valueOf(j);
        fq0Var.c = "onAdClicked";
        ci2Var.e(fq0Var);
    }
}
