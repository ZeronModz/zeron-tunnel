package com.v2ray.ang.util;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzj;
import com.google.android.ump.ConsentDebugSettings$Builder;
import com.google.android.ump.ConsentRequestParameters$Builder;
import com.google.android.ump.FormError;
import defpackage.b1;
import defpackage.di;
import defpackage.pq;
import defpackage.px1;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/util/GoogleMobileAdsConsentManager;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "OnConsentGatheringCompleteListener", "Companion", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GoogleMobileAdsConsentManager {
    public static final Companion b = new Companion(null);
    public static volatile GoogleMobileAdsConsentManager c;
    public final zzj a;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/v2ray/ang/util/GoogleMobileAdsConsentManager$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcom/v2ray/ang/util/GoogleMobileAdsConsentManager;", "instance", "Lcom/v2ray/ang/util/GoogleMobileAdsConsentManager;", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }

        public final GoogleMobileAdsConsentManager a(Context context) {
            GoogleMobileAdsConsentManager googleMobileAdsConsentManager;
            context.getClass();
            GoogleMobileAdsConsentManager googleMobileAdsConsentManager2 = GoogleMobileAdsConsentManager.c;
            if (googleMobileAdsConsentManager2 != null) {
                return googleMobileAdsConsentManager2;
            }
            synchronized (this) {
                googleMobileAdsConsentManager = GoogleMobileAdsConsentManager.c;
                if (googleMobileAdsConsentManager == null) {
                    googleMobileAdsConsentManager = new GoogleMobileAdsConsentManager(context, null);
                    GoogleMobileAdsConsentManager.c = googleMobileAdsConsentManager;
                }
            }
            return googleMobileAdsConsentManager;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/v2ray/ang/util/GoogleMobileAdsConsentManager$OnConsentGatheringCompleteListener;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lcom/google/android/ump/FormError;", "error", "Lmk1;", "consentGatheringComplete", "(Lcom/google/android/ump/FormError;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface OnConsentGatheringCompleteListener {
        void consentGatheringComplete(FormError error);
    }

    public GoogleMobileAdsConsentManager(Context context, xu xuVar) {
        zzj zzjVarB = zza.a(context).b();
        zzjVarB.getClass();
        this.a = zzjVarB;
    }

    public final void a(FragmentActivity fragmentActivity, OnConsentGatheringCompleteListener onConsentGatheringCompleteListener) {
        px1 px1VarA = new ConsentDebugSettings$Builder(fragmentActivity).a();
        ConsentRequestParameters$Builder consentRequestParameters$Builder = new ConsentRequestParameters$Builder();
        consentRequestParameters$Builder.a = px1VarA;
        this.a.requestConsentInfoUpdate(fragmentActivity, new pq(consentRequestParameters$Builder), new di(6, fragmentActivity, onConsentGatheringCompleteListener), new b1(onConsentGatheringCompleteListener, 18));
    }
}
