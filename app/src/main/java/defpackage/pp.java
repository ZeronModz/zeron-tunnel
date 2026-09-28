package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pp extends ActivityResultRegistry {
    public final /* synthetic */ ComponentActivity i;

    public pp(ComponentActivity componentActivity) {
        this.i = componentActivity;
    }

    @Override // androidx.activity.result.ActivityResultRegistry
    public final void c(int i, ActivityResultContract activityResultContract, Object obj) {
        Bundle bundleExtra;
        int i2;
        activityResultContract.getClass();
        ComponentActivity componentActivity = this.i;
        ActivityResultContract.SynchronousResult synchronousResultB = activityResultContract.b(componentActivity, obj);
        if (synchronousResultB != null) {
            new Handler(Looper.getMainLooper()).post(new xh(this, i, synchronousResultB, 4));
            return;
        }
        Intent intentA = activityResultContract.a(componentActivity, obj);
        if (intentA.getExtras() != null) {
            Bundle extras = intentA.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentA.setExtrasClassLoader(componentActivity.getClassLoader());
            }
        }
        if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
            String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            x2.N(componentActivity, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
            componentActivity.startActivityForResult(intentA, i, bundle);
            return;
        }
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            intentSenderRequest.getClass();
            i2 = i;
        } catch (IntentSender.SendIntentException e) {
            e = e;
            i2 = i;
        }
        try {
            componentActivity.startIntentSenderForResult(intentSenderRequest.a, i2, intentSenderRequest.b, intentSenderRequest.c, intentSenderRequest.d, 0, bundle);
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            new Handler(Looper.getMainLooper()).post(new xh(this, i2, e, 5));
        }
    }
}
