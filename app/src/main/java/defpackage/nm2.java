package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbj;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.s3;
import com.google.android.gms.internal.ads.zzbph;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class nm2 extends zzbj {
    public final /* synthetic */ ci2 a;
    public final /* synthetic */ s3 b;

    public nm2(s3 s3Var, ci2 ci2Var) {
        this.a = ci2Var;
        this.b = s3Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb() {
        long j = this.b.a;
        fq0 fq0Var = new fq0("interstitial");
        fq0Var.a = Long.valueOf(j);
        fq0Var.c = "onAdClosed";
        this.a.e(fq0Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc(int i) {
        long j = this.b.a;
        fq0 fq0Var = new fq0("interstitial");
        fq0Var.a = Long.valueOf(j);
        fq0Var.c = "onAdFailedToLoad";
        fq0Var.d = Integer.valueOf(i);
        this.a.e(fq0Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzd(zze zzeVar) {
        long j = this.b.a;
        int i = zzeVar.zza;
        fq0 fq0Var = new fq0("interstitial");
        fq0Var.a = Long.valueOf(j);
        fq0Var.c = "onAdFailedToLoad";
        fq0Var.d = Integer.valueOf(i);
        this.a.e(fq0Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzf() {
        long j = this.b.a;
        fq0 fq0Var = new fq0("interstitial");
        fq0Var.a = Long.valueOf(j);
        fq0Var.c = "onAdLoaded";
        this.a.e(fq0Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzg() {
        long j = this.b.a;
        fq0 fq0Var = new fq0("interstitial");
        fq0Var.a = Long.valueOf(j);
        fq0Var.c = "onAdOpened";
        this.a.e(fq0Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzh() throws RemoteException {
        long j = this.b.a;
        fq0 fq0Var = new fq0("interstitial");
        fq0Var.a = Long.valueOf(j);
        fq0Var.c = "onAdClicked";
        ((zzbph) this.a.b).zzb(fq0Var.b());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzj() {
    }
}
