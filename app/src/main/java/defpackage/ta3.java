package defpackage;

import com.google.android.gms.internal.ads.zzhuu;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ta3 extends zzhuu {
    public final r43 a;
    public final sa3 b;
    public final q43 c;
    public final e43 d;

    public /* synthetic */ ta3(r43 r43Var, sa3 sa3Var, q43 q43Var, e43 e43Var) {
        this.a = r43Var;
        this.b = sa3Var;
        this.c = q43Var;
        this.d = e43Var;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean a() {
        return this.d != e43.u;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ta3)) {
            return false;
        }
        ta3 ta3Var = (ta3) obj;
        return ta3Var.a == this.a && ta3Var.b == this.b && ta3Var.c == this.c && ta3Var.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(ta3.class, this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        String str = this.d.b;
        int length = str.length();
        String str2 = this.c.b;
        int length2 = str2.length();
        String str3 = this.a.b;
        int length3 = str3.length();
        String str4 = this.b.a;
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + str4.length() + 1);
        hz.H(sb, "ECDSA Parameters (variant: ", str, ", hashType: ", str2);
        hz.H(sb, ", encoding: ", str3, ", curve: ", str4);
        sb.append(")");
        return sb.toString();
    }
}
