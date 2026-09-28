package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class lf3 {
    public final Context a;
    public final Supplier b;

    public lf3(Context context, Supplier supplier) {
        this.a = context;
        this.b = supplier;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lf3)) {
            return false;
        }
        lf3 lf3Var = (lf3) obj;
        if (!this.a.equals(lf3Var.a)) {
            return false;
        }
        Supplier supplier = lf3Var.b;
        Supplier supplier2 = this.b;
        return supplier2 == null ? supplier == null : supplier2.equals(supplier);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        Supplier supplier = this.b;
        return (supplier == null ? 0 : supplier.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        hz.H(sb, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
