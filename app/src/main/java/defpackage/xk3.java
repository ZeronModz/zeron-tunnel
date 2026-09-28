package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xk3 extends cs1 implements zzx {
    @Override // com.google.android.gms.common.internal.zzx
    public final IObjectWrapper zzd() {
        return ec1.J(c(1, e()));
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final int zze() {
        Parcel parcelC = c(2, e());
        int i = parcelC.readInt();
        parcelC.recycle();
        return i;
    }
}
