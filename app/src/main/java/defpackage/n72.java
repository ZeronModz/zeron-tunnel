package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbtw;
import com.google.android.gms.internal.ads.zzbvr;
import com.google.android.gms.internal.ads.zzbvs;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class n72 extends c12 implements zzbtt {
    @Override // com.google.android.gms.internal.ads.zzbtt
    public final zzbtw zzb(String str) throws RemoteException {
        zzbtw o72Var;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            o72Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            o72Var = iInterfaceQueryLocalInterface instanceof zzbtw ? (zzbtw) iInterfaceQueryLocalInterface : new o72(strongBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        }
        parcelZzcZ.recycle();
        return o72Var;
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final boolean zzc(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        boolean zA = e12.a(parcelZzcZ);
        parcelZzcZ.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final boolean zzd(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(4, parcelZza);
        boolean zA = e12.a(parcelZzcZ);
        parcelZzcZ.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final zzbvs zze(String str) throws RemoteException {
        zzbvs d82Var;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        int i = zzbvr.a;
        if (strongBinder == null) {
            d82Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
            d82Var = iInterfaceQueryLocalInterface instanceof zzbvs ? (zzbvs) iInterfaceQueryLocalInterface : new d82(strongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        }
        parcelZzcZ.recycle();
        return d82Var;
    }
}
