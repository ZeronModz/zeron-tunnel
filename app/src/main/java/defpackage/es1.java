package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zab;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class es1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<es1> CREATOR = new zab();
    public final int a;
    public final StringToIntConverter b;

    public es1(StringToIntConverter stringToIntConverter) {
        this.a = 1;
        this.b = stringToIntConverter;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = n8.V(20293, parcel);
        n8.P(parcel, 1, 4);
        parcel.writeInt(this.a);
        n8.F(parcel, 2, this.b, i);
        n8.e0(iV, parcel);
    }

    public es1(int i, StringToIntConverter stringToIntConverter) {
        this.a = i;
        this.b = stringToIntConverter;
    }
}
