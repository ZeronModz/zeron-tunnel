package defpackage;

import com.google.android.gms.internal.ads.zzhch;
import java.util.Objects;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class u53 extends zzhch {
    public final q43 a;
    public final int b;

    public u53(int i, q43 q43Var) {
        this.a = q43Var;
        this.b = i;
    }

    public static u53 b(int i, q43 q43Var) throws GeneralSecurityException {
        if (i >= 8 && i <= 12) {
            return new u53(i, q43Var);
        }
        zg1.m("Salt size must be between 8 and 12 bytes");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean a() {
        return this.a != q43.n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u53)) {
            return false;
        }
        u53 u53Var = (u53) obj;
        return u53Var.a == this.a && u53Var.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(u53.class, this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        String str = this.a.b;
        int length = str.length();
        int i = this.b;
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(i).length() + 1);
        sb.append("X-AES-GCM Parameters (variant: ");
        sb.append(str);
        sb.append("salt_size_bytes: ");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
