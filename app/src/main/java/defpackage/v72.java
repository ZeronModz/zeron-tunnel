package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzec;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbkk;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzbks;
import com.google.android.gms.internal.ads.zzbui;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class v72 extends c12 implements zzbui {
    public v72(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final float zzA() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(24, zza());
        float f = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final float zzB() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(25, zza());
        float f = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzC() throws RemoteException {
        zzda(26, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final String zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final List zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayList = parcelZzcZ.readArrayList(e12.a);
        parcelZzcZ.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final String zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final zzbks zzh() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        zzbks zzbksVarA = zzbkr.a(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbksVarA;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final String zzi() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final String zzj() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(7, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final double zzk() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(8, zza());
        double d = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final String zzl() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final String zzm() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(10, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final zzed zzn() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(11, zza());
        zzed zzedVarZzb = zzec.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzedVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final zzbkl zzo() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(12, zza());
        zzbkl zzbklVarA = zzbkk.a(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbklVarA;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final IObjectWrapper zzp() {
        return ec1.J(zzcZ(13, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final IObjectWrapper zzq() {
        return ec1.J(zzcZ(14, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final IObjectWrapper zzr() {
        return ec1.J(zzcZ(15, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final Bundle zzs() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(16, zza());
        Bundle bundle = (Bundle) e12.b(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final boolean zzt() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(17, zza());
        boolean zA = e12.a(parcelZzcZ);
        parcelZzcZ.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final boolean zzu() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(18, zza());
        boolean zA = e12.a(parcelZzcZ);
        parcelZzcZ.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzv() throws RemoteException {
        zzda(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        zzda(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzx(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        e12.e(parcelZza, iObjectWrapper2);
        e12.e(parcelZza, iObjectWrapper3);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzy(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        zzda(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final float zzz() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(23, zza());
        float f = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f;
    }
}
