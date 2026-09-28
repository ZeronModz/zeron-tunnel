package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.signin.zae;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ls1 implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public final /* synthetic */ zaaw a;

    public /* synthetic */ ls1(zaaw zaawVar) {
        this.a = zaawVar;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zaaw zaawVar = this.a;
        yg0.m(zaawVar.r);
        zae zaeVar = zaawVar.k;
        yg0.m(zaeVar);
        zaeVar.zad(new ks1(zaawVar));
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zaaw zaawVar = this.a;
        Lock lock = zaawVar.b;
        lock.lock();
        try {
            if (zaawVar.l && !connectionResult.a()) {
                zaawVar.a();
                zaawVar.f();
            } else {
                zaawVar.d(connectionResult);
            }
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
