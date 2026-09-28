package defpackage;

import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.zzb;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class yu1 extends zzcg {
    public final /* synthetic */ PreloadCallbackV2 a;

    public yu1(zzb zzbVar, PreloadCallbackV2 preloadCallbackV2) {
        this.a = preloadCallbackV2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zze(String str, zzea zzeaVar) {
        this.a.onAdPreloaded(str, ResponseInfo.zzb(zzeaVar));
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzf(String str) {
        this.a.onAdsExhausted(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzg(String str, zze zzeVar) {
        this.a.onAdFailedToPreload(str, zzeVar.zzb());
    }
}
