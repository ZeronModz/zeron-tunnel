package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzeeq;
import com.google.android.gms.internal.ads.zzeff;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jo2 extends zzeeq {
    public String g;
    public int h;

    @Override // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.b) {
            try {
                if (!this.d) {
                    this.d = true;
                    try {
                        try {
                            int i = this.h;
                            if (i == 2) {
                                ((zzbzh) this.f.getService()).zzg(this.e, ((Boolean) zzbd.zzc().a(p32.ue)).booleanValue() ? new go2(this.a, this.e) : new fo2(this));
                            } else if (i == 3) {
                                ((zzbzh) this.f.getService()).zzh(this.g, ((Boolean) zzbd.zzc().a(p32.ue)).booleanValue() ? new go2(this.a, this.e) : new fo2(this));
                            } else {
                                this.a.b(new zzeff(1));
                            }
                        } catch (Throwable th) {
                            zzt.zzh().f("RemoteUrlAndCacheKeyClientTask.onConnected", th);
                            this.a.b(new zzeff(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.a.b(new zzeff(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeeq, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzo.zzd("Cannot connect to remote service, fallback to local instance.");
        this.a.b(new zzeff(1));
    }
}
