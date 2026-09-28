package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbxs;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class p82 extends c12 implements zzbxs {
    public p82(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzH(int i, String[] strArr, int[] iArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeStringArray(strArr);
        parcelZza.writeIntArray(iArr);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zze() throws RemoteException {
        zzda(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzf() throws RemoteException {
        zzda(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final boolean zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(11, zza());
        boolean zA = e12.a(parcelZzcZ);
        parcelZzcZ.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzh(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, bundle);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzi() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzj() throws RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzk() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzl() throws RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzm(int i, int i2, Intent intent) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        e12.c(parcelZza, intent);
        zzda(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzo(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, bundle);
        Parcel parcelZzcZ = zzcZ(6, parcelZza);
        if (parcelZzcZ.readInt() != 0) {
            bundle.readFromParcel(parcelZzcZ);
        }
        parcelZzcZ.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzp() throws RemoteException {
        zzda(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzq() throws RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzs() throws RemoteException {
        zzda(9, zza());
    }
}
