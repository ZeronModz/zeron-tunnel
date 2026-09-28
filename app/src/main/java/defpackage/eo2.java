package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzeek;
import com.google.android.gms.internal.ads.zzeeq;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class eo2 extends zzeeq {
    public final Context g;
    public final VersionInfoParcel h;
    public final zzeek i;

    public eo2(Context context, VersionInfoParcel versionInfoParcel, zzeek zzeekVar) {
        this.g = context;
        this.h = versionInfoParcel;
        this.i = zzeekVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.b) {
            if (!this.d) {
                this.d = true;
                try {
                    ((zzbzh) this.f.getService()).zzi(this.h.afmaVersion);
                    this.i.mo6zza();
                } catch (RemoteException e) {
                    this.i.zzb(e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeeq, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        super.onConnectionFailed(connectionResult);
        this.i.zzb(new RemoteException("Connection failed: ".concat(String.valueOf(connectionResult.d))));
    }

    @Override // com.google.android.gms.internal.ads.zzeeq, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzo.zzd("Cannot connect to remote service, fallback to local instance.");
        this.i.zzb(new RemoteException(vh.i(i, "Connection suspended with cause: ", new StringBuilder(String.valueOf(i).length() + 33))));
    }
}
