package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.z;
import com.google.android.gms.measurement.internal.zzgb;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class gh3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wj3 b;
    public final /* synthetic */ z c;

    public /* synthetic */ gh3(z zVar, wj3 wj3Var, int i) {
        this.a = i;
        this.b = wj3Var;
        this.c = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        wj3 wj3Var = this.b;
        z zVar = this.c;
        switch (i) {
            case 0:
                r rVar = zVar.a;
                zzgb zzgbVar = zVar.d;
                if (zzgbVar != null) {
                    try {
                        zzgbVar.zzt(wj3Var);
                    } catch (RemoteException e) {
                        m mVar = rVar.f;
                        r.h(mVar);
                        mVar.f.b(e, "Failed to reset data on the service: remote exception");
                    }
                    zVar.n();
                } else {
                    m mVar2 = rVar.f;
                    r.h(mVar2);
                    mVar2.f.a("Failed to reset data on the service: not connected to service");
                }
                break;
            case 1:
                r rVar2 = zVar.a;
                zzgb zzgbVar2 = zVar.d;
                if (zzgbVar2 == null) {
                    m mVar3 = rVar2.f;
                    r.h(mVar3);
                    mVar3.i.a("Failed to send app backgrounded");
                } else {
                    try {
                        zzgbVar2.zzA(wj3Var);
                        zVar.n();
                    } catch (RemoteException e2) {
                        m mVar4 = rVar2.f;
                        r.h(mVar4);
                        mVar4.f.b(e2, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
                break;
            default:
                r rVar3 = zVar.a;
                zzgb zzgbVar3 = zVar.d;
                if (zzgbVar3 == null) {
                    m mVar5 = rVar3.f;
                    r.h(mVar5);
                    mVar5.f.a("Failed to send measurementEnabled to service");
                } else {
                    try {
                        zzgbVar3.zzi(wj3Var);
                        zVar.n();
                    } catch (RemoteException e3) {
                        m mVar6 = rVar3.f;
                        r.h(mVar6);
                        mVar6.f.b(e3, "Failed to send measurementEnabled to the service");
                    }
                }
                break;
        }
    }
}
