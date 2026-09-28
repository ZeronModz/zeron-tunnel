package defpackage;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.internal.zzn;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xw1 {
    public static final Uri a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    public static Intent a(Context context, zzn zznVar) throws zzaf {
        Bundle bundleCall;
        String str = zznVar.a;
        if (str == null) {
            return new Intent().setComponent(zznVar.c);
        }
        Intent intent = null;
        if (zznVar.d) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(a);
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                } catch (Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (RemoteException e) {
                e = e;
                "Dynamic intent resolution failed: ".concat(e.toString());
                bundleCall = null;
            } catch (IllegalArgumentException e2) {
                e = e2;
                "Dynamic intent resolution failed: ".concat(e.toString());
                bundleCall = null;
            }
            if (bundleCall != null) {
                Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                if (intent2 != null) {
                    intent = intent2;
                } else {
                    PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                    if (pendingIntent != null) {
                        new StringBuilder(str.length() + 72);
                        throw new zzaf(new ConnectionResult(25, pendingIntent));
                    }
                }
            }
            if (intent == null) {
                "Dynamic lookup for intent failed for action: ".concat(str);
            }
        }
        return intent == null ? new Intent(str).setPackage(zznVar.b) : intent;
    }
}
