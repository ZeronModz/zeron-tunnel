package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zzs;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class vj3 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<vj3> CREATOR = new zzs();
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;

    public vj3(boolean z, String str, int i, int i2, long j) {
        this.a = z;
        this.b = str;
        this.c = mu.B(i) - 1;
        this.d = mu.x(i2) - 1;
        this.e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = n8.V(20293, parcel);
        n8.P(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        n8.G(parcel, 2, this.b);
        n8.P(parcel, 3, 4);
        parcel.writeInt(this.c);
        n8.P(parcel, 4, 4);
        parcel.writeInt(this.d);
        n8.P(parcel, 5, 8);
        parcel.writeLong(this.e);
        n8.e0(iV, parcel);
    }
}
