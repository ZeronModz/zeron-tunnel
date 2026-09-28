package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.internal.zzad;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ev1 extends cs1 implements zzad {
    @Override // com.google.android.gms.common.internal.zzad
    public final boolean zze(qk3 qk3Var, IObjectWrapper iObjectWrapper) {
        Parcel parcelE = e();
        f92.b(parcelE, qk3Var);
        f92.c(parcelE, iObjectWrapper);
        Parcel parcelC = c(5, parcelE);
        boolean z = parcelC.readInt() != 0;
        parcelC.recycle();
        return z;
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final vj3 zzf(vi3 vi3Var) {
        Parcel parcelE = e();
        f92.b(parcelE, vi3Var);
        Parcel parcelC = c(6, parcelE);
        vj3 vj3Var = (vj3) f92.a(parcelC, vj3.CREATOR);
        parcelC.recycle();
        return vj3Var;
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final boolean zzg() {
        Parcel parcelC = c(7, e());
        int i = f92.a;
        boolean z = parcelC.readInt() != 0;
        parcelC.recycle();
        return z;
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final vj3 zzh(vi3 vi3Var) {
        Parcel parcelE = e();
        f92.b(parcelE, vi3Var);
        Parcel parcelC = c(8, parcelE);
        vj3 vj3Var = (vj3) f92.a(parcelC, vj3.CREATOR);
        parcelC.recycle();
        return vj3Var;
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final boolean zzi() {
        Parcel parcelC = c(9, e());
        int i = f92.a;
        boolean z = parcelC.readInt() != 0;
        parcelC.recycle();
        return z;
    }
}
