package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzcar;
import com.google.android.gms.internal.ads.zzcas;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class v92 extends c12 implements zzcar {
    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzf(IObjectWrapper iObjectWrapper, int i) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzk(IObjectWrapper iObjectWrapper, zzcas zzcasVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        e12.c(parcelZza, zzcasVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzm(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        parcelZza.writeInt(i);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzn(IObjectWrapper iObjectWrapper) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        zzda(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcar
    public final void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        zzda(13, parcelZza);
    }
}
