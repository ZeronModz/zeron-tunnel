package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzba;
import com.google.android.gms.internal.ads.zzbzl;
import com.google.android.gms.internal.ads.zzbzu;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class c92 extends c12 implements zzbzl {
    public c92(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, parcelFileDescriptor);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzf(zzba zzbaVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, zzbaVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbzu zzbzuVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, parcelFileDescriptor);
        e12.c(parcelZza, zzbzuVar);
        zzda(3, parcelZza);
    }
}
