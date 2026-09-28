package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zaj;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class nt1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<nt1> CREATOR = new zaj();
    public final int a;
    public final zat b;

    public nt1(int i, zat zatVar) {
        this.a = i;
        this.b = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = n8.V(20293, parcel);
        n8.P(parcel, 1, 4);
        parcel.writeInt(this.a);
        n8.F(parcel, 2, this.b, i);
        n8.e0(iV, parcel);
    }
}
