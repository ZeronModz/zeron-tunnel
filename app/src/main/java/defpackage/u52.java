package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzdz;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzec;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbkp;
import com.google.android.gms.internal.ads.zzbks;
import com.google.android.gms.internal.ads.zzbmj;
import com.google.android.gms.internal.ads.zzbmm;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class u52 extends c12 implements zzbmm {
    @Override // com.google.android.gms.internal.ads.zzbmm
    public final boolean zzA() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(24, zza());
        boolean zA = e12.a(parcelZzcZ);
        parcelZzcZ.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzB(zzdj zzdjVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, zzdjVar);
        zzda(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzC(zzdf zzdfVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, zzdfVar);
        zzda(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzD() throws RemoteException {
        zzda(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzE() throws RemoteException {
        zzda(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final zzbkp zzF() throws RemoteException {
        zzbkp b52Var;
        Parcel parcelZzcZ = zzcZ(29, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            b52Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            b52Var = iInterfaceQueryLocalInterface instanceof zzbkp ? (zzbkp) iInterfaceQueryLocalInterface : new b52(strongBinder);
        }
        parcelZzcZ.recycle();
        return b52Var;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final boolean zzG() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(30, zza());
        boolean zA = e12.a(parcelZzcZ);
        parcelZzcZ.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final zzea zzH() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(31, zza());
        zzea zzeaVarZzb = zzdz.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzI(zzdt zzdtVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, zzdtVar);
        zzda(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzJ(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, bundle);
        zzda(33, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final long zzK() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(34, zza());
        long j = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzL(long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzda(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final List zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayList = parcelZzcZ.readArrayList(e12.a);
        parcelZzcZ.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final zzbks zzh() throws RemoteException {
        zzbks c52Var;
        Parcel parcelZzcZ = zzcZ(5, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            c52Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            c52Var = iInterfaceQueryLocalInterface instanceof zzbks ? (zzbks) iInterfaceQueryLocalInterface : new c52(strongBinder);
        }
        parcelZzcZ.recycle();
        return c52Var;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzi() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzj() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(7, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final double zzk() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(8, zza());
        double d = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzl() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzm() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(10, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final zzed zzn() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(11, zza());
        zzed zzedVarZzb = zzec.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzedVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzo() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzp() throws RemoteException {
        zzda(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final zzbkl zzq() throws RemoteException {
        zzbkl a52Var;
        Parcel parcelZzcZ = zzcZ(14, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            a52Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            a52Var = iInterfaceQueryLocalInterface instanceof zzbkl ? (zzbkl) iInterfaceQueryLocalInterface : new a52(strongBinder);
        }
        parcelZzcZ.recycle();
        return a52Var;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzr(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, bundle);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final boolean zzs(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, bundle);
        Parcel parcelZzcZ = zzcZ(16, parcelZza);
        boolean zA = e12.a(parcelZzcZ);
        parcelZzcZ.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzt(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, bundle);
        zzda(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final IObjectWrapper zzu() {
        return ec1.J(zzcZ(18, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final IObjectWrapper zzv() {
        return ec1.J(zzcZ(19, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final Bundle zzw() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(20, zza());
        Bundle bundle = (Bundle) e12.b(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzx(zzbmj zzbmjVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, zzbmjVar);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzy() throws RemoteException {
        zzda(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final List zzz() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(23, zza());
        ArrayList arrayList = parcelZzcZ.readArrayList(e12.a);
        parcelZzcZ.recycle();
        return arrayList;
    }
}
