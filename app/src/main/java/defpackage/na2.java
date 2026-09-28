package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzcda;
import com.google.android.gms.internal.ads.zzcdd;
import com.google.android.gms.internal.ads.zzcdh;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class na2 extends c12 implements zzcdd {
    public na2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zze(IObjectWrapper iObjectWrapper, zzcdh zzcdhVar, zzcda zzcdaVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        e12.c(parcelZza, zzcdhVar);
        e12.e(parcelZza, zzcdaVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzf(IObjectWrapper iObjectWrapper) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzi(zzbyk zzbykVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        e12.e(parcelZza, iObjectWrapper2);
        parcelZza.writeString(str);
        e12.e(parcelZza, iObjectWrapper3);
        return ec1.J(zzcZ(11, parcelZza));
    }
}
