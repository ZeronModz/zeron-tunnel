package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.z;
import com.google.android.gms.measurement.internal.zzgb;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ph3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ ph3(z zVar, int i) {
        this.a = i;
        this.b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        z zVar = this.b;
        switch (i) {
            case 0:
                zVar.g();
                break;
            case 1:
                r rVar = zVar.a;
                zzgb zzgbVar = zVar.d;
                if (zzgbVar == null) {
                    m mVar = rVar.f;
                    r.h(mVar);
                    mVar.f.a("Failed to send Dma consent settings to service");
                } else {
                    try {
                        zzgbVar.zzz(zVar.q(false));
                        zVar.n();
                    } catch (RemoteException e) {
                        m mVar2 = rVar.f;
                        r.h(mVar2);
                        mVar2.f.b(e, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
                break;
            default:
                r rVar2 = zVar.a;
                zzgb zzgbVar2 = zVar.d;
                if (zzgbVar2 == null) {
                    m mVar3 = rVar2.f;
                    r.h(mVar3);
                    mVar3.f.a("Failed to send storage consent settings to service");
                } else {
                    try {
                        zzgbVar2.zzy(zVar.q(false));
                        zVar.n();
                    } catch (RemoteException e2) {
                        m mVar4 = rVar2.f;
                        r.h(mVar4);
                        mVar4.f.b(e2, "Failed to send storage consent settings to the service");
                    }
                }
                break;
        }
    }
}
