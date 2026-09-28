package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.k;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.z;
import com.google.android.gms.measurement.internal.zzgb;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class hh3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wj3 b;
    public final /* synthetic */ z c;

    public hh3(z zVar, wj3 wj3Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = wj3Var;
                Objects.requireNonNull(zVar);
                this.c = zVar;
                break;
            default:
                this.b = wj3Var;
                this.c = zVar;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.a;
        wj3 wj3Var = this.b;
        z zVar = this.c;
        switch (i) {
            case 0:
                zzgb zzgbVar = zVar.d;
                r rVar = zVar.a;
                if (zzgbVar == null) {
                    m mVar = rVar.f;
                    r.h(mVar);
                    mVar.f.a("Discarding data. Failed to send app launch");
                } else {
                    try {
                        b bVar = rVar.d;
                        k kVar = l.c1;
                        if (bVar.k(null, kVar)) {
                            zVar.s(zzgbVar, null, wj3Var);
                        }
                        zzgbVar.zzg(wj3Var);
                        rVar.i().f();
                        rVar.d.k(null, kVar);
                        zVar.s(zzgbVar, null, wj3Var);
                        zVar.n();
                    } catch (RemoteException e) {
                        m mVar2 = rVar.f;
                        r.h(mVar2);
                        mVar2.f.b(e, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            default:
                zzgb zzgbVar2 = zVar.d;
                r rVar2 = zVar.a;
                if (zzgbVar2 == null) {
                    m mVar3 = rVar2.f;
                    r.h(mVar3);
                    mVar3.f.a("Failed to send consent settings to service");
                } else {
                    try {
                        zzgbVar2.zzv(wj3Var);
                        zVar.n();
                    } catch (RemoteException e2) {
                        m mVar4 = rVar2.f;
                        r.h(mVar4);
                        mVar4.f.b(e2, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }
}
