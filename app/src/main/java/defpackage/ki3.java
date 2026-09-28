package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzls;
import com.google.android.gms.measurement.internal.zzop;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ki3 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ki3> CREATOR = new zzop();
    public final List a;

    public ki3(ArrayList arrayList) {
        this.a = arrayList;
    }

    public static ki3 a(zzls... zzlsVarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(zzlsVarArr[0].zza()));
        return new ki3(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = n8.V(20293, parcel);
        n8.D(parcel, 1, this.a);
        n8.e0(iV, parcel);
    }
}
