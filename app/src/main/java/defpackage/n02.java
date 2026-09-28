package defpackage;

import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadFailureListener;
import com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadSuccessListener;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class n02 implements UserMessagingPlatform$OnConsentFormLoadSuccessListener, UserMessagingPlatform$OnConsentFormLoadFailureListener {
    public final UserMessagingPlatform$OnConsentFormLoadSuccessListener a;
    public final UserMessagingPlatform$OnConsentFormLoadFailureListener b;

    public /* synthetic */ n02(UserMessagingPlatform$OnConsentFormLoadSuccessListener userMessagingPlatform$OnConsentFormLoadSuccessListener, UserMessagingPlatform$OnConsentFormLoadFailureListener userMessagingPlatform$OnConsentFormLoadFailureListener) {
        this.a = userMessagingPlatform$OnConsentFormLoadSuccessListener;
        this.b = userMessagingPlatform$OnConsentFormLoadFailureListener;
    }

    @Override // com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadFailureListener
    public final void onConsentFormLoadFailure(FormError formError) {
        this.b.onConsentFormLoadFailure(formError);
    }

    @Override // com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadSuccessListener
    public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
        this.a.onConsentFormLoadSuccess(consentForm);
    }
}
