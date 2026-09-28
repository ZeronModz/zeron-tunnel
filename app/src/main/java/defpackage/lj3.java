package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.zzjq;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class lj3 implements zzjq {
    public final zzda a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public lj3(AppMeasurementDynamiteService appMeasurementDynamiteService, zzda zzdaVar) {
        this.b = appMeasurementDynamiteService;
        this.a = zzdaVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjq
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        try {
            this.a.zze(str, str2, bundle, j);
        } catch (RemoteException e) {
            r rVar = this.b.a;
            if (rVar != null) {
                m mVar = rVar.f;
                r.h(mVar);
                mVar.i.b(e, "Event listener threw exception");
            }
        }
    }
}
