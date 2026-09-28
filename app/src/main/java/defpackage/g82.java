package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.zzbwi;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class g82 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<g82> CREATOR = new zzbwi();
    public final int a;
    public final int b;
    public final int c;

    public g82(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static g82 a(VersionInfo versionInfo) {
        return new g82(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof g82)) {
            g82 g82Var = (g82) obj;
            if (g82Var.c == this.c && g82Var.b == this.b && g82Var.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.a, this.b, this.c});
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        int i3 = this.c;
        StringBuilder sb = new StringBuilder(length + 1 + length2 + 1 + String.valueOf(i3).length());
        ec1.M(i, i2, ".", ".", sb);
        sb.append(i3);
        return sb.toString();
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
        n8.e0(iV, parcel);
    }
}
