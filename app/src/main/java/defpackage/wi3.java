package defpackage;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class wi3 extends cs1 {
    public final IObjectWrapper h(a aVar, String str, int i) {
        Parcel parcelE = e();
        f92.c(parcelE, aVar);
        parcelE.writeString(str);
        parcelE.writeInt(i);
        return ec1.J(c(2, parcelE));
    }

    public final IObjectWrapper i(a aVar, String str, int i) {
        Parcel parcelE = e();
        f92.c(parcelE, aVar);
        parcelE.writeString(str);
        parcelE.writeInt(i);
        return ec1.J(c(4, parcelE));
    }

    public final IObjectWrapper j(a aVar, String str, int i, a aVar2) {
        Parcel parcelE = e();
        f92.c(parcelE, aVar);
        parcelE.writeString(str);
        parcelE.writeInt(i);
        f92.c(parcelE, aVar2);
        return ec1.J(c(8, parcelE));
    }
}
