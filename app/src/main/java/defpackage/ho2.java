package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzbyw;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzeeq;
import com.google.android.gms.internal.ads.zzeff;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ho2 extends zzeeq {
    public final Context g;
    public final ta2 h;

    public ho2(Context context, ta2 ta2Var) {
        this.g = context;
        this.h = ta2Var;
        this.f = new zzbyw(context, zzt.zzs().zza(), this, this);
    }

    public final ListenableFuture c(zzbzu zzbzuVar) {
        synchronized (this.b) {
            try {
                if (this.c) {
                    return this.a;
                }
                this.c = true;
                this.e = zzbzuVar;
                this.f.checkAvailabilityAndConnect();
                zzcen zzcenVar = this.a;
                zzcenVar.a.addListener(new kc2(this, 16), g3.g);
                zzeeq.b(this.g, zzcenVar, this.h);
                return zzcenVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.b) {
            try {
                if (!this.d) {
                    this.d = true;
                    try {
                        ((zzbzh) this.f.getService()).zzf(this.e, ((Boolean) zzbd.zzc().a(p32.ue)).booleanValue() ? new go2(this.a, this.e) : new fo2(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.a.b(new zzeff(1));
                    } catch (Throwable th) {
                        zzt.zzh().f("RemoteSignalsClientTask.onConnected", th);
                        this.a.b(new zzeff(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
