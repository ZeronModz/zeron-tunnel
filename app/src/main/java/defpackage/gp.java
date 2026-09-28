package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.zzc;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<gp> CREATOR;
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    static {
        new Object() { // from class: com.google.android.gms.common.api.ComplianceOptions$Builder
        };
        new gp(-1, -1, 0, true);
        CREATOR = new zzc();
    }

    public gp(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gp)) {
            return false;
        }
        gp gpVar = (gp) obj;
        return this.a == gpVar.a && this.b == gpVar.b && this.c == gpVar.c && this.d == gpVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        int i3 = this.c;
        int length3 = String.valueOf(i3).length();
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z).length() + 1);
        hz.C(i, i2, "ComplianceOptions{callerProductId=", ", dataOwnerProductId=", sb);
        sb.append(", processingReason=");
        sb.append(i3);
        sb.append(", isUserData=");
        sb.append(z);
        sb.append("}");
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
        n8.P(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        n8.e0(iV, parcel);
    }
}
