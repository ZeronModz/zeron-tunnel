package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbmj;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class t52 extends c12 implements zzbmj {
    @Override // com.google.android.gms.internal.ads.zzbmj
    public final void zze(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final void zzf() throws RemoteException {
        zzda(2, zza());
    }
}
