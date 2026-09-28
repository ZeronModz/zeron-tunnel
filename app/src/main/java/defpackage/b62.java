package defpackage;

import com.google.android.gms.internal.consent_sdk.zzaw;
import com.google.android.gms.internal.consent_sdk.zzbc;
import com.google.android.gms.internal.consent_sdk.zzbq;
import com.google.android.gms.internal.consent_sdk.zzdt;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadFailureListener;
import com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadSuccessListener;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class b62 {
    public final zzdt a;
    public final Executor b;
    public final AtomicReference c = new AtomicReference();
    public final AtomicReference d = new AtomicReference();

    public b62(zzdt zzdtVar, Executor executor) {
        this.a = zzdtVar;
        this.b = executor;
    }

    public final void a() {
        zzbq zzbqVar = (zzbq) this.c.get();
        if (zzbqVar == null) {
            return;
        }
        final zzbc zzbcVarZza = ((zzaw) this.a.zza()).zza(zzbqVar).zzb().zza();
        zzbcVarZza.l = true;
        af2.a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbe
            @Override // java.lang.Runnable
            public final void run() {
                final AtomicReference atomicReference = this.a.d;
                zzbcVarZza.a(new UserMessagingPlatform$OnConsentFormLoadSuccessListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbf
                    @Override // com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadSuccessListener
                    public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                        atomicReference.set(consentForm);
                    }
                }, new UserMessagingPlatform$OnConsentFormLoadFailureListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbg
                    @Override // com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadFailureListener
                    public final void onConsentFormLoadFailure(FormError formError) {
                        "Failed to load and cache a form, error=".concat(String.valueOf(formError.b));
                    }
                });
            }
        });
    }
}
