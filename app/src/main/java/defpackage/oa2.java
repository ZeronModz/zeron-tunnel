package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzcdd;
import com.google.android.gms.internal.ads.zzcdg;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class oa2 extends c12 implements zzcdg {
    @Override // com.google.android.gms.internal.ads.zzcdg
    public final zzcdd zze(IObjectWrapper iObjectWrapper, zzbtt zzbttVar, int i) throws RemoteException {
        zzcdd na2Var;
        Parcel parcelZza = zza();
        e12.e(parcelZza, iObjectWrapper);
        e12.e(parcelZza, zzbttVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            na2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            na2Var = iInterfaceQueryLocalInterface instanceof zzcdd ? (zzcdd) iInterfaceQueryLocalInterface : new na2(strongBinder);
        }
        parcelZzcZ.recycle();
        return na2Var;
    }
}
