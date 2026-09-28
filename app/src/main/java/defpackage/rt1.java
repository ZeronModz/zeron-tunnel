package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.common.server.response.zap;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class rt1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<rt1> CREATOR = new zap();
    public final int a;
    public final String b;
    public final ArrayList c;

    public rt1(String str, Map map) {
        ArrayList arrayList;
        this.a = 1;
        this.b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new ut1(str2, (a) map.get(str2)));
            }
        }
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = n8.V(20293, parcel);
        n8.P(parcel, 1, 4);
        parcel.writeInt(this.a);
        n8.G(parcel, 2, this.b);
        n8.K(parcel, 3, this.c);
        n8.e0(iV, parcel);
    }

    public rt1(int i, String str, ArrayList arrayList) {
        this.a = i;
        this.b = str;
        this.c = arrayList;
    }
}
