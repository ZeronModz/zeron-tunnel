package defpackage;

import com.google.android.gms.internal.ads.zzhch;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class x53 extends zzhch {
    public final r43 a;

    public x53(r43 r43Var) {
        this.a = r43Var;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean a() {
        return this.a != r43.q;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x53) && ((x53) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(x53.class, this.a);
    }

    public final String toString() {
        String str = this.a.b;
        return vh.t(new StringBuilder(str.length() + 40), "XChaCha20Poly1305 Parameters (variant: ", str, ")");
    }
}
