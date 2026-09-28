package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.b1;
import com.google.android.gms.internal.ads.zzfwn;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pw2 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<pw2> CREATOR = new zzfwn();
    public final int a;
    public b1 b = null;
    public byte[] c;

    public pw2(int i, byte[] bArr) {
        this.a = i;
        this.c = bArr;
        zzb();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = n8.V(20293, parcel);
        n8.P(parcel, 1, 4);
        parcel.writeInt(this.a);
        byte[] bArrA = this.c;
        if (bArrA == null) {
            bArrA = this.b.a();
        }
        n8.B(parcel, 2, bArrA);
        n8.e0(iV, parcel);
    }

    public final void zzb() {
        b1 b1Var = this.b;
        if (b1Var != null || this.c == null) {
            if (b1Var == null || this.c != null) {
                if (b1Var != null && this.c != null) {
                    u7.p("Invalid internal representation - full");
                } else if (b1Var == null && this.c == null) {
                    u7.p("Invalid internal representation - empty");
                } else {
                    u7.p("Impossible");
                }
            }
        }
    }
}
