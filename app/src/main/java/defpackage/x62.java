package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbqv;
import com.google.android.gms.internal.ads.zzbrb;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class x62 extends c12 implements zzbrb {
    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zze(zzbqv zzbqvVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, zzbqvVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zzf(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zzg(zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }
}
