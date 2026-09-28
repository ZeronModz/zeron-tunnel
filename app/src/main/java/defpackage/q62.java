package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.zzbpw;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class q62 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<q62> CREATOR = new zzbpw();
    public final boolean a;
    public final String b;
    public final int c;
    public final byte[] d;
    public final String[] e;
    public final String[] f;
    public final boolean g;
    public final long h;

    public q62(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.a = z;
        this.b = str;
        this.c = i;
        this.d = bArr;
        this.e = strArr;
        this.f = strArr2;
        this.g = z2;
        this.h = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = n8.V(20293, parcel);
        n8.P(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        n8.G(parcel, 2, this.b);
        n8.P(parcel, 3, 4);
        parcel.writeInt(this.c);
        n8.B(parcel, 4, this.d);
        n8.H(parcel, 5, this.e);
        n8.H(parcel, 6, this.f);
        n8.P(parcel, 7, 4);
        parcel.writeInt(this.g ? 1 : 0);
        n8.P(parcel, 8, 8);
        parcel.writeLong(this.h);
        n8.e0(iV, parcel);
    }
}
