package defpackage;

import com.google.android.gms.internal.ads.zzhmn;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class c83 extends zzhmn {
    public final int a;
    public final int b;
    public final e43 c;

    public /* synthetic */ c83(int i, int i2, e43 e43Var) {
        this.a = i;
        this.b = i2;
        this.c = e43Var;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean a() {
        return this.c != e43.q;
    }

    public final int b() {
        e43 e43Var = e43.q;
        int i = this.b;
        e43 e43Var2 = this.c;
        if (e43Var2 == e43Var) {
            return i;
        }
        if (e43Var2 == e43.n || e43Var2 == e43.o || e43Var2 == e43.p) {
            return i + 5;
        }
        u7.p("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c83)) {
            return false;
        }
        c83 c83Var = (c83) obj;
        return c83Var.a == this.a && c83Var.b() == b() && c83Var.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(c83.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        int length = strValueOf.length();
        int i = this.b;
        int length2 = String.valueOf(i).length();
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i2).length() + 10);
        sb.append("AES-CMAC Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i);
        return vh.r(sb, "-byte tags, and ", i2, "-byte key)");
    }
}
