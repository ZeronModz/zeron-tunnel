package defpackage;

import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class tq2 extends zzcd {
    public final /* synthetic */ PreloadCallback a;

    public tq2(zzex zzexVar, PreloadCallback preloadCallback) {
        this.a = preloadCallback;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zze(zzft zzftVar) {
        PreloadConfiguration preloadConfigurationZzr = zzf.zzr(zzftVar);
        if (preloadConfigurationZzr != null) {
            this.a.onAdsAvailable(preloadConfigurationZzr);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zzf(zzft zzftVar) {
        PreloadConfiguration preloadConfigurationZzr = zzf.zzr(zzftVar);
        if (preloadConfigurationZzr != null) {
            this.a.onAdsExhausted(preloadConfigurationZzr);
        }
    }
}
