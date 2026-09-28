package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.signin.internal.zal;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class pt1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<pt1> CREATOR = new zal();
    public final int a;
    public final ConnectionResult b;
    public final d c;

    public pt1(int i, ConnectionResult connectionResult, d dVar) {
        this.a = i;
        this.b = connectionResult;
        this.c = dVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = n8.V(20293, parcel);
        n8.P(parcel, 1, 4);
        parcel.writeInt(this.a);
        n8.F(parcel, 2, this.b, i);
        n8.F(parcel, 3, this.c, i);
        n8.e0(iV, parcel);
    }
}
