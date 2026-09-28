package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbcx;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class f12 extends c12 implements zzbcx {
    @Override // com.google.android.gms.internal.ads.zzbcx
    public final Bundle zze(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, bundle);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        Bundle bundle2 = (Bundle) e12.b(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle2;
    }
}
