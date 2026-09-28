package defpackage;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbks;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class c52 extends c12 implements zzbks {
    public c52(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final IObjectWrapper zzb() {
        return ec1.J(zzcZ(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final Uri zzc() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        Uri uri = (Uri) e12.b(parcelZzcZ, Uri.CREATOR);
        parcelZzcZ.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final double zzd() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        double d = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final int zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(4, zza());
        int i = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final int zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        int i = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final Map zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(6, zza());
        HashMap hashMap = parcelZzcZ.readHashMap(e12.a);
        parcelZzcZ.recycle();
        return hashMap;
    }
}
