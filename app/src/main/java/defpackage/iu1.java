package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zay;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class iu1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<iu1> CREATOR = new zay();
    public final int a;
    public final int b;
    public final int c;
    public final Scope[] d;

    public iu1(int i, int i2, int i3, Scope[] scopeArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = n8.V(20293, parcel);
        n8.P(parcel, 1, 4);
        parcel.writeInt(this.a);
        n8.P(parcel, 2, 4);
        parcel.writeInt(this.b);
        n8.P(parcel, 3, 4);
        parcel.writeInt(this.c);
        n8.J(parcel, 4, this.d, i);
        n8.e0(iV, parcel);
    }
}
