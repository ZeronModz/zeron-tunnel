package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.zzbpu;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class p62 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<p62> CREATOR = new zzbpu();
    public final String a;
    public final String[] b;
    public final String[] c;

    public p62(String str, String[] strArr, String[] strArr2) {
        this.a = str;
        this.b = strArr;
        this.c = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = n8.V(20293, parcel);
        n8.G(parcel, 1, this.a);
        n8.H(parcel, 2, this.b);
        n8.H(parcel, 3, this.c);
        n8.e0(iV, parcel);
    }
}
