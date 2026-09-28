package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzec;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzbqk;
import com.google.android.gms.internal.ads.zzbtw;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbuc;
import com.google.android.gms.internal.ads.zzbui;
import com.google.android.gms.internal.ads.zzcar;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class o72 extends c12 implements zzbtw {
    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzA(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        ClassLoader classLoader = e12.a;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzed zzB() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(26, zza());
        zzed zzedVarZzb = zzec.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzedVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzbui zzC() throws RemoteException {
        zzbui v72Var;
        Parcel parcelZzcZ = zzcZ(27, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            v72Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            v72Var = iInterfaceQueryLocalInterface instanceof zzbui ? (zzbui) iInterfaceQueryLocalInterface : new v72(strongBinder);
        }
        parcelZzcZ.recycle();
        return v72Var;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzD(IObjectWrapper iObjectWrapper, zzm zzmVar, String str, zzbtz zzbtzVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        e12.c(parcelZza, zzmVar);
        parcelZza.writeString(str);
        e12.e(parcelZza, zzbtzVar);
        zzda(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzE(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        zzda(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzF(IObjectWrapper iObjectWrapper, zzbqk zzbqkVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        e12.e(parcelZza, zzbqkVar);
        parcelZza.writeTypedList(list);
        zzda(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzG(IObjectWrapper iObjectWrapper, zzm zzmVar, String str, zzbtz zzbtzVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        e12.c(parcelZza, zzmVar);
        parcelZza.writeString(str);
        e12.e(parcelZza, zzbtzVar);
        zzda(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final g82 zzH() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(33, zza());
        g82 g82Var = (g82) e12.b(parcelZzcZ, g82.CREATOR);
        parcelZzcZ.recycle();
        return g82Var;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final g82 zzI() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(34, zza());
        g82 g82Var = (g82) e12.b(parcelZzcZ, g82.CREATOR);
        parcelZzcZ.recycle();
        return g82Var;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzJ(IObjectWrapper iObjectWrapper, zzr zzrVar, zzm zzmVar, String str, String str2, zzbtz zzbtzVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        e12.c(parcelZza, zzrVar);
        e12.c(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        e12.e(parcelZza, zzbtzVar);
        zzda(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzbuc zzK() throws RemoteException {
        zzbuc r72Var;
        Parcel parcelZzcZ = zzcZ(36, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            r72Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            r72Var = iInterfaceQueryLocalInterface instanceof zzbuc ? (zzbuc) iInterfaceQueryLocalInterface : new r72(strongBinder);
        }
        parcelZzcZ.recycle();
        return r72Var;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzL(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        zzda(37, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzM(IObjectWrapper iObjectWrapper, zzm zzmVar, String str, zzbtz zzbtzVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        e12.c(parcelZza, zzmVar);
        parcelZza.writeString(str);
        e12.e(parcelZza, zzbtzVar);
        zzda(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzN(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        zzda(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final t72 zzO() throws RemoteException {
        t72 t72Var;
        Parcel parcelZzcZ = zzcZ(15, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            t72Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            t72Var = iInterfaceQueryLocalInterface instanceof t72 ? (t72) iInterfaceQueryLocalInterface : new t72(strongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        }
        parcelZzcZ.recycle();
        return t72Var;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final u72 zzP() throws RemoteException {
        u72 u72Var;
        Parcel parcelZzcZ = zzcZ(16, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            u72Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            u72Var = iInterfaceQueryLocalInterface instanceof u72 ? (u72) iInterfaceQueryLocalInterface : new u72(strongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
        }
        parcelZzcZ.recycle();
        return u72Var;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zze(IObjectWrapper iObjectWrapper, zzr zzrVar, zzm zzmVar, String str, zzbtz zzbtzVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final IObjectWrapper zzf() {
        return ec1.J(zzcZ(2, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzg(IObjectWrapper iObjectWrapper, zzm zzmVar, String str, zzbtz zzbtzVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzh() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzi() throws RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzj(IObjectWrapper iObjectWrapper, zzr zzrVar, zzm zzmVar, String str, String str2, zzbtz zzbtzVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        e12.c(parcelZza, zzrVar);
        e12.c(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        e12.e(parcelZza, zzbtzVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzk(IObjectWrapper iObjectWrapper, zzm zzmVar, String str, String str2, zzbtz zzbtzVar) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        e12.c(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        e12.e(parcelZza, zzbtzVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzl() throws RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzm() throws RemoteException {
        zzda(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzn(IObjectWrapper iObjectWrapper, zzm zzmVar, String str, zzcar zzcarVar, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        e12.c(parcelZza, zzmVar);
        parcelZza.writeString(null);
        e12.e(parcelZza, zzcarVar);
        parcelZza.writeString(str2);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzo(zzm zzmVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        e12.c(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzda(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzp() throws RemoteException {
        zzda(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final boolean zzq() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(13, zza());
        boolean zA = e12.a(parcelZzcZ);
        parcelZzcZ.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzr(IObjectWrapper iObjectWrapper, zzm zzmVar, String str, String str2, zzbtz zzbtzVar, zzbkh zzbkhVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        e12.c(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        e12.e(parcelZza, zzbtzVar);
        e12.c(parcelZza, zzbkhVar);
        parcelZza.writeStringList(list);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final Bundle zzs() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final Bundle zzt() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final Bundle zzu() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzv(zzm zzmVar, String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final boolean zzx() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(22, zza());
        boolean zA = e12.a(parcelZzcZ);
        parcelZzcZ.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzy(IObjectWrapper iObjectWrapper, zzcar zzcarVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        e12.e(parcelZza, zzcarVar);
        parcelZza.writeStringList(list);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzblm zzz() {
        throw null;
    }
}
