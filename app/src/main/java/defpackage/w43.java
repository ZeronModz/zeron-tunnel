package defpackage;

import com.google.android.gms.internal.ads.zzhch;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class w43 extends zzhch {
    public final int a;
    public final int b;
    public final e43 c;

    public /* synthetic */ w43(int i, int i2, e43 e43Var) {
        this.a = i;
        this.b = i2;
        this.c = e43Var;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean a() {
        return this.c != e43.h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w43)) {
            return false;
        }
        w43 w43Var = (w43) obj;
        return w43Var.a == this.a && w43Var.b == this.b && w43Var.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(w43.class, Integer.valueOf(this.a), Integer.valueOf(this.b), 16, this.c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        int length = strValueOf.length();
        int i = this.b;
        int length2 = String.valueOf(i).length();
        int length3 = String.valueOf(16).length();
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(vh.b(length + 30 + length2 + 10 + length3, 15, String.valueOf(i2).length(), 10));
        sb.append("AesEax Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i);
        return vh.r(sb, "-byte IV, 16-byte tag, and ", i2, "-byte key)");
    }
}
