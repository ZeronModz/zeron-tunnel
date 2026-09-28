package defpackage;

import com.google.android.gms.internal.ads.zzhuu;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ya3 extends zzhuu {
    public final xa3 a;

    public ya3(xa3 xa3Var) {
        this.a = xa3Var;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean a() {
        return this.a != xa3.e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ya3) && ((ya3) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(ya3.class, this.a);
    }

    public final String toString() {
        String str = this.a.a;
        return vh.t(new StringBuilder(str.length() + 30), "Ed25519 Parameters (variant: ", str, ")");
    }
}
