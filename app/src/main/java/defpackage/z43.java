package defpackage;

import com.google.android.gms.internal.ads.zzhch;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class z43 extends zzhch {
    public final int a;
    public final q43 b;

    public /* synthetic */ z43(int i, q43 q43Var) {
        this.a = i;
        this.b = q43Var;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean a() {
        return this.b != q43.j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z43)) {
            return false;
        }
        z43 z43Var = (z43) obj;
        return z43Var.a == this.a && z43Var.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(z43.class, Integer.valueOf(this.a), 12, 16, this.b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        int length = strValueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i = this.a;
        StringBuilder sb = new StringBuilder(vh.b(length + 30 + length2 + 10 + length3, 15, String.valueOf(i).length(), 10));
        sb.append("AesGcm Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", 12-byte IV, 16-byte tag, and ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }
}
