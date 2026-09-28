package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbui;
import com.google.android.gms.internal.ads.zzbvm;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class b82 extends c12 implements zzbvm {
    public b82(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zze(zzbui zzbuiVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, zzbuiVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzf(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString("Adapter returned null.");
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzg(zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }
}
