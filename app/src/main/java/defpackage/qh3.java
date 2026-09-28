package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.q;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.z;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzgo;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class qh3 implements ServiceConnection, BaseGmsClient$BaseConnectionCallbacks, BaseGmsClient$BaseOnConnectionFailedListener {
    public volatile boolean a;
    public volatile zzgo b;
    public final /* synthetic */ z c;

    public qh3(z zVar) {
        this.c = zVar;
    }

    public final void a() {
        z zVar = this.c;
        zVar.a();
        Context context = zVar.a.a;
        synchronized (this) {
            try {
                if (this.a) {
                    m mVar = this.c.a.f;
                    r.h(mVar);
                    mVar.n.a("Connection attempt already in progress");
                } else {
                    if (this.b != null && (this.b.isConnecting() || this.b.isConnected())) {
                        m mVar2 = this.c.a.f;
                        r.h(mVar2);
                        mVar2.n.a("Already awaiting connection attempt");
                        return;
                    }
                    this.b = new zzgo(context, Looper.getMainLooper(), this, this);
                    m mVar3 = this.c.a.f;
                    r.h(mVar3);
                    mVar3.n.a("Connecting to remote service");
                    this.a = true;
                    yg0.m(this.b);
                    this.b.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        q qVar = this.c.a.g;
        r.h(qVar);
        qVar.f();
        synchronized (this) {
            boolean z = false;
            try {
                yg0.m(this.b);
                zzgb zzgbVar = (zzgb) this.b.getService();
                q qVar2 = this.c.a.g;
                r.h(qVar2);
                qVar2.j(new qj2(this, 25, zzgbVar, z));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        boolean z;
        z zVar = this.c;
        q qVar = zVar.a.g;
        r.h(qVar);
        qVar.f();
        m mVar = zVar.a.f;
        if (mVar == null || !mVar.b) {
            mVar = null;
        }
        if (mVar != null) {
            mVar.n.b(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            z = false;
            this.a = false;
            this.b = null;
        }
        q qVar2 = this.c.a.g;
        r.h(qVar2);
        qVar2.j(new wn2(this, 22, connectionResult, z));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        r rVar = this.c.a;
        q qVar = rVar.g;
        r.h(qVar);
        qVar.f();
        m mVar = rVar.f;
        r.h(mVar);
        mVar.m.a("Service connection suspended");
        q qVar2 = rVar.g;
        r.h(qVar2);
        qVar2.j(new pt2(this, 22));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        q qVar = this.c.a.g;
        r.h(qVar);
        qVar.f();
        synchronized (this) {
            boolean z = false;
            if (iBinder == null) {
                this.a = false;
                m mVar = this.c.a.f;
                r.h(mVar);
                mVar.f.a("Service connected with null binder");
                return;
            }
            Object bx2Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    bx2Var = iInterfaceQueryLocalInterface instanceof zzgb ? (zzgb) iInterfaceQueryLocalInterface : new bx2(iBinder);
                    m mVar2 = this.c.a.f;
                    r.h(mVar2);
                    mVar2.n.a("Bound to IMeasurementService interface");
                } else {
                    m mVar3 = this.c.a.f;
                    r.h(mVar3);
                    mVar3.f.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                m mVar4 = this.c.a.f;
                r.h(mVar4);
                mVar4.f.a("Service connect failed to get IMeasurementService");
            }
            if (bx2Var == null) {
                this.a = false;
                try {
                    nq nqVarB = nq.b();
                    z zVar = this.c;
                    nqVarB.c(zVar.a.a, zVar.c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                q qVar2 = this.c.a.g;
                r.h(qVar2);
                qVar2.j(new wn2(this, 20, bx2Var, z));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        r rVar = this.c.a;
        q qVar = rVar.g;
        r.h(qVar);
        qVar.f();
        m mVar = rVar.f;
        r.h(mVar);
        mVar.m.a("Service disconnected");
        q qVar2 = rVar.g;
        r.h(qVar2);
        qVar2.j(new qj2(this, 24, componentName, false));
    }
}
