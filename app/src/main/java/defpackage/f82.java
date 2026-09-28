package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbuy;
import com.google.android.gms.internal.ads.zzbva;
import com.google.android.gms.internal.ads.zzbvm;
import com.google.android.gms.internal.ads.zzbwf;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class f82 implements MediationAdLoadCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzbvm b;
    public final /* synthetic */ zzbtz c;

    public /* synthetic */ f82(zzbwf zzbwfVar, zzbvm zzbvmVar, zzbtz zzbtzVar, int i) {
        this.a = i;
        this.b = zzbvmVar;
        this.c = zzbtzVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        int i = this.a;
        zzbvm zzbvmVar = this.b;
        switch (i) {
            case 0:
                try {
                    zzbvmVar.zzg(adError.zza());
                } catch (RemoteException e) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                    return;
                }
                break;
            default:
                try {
                    zzbvmVar.zzg(adError.zza());
                } catch (RemoteException e2) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e2);
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        int i = this.a;
        zzbtz zzbtzVar = this.c;
        zzbvm zzbvmVar = this.b;
        switch (i) {
            case 0:
                NativeAdMapper nativeAdMapper = (NativeAdMapper) obj;
                if (nativeAdMapper != null) {
                    try {
                        zzbvmVar.zze(new zzbuy(nativeAdMapper));
                    } catch (RemoteException e) {
                        zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                    }
                } else {
                    zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        zzbvmVar.zzf("Adapter returned null.");
                    } catch (RemoteException e2) {
                        zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e2);
                        return null;
                    }
                }
                break;
            default:
                UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) obj;
                if (unifiedNativeAdMapper != null) {
                    try {
                        zzbvmVar.zze(new zzbva(unifiedNativeAdMapper));
                    } catch (RemoteException e3) {
                        zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e3);
                    }
                } else {
                    zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        zzbvmVar.zzf("Adapter returned null.");
                    } catch (RemoteException e4) {
                        zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
                        return null;
                    }
                }
                break;
        }
        return new jx2(zzbtzVar, 25);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        switch (this.a) {
            case 0:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            default:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
        }
    }
}
