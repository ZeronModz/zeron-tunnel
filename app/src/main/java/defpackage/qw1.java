package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzag;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class qw1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<qw1> CREATOR = new zzag();
    public final long a;
    public final int b;
    public final long c;

    public qw1(long j, int i, long j2) {
        this.a = j;
        this.b = i;
        this.c = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = n8.V(20293, parcel);
        n8.P(parcel, 1, 8);
        parcel.writeLong(this.a);
        n8.P(parcel, 2, 4);
        parcel.writeInt(this.b);
        n8.P(parcel, 3, 8);
        parcel.writeLong(this.c);
        n8.e0(iV, parcel);
    }
}
