package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.q;
import com.google.android.gms.measurement.internal.r;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y63 implements ServiceConnection {
    public final String a;
    public final /* synthetic */ ca2 b;

    public y63(ca2 ca2Var, String str) {
        Objects.requireNonNull(ca2Var);
        this.b = ca2Var;
        this.a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ca2 ca2Var = this.b;
        if (iBinder == null) {
            m mVar = ((r) ca2Var.b).f;
            r.h(mVar);
            mVar.i.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = k62.a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            zzbq c62Var = iInterfaceQueryLocalInterface instanceof zzbq ? (zzbq) iInterfaceQueryLocalInterface : new c62(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 2);
            r rVar = (r) ca2Var.b;
            m mVar2 = rVar.f;
            r.h(mVar2);
            mVar2.n.a("Install Referrer Service connected");
            q qVar = rVar.g;
            r.h(qVar);
            qVar.j(new qj2(this, c62Var, this));
        } catch (RuntimeException e) {
            m mVar3 = ((r) ca2Var.b).f;
            r.h(mVar3);
            mVar3.i.b(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        m mVar = ((r) this.b.b).f;
        r.h(mVar);
        mVar.n.a("Install Referrer Service disconnected");
    }
}
