package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzda;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class sg2 extends cs1 implements zzda {
    public sg2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 2);
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final void zze(String str, String str2, Bundle bundle, long j) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        x52.b(parcelE, bundle);
        parcelE.writeLong(j);
        f(1, parcelE);
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final int zzf() {
        Parcel parcelD = d(2, e());
        int i = parcelD.readInt();
        parcelD.recycle();
        return i;
    }
}
