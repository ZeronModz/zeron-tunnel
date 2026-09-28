package defpackage;

import com.google.android.gms.internal.ads.zzhch;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class k53 extends zzhch {
    public final String a;
    public final q43 b;

    public k53(String str, q43 q43Var) {
        this.a = str;
        this.b = q43Var;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean a() {
        return this.b != q43.l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k53)) {
            return false;
        }
        k53 k53Var = (k53) obj;
        return k53Var.a.equals(this.a) && k53Var.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(k53.class, this.a, this.b);
    }

    public final String toString() {
        String str = this.b.b;
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 45 + str.length() + 1);
        hz.H(sb, "LegacyKmsAead Parameters (keyUri: ", str2, ", variant: ", str);
        sb.append(")");
        return sb.toString();
    }
}
