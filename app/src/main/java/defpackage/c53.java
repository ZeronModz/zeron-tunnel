package defpackage;

import com.google.android.gms.internal.ads.zzhch;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class c53 extends zzhch {
    public final int a;
    public final r43 b;

    public /* synthetic */ c53(int i, r43 r43Var) {
        this.a = i;
        this.b = r43Var;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean a() {
        return this.b != r43.h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c53)) {
            return false;
        }
        c53 c53Var = (c53) obj;
        return c53Var.a == this.a && c53Var.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(c53.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        int length = strValueOf.length();
        int i = this.a;
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(i).length() + 10);
        sb.append("AesGcmSiv Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }
}
