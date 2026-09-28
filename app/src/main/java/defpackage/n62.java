package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbtt;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class n62 extends c12 implements zzbpn {
    @Override // com.google.android.gms.internal.ads.zzbpn
    public final zzbpk zze(IObjectWrapper iObjectWrapper, zzbtt zzbttVar, int i, zzbph zzbphVar) throws RemoteException {
        zzbpk m62Var;
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        e12.e(parcelZza, zzbttVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        e12.e(parcelZza, zzbphVar);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            m62Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            m62Var = iInterfaceQueryLocalInterface instanceof zzbpk ? (zzbpk) iInterfaceQueryLocalInterface : new m62(strongBinder);
        }
        parcelZzcZ.recycle();
        return m62Var;
    }
}
