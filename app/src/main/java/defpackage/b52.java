package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzec;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbkp;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class b52 extends c12 implements zzbkp {
    public b52(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final float zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        float f = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final IObjectWrapper zzg() {
        return ec1.J(zzcZ(4, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final float zzh() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        float f = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final float zzi() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(6, zza());
        float f = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final zzed zzj() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(7, zza());
        zzed zzedVarZzb = zzec.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzedVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final boolean zzk() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(8, zza());
        boolean zA = e12.a(parcelZzcZ);
        parcelZzcZ.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final boolean zzl() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(10, zza());
        boolean zA = e12.a(parcelZzcZ);
        parcelZzcZ.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final void zzm(q52 q52Var) {
        throw null;
    }
}
