package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiMetadata$Builder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class t5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<t5> CREATOR = nu1.a;
    public static final t5 d;
    public final gp a;
    public final boolean b;
    public boolean c;

    static {
        ApiMetadata$Builder apiMetadata$Builder = new ApiMetadata$Builder();
        t5 t5Var = new t5(null, false);
        t5Var.c = apiMetadata$Builder.a;
        d = t5Var;
        ApiMetadata$Builder apiMetadata$Builder2 = new ApiMetadata$Builder();
        apiMetadata$Builder2.a = true;
        new t5(null, false).c = apiMetadata$Builder2.a;
    }

    public t5(gp gpVar, boolean z) {
        this.a = gpVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) obj;
        return dn0.p(this.a, t5Var.a) && this.c == t5Var.c && this.b == t5Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.c), Boolean.valueOf(this.b)});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        return vh.t(new StringBuilder(strValueOf.length() + 31), "ApiMetadata(complianceOptions=", strValueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iV = n8.V(20293, parcel);
        n8.F(parcel, 1, this.a, i);
        n8.P(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        n8.e0(iV, parcel);
    }
}
