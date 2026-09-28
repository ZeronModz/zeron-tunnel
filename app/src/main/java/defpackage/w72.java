package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbuk;
import com.google.android.gms.internal.ads.zzbuu;
import com.google.android.gms.internal.ads.zzcbp;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class w72 implements MediationAdLoadCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzbtz b;
    public final /* synthetic */ zzbuu c;

    public /* synthetic */ w72(zzbuu zzbuuVar, zzbtz zzbtzVar, int i) {
        this.a = i;
        this.b = zzbtzVar;
        this.c = zzbuuVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        int i = this.a;
        zzbtz zzbtzVar = this.b;
        zzbuu zzbuuVar = this.c;
        switch (i) {
            case 0:
                try {
                    String canonicalName = zzbuuVar.a.getClass().getCanonicalName();
                    int code = adError.getCode();
                    String message = adError.getMessage();
                    String domain = adError.getDomain();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 43 + String.valueOf(code).length() + 17 + String.valueOf(message).length() + 16 + String.valueOf(domain).length());
                    sb.append(canonicalName);
                    sb.append("failed to loaded mediation ad: ErrorCode = ");
                    sb.append(code);
                    sb.append(". ErrorMessage = ");
                    sb.append(message);
                    sb.append(". ErrorDomain = ");
                    sb.append(domain);
                    zzo.zzd(sb.toString());
                    zzbtzVar.zzx(adError.zza());
                    zzbtzVar.zzw(adError.getCode(), adError.getMessage());
                    zzbtzVar.zzg(adError.getCode());
                } catch (RemoteException e) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                    return;
                }
                break;
            case 1:
                try {
                    String canonicalName2 = zzbuuVar.a.getClass().getCanonicalName();
                    int code2 = adError.getCode();
                    String message2 = adError.getMessage();
                    String domain2 = adError.getDomain();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName2).length() + 43 + String.valueOf(code2).length() + 17 + String.valueOf(message2).length() + 16 + String.valueOf(domain2).length());
                    sb2.append(canonicalName2);
                    sb2.append("failed to loaded mediation ad: ErrorCode = ");
                    sb2.append(code2);
                    sb2.append(". ErrorMessage = ");
                    sb2.append(message2);
                    sb2.append(". ErrorDomain = ");
                    sb2.append(domain2);
                    zzo.zzd(sb2.toString());
                    zzbtzVar.zzx(adError.zza());
                    zzbtzVar.zzw(adError.getCode(), adError.getMessage());
                    zzbtzVar.zzg(adError.getCode());
                } catch (RemoteException e2) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e2);
                    return;
                }
                break;
            case 2:
                try {
                    String canonicalName3 = zzbuuVar.a.getClass().getCanonicalName();
                    int code3 = adError.getCode();
                    String message3 = adError.getMessage();
                    String domain3 = adError.getDomain();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(canonicalName3).length() + 41 + String.valueOf(code3).length() + 17 + String.valueOf(message3).length() + 16 + String.valueOf(domain3).length());
                    sb3.append(canonicalName3);
                    sb3.append("failed to load mediation ad: ErrorCode = ");
                    sb3.append(code3);
                    sb3.append(". ErrorMessage = ");
                    sb3.append(message3);
                    sb3.append(". ErrorDomain = ");
                    sb3.append(domain3);
                    zzo.zzd(sb3.toString());
                    zzbtzVar.zzx(adError.zza());
                    zzbtzVar.zzw(adError.getCode(), adError.getMessage());
                    zzbtzVar.zzg(adError.getCode());
                } catch (RemoteException e3) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e3);
                    return;
                }
                break;
            case 3:
                try {
                    String canonicalName4 = zzbuuVar.a.getClass().getCanonicalName();
                    int code4 = adError.getCode();
                    String message4 = adError.getMessage();
                    String domain4 = adError.getDomain();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(canonicalName4).length() + 41 + String.valueOf(code4).length() + 17 + String.valueOf(message4).length() + 16 + String.valueOf(domain4).length());
                    sb4.append(canonicalName4);
                    sb4.append("failed to load mediation ad: ErrorCode = ");
                    sb4.append(code4);
                    sb4.append(". ErrorMessage = ");
                    sb4.append(message4);
                    sb4.append(". ErrorDomain = ");
                    sb4.append(domain4);
                    zzo.zzd(sb4.toString());
                    zzbtzVar.zzx(adError.zza());
                    zzbtzVar.zzw(adError.getCode(), adError.getMessage());
                    zzbtzVar.zzg(adError.getCode());
                } catch (RemoteException e4) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
                    return;
                }
                break;
            case 4:
                try {
                    String canonicalName5 = zzbuuVar.a.getClass().getCanonicalName();
                    int code5 = adError.getCode();
                    String message5 = adError.getMessage();
                    String domain5 = adError.getDomain();
                    StringBuilder sb5 = new StringBuilder(String.valueOf(canonicalName5).length() + 41 + String.valueOf(code5).length() + 17 + String.valueOf(message5).length() + 16 + String.valueOf(domain5).length());
                    sb5.append(canonicalName5);
                    sb5.append("failed to load mediation ad: ErrorCode = ");
                    sb5.append(code5);
                    sb5.append(". ErrorMessage = ");
                    sb5.append(message5);
                    sb5.append(". ErrorDomain = ");
                    sb5.append(domain5);
                    zzo.zzd(sb5.toString());
                    zzbtzVar.zzx(adError.zza());
                    zzbtzVar.zzw(adError.getCode(), adError.getMessage());
                    zzbtzVar.zzg(adError.getCode());
                } catch (RemoteException e5) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e5);
                    return;
                }
                break;
            default:
                try {
                    String canonicalName6 = zzbuuVar.a.getClass().getCanonicalName();
                    int code6 = adError.getCode();
                    String message6 = adError.getMessage();
                    String domain6 = adError.getDomain();
                    StringBuilder sb6 = new StringBuilder(String.valueOf(canonicalName6).length() + 41 + String.valueOf(code6).length() + 17 + String.valueOf(message6).length() + 16 + String.valueOf(domain6).length());
                    sb6.append(canonicalName6);
                    sb6.append("failed to load mediation ad: ErrorCode = ");
                    sb6.append(code6);
                    sb6.append(". ErrorMessage = ");
                    sb6.append(message6);
                    sb6.append(". ErrorDomain = ");
                    sb6.append(domain6);
                    zzo.zzd(sb6.toString());
                    zzbtzVar.zzx(adError.zza());
                    zzbtzVar.zzw(adError.getCode(), adError.getMessage());
                    zzbtzVar.zzg(adError.getCode());
                } catch (RemoteException e6) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* synthetic */ Object onSuccess(Object obj) {
        int i = this.a;
        zzbuu zzbuuVar = this.c;
        zzbtz zzbtzVar = this.b;
        switch (i) {
            case 0:
                try {
                    zzbuuVar.e = ((MediationBannerAd) obj).getView();
                    zzbtzVar.zzj();
                    break;
                } catch (RemoteException e) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                }
                return new zzbuk(zzbtzVar);
            case 1:
                try {
                    zzbuuVar.f = (MediationInterstitialAd) obj;
                    zzbtzVar.zzj();
                    break;
                } catch (RemoteException e2) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e2);
                }
                return new zzbuk(zzbtzVar);
            case 2:
                try {
                    zzbuuVar.g = (UnifiedNativeAdMapper) obj;
                    zzbtzVar.zzj();
                    break;
                } catch (RemoteException e3) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e3);
                }
                return new zzbuk(zzbtzVar);
            case 3:
                try {
                    zzbuuVar.h = (NativeAdMapper) obj;
                    zzbtzVar.zzj();
                    break;
                } catch (RemoteException e4) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
                }
                return new zzbuk(zzbtzVar);
            case 4:
                try {
                    zzbuuVar.i = (MediationRewardedAd) obj;
                    zzbtzVar.zzj();
                    break;
                } catch (RemoteException e5) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e5);
                }
                return new zzcbp(zzbtzVar);
            default:
                try {
                    zzbuuVar.k = (MediationAppOpenAd) obj;
                    zzbtzVar.zzj();
                    break;
                } catch (RemoteException e6) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
                }
                return new zzbuk(zzbtzVar);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        int i = this.a;
        zzbtz zzbtzVar = this.b;
        zzbuu zzbuuVar = this.c;
        switch (i) {
            case 0:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            case 1:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            case 2:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            case 3:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            case 4:
                try {
                    String canonicalName = zzbuuVar.a.getClass().getCanonicalName();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 31 + String.valueOf(str).length());
                    sb.append(canonicalName);
                    sb.append("failed to loaded mediation ad: ");
                    sb.append(str);
                    zzo.zzd(sb.toString());
                    zzbtzVar.zzw(0, str);
                    zzbtzVar.zzg(0);
                } catch (RemoteException e) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                    return;
                }
                break;
            default:
                try {
                    String canonicalName2 = zzbuuVar.a.getClass().getCanonicalName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName2).length() + 31 + String.valueOf(str).length());
                    sb2.append(canonicalName2);
                    sb2.append("failed to loaded mediation ad: ");
                    sb2.append(str);
                    zzo.zzd(sb2.toString());
                    zzbtzVar.zzw(0, str);
                    zzbtzVar.zzg(0);
                } catch (RemoteException e2) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e2);
                    return;
                }
                break;
        }
    }
}
