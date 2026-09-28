package defpackage;

import com.google.android.gms.internal.ads.zzhch;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class n53 extends zzhch {
    public final e43 a;
    public final String b;
    public final r43 c;
    public final zzhch d;

    public /* synthetic */ n53(e43 e43Var, String str, r43 r43Var, zzhch zzhchVar) {
        this.a = e43Var;
        this.b = str;
        this.c = r43Var;
        this.d = zzhchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean a() {
        return this.a != e43.m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n53)) {
            return false;
        }
        n53 n53Var = (n53) obj;
        return n53Var.c.equals(this.c) && n53Var.d.equals(this.d) && n53Var.b.equals(this.b) && n53Var.a.equals(this.a);
    }

    public final int hashCode() {
        return Objects.hash(n53.class, this.b, this.c, this.d, this.a);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String strValueOf3 = String.valueOf(this.a);
        String str = this.b;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        StringBuilder sb = new StringBuilder(length + 64 + length2 + 27 + strValueOf2.length() + 11 + strValueOf3.length() + 1);
        hz.H(sb, "LegacyKmsEnvelopeAead Parameters (kekUri: ", str, ", dekParsingStrategy: ", strValueOf);
        hz.H(sb, ", dekParametersForNewKeys: ", strValueOf2, ", variant: ", strValueOf3);
        sb.append(")");
        return sb.toString();
    }
}
