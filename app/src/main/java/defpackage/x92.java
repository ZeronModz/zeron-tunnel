package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzdz;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcbc;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcbn;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class x92 extends c12 implements zzcaz {
    public x92(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzc(zzm zzmVar, zzcbg zzcbgVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, zzmVar);
        e12.e(parcelZza, zzcbgVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzd(zzm zzmVar, zzcbg zzcbgVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, zzmVar);
        e12.e(parcelZza, zzcbgVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zze(zzcbc zzcbcVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, zzcbcVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzf(zzdq zzdqVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, zzdqVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final Bundle zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        Bundle bundle = (Bundle) e12.b(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzh(zzcbn zzcbnVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, zzcbnVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final boolean zzi() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final String zzj() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzk(IObjectWrapper iObjectWrapper, boolean z) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final zzcaw zzl() throws RemoteException {
        zzcaw w92Var;
        Parcel parcelZzcZ = zzcZ(11, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            w92Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            w92Var = iInterfaceQueryLocalInterface instanceof zzcaw ? (zzcaw) iInterfaceQueryLocalInterface : new w92(strongBinder);
        }
        parcelZzcZ.recycle();
        return w92Var;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final zzea zzm() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(12, zza());
        zzea zzeaVarZzb = zzdz.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final String zzn() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(16, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzo(zzdt zzdtVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, zzdtVar);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzp(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        ClassLoader classLoader = e12.a;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final long zzq() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(17, zza());
        long j = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzr(long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzda(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzs(ba2 ba2Var) {
        throw null;
    }
}
