package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.zae;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ys1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ys1> CREATOR = new zae();
    public final int a;
    public final String b;
    public final int c;

    public ys1(String str, int i) {
        this.a = 1;
        this.b = str;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = n8.V(20293, parcel);
        n8.P(parcel, 1, 4);
        parcel.writeInt(this.a);
        n8.G(parcel, 2, this.b);
        n8.P(parcel, 3, 4);
        parcel.writeInt(this.c);
        n8.e0(iV, parcel);
    }

    public ys1(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }
}
