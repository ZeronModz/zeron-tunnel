package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.internal.ads.g5;
import com.google.android.gms.internal.ads.zzfwh;
import com.google.android.gms.internal.ads.zzfwj;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class mw2 implements BaseGmsClient$BaseConnectionCallbacks, BaseGmsClient$BaseOnConnectionFailedListener {
    public final zzfwj a;
    public final g5 b;
    public final Object c = new Object();
    public boolean d = false;
    public boolean e = false;

    public mw2(Context context, Looper looper, g5 g5Var) {
        this.b = g5Var;
        this.a = new zzfwj(context, looper, this, this, 12800000);
    }

    public final void a() {
        synchronized (this.c) {
            try {
                zzfwj zzfwjVar = this.a;
                if (zzfwjVar.isConnected() || zzfwjVar.isConnecting()) {
                    zzfwjVar.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.c) {
            try {
                if (this.e) {
                    return;
                }
                this.e = true;
                try {
                    qw2 qw2Var = (qw2) this.a.getService();
                    zzfwh zzfwhVar = new zzfwh(this.b.a());
                    Parcel parcelZza = qw2Var.zza();
                    e12.c(parcelZza, zzfwhVar);
                    qw2Var.zzda(2, parcelZza);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    a();
                    throw th;
                }
                a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
