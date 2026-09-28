package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzec;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbvd;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzbvm;
import com.google.android.gms.internal.ads.zzbvp;
import com.google.android.gms.internal.ads.zzbvs;
import com.google.android.gms.internal.ads.zzbvv;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class d82 extends c12 implements zzbvs {
    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zze(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzr zzrVar, zzbvv zzbvvVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        e12.c(parcelZza, bundle);
        e12.c(parcelZza, bundle2);
        e12.c(parcelZza, zzrVar);
        e12.e(parcelZza, zzbvvVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final g82 zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        g82 g82Var = (g82) e12.b(parcelZzcZ, g82.CREATOR);
        parcelZzcZ.recycle();
        return g82Var;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final g82 zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        g82 g82Var = (g82) e12.b(parcelZzcZ, g82.CREATOR);
        parcelZzcZ.recycle();
        return g82Var;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final zzed zzh() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        zzed zzedVarZzb = zzec.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzedVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzi(String str, String str2, zzm zzmVar, IObjectWrapper iObjectWrapper, zzbvg zzbvgVar, zzbtz zzbtzVar, zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        e12.c(parcelZza, zzmVar);
        e12.e(parcelZza, iObjectWrapper);
        e12.e(parcelZza, zzbvgVar);
        e12.e(parcelZza, zzbtzVar);
        e12.c(parcelZza, zzrVar);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzj(String str, String str2, zzm zzmVar, IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, zzbtz zzbtzVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        e12.c(parcelZza, zzmVar);
        e12.e(parcelZza, iObjectWrapper);
        e12.e(parcelZza, zzbvjVar);
        e12.e(parcelZza, zzbtzVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final boolean zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        Parcel parcelZzcZ = zzcZ(15, parcelZza);
        boolean zA = e12.a(parcelZzcZ);
        parcelZzcZ.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzl(String str, String str2, zzm zzmVar, IObjectWrapper iObjectWrapper, zzbvp zzbvpVar, zzbtz zzbtzVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        e12.c(parcelZza, zzmVar);
        e12.e(parcelZza, iObjectWrapper);
        e12.e(parcelZza, zzbvpVar);
        e12.e(parcelZza, zzbtzVar);
        zzda(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final boolean zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        Parcel parcelZzcZ = zzcZ(17, parcelZza);
        boolean zA = e12.a(parcelZzcZ);
        parcelZzcZ.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzn(String str, String str2, zzm zzmVar, IObjectWrapper iObjectWrapper, zzbvm zzbvmVar, zzbtz zzbtzVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        e12.c(parcelZza, zzmVar);
        e12.e(parcelZza, iObjectWrapper);
        e12.e(parcelZza, zzbvmVar);
        e12.e(parcelZza, zzbtzVar);
        zzda(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzo(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzp(String str, String str2, zzm zzmVar, IObjectWrapper iObjectWrapper, zzbvp zzbvpVar, zzbtz zzbtzVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        e12.c(parcelZza, zzmVar);
        e12.e(parcelZza, iObjectWrapper);
        e12.e(parcelZza, zzbvpVar);
        e12.e(parcelZza, zzbtzVar);
        zzda(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzq(String str, String str2, zzm zzmVar, IObjectWrapper iObjectWrapper, zzbvg zzbvgVar, zzbtz zzbtzVar, zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        e12.c(parcelZza, zzmVar);
        e12.e(parcelZza, iObjectWrapper);
        e12.e(parcelZza, zzbvgVar);
        e12.e(parcelZza, zzbtzVar);
        e12.c(parcelZza, zzrVar);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzr(String str, String str2, zzm zzmVar, IObjectWrapper iObjectWrapper, zzbvm zzbvmVar, zzbtz zzbtzVar, zzbkh zzbkhVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        e12.c(parcelZza, zzmVar);
        e12.e(parcelZza, iObjectWrapper);
        e12.e(parcelZza, zzbvmVar);
        e12.e(parcelZza, zzbtzVar);
        e12.c(parcelZza, zzbkhVar);
        zzda(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzs(String str, String str2, zzm zzmVar, IObjectWrapper iObjectWrapper, zzbvd zzbvdVar, zzbtz zzbtzVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        e12.c(parcelZza, zzmVar);
        e12.e(parcelZza, iObjectWrapper);
        e12.e(parcelZza, zzbvdVar);
        e12.e(parcelZza, zzbtzVar);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        Parcel parcelZzcZ = zzcZ(24, parcelZza);
        boolean zA = e12.a(parcelZzcZ);
        parcelZzcZ.recycle();
        return zA;
    }
}
