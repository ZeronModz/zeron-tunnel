package defpackage;

import com.google.android.gms.internal.ads.zzhch;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class f53 extends zzhch {
    public final e43 a;

    public f53(e43 e43Var) {
        this.a = e43Var;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean a() {
        return this.a != e43.k;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f53) && ((f53) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(f53.class, this.a);
    }

    public final String toString() {
        String str = this.a.b;
        return vh.t(new StringBuilder(str.length() + 39), "ChaCha20Poly1305 Parameters (variant: ", str, ")");
    }
}
