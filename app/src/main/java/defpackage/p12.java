package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzdz;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzbfe;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class p12 extends c12 implements zzbex {
    public p12(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final zzbx zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzf(IObjectWrapper iObjectWrapper, zzbfe zzbfeVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        e12.e(parcelZza, zzbfeVar);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final zzea zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        zzea zzeaVarZzb = zzdz.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzh(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        ClassLoader classLoader = e12.a;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzi(zzdt zzdtVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, zzdtVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final String zzj() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(8, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final long zzk() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        long j = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzl(long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzda(10, parcelZza);
    }
}
