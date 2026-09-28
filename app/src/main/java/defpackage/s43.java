package defpackage;

import com.google.android.gms.internal.ads.zzhch;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class s43 extends zzhch {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final r43 e;
    public final q43 f;

    public /* synthetic */ s43(int i, int i2, int i3, int i4, r43 r43Var, q43 q43Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = r43Var;
        this.f = q43Var;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean a() {
        return this.e != r43.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s43)) {
            return false;
        }
        s43 s43Var = (s43) obj;
        return s43Var.a == this.a && s43Var.b == this.b && s43Var.c == this.c && s43Var.d == this.d && s43Var.e == this.e && s43Var.f == this.f;
    }

    public final int hashCode() {
        return Objects.hash(s43.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.e);
        String strValueOf2 = String.valueOf(this.f);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i = this.c;
        int length3 = String.valueOf(i).length();
        int i2 = this.d;
        int length4 = String.valueOf(i2).length();
        int i3 = this.a;
        int length5 = String.valueOf(i3).length();
        int i4 = this.b;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i4).length() + 15);
        hz.H(sb, "AesCtrHmacAead Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        hz.C(i, i2, ", ", "-byte IV, and ", sb);
        hz.C(i3, i4, "-byte tags, and ", "-byte AES key, and ", sb);
        sb.append("-byte HMAC key)");
        return sb.toString();
    }
}
