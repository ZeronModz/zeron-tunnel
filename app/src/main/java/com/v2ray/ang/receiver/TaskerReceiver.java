package com.v2ray.ang.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.webkit.Profile;
import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.service.b;
import kotlin.Metadata;
import libv2ray.CoreController;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/receiver/TaskerReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaskerReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle bundleExtra;
        context.getClass();
        if (intent != null) {
            try {
                bundleExtra = intent.getBundleExtra("com.twofortyfouram.locale.intent.extra.BUNDLE");
            } catch (Exception unused) {
                return;
            }
        } else {
            bundleExtra = null;
        }
        Boolean boolValueOf = bundleExtra != null ? Boolean.valueOf(bundleExtra.getBoolean("tasker_extra_bundle_switch", false)) : null;
        String string = bundleExtra != null ? bundleExtra.getString("tasker_extra_bundle_guid") : null;
        if (string == null) {
            string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (boolValueOf != null && !TextUtils.isEmpty(string)) {
            if (!boolValueOf.booleanValue()) {
                CoreController coreController = b.a;
                b.g(context);
            } else if (string.equals(Profile.DEFAULT_PROFILE_NAME)) {
                CoreController coreController2 = b.a;
                b.e(context);
            } else {
                CoreController coreController3 = b.a;
                b.d(context, string);
            }
        }
    }
}
