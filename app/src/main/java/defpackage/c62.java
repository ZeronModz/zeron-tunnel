package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbq;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c62 extends cs1 implements zzbq {
    @Override // com.google.android.gms.internal.measurement.zzbq
    public final Bundle zze(Bundle bundle) {
        Parcel parcelE = e();
        x52.b(parcelE, bundle);
        Parcel parcelD = d(1, parcelE);
        Bundle bundle2 = (Bundle) x52.a(parcelD, Bundle.CREATOR);
        parcelD.recycle();
        return bundle2;
    }
}
