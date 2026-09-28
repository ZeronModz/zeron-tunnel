package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzgoj;
import com.google.android.gms.internal.ads.zzgol;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class t03 extends c12 implements zzgoj {
    @Override // com.google.android.gms.internal.ads.zzgoj
    public final void zze(String str, Bundle bundle, zzgol zzgolVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        e12.c(parcelZza, bundle);
        e12.e(parcelZza, zzgolVar);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzgoj
    public final void zzf(Bundle bundle, zzgol zzgolVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, bundle);
        e12.e(parcelZza, zzgolVar);
        zzdb(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzgoj
    public final void zzg(Bundle bundle, zzgol zzgolVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, bundle);
        e12.e(parcelZza, zzgolVar);
        zzdb(3, parcelZza);
    }
}
