package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzblw;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class n52 extends c12 implements zzblw {
    @Override // com.google.android.gms.internal.ads.zzblw
    public final void zze(zzblm zzblmVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        e12.e(parcelZza, zzblmVar);
        parcelZza.writeString(str);
        zzda(1, parcelZza);
    }
}
