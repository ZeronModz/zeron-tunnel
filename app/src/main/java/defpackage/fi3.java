package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzoi;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class fi3 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<fi3> CREATOR = new zzoi();
    public final String a;
    public final long b;
    public final int c;

    public fi3(int i, long j, String str) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = n8.V(20293, parcel);
        n8.G(parcel, 1, this.a);
        n8.P(parcel, 2, 8);
        parcel.writeLong(this.b);
        n8.P(parcel, 3, 4);
        parcel.writeInt(this.c);
        n8.e0(iV, parcel);
    }
}
