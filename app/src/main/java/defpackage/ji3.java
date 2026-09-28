package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzon;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ji3 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ji3> CREATOR = new zzon();
    public final long a;
    public byte[] b;
    public final String c;
    public final Bundle d;
    public final int e;
    public final long f;
    public String g;

    public ji3(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.a = j;
        this.b = bArr;
        this.c = str;
        this.d = bundle;
        this.e = i;
        this.f = j2;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = n8.V(20293, parcel);
        n8.P(parcel, 1, 8);
        parcel.writeLong(this.a);
        n8.B(parcel, 2, this.b);
        n8.G(parcel, 3, this.c);
        n8.A(parcel, 4, this.d);
        n8.P(parcel, 5, 4);
        parcel.writeInt(this.e);
        n8.P(parcel, 6, 8);
        parcel.writeLong(this.f);
        n8.G(parcel, 7, this.g);
        n8.e0(iV, parcel);
    }
}
