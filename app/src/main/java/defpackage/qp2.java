package defpackage;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzen;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qp2 extends zzbc {
    public final /* synthetic */ zzen a;

    public qp2(zzen zzenVar) {
        this.a = zzenVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbc, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        zzen zzenVar = this.a;
        zzenVar.zzE().zza(zzenVar.zzz());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbc, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        zzen zzenVar = this.a;
        zzenVar.zzE().zza(zzenVar.zzz());
        super.onAdLoaded();
    }
}
