package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzl;
import com.google.android.gms.internal.ads.zzbzu;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class b92 extends c12 implements zzbzh {
    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zze(zzbzu zzbzuVar, zzbzl zzbzlVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, zzbzuVar);
        e12.e(parcelZza, zzbzlVar);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzf(zzbzu zzbzuVar, zzbzl zzbzlVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, zzbzuVar);
        e12.e(parcelZza, zzbzlVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzg(zzbzu zzbzuVar, zzbzl zzbzlVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, zzbzuVar);
        e12.e(parcelZza, zzbzlVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzh(String str, zzbzl zzbzlVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        e12.e(parcelZza, zzbzlVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzi(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzj(zzbzd zzbzdVar, d92 d92Var) {
        throw null;
    }
}
