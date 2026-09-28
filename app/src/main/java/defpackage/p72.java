package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzcas;
import com.google.android.gms.internal.ads.zzcaw;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class p72 extends c12 implements zzbtz {
    public p72(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zze() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzf() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzg(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzh() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzi() throws RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzj() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzk() throws RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzl(String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzm(zzblm zzblmVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, zzblmVar);
        parcelZza.writeString(str);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzn() throws RemoteException {
        zzda(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzo() throws RemoteException {
        zzda(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzp(zzcas zzcasVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzq() throws RemoteException {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzr(zzcaw zzcawVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, zzcawVar);
        zzda(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzs(int i) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzt() throws RemoteException {
        zzda(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzu() throws RemoteException {
        zzda(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzv(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzw(int i, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        zzda(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzx(zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, zzeVar);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzy(zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, zzeVar);
        zzda(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzz() throws RemoteException {
        zzda(25, zza());
    }
}
