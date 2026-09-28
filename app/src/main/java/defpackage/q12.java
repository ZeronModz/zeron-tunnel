package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzbfa;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class q12 extends c12 implements zzbfa {
    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzb(zzbex zzbexVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, zzbexVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzc(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzd(zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }
}
