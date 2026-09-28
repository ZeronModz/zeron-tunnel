package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.IGmsCallbacks;
import com.google.android.gms.common.internal.zzj;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ml3 extends cs1 implements IGmsCallbacks {
    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) {
        Parcel parcelE = e();
        parcelE.writeInt(i);
        parcelE.writeStrongBinder(iBinder);
        f92.b(parcelE, bundle);
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.b.transact(1, parcelE, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcelE.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int i, Bundle bundle) {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int i, IBinder iBinder, zzj zzjVar) {
        throw null;
    }
}
