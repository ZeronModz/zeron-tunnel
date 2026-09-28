package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbxl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class m82 extends c12 implements zzbxl {
    public m82(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zze(Intent intent) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, intent);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzf(IObjectWrapper iObjectWrapper, String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzg() throws RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzi(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeStringArray(strArr);
        parcelZza.writeIntArray(iArr);
        e12.e(parcelZza, iObjectWrapper);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzj(IObjectWrapper iObjectWrapper, zza zzaVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        e12.c(parcelZza, zzaVar);
        zzda(6, parcelZza);
    }
}
